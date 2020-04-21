/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.caregivers;

import business.EcoSystem;
import business.employee.Employee;
import business.enterprise.Enterprise;
import business.individuals.Individual;
import business.network.Network;
import business.role.Role;
import business.useraccount.UserAccount;
import business.workqueue.WorkRequest;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sayalipathare
 */
public class AssignToDoctorJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount userAccount;
    Individual individual;
    Enterprise enterprise;
    EcoSystem system;

    /**
     * Creates new form AssignToDoctorJPanel
     *
     * @param userProcessConatiner
     * @param userAccount
     * @param individual
     * @param enterprise
     */
    public AssignToDoctorJPanel(JPanel userProcessConatiner, UserAccount userAccount, Individual individual, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessConatiner;
        this.userAccount = userAccount;
        this.individual = individual;
        this.enterprise = enterprise;
        this.system = system;
        registrationIDTextField.setText(String.valueOf(this.individual.getRegistrationId()));
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

        jLabel1 = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        registrationIDTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Registration id:");

        btnAssign.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnAssign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/request.png"))); // NOI18N
        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        doctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Doctor name", "Enteprise name", "Network"
            }
        ));
        jScrollPane1.setViewportView(doctorTable);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/nurseToDoc.gif"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/caregiver.png"))); // NOI18N
        jLabel4.setText("ASSIGN TO DOCTOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(83, 83, 83)
                        .addComponent(registrationIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAssign)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 114, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(registrationIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnAssign)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) doctorTable.getModel();
        dtm.setRowCount(0);
        for (Network n : system.getNetworkList()) {
            System.out.println("city: " + this.individual.getCity());
            System.out.println("city: " + n.getName());
            if (this.individual.getCity().equalsIgnoreCase(n.getName())) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.Hospital.getValue())) {
                        Iterator empIterator = e.getEmpMap().entrySet().iterator();

                        while (empIterator.hasNext()) {
                            Map.Entry mapElement = (Map.Entry) empIterator.next();
                            Employee emp = ((Employee) mapElement.getKey());
                            UserAccount doctor = ((UserAccount) mapElement.getValue());
                            if (doctor.getRoleType().getValue().equals(Role.RoleType.Doctor.getValue())) {
                                Object row[] = new Object[3];
                                row[0] = emp;
                                row[1] = e;
                                row[2] = n;
                                dtm.addRow(row);
                            }
                        }

                    }
                }
            }
        }
    }

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your h)andling code here:
        int selectedRow = doctorTable.getSelectedRow();
        if (selectedRow >= 0) {
            UserAccount doctor = null;
            Employee emp = null;
            Employee e = (Employee) doctorTable.getValueAt(selectedRow, 0);
            Iterator empIterator = system.getEmpMap().entrySet().iterator();

            while (empIterator.hasNext()) {
                Map.Entry mapElement = (Map.Entry) empIterator.next();
                Employee e1 = ((Employee) mapElement.getKey());
                UserAccount ua = ((UserAccount) mapElement.getValue());
                if (e1.equals(e)) {
                    doctor = ua;
                    emp = e1;
                    break;
                }
            }
            if (doctor != null) {
                for (WorkRequest w : this.userAccount.getWorkQueue().getWorkRequestList()) {
                    if ((w.getIndividual() != null) && (w.getIndividual().getRegistrationId() == individual.getRegistrationId())) {
                        System.out.println(doctor);
                        System.out.println(w.getStatus());
                        if (w.getStatus().equals("Declined") && w.getSender().equals(doctor)) {
                            JOptionPane.showMessageDialog(null, "Please choose different doctor to schedule appointment");

                        } else {
                            w.setSender(this.userAccount);
                            w.setStatus("Requested to Doctor");
                            w.setMessage("");
                            w.setIndividual(this.individual);
                            doctor.getWorkQueue().getWorkRequestList().add(w);
                            JOptionPane.showMessageDialog(null, individual.getFirstName() + " " + individual.getLastName() + " is in the waiting queue of doctor " + emp + " for scheduling an appointment.");
                        }
                        break;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a doctor to schedule an appointment.");
        }
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JTable doctorTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField registrationIDTextField;
    // End of variables declaration//GEN-END:variables
}
