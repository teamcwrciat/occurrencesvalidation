/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Desktop;


import Controllers.Occurrences.CTempCountries;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HSOTELO
 */
public class FrmCountries extends javax.swing.JDialog {
    /*Member class*/
    private CTempCountries cTCountries;
    
    /**
     * Creates new form FrmCountries
     */
    public FrmCountries(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cTCountries=new CTempCountries();
        load();
    }
    
    /**
     * Method that update table with the countries
     */
    private void load()
    {
        DefaultTableModel model = (DefaultTableModel) tblCountries.getModel();
        int rows=tblCountries.getRowCount();
        for(int i=0;i<rows;i++)
            model.removeRow(0);
        cTCountries.fillTableAll((DefaultTableModel) tblCountries.getModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCountries = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblIso2 = new javax.swing.JLabel();
        txtIso2 = new javax.swing.JTextField();
        lblIso3 = new javax.swing.JLabel();
        txtIso3 = new javax.swing.JTextField();
        cmdInsert = new javax.swing.JButton();
        cmdDelete = new javax.swing.JButton();
        cmdClear = new javax.swing.JButton();
        lblLat = new javax.swing.JLabel();
        txtLat = new javax.swing.JTextField();
        lblLon = new javax.swing.JLabel();
        txtLon = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Countries");
        setResizable(false);

        tblCountries.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Iso 2", "Iso 3", "Lat", "Lon"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCountries);

        lblName.setText("Name:");

        lblIso2.setText("Iso 2:");

        lblIso3.setText("Iso 3:");

        cmdInsert.setText("Insert");
        cmdInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdInsertActionPerformed(evt);
            }
        });

        cmdDelete.setText("Delete");
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        cmdClear.setText("Clear");
        cmdClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdClearActionPerformed(evt);
            }
        });

        lblLat.setText("Lat:");

        lblLon.setText("Lon:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(cmdInsert)
                .addGap(101, 101, 101)
                .addComponent(cmdClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdDelete)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIso2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIso2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIso3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIso3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLat)
                        .addComponent(txtLat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblLon)
                        .addComponent(txtLon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIso3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIso3)
                        .addComponent(txtIso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIso2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblName)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdInsert)
                    .addComponent(cmdDelete)
                    .addComponent(cmdClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdInsertActionPerformed
        // TODO add your handling code here:
        try
        {
            if(cTCountries.add(txtName.getText(), txtIso2.getText(), txtIso3.getText(), Double.parseDouble(txtLat.getText()),Double.parseDouble(txtLon.getText())))
                JOptionPane.showMessageDialog(this, "Country add");
            load();
        }
        catch(SQLException | HeadlessException ex)
        {
            JOptionPane.showMessageDialog(this, "Error: " + ex);
        }        
    }//GEN-LAST:event_cmdInsertActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        // TODO add your handling code here:
        try
        {
            if(cTCountries.delete(tblCountries.getValueAt(tblCountries.getSelectedRow(), 0).toString()))
                JOptionPane.showMessageDialog(this, "Country delete");
            load();
        }
        catch(SQLException | HeadlessException ex)
        {
            JOptionPane.showMessageDialog(this, "Error: " + ex);
        }
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void cmdClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdClearActionPerformed
        // TODO add your handling code here:
        txtName.setText("");
        txtIso2.setText("");
        txtIso3.setText("");
        txtLat.setText("");
        txtLon.setText("");
    }//GEN-LAST:event_cmdClearActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdClear;
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdInsert;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIso2;
    private javax.swing.JLabel lblIso3;
    private javax.swing.JLabel lblLat;
    private javax.swing.JLabel lblLon;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblCountries;
    private javax.swing.JTextField txtIso2;
    private javax.swing.JTextField txtIso3;
    private javax.swing.JTextField txtLat;
    private javax.swing.JTextField txtLon;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
