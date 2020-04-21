/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.enterprise;

import business.EcoSystem;
import business.employee.Employee;
import business.enterprise.Enterprise;
import business.enterprise.Enterprise.EnterpriseType;
import business.organization.Organization;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sayalipathare
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmployeeJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    Enterprise enterprise;
    EcoSystem system;
    
    public ManageEmployeeJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.system = system;
        this.populateDropdown();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dpdOrganization = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        dpdOrganizationEmp = new javax.swing.JComboBox();
        nameTextField = new javax.swing.JTextField();
        btnCreateEmployee = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setText("Organization");
        add(jLabel1);
        jLabel1.setBounds(370, 80, 81, 16);

        dpdOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dpdOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpdOrganizationActionPerformed(evt);
            }
        });
        add(dpdOrganization);
        dpdOrganization.setBounds(480, 80, 120, 27);

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Employee Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(310, 120, 480, 92);

        dpdOrganizationEmp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dpdOrganizationEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpdOrganizationEmpActionPerformed(evt);
            }
        });
        add(dpdOrganizationEmp);
        dpdOrganizationEmp.setBounds(160, 300, 140, 27);

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        add(nameTextField);
        nameTextField.setBounds(160, 350, 140, 26);

        btnCreateEmployee.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnCreateEmployee.setText("Create Employee");
        btnCreateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEmployeeActionPerformed(evt);
            }
        });
        add(btnCreateEmployee);
        btnCreateEmployee.setBounds(160, 430, 140, 40);

        btnBack.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon("/Users/sayalipathare/pathare_sayali_001029759/code_warriors_final_project/IDDSupportSystem/images/backbutton.png")); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(20, 430, 100, 40);

        jLabel3.setText("Organization");
        add(jLabel3);
        jLabel3.setBounds(60, 300, 90, 20);

        jLabel2.setText("Name");
        add(jLabel2);
        jLabel2.setBounds(60, 350, 36, 16);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("View Employees");
        add(jLabel4);
        jLabel4.setBounds(430, 20, 140, 30);
        add(jSeparator1);
        jSeparator1.setBounds(20, 220, 661, 10);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Create Employees");
        add(jLabel5);
        jLabel5.setBounds(130, 240, 160, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/sayalipathare/pathare_sayali_001029759/code_warriors_final_project/IDDSupportSystem/images/employee.png")); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(30, 20, 100, 70);

        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/sayalipathare/pathare_sayali_001029759/code_warriors_final_project/IDDSupportSystem/images/manageEmployee1.gif")); // NOI18N
        jLabel7.setText("jLabel7");
        add(jLabel7);
        jLabel7.setBounds(430, 250, 430, 320);
    }// </editor-fold>//GEN-END:initComponents
    
    private void populateDropdown() {
        dpdOrganization.removeAllItems();
        dpdOrganizationEmp.removeAllItems();
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()) {
            dpdOrganization.addItem(org);
            dpdOrganizationEmp.addItem(org);
                 //   dpdOrganizationEmp.setSelectedItem(org);

        }
    }
    
    public void populateTable(Organization organization) {
        DefaultTableModel dtm = (DefaultTableModel) organizationJTable.getModel();
        dtm.setRowCount(0);
        for(Employee e: organization.getEmployeeDirectory().getEmployeeList())
        {
            Object[] row = new Object[2];
            row[0] = e;
            dtm.addRow(row);
        }
    }
    
    private void dpdOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpdOrganizationActionPerformed
       Organization organization = (Organization) dpdOrganization.getSelectedItem();
       if(organization != null) {
           this.populateTable(organization);
       }
    }//GEN-LAST:event_dpdOrganizationActionPerformed

    private void btnCreateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEmployeeActionPerformed

        if (nameTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill out all the details");
            return;
        }
         
        Organization org = (Organization) dpdOrganizationEmp.getSelectedItem();
        String name = nameTextField.getText();
  
            org.getEmployeeDirectory().createEmployee(name);
            enterprise.getEmployeeDirectory().createEmployee(name);
            system.getEmployeeDirectory().createEmployee(name);
        
        this.populateTable(org);
        JOptionPane.showMessageDialog(null, "Employee created successfully");
        nameTextField.setText("");
          
    }//GEN-LAST:event_btnCreateEmployeeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
     
     userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
       Component component = componentArray[componentArray.length - 1];
        AdminWorkAreaJPanel dwjp = (AdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

 
    private void dpdOrganizationEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpdOrganizationEmpActionPerformed

        // TODO add your handling code here:
//        if(enterprise.getEnterpriseType().equals(EnterpriseType.Hospital)) {
//            if (dpdOrganizationEmp.getSelectedItem()!=null) {
//                System.out.println(dpdOrganizationEmp.getSelectedItem().toString().equals("Doctor Organization"));
//                if(dpdOrganizationEmp.getSelectedItem().toString().equals(Organization.Type.Doctor.toString()))
//                {
//                     specializationTextField.setVisible(true);
//                     labelSpecialization.setVisible(true);
//                }else{
//                    specializationTextField.setVisible(false);
//                     labelSpecialization.setVisible(false);
//                }
//            }
//        }
    }//GEN-LAST:event_dpdOrganizationEmpActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateEmployee;
    private javax.swing.JComboBox dpdOrganization;
    private javax.swing.JComboBox dpdOrganizationEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
