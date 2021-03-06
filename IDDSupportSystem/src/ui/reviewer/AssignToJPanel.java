/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.reviewer;

import business.employee.Employee;
import business.enterprise.Enterprise;
import business.individuals.Individual;
import business.role.CaregiverRole;
import business.useraccount.UserAccount;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kales
 */
public class AssignToJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AssignToJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    Individual individual;
    Map<Employee, UserAccount> map;
    Enterprise enterprise;
    String role;

    public AssignToJPanel(JPanel userProcessContainer, UserAccount userAccount, Individual individual, Enterprise enterprise, String role) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.individual = individual;
        this.enterprise = enterprise;
        this.role = role;
        this.displayData();
        this.populateTable();
        if (individual.getServiceType().equals("Medical")) {
            jLabel5.setText("Care Giver");
        } else {
            jLabel5.setText("Trainer");
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        caregiverTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        firstNameValue = new javax.swing.JLabel();
        assignCareGiverBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lastNameValue = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        registrationValue = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewImages/reviewER.png"))); // NOI18N
        jLabel1.setText("ASSIGN WORK REQUEST");
        add(jLabel1);
        jLabel1.setBounds(30, 10, 390, 50);

        caregiverTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(caregiverTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(120, 210, 484, 105);

        jLabel2.setText("First Name");
        add(jLabel2);
        jLabel2.setBounds(120, 150, 68, 16);

        firstNameValue.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        firstNameValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(firstNameValue);
        firstNameValue.setBounds(240, 150, 120, 26);

        assignCareGiverBtn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        assignCareGiverBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/request.png"))); // NOI18N
        assignCareGiverBtn.setText("Assign ");
        assignCareGiverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignCareGiverBtnActionPerformed(evt);
            }
        });
        add(assignCareGiverBtn);
        assignCareGiverBtn.setBounds(441, 360, 170, 40);

        jLabel3.setText("Last Name");
        add(jLabel3);
        jLabel3.setBounds(390, 150, 66, 16);

        lastNameValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(lastNameValue);
        lastNameValue.setBounds(480, 150, 105, 26);

        jLabel4.setText("Registration #");
        add(jLabel4);
        jLabel4.setBounds(120, 100, 88, 20);

        registrationValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(registrationValue);
        registrationValue.setBounds(240, 100, 120, 26);

        backBtn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/backbutton.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(20, 360, 110, 40);
        add(jLabel5);
        jLabel5.setBounds(275, 6, 108, 34);
    }// </editor-fold>//GEN-END:initComponents

    public void displayData() {
        registrationValue.setText(String.valueOf(this.individual.getRegistrationId()));
        firstNameValue.setText(this.individual.getFirstName());
        lastNameValue.setText(this.individual.getLastName());
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) caregiverTable.getModel();
        dtm.setRowCount(0);
        if (enterprise.getEmpMap() != null) {
            Iterator empIterator = enterprise.getEmpMap().entrySet().iterator();

            while (empIterator.hasNext()) {
                Map.Entry mapElement = (Map.Entry) empIterator.next();
                Employee e = ((Employee) mapElement.getKey());
                UserAccount ua = ((UserAccount) mapElement.getValue());

                if (role.equalsIgnoreCase("caregiver")) {
                    if (ua.getRoleType().getValue().equalsIgnoreCase("Caregiver")) {
                        if (e.getStatus().equals("Available")) {
                            Object row[] = new Object[2];
                            row[0] = e;
                            row[1] = e.getStatus();
                            dtm.addRow(row);
                        }
                    }
                } else {
                    if (ua.getRoleType().getValue().equalsIgnoreCase("Trainer")) {
                        Object row[] = new Object[2];
                        row[0] = e;
                        dtm.addRow(row);
                    }
                }

            }
        }
    }

    private void assignCareGiverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignCareGiverBtnActionPerformed
        // TODO add your handling code here:'
        UserAccount caregiver = null;
        int selectedRow = caregiverTable.getSelectedRow();
        if (selectedRow >= 0) {
            UserAccount ua = null;
            Employee emp = null;
            Employee e = (Employee) caregiverTable.getValueAt(selectedRow, 0);
            Iterator empIterator = enterprise.getEmpMap().entrySet().iterator();

            while (empIterator.hasNext()) {
                Map.Entry mapElement = (Map.Entry) empIterator.next();
                Employee e1 = ((Employee) mapElement.getKey());
                caregiver = ((UserAccount) mapElement.getValue());
                if (e1.equals(e)) {
                    ua = caregiver;
                    emp = e1;
                    break;
                }
            }
            if (ua != null) {
                for (WorkRequest w : this.userAccount.getWorkQueue().getWorkRequestList()) {
                    if ((w.getIndividual() != null) && (w.getIndividual().getRegistrationId() == this.individual.getRegistrationId())) {
                        if (individual.getServiceType().equals("MedicalService")) {
                            w.setSender(this.userAccount);
                            w.setStatus("Assigned to Caregiver");
                            w.setMessage("");
                            w.setReceiver(caregiver);
                            w.setIndividual(this.individual);
                            ua.getWorkQueue().getWorkRequestList().add(w);
                            emp.setStatus("Reserved");
                            JOptionPane.showMessageDialog(null, individual.getFirstName() + " " + individual.getLastName() + " assigned to caregiver " + emp);
                            break;
                        } else {

                            w.setSender(this.userAccount);
                            w.setStatus("Assigned to Trainer");
                            w.setMessage("");
                            //w.setReceiver(caregiver);
                            w.setIndividual(this.individual);
                            ua.getWorkQueue().getWorkRequestList().add(w);
                            JOptionPane.showMessageDialog(null, individual.getFirstName() + " " + individual.getLastName() + " assigned to trainer " + emp);
                            break;
                        }
                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a caregiver to assign.");
        }

    }//GEN-LAST:event_assignCareGiverBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageIndividuals manageIndividuals = (ManageIndividuals) component;
        manageIndividuals.populateTable();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignCareGiverBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable caregiverTable;
    private javax.swing.JLabel firstNameValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameValue;
    private javax.swing.JLabel registrationValue;
    // End of variables declaration//GEN-END:variables
}
