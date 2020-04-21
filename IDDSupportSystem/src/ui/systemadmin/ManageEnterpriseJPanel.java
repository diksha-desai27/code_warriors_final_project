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
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

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

        add(jScrollPane1);
        jScrollPane1.setBounds(120, 40, 510, 97);

        jLabel1.setText("Network: ");
        add(jLabel1);
        jLabel1.setBounds(340, 170, 61, 16);

        dpdNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dpdNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpdNetworkActionPerformed(evt);
            }
        });
        add(dpdNetwork);
        dpdNetwork.setBounds(457, 170, 170, 27);

        jLabel2.setText("Enterprise Type:");
        add(jLabel2);
        jLabel2.setBounds(340, 220, 101, 16);

        dpdEnterpriseType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dpdEnterpriseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpdEnterpriseTypeActionPerformed(evt);
            }
        });
        add(dpdEnterpriseType);
        dpdEnterpriseType.setBounds(467, 220, 160, 27);

        jLabel3.setText("Name:");
        add(jLabel3);
        jLabel3.setBounds(350, 270, 40, 16);
        add(enterpriseNameTextField);
        enterpriseNameTextField.setBounds(471, 270, 150, 26);

        btnCreateEnterprise.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnCreateEnterprise.setText("Create Enterprise");
        btnCreateEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEnterpriseActionPerformed(evt);
            }
        });
        add(btnCreateEnterprise);
        btnCreateEnterprise.setBounds(451, 340, 170, 40);

        btnBack.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/backbutton.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(20, 340, 120, 40);

        btnDelete.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/trash.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(640, 40, 140, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/case.png"))); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(39, 30, 120, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEnterpriseActionPerformed
        // TODO add your handling code here:
        if (enterpriseNameTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill out all the details");
            return;
        }
        Network network = (Network)dpdNetwork.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) dpdEnterpriseType.getSelectedItem();
        String name = enterpriseNameTextField.getText();
        if(network.getEnterpriseDirectory().checkIfEnterpriseIsUnique(name, type))
        {
            for(Network n: system.getNetworkList()) {
                if(n.equals(network))
                {
                    n.getEnterpriseDirectory().createEnterprise(name, type);
                    JOptionPane.showMessageDialog(null, "Enterprise created successfully");
                    break;
                }
            }
            enterpriseNameTextField.setText("");
        
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Enterprise has already been used. Please enter another enterprise name.");
            enterpriseNameTextField.setText("");
        } 
        populateTable();

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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
