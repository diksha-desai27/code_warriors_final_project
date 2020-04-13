/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.systemadmin;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dikshadesai
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem system;
    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        
        dpdEnterpriseType.removeAllItems();
        this.populateNetwork();
        this.populateEnterpriseType();
        this.populateTable();
    }
    
    private void populateNetwork() {
        dpdNetwork.removeAllItems();
        
        for(Network n: system.getNetworkList())
        {
            dpdNetwork.addItem(n);
        }
    }
    
    private void populateEnterpriseType() {
        for(Enterprise.EnterpriseType type: Enterprise.EnterpriseType.values())
        {
            dpdEnterpriseType.addItem(type);
        }
    }
    
    public void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) enterpriseTable.getModel();
        model.setRowCount(0);
       
        
        for(Network n: system.getNetworkList()) {
            for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList())
            {
                Object[] row = new Object[3];
                row[0] = e;
                row[1] = n;
                row[2] = e.getEnterpriseType().getValue();
                model.addRow(row);
            }
        }
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
        enterpriseTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        dpdNetwork = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        dpdEnterpriseType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        enterpriseNameTextField = new javax.swing.JTextField();
        btnCreateEnterprise = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        enterpriseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Enterprise Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseTable);

        jLabel1.setText("Network: ");

        dpdNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dpdNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpdNetworkActionPerformed(evt);
            }
        });

        jLabel2.setText("Enterprise Type:");

        dpdEnterpriseType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dpdEnterpriseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpdEnterpriseTypeActionPerformed(evt);
            }
        });

        jLabel3.setText("Name:");

        btnCreateEnterprise.setText("Create Enterprise");
        btnCreateEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEnterpriseActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(216, 216, 216)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addComponent(btnBack))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dpdEnterpriseType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dpdNetwork, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(enterpriseNameTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCreateEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnDelete)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dpdNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dpdEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(enterpriseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateEnterprise)
                    .addComponent(btnBack))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEnterpriseActionPerformed
        // TODO add your handling code here:
        Network network = (Network)dpdNetwork.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) dpdEnterpriseType.getSelectedItem();
        String name = enterpriseNameTextField.getText();
        
        for(Network n: system.getNetworkList()) {
            if(n.equals(network))
            {
                n.getEnterpriseDirectory().createEnterprise(name, type);
                JOptionPane.showMessageDialog(null, "Enterprise created successfully");
                break;
            }
        }
        populateTable();
        System.out.println("Helloo----" + system.getNetworkList());
    }//GEN-LAST:event_btnCreateEnterpriseActionPerformed

    private void dpdNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpdNetworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpdNetworkActionPerformed

    private void dpdEnterpriseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpdEnterpriseTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpdEnterpriseTypeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel = new SystemAdminWorkAreaJPanel(userProcessContainer, system);
        userProcessContainer.add("systemAdminWorkAreaJPanel",systemAdminWorkAreaJPanel);
       
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
       
        int selectedRow = enterpriseTable.getSelectedRow();
        if(selectedRow >= 0) {
            Enterprise en = (Enterprise) enterpriseTable.getValueAt(selectedRow, 0);
            for(Network n: system.getNetworkList()) {
                for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()) {
                    if(en.equals(e))
                    {
                        n.getEnterpriseDirectory().deleteEnterprise(en);
                        this.populateTable();
                        JOptionPane.showMessageDialog(null, "Enterprise deleted successfully");
                        break;
                    }
                }
            }
               
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select an Enterprise to delete.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateEnterprise;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox<Object> dpdEnterpriseType;
    private javax.swing.JComboBox<Object> dpdNetwork;
    private javax.swing.JTextField enterpriseNameTextField;
    private javax.swing.JTable enterpriseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
