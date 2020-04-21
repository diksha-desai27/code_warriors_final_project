/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.enterprise;

import business.EcoSystem;
import business.employee.Employee;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.role.CaregiverRole;
import business.role.DoctorRole;
import business.role.NurseRole;
import business.role.ReviewerRole;
import business.role.Role;
import business.role.Role.RoleType;
import business.role.TrainerRole;
import business.schedule.Schedule;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.util.Iterator;
import java.util.Map;
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
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    Enterprise enterprise;
    EcoSystem system;

    public ManageUserAccountJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.system = system;
        this.populateOrganization();
        this.populateTable();
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
        btnCreate = new javax.swing.JButton();
        usernameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dpdEmployee = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        dpdOrganization = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        dpdRole = new javax.swing.JComboBox();
        passwordField = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel1.setText("Username");

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTable);

        jLabel2.setText("Password");

        jLabel3.setText("Employee");

        dpdEmployee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/backbutton.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setText("Organization");

        dpdOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dpdOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpdOrganizationActionPerformed(evt);
            }
        });

        jLabel4.setText("Role");

        dpdRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dpdRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpdRoleActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/employeeUserAccount.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(usernameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(246, 246, 246)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addGap(21, 21, 21)))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dpdOrganization, 0, 190, Short.MAX_VALUE)
                                .addComponent(dpdEmployee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dpdRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(btnCreate))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(252, 252, 252))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dpdOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dpdEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dpdRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 797, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dpdRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpdRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpdRoleActionPerformed

    private void dpdOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpdOrganizationActionPerformed
        Organization org = (Organization) dpdOrganization.getSelectedItem();
        if (org != null) {
            this.populateEmployees(org);
            this.populateRoles(org);
        }
    }//GEN-LAST:event_dpdOrganizationActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AdminWorkAreaJPanel dwjp = (AdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

        if (usernameTextField.getText().equals("") || passwordField.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill out all the details");
        } else if (usernamePatternCorrect()) {
            if (passwordPatternCorrect()) {
                String username = usernameTextField.getText();
                char c[] = passwordField.getPassword();
                String password = String.valueOf(c);

                Organization org = (Organization) dpdOrganization.getSelectedItem();
                Employee emp = (Employee) dpdEmployee.getSelectedItem();
                String value = dpdRole.getSelectedItem().toString();
                Role role = null;
                RoleType roleType = null;
                if (value.equals("Caregiver")) {
                    role = new CaregiverRole();
                    roleType = Role.RoleType.Caregiver;
                } else if (value.equals("Doctor")) {
                    role = new DoctorRole();
                    roleType = Role.RoleType.Doctor;
                } else if (value.equals("Nurse")) {
                    role = new NurseRole();
                    roleType = Role.RoleType.Nurse;
                } else if (value.equals("Reviewer")) {
                    role = new ReviewerRole();
                    roleType = Role.RoleType.Reviewer;
                } else {
                    role = new TrainerRole();
                    roleType = Role.RoleType.Trainer;
                }

     
                    

//                       Iterator empIterator = system.getEmpMap().entrySet().iterator();
//                       while (empIterator.hasNext())
//                       {
//                           Map.Entry mapElement = (Map.Entry) empIterator.next();
//                           Employee e = ((Employee) mapElement.getKey());
//                           UserAccount ua = ((UserAccount) mapElement.getValue());

                            if(!system.getUserAccountDirectory().checkIfUsernameIsUnique(username))
                            {
                                JOptionPane.showMessageDialog(null, "Username has been already taken. Please use another username");
//                                break;   
                            }
                            else
                            {
                                UserAccount ua1 = enterprise.getUserAccountDirectory().createUserAccount(username, password, role, roleType);

                                if (org.getName().equals(Organization.Type.Doctor.getValue()) || org.getName().equals(Organization.Type.Nurse.getValue()) || org.getName().equals(Organization.Type.Trainer.getValue()))
                                {
                                    Schedule sch = new Schedule();
                                    enterprise.getSchedule().put(ua1, sch);
                                }

                                if (org.getName().equals(Organization.Type.Caregiver.getValue()))
                                {
                                    emp.setStatus("Available");
                                }
                                

                                enterprise.getEmpMap().put(emp, ua1);
                                enterprise.getUserAccountDirectory().createUserAccount(username, password, role, roleType);
                                org.getUserAccountDirectory().createUserAccount(username, password, role, roleType);
                                system.getEmpMap().put(emp, ua1);
                                system.getUserAccountDirectory().createUserAccount(username, password, role, roleType);
                                JOptionPane.showMessageDialog(null, "User account created successfully.");
                             
                            
                      
                }
//                else
//                {
//                    Iterator empIterator = system.getEmpMap().entrySet().iterator();
//                    while (empIterator.hasNext())
//                    {
//                        Map.Entry mapElement = (Map.Entry) empIterator.next();
//                        Employee e = ((Employee) mapElement.getKey());
//                        UserAccount ua = ((UserAccount) mapElement.getValue());
//                        if (ua.getUsername().equals(username))
//                        {
//                            JOptionPane.showMessageDialog(null, "Username has been already taken. Please use another username");
//                            break;
//                        }
//                        else
//                        {
//                            UserAccount ua1 = enterprise.getUserAccountDirectory().createUserAccount(username, password, role, roleType);
//                            enterprise.getEmpMap().put(emp, ua1);
//                            enterprise.getUserAccountDirectory().createUserAccount(username, password, role, roleType);
//                            org.getUserAccountDirectory().createUserAccount(username, password, role, roleType);
//                            system.getEmpMap().put(emp, ua1);
//
//                            if (org.getName().equals(Organization.Type.Doctor.getValue()) || org.getName().equals(Organization.Type.Nurse.getValue()) || org.getName().equals(Organization.Type.Trainer.getValue()))
//                            {
//                                Schedule sch = new Schedule();
//                                enterprise.getSchedule().put(ua1, sch);
//                                System.out.println("hi" + enterprise.getSchedule());
//                            }
//
//                            if (org.getName().equals(Organization.Type.Caregiver.getValue()))
//                            {
//                                emp.setStatus("Available");
//                            }
//                            System.out.println("Enterprise HashMap " + enterprise.getEmpMap());
//                            System.out.println("System HashMap " + system.getEmpMap());
//                            JOptionPane.showMessageDialog(null, "User account created successfully.");
//                            break;
//
//                        }
//                    }

//                }
                this.populateTable();
                usernameTextField.setText("");
                passwordField.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please enter valid password");
            }
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Username is invalid. Username must be in the format: xx_xx@xx.xx");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) userTable.getModel();
        dtm.setRowCount(0);
        if (enterprise.getEmpMap() != null) {
            Iterator empIterator = enterprise.getEmpMap().entrySet().iterator();
            while (empIterator.hasNext()) {
                Map.Entry mapElement = (Map.Entry) empIterator.next();
                Employee e = ((Employee) mapElement.getKey());
                UserAccount ua = ((UserAccount) mapElement.getValue());
                Object row[] = new Object[3];
                row[0] = ua.getUsername();
                row[1] = ua.getRoleType().getValue();
                dtm.addRow(row);
            }
        }
    }

    public void populateOrganization() {
        dpdOrganization.removeAllItems();
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            dpdOrganization.addItem(org);

        }
    }

    public void populateEmployees(Organization organization) {
        dpdEmployee.removeAllItems();
        for (Employee emp : organization.getEmployeeDirectory().getEmployeeList()) {
            dpdEmployee.addItem(emp);
        }
    }

    public void populateRoles(Organization organization) {
        dpdRole.removeAllItems();
        if (Organization.Type.Caregiver.getValue().equalsIgnoreCase(organization.getName())) {
            dpdRole.addItem(Role.RoleType.Caregiver);
        } else if (Organization.Type.Reviewer.getValue().equalsIgnoreCase(organization.getName())) {
            dpdRole.addItem(Role.RoleType.Reviewer);
        } else if (Organization.Type.Doctor.getValue().equalsIgnoreCase(organization.getName())) {
            dpdRole.addItem(Role.RoleType.Doctor);
        } else if (Organization.Type.Nurse.getValue().equalsIgnoreCase(organization.getName())) {
            dpdRole.addItem(Role.RoleType.Nurse);
        } else {
            dpdRole.addItem(Role.RoleType.Trainer);
        }
    }

    private boolean usernamePatternCorrect() {
        Pattern p = Pattern.compile("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
        Matcher m = p.matcher(usernameTextField.getText());
        Boolean b = m.matches();
        return b;
    }

    private boolean passwordPatternCorrect() {
        Pattern q = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=_])(?=\\S+$).{6,20}$");
        Matcher n = q.matcher(String.valueOf(passwordField.getPassword()));
        Boolean c = n.matches();
        return c;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox dpdEmployee;
    private javax.swing.JComboBox dpdOrganization;
    private javax.swing.JComboBox dpdRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTable userTable;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
