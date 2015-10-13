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
package Views.Desktop;

import Controllers.Occurrences.BaseController;
import Controllers.Occurrences.CMetadata;
import Controllers.Occurrences.CTempCountries;
import Controllers.Occurrences.CTempOccurrences;
import Controllers.Tools.TypeImports;
import Tools.Configuration;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Steven Sotelo - stevenbetancurt@hotmail.com
 */
public class FrmImport extends javax.swing.JDialog {
    
    private BaseController cBase;
    private boolean exit;
    
    
    /**
     * @return the controller
     */
    public BaseController getCBase(){
        return cBase;
    }
    
    /**
     * @return the exit
     */
    public boolean isExit() {
        return exit;
    }
    
    public String getSource(){
        return txtSource.getText();
    }
    
    public String getSplit(){
        return txtSplit.getText();
    }
    
    public boolean getClean(){
        return chkClean.isSelected();
    }
    
    public String getLog(){
        return txtLog.getText();
    }
    /**
     * Creates new form FrmImport
     */
    public FrmImport(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        exit=false;
        // Add
        for(TypeImports value: TypeImports.values())
            cboTypeImport.addItem(value);
        txtLog.setText(Configuration.DIRECTORY_DEFAULT);
        txtSource.setText(Configuration.DIRECTORY_DEFAULT);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSource = new javax.swing.JLabel();
        txtSource = new javax.swing.JTextField();
        cmdSelectFile = new javax.swing.JButton();
        lblLog = new javax.swing.JLabel();
        txtLog = new javax.swing.JTextField();
        cmdLog = new javax.swing.JButton();
        lblSplit = new javax.swing.JLabel();
        txtSplit = new javax.swing.JTextField();
        chkClean = new javax.swing.JCheckBox();
        lblDesType = new javax.swing.JLabel();
        cboTypeImport = new javax.swing.JComboBox();
        cmdStartImport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Import");
        setResizable(false);

        lblSource.setText("Path source:");

        cmdSelectFile.setText("Search");
        cmdSelectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSelectFileActionPerformed(evt);
            }
        });

        lblLog.setText("Log:");

        cmdLog.setText("Search");
        cmdLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLogActionPerformed(evt);
            }
        });

        lblSplit.setText("Split:");

        txtSplit.setText("\\|");
        txtSplit.setToolTipText("");

        chkClean.setSelected(true);
        chkClean.setText("Clean data");

        lblDesType.setText("Type import:");

        cmdStartImport.setText("Start import");
        cmdStartImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdStartImportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSource)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSource, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblLog)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLog, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdSelectFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblSplit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSplit, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkClean)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDesType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboTypeImport, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(cmdStartImport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSource)
                    .addComponent(cmdSelectFile)
                    .addComponent(txtSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLog)
                    .addComponent(cmdLog)
                    .addComponent(txtLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkClean)
                    .addComponent(lblSplit)
                    .addComponent(txtSplit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDesType)
                    .addComponent(cboTypeImport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(cmdStartImport)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void cmdSelectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSelectFileActionPerformed
        // TODO add your handling code here:
        try
        {
            JFileChooser fc=new JFileChooser();
            fc.setCurrentDirectory(new File(txtSource.getText().equals("") ? System.getProperty("user.home") : txtSource.getText()));
            if(fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
                txtSource.setText(fc.getSelectedFile().getAbsolutePath());
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_cmdSelectFileActionPerformed
        
    private void cmdStartImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdStartImportActionPerformed
        // TODO add your handling code here:
        try
        {
            TypeImports tImport=(TypeImports)cboTypeImport.getSelectedItem();
            cBase=tImport==TypeImports.TEMP_OCCURRENCES ? new CTempOccurrences() : 
                    (tImport==TypeImports.METADATA ? new CMetadata() : (tImport==TypeImports.TEMP_COUNTRIES ? new CTempCountries() : null));            
            this.exit=true;            
            this.setVisible(false);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex);
            System.out.println(ex);
        }
    }//GEN-LAST:event_cmdStartImportActionPerformed

    private void cmdLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLogActionPerformed
        // TODO add your handling code here:
        try
        {
            JFileChooser fc=new JFileChooser();            
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fc.setCurrentDirectory(new File(txtLog.getText()));
            if(fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
                txtLog.setText(fc.getSelectedFile().getAbsolutePath());
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_cmdLogActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboTypeImport;
    private javax.swing.JCheckBox chkClean;
    private javax.swing.JButton cmdLog;
    private javax.swing.JButton cmdSelectFile;
    private javax.swing.JButton cmdStartImport;
    private javax.swing.JLabel lblDesType;
    private javax.swing.JLabel lblLog;
    private javax.swing.JLabel lblSource;
    private javax.swing.JLabel lblSplit;
    private javax.swing.JTextField txtLog;
    private javax.swing.JTextField txtSource;
    private javax.swing.JTextField txtSplit;
    // End of variables declaration//GEN-END:variables
}
