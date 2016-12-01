/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deliveryoversightsystem.systemAdmin;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import model.createUserAcctModel;
import others.ButtonColumn;

/**
 *
 * @author Aimee
 */
public class ViewUsersAcct extends javax.swing.JFrame {
    
    public static ViewUsersAcct instance; //this might be thecause of the issue
    
    public static void setInstance(ViewUsersAcct aInstance) { //this might be thecause of the issue
      instance = aInstance;
    }

    /**
     * Creates new form ViewUsersAcct
     */
    public ViewUsersAcct() {
        initComponents();
        instance = this; //this might be thecause of the issue
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    public static ViewUsersAcct getInstance(){ //this might be thecause of the issue
        if(instance == null)
            instance = new ViewUsersAcct();
        return instance;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dosLabel = new javax.swing.JLabel();
        viewUsersLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        viewUserAcctCB = new javax.swing.JComboBox();
        conditionField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewUsers = new javax.swing.JTable();
        editAcctBtn = new javax.swing.JButton();
        deactivateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        dosLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        dosLabel.setForeground(new java.awt.Color(255, 255, 255));
        dosLabel.setText("Delivery Oversight System");

        viewUsersLabel.setBackground(new java.awt.Color(255, 255, 255));
        viewUsersLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        viewUsersLabel.setForeground(new java.awt.Color(255, 255, 255));
        viewUsersLabel.setText("User Accounts");

        viewUserAcctCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Employee ID", "Status" }));

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refreshBtn.png"))); // NOI18N
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        viewUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Lastname", "Firstname", "Birthdate", "Positionl", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viewUsers);

        editAcctBtn.setText("Edit Account");
        editAcctBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAcctBtnActionPerformed(evt);
            }
        });

        deactivateBtn.setText("Deactivate");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dosLabel)
                            .addComponent(viewUsersLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(editAcctBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(deactivateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(viewUserAcctCB, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(conditionField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(26, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(dosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewUsersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewUserAcctCB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conditionField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editAcctBtn)
                    .addComponent(deactivateBtn))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(319, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String retVal = "";
        String condition = getViewUserAcctCB().getSelectedItem().toString();
        
        if(condition.equalsIgnoreCase("Employee ID")){
            retVal = "employeeID";
        }else if(condition.equalsIgnoreCase("Status")){
            retVal = "userStatus";
        }  
        
        String searchVal = getConditionField().getText().trim();
        
        updateViewUsersWithSearch(createUserAcctModel.getUsersWithSearch(retVal,searchVal));  
            System.gc();
    }//GEN-LAST:event_searchBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        updateViewUsersTable(createUserAcctModel.getAllUsers());
            System.gc();
    }//GEN-LAST:event_refreshBtnActionPerformed
    
    public EditUserAccount EA;
    
    private void editAcctBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAcctBtnActionPerformed
        // TODO add your handling code here:
        EA = new EditUserAccount(empID);
        EA.setVisible(true);
        ViewUsersAcct.instance.setEnabled(false);
        EA.setEnabled();
        
        EA.setEditForm(empID); //fills the Edit User Account form w/ its respective data
        
        System.gc();
    }//GEN-LAST:event_editAcctBtnActionPerformed

    public String empID;
    
    private void viewUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewUsersMouseClicked
        // TODO add your handling code here:
        int i = evt.getY()/getViewUsers().getRowHeight();
        if(evt.getClickCount() == 2 && i < getViewUsers().getRowCount()){
            //setUpdateDependentOK(true);
            //setUpdateEmployeePanelValues(getDependentFromTable(i));
            empID = getEmployeeID(i);
            System.gc();
        }
    }//GEN-LAST:event_viewUsersMouseClicked

    /**
     * get the data from the table at row i
     * @param i row
     * @return a String from row i
     */
    private String getEmployeeID(int i){
        String empNo = getViewUsers().getValueAt(i, 0).toString();
        return empNo;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewUsersAcct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUsersAcct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUsersAcct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUsersAcct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUsersAcct().setVisible(true);
            }
        });
    }
    
    /**Getters and Setters**/
    public JTextField getConditionField() {
        return conditionField;
    }

    public void setConditionField(JTextField conditionField) {
        this.conditionField = conditionField;
    }

    public JTable getViewUsers() {
        return viewUsers;
    }

    public void setViewUsers(JTable viewUsers) {
        this.viewUsers = viewUsers;
    }

    public JComboBox getViewUserAcctCB() {
        return viewUserAcctCB;
    }

    public void setViewUserAcctCB(JComboBox viewUserAcctCB) {
        this.viewUserAcctCB = viewUserAcctCB;
    }

    
    /**
     * added by angela 11.9.16
     * update the userList table by using the values in the userList arrayList
     * @param userList 
     */
    public void updateViewUsersWithSearch(ArrayList<createUserAcctModel> userList) {
         if(userList == null)
            return;
        DefaultTableModel model = (DefaultTableModel) getViewUsers().getModel();
        int size = userList.size(), modelRows = model.getRowCount();
        if(size > modelRows){
            for(int i = size-modelRows; i > 0; i--)
                model.addRow(new String[model.getColumnCount()]);
        }
        else if(modelRows > size){
            for(int i = modelRows-size; i > 0; i--)
                model.removeRow(0);
        }
        for(int i = 0; i < userList.size(); i++){
            createUserAcctModel m = userList.get(i);
            
            model.setValueAt(m.getEmpID(),i,0);
            model.setValueAt(m.getLastName(),i,1);
            model.setValueAt(m.getFirstName(),i,2);
            model.setValueAt(m.getBirthDate(),i,3);
            
            String pos = m.getPosition().trim();
            // condition to display String Position not abbrev.
            if(pos.equals("WM")){
                pos = "Warehouse Manager";
            }else if(pos.equals("PH")){
                pos = "Purchasing Head";
            }else if(pos.equals("SA")){
                pos = "System Administrator";
            }
            model.setValueAt(pos,i,4);
            model.setValueAt(m.getStatus(),i,5);
            
        }
        System.gc();  
    }
    
    /**
     * 
     * @param userList 
     */
    public void updateViewUsersTable(ArrayList<createUserAcctModel> userList){
        
        JOptionPane.showMessageDialog(null,"Getting table results...");
        if(userList == null)
            return;
        DefaultTableModel model = (DefaultTableModel) getViewUsers().getModel();
        int size = userList.size(), modelRows = model.getRowCount();
        if(size > modelRows){
            for(int i = size-modelRows; i > 0; i--)
                model.addRow(new String[model.getColumnCount()]);
        }
        else if(modelRows > size){
            for(int i = modelRows-size; i > 0; i--)
                model.removeRow(0);
        }
        for(int i = 0; i < userList.size(); i++){
            createUserAcctModel m = userList.get(i);
            
            model.setValueAt(m.getEmpID(),i,0);
            model.setValueAt(m.getLastName(),i,1);
            model.setValueAt(m.getFirstName(),i,2);
            model.setValueAt(m.getBirthDate(),i,3);
            
            String pos = m.getPosition().trim();
            // condition to display String Position not abbrev.
            if(pos.equals("WM")){
                pos = "Warehouse Manager";
            }else if(pos.equals("PH")){
                pos = "Purchasing Head";
            }else if(pos.equals("SA")){
                pos = "System Administrator";
            }
            model.setValueAt(pos,i,4);
            model.setValueAt(m.getStatus(),i,5);
            
            //model.setValueAt(m.getPhilcareYear(),i,6); - account created date
            //model.setValueAt(m.getMonth1(),i,7); - change password button
            //model.setValueAt(m.getMonth2(),i,8); - deactivate button
            
            //ButtonColumn btnCol = new ButtonColumn(viewUsersTable, Change, 7);
           
        }
        System.gc();
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt){
        showExitDialog();
    }
    
    private void showExitDialog(){
        systemAdminHome.instance.setEnabled(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField conditionField;
    private javax.swing.JButton deactivateBtn;
    private javax.swing.JLabel dosLabel;
    private javax.swing.JButton editAcctBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox viewUserAcctCB;
    private javax.swing.JTable viewUsers;
    private javax.swing.JLabel viewUsersLabel;
    // End of variables declaration//GEN-END:variables
}