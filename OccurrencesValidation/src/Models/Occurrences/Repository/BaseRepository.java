 /**
  * Copyright 2014 International Center for Tropical Agriculture (CIAT).
  * This file is part of:
  * Crop Wild Relatives
  * It is free software: You can redistribute it and/or modify
  * it under the terms of the GNU General Public License as published by
  * the Free Software Foundation, either version 3 of the License, or
  * at your option) any later version.
  * It is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  * GNU General Public License for more details.
  *
  * See <http://www.gnu.org/licenses/>.
  */

package Models.Occurrences.Repository;

import Models.DataBase.BaseUpdate;
import Models.DataBase.Field;
import Models.DataBase.MySQL;
import Models.DataBase.ResultQuery;
import Models.Occurrences.Source.BaseTable;
import Tools.Configuration;
import Tools.FixData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Steven Sotelo - stevenbetancurt@hotmail.com
 */
public abstract class BaseRepository {
    /*Members Class*/
    protected MySQL db;
    private String table;
    protected MySQL dbInformationSchema;
    
    /**
     * @return the table
     */
    public String getTable() {
        return table;
    }
    
    /*Methods*/
    /**
     * Method Construct
     * @param table table name
     */
    public BaseRepository(String table){
        db=new MySQL(Configuration.getParameter("currie_server"),Configuration.getParameter("currie_schema_gapanalysis"), Configuration.getParameter("currie_user"), Configuration.getParameter("currie_password"));
        dbInformationSchema = new MySQL(Configuration.getParameter("currie_server"),Configuration.getParameter("currie_schema_base"),Configuration.getParameter("currie_user"), Configuration.getParameter("currie_password"));
        this.table=table;
    }
    
    /**
     * Method that return the query executed
     * @param number True if you want get query from schema, otherwise false
     * @return 
     */
    public String getQuery(boolean schema)
    {
        return schema ? db.getQuery() : dbInformationSchema.getQuery();
    }
    
    /**
     * Method that execute a query into database
     * @param query query to execute
     * @return number rows affected
     * @throws SQLException 
     */
    public long executeQuery(String query) throws SQLException
    {
        return db.update(query);
    }
    
    /**
     * Method that validate that a list of fields have the same names that the table into database
     * @param fields list of fields for check with table
     * @return List values
     * @throws SQLException Error with connection to the database
     */
    public ArrayList<Field> validateFields(ArrayList<String> fields) throws SQLException, Exception{
        HashMap rows=new HashMap();
        ArrayList<Field> realFields=new ArrayList<Field>();
        String listFields="";
        for(String f: fields)
            listFields+="'" +f +"'," ;
        listFields=listFields.substring(0, listFields.length()-1);
        //query to database
        dbInformationSchema.getResults("Select COLUMN_NAME, DATA_TYPE " +
                                        "From COLUMNS " +
                                        "Where TABLE_NAME = '" + getTable() +"' and Table_schema = '" + Configuration.getParameter("currie_schema_gapanalysis") + "'" +
                                            "and COLUMN_NAME in (" + listFields + ");");
        while(dbInformationSchema.getRecordSet().next())
            rows.put(dbInformationSchema.getRecordSet().getString(1), dbInformationSchema.getRecordSet().getString(2));
        for(String f : fields)
        {
            if(!rows.containsKey(f))
                throw new Exception(f + " field not found into table \"" + getTable() + "\". Count table: " + String.valueOf(realFields.size()) + ", Count fields file: "+ String.valueOf(fields.size()));
            realFields.add(new Field(f,rows.get(f).toString()));
        }
        return realFields;
    }
    
    /**
     * Method that add entity to database
     * @param entity to add
     * @return Result of execute query
     */
    public ResultQuery add(BaseTable entity) throws SQLException{
        String query="insert into " + getTable() + " (";
        String fields = "", values="";
        Object temp;
        for(String f:entity.getAttributes())
        {
            fields+=f + ",";
            temp=entity.get(f);
            values += temp == null || temp.toString().equals("NULL") || temp.toString().equals("null") ? FixData.NULL_DATABASE + "," : "'" + FixData.fixedValueToQuery(temp.toString().trim()) + "',";
        }
        query+=fields.substring(0, fields.length()-1) + ") values (";
        query+=values.substring(0, values.length()-1) + ");";
        return new ResultQuery(query, db.update(query));
    }
    
    /**
     * Method that update entity to database
     * @param entity to add
     * @param field field for update
     * @return Result of execute query
     */
    public ResultQuery update(BaseTable entity,String field) throws SQLException{
        String query="update " + getTable() + " set ";
        Object temp;
        for(String f:entity.getAttributes())
        {
            if(!f.equals(field))
            {
                temp=entity.get(f);
                query += f + "=" + (temp == null || temp.equals(FixData.NULL_DATABASE) ? FixData.NULL_DATABASE : "'" + FixData.fixedValueToQuery(temp.toString().trim()) + "'") + ",";
            }            
        }
        query=query.substring(0, query.length()-1) + " where " + field + "='" +entity.get(field) + "';";
        return new ResultQuery(query, db.update(query));
    }
    
    /**
     * Method that update tables into database
     * @param change change to do
     * @return Result of execute query
     * @throws SQLException 
     */
    public ResultQuery update(BaseUpdate change) throws SQLException{
        String query="update " + getTable() + " set " + change.getField() + "=" + change.getValue() + " " + (change.getCondition().equals("") ? "": "where " + change.getCondition() + ";");
        return new ResultQuery(query, db.update(query));
    }
    
    /**
     * Method that delete a entity from database
     * @param field name field for delete
     * @param value value for delete
     * @return Result execute query
     * @throws SQLException 
     */
    public ResultQuery delete(String field,String value) throws SQLException{
        String query="Delete from " + getTable() + " where " + field + "='" + value + "';";
        return new ResultQuery(query, db.update(query));
    }
    
    /**
     * Method that return count register in the table
     * @return count of register into table, if it return -1 exist a error
     */
    public long count() {
        long a=-1;
        try
        {
            db.getResults("Select count(id) From " + getTable());
            while(this.db.getRecordSet().next())
                a=this.db.getRecordSet().getLong(1);
        }
        catch (SQLException ex)
        {
            System.out.println("Error in count register " + ex);
        }
        return a;
    }
    
    /**
     * Method that return count register in the table
     * @return count of register into table, if it return -1 exist a error
     */
    public long count(String condition) {
        long a=-1;
        try
        {
            db.getResults("Select count(id) From " + getTable() + " Where " + condition);
            while(this.db.getRecordSet().next())
                a=this.db.getRecordSet().getLong(1);
        }
        catch (SQLException ex)
        {
            System.out.println("Error in count register " + ex);
        }
        return a;
    }
    
    
    /**
     * Method that establish if the record set has more rows.
     * You should pass the parameter instanced, because the method
     * load and return the same instance
     * @param entity entity to load
     * @return entity
     * @throws SQLException 
     */
    public BaseTable hasNext(BaseTable entity) throws SQLException{        
        if(db.getRecordSet().next()){
            entity.load(db.getRecordSet());
            return entity;
        }
        else
            return null;
    }

    
}
