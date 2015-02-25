/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Desktop;


import Controllers.Occurrences.BaseController;
import Controllers.Occurrences.CMetadata;
import Controllers.Occurrences.CTempOccurrences;
import Controllers.Tools.Importer.TypeImports;
import Tools.Configuration;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author hsotelo
 */
public class FrmUpdate extends javax.swing.JDialog {

    private boolean exit;
    private BaseController cBase;
    
    /**
     * @return the exit
     */
    public boolean isExit() {
        return exit;
    }
    
    /**
     * Creates new form FrmQuery
     */
    public FrmUpdate(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        // Add
        for(TypeImports value: TypeImports.values())
            cboTypeImport.addItem(value);
        txtLog.setText(Configuration.DIRECTORY_DEFAULT);
    }
    
    /**
     * @return Controller base
     */
    public BaseController getCBase(){
        return cBase;
    }
    
    /**
     * @return Path the source file
     */
    public String getFile(){
        return txtFile.getText();
    }
    
    /**
     * @return Path to save the log
     */
    public String getLog(){
        return txtLog.getText();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFile = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();
        cmdSearch = new javax.swing.JButton();
        lblLog = new javax.swing.JLabel();
        txtLog = new javax.swing.JTextField();
        cmdLog = new javax.swing.JButton();
        lblTypeImport = new javax.swing.JLabel();
        cboTypeImport = new javax.swing.JComboBox();
        cmdRun = new javax.swing.JButton();
        cmdExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update");
        setResizable(false);

        lblFile.setText("File:");

        cmdSearch.setText("Search");
        cmdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSearchActionPerformed(evt);
            }
        });

        lblLog.setText("Log:");

        cmdLog.setText("Search");
        cmdLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLogActionPerformed(evt);
            }
        });

        lblTypeImport.setText("Type:");

        cmdRun.setText("Run");
        cmdRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRunActionPerformed(evt);
            }
        });

        cmdExit.setText("Exit");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdRun, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTypeImport)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cboTypeImport, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblLog)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtLog, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmdLog))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblFile)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmdSearch)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFile)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLog)
                    .addComponent(txtLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdLog))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTypeImport)
                    .addComponent(cboTypeImport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdRun)
                    .addComponent(cmdExit))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSearchActionPerformed
        // TODO add your handling code here:
        try
        {
            JFileChooser fc=new JFileChooser();            
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fc.setCurrentDirectory(new File(txtFile.getText().equals("") ? System.getProperty("user.home") : txtFile.getText()));
            if(fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
                txtFile.setText(fc.getSelectedFile().getAbsolutePath());
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_cmdSearchActionPerformed

    private void cmdRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRunActionPerformed
        // TODO add your handling code here:
        try
        {
            TypeImports tImport=(TypeImports)cboTypeImport.getSelectedItem();
            cBase=tImport==TypeImports.TEMP_OCCURRENCES ? new CTempOccurrences() : 
                    (tImport==TypeImports.METADATA ? new CMetadata() : null);
            this.exit=false;            
            this.setVisible(false);
        }
        catch(Exception ex)
        {
            System.out.println("Error start");
            System.out.println(ex);
        }
    }//GEN-LAST:event_cmdRunActionPerformed

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

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        // TODO add your handling code here:
        exit=true;
        this.setVisible(false);
    }//GEN-LAST:event_cmdExitActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboTypeImport;
    private javax.swing.JButton cmdExit;
    private javax.swing.JButton cmdLog;
    private javax.swing.JButton cmdRun;
    private javax.swing.JButton cmdSearch;
    private javax.swing.JLabel lblFile;
    private javax.swing.JLabel lblLog;
    private javax.swing.JLabel lblTypeImport;
    private javax.swing.JTextField txtFile;
    private javax.swing.JTextField txtLog;
    // End of variables declaration//GEN-END:variables

}
