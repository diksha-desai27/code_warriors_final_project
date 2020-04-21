/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.individuals;

import business.EcoSystem;
import business.employee.Employee;
import business.enterprise.Enterprise;
import business.individuals.Individual;
import business.useraccount.UserAccount;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kales
 */
public class IndividualMyAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form IndividualMyAccountJPanel
     */
    EcoSystem ecoSystem;
    JPanel rightJPanel;
    Individual individual;
    UserAccount userAccount;
    ArrayList<Enterprise> facilityList;
    boolean flag = false;

    public IndividualMyAccountJPanel(JPanel rightJPanel, UserAccount userAccount, Individual individual, ArrayList<Enterprise> facilityList) {
        initComponents();
        this.rightJPanel = rightJPanel;
        this.individual = individual;
        this.facilityList = facilityList;
        this.userAccount = userAccount;
        firstNamejTextField.setText(individual.getFirstName());
        lastNamejTextField.setText(individual.getLastName());
        userNamejTextField.setText(individual.getUserName());

        firstNamejTextField.setEnabled(false);
        lastNamejTextField.setEnabled(false);
        userNamejTextField.setEnabled(false);

        if (userAccount.getWorkQueue().getWorkRequestList().isEmpty()) {
            this.populateFacilities();
            facilityJTable.setVisible(true);
            this.requestFacilityBtn.setVisible(true);
            this.btnAvailableFacility.setVisible(true);
            this.requestJLabel.setVisible(false);
        } else {
            for (WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()) {
                if (!wr.getStatus().equalsIgnoreCase("Completed")) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                facilityJTable.setVisible(false);
                this.requestFacilityBtn.setEnabled(false);
                this.btnAvailableFacility.setEnabled(false);
                this.requestJLabel.setVisible(true);
                this.populateData();
            } else {
                this.populateFacilities();
                facilityJTable.setVisible(true);
                this.requestFacilityBtn.setVisible(true);
                this.btnAvailableFacility.setVisible(true);
                this.individualWRequestJTable.setVisible(false);
                this.requestJLabel.setVisible(false);
            }

        }

    }

    public void populateData() {
        DefaultTableModel model = (DefaultTableModel) individualWRequestJTable.getModel();
        model.setRowCount(0);

        for (WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[4];
            row[0] = wr.getRequestId();
            row[1] = wr.getSender();
            row[2] = wr.getReceiver();
            row[3] = wr.getStatus();
            model.addRow(row);
        }
    }

    private void populateFacilities() {
        DefaultTableModel model = (DefaultTableModel) facilityJTable.getModel();
        model.setRowCount(0);
        for (Enterprise e : facilityList) {
            Object[] row = new Object[1];
            row[0] = e;
            model.addRow(row);
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
        jLabel2 = new javax.swing.JLabel();
        firstNamejTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lastNamejTextField = new javax.swing.JTextField();
        userNameLabel = new javax.swing.JLabel();
        userNamejTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordJField = new javax.swing.JPasswordField();
        confirmLabel = new javax.swing.JLabel();
        confirmJPassword = new javax.swing.JPasswordField();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        individualWRequestJTable = new javax.swing.JTable();
        requestJLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        facilityJTable = new javax.swing.JTable();
        requestFacilityBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnAvailableFacility = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        requestFacilityBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MY ACCOUNT");
        add(jLabel1);
        jLabel1.setBounds(110, 30, 570, 40);

        jLabel2.setText("First Name");
        add(jLabel2);
        jLabel2.setBounds(6, 127, 76, 20);
        add(firstNamejTextField);
        firstNamejTextField.setBounds(161, 122, 164, 26);

        jLabel3.setText("Last Name");
        add(jLabel3);
        jLabel3.setBounds(6, 169, 84, 26);
        add(lastNamejTextField);
        lastNamejTextField.setBounds(161, 169, 164, 26);

        userNameLabel.setText("User Name");
        add(userNameLabel);
        userNameLabel.setBounds(10, 220, 102, 20);
        add(userNamejTextField);
        userNamejTextField.setBounds(160, 210, 164, 26);

        passwordLabel.setText("Password");
        add(passwordLabel);
        passwordLabel.setBounds(10, 260, 331, 20);
        add(passwordJField);
        passwordJField.setBounds(160, 250, 164, 26);

        confirmLabel.setText("Confirm Password");
        add(confirmLabel);
        confirmLabel.setBounds(10, 300, 137, 26);
        add(confirmJPassword);
        confirmJPassword.setBounds(160, 300, 164, 26);

        btnUpdate.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/refresh.png"))); // NOI18N
        btnUpdate.setText("Update ");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(100, 342, 160, 50);

        individualWRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Request ID", "Sender", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(individualWRequestJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 650, 601, 97);

        requestJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        requestJLabel.setText("MY REQUESTS");
        add(requestJLabel);
        requestJLabel.setBounds(30, 600, 172, 29);

        facilityJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Facility Name", "Facility Contact Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(facilityJTable);

        add(jScrollPane2);
        jScrollPane2.setBounds(6, 484, 501, 97);

        requestFacilityBtn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        requestFacilityBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/request.png"))); // NOI18N
        requestFacilityBtn.setText("Request Facility ");
        requestFacilityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestFacilityBtnActionPerformed(evt);
            }
        });
        add(requestFacilityBtn);
        requestFacilityBtn.setBounds(530, 480, 170, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("AVAILABLE FACILITY ");
        add(jLabel5);
        jLabel5.setBounds(20, 430, 270, 29);

        btnAvailableFacility.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnAvailableFacility.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/time.png"))); // NOI18N
        btnAvailableFacility.setText("Check Available Facility ");
        btnAvailableFacility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailableFacilityActionPerformed(evt);
            }
        });
        add(btnAvailableFacility);
        btnAvailableFacility.setBounds(290, 342, 230, 50);

        jLabel6.setBackground(new java.awt.Color(107, 200, 223));
        jLabel6.setForeground(new java.awt.Color(102, 204, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/patient.png"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(20, 20, 70, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/back.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4);
        jLabel4.setBounds(80, 20, 560, 60);

        requestFacilityBtn1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        requestFacilityBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/request.png"))); // NOI18N
        requestFacilityBtn1.setText("Add Feedback");
        requestFacilityBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestFacilityBtn1ActionPerformed(evt);
            }
        });
        add(requestFacilityBtn1);
        requestFacilityBtn1.setBounds(630, 650, 170, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        if (passwordPatternCorrect()) {
            if (String.valueOf(passwordJField.getPassword()).equals(String.valueOf(confirmJPassword.getPassword()))) {
                userAccount.setPassword(String.valueOf(passwordJField.getPassword()));
                JOptionPane.showMessageDialog(null, "Password Updated Successfully!!");
                this.passwordJField.setText("");
                this.confirmJPassword.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Password and Confirm Password do not match.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter valid password");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void requestFacilityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestFacilityBtnActionPerformed
        int selectedRow = facilityJTable.getSelectedRow();
        UserAccount selectedUserAccount = null;
        if (selectedRow >= 0) {
            Enterprise enteprise = (Enterprise) facilityJTable.getValueAt(selectedRow, 0);
            Iterator empIterator = enteprise.getEmpMap().entrySet().iterator();

            while (empIterator.hasNext()) {
                Map.Entry mapElement = (Map.Entry) empIterator.next();
                Employee e = ((Employee) mapElement.getKey());
                UserAccount ua = ((UserAccount) mapElement.getValue());
                if (ua.getRoleType().getValue().equals("Reviewer")) {
                    selectedUserAccount = ua;
                    break;
                }
            }
            if (selectedUserAccount == null) {
                JOptionPane.showMessageDialog(null, "Oops!! We cannot process your request at this time");
                return;
            } else {
                WorkRequest workRequest = new WorkRequest();
                workRequest.setSender(userAccount);
                workRequest.setStatus("Requested Facility");
                workRequest.setMessage("");
                workRequest.setIndividual(individual);
                JOptionPane.showMessageDialog(null, "Facility Requested Successfully!!. Please keep a track of your request present in 'MyAccount' section");
                userAccount.getWorkQueue().getWorkRequestList().add(workRequest);
                selectedUserAccount.getWorkQueue().getWorkRequestList().add(workRequest);
                //       rightJPanel.remove(this);
                populateData();
                //  this.facilityJTable.setVisible(false);
                this.requestFacilityBtn.setEnabled(false);
                this.btnAvailableFacility.setEnabled(false);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a facility");
        }

    }//GEN-LAST:event_requestFacilityBtnActionPerformed

    private void btnAvailableFacilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailableFacilityActionPerformed
        // TODO add your handling code here:
        this.facilityJTable.setVisible(true);
        this.requestFacilityBtn.setVisible(true);
    }//GEN-LAST:event_btnAvailableFacilityActionPerformed

    private void requestFacilityBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestFacilityBtn1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = individualWRequestJTable.getSelectedRow();
        if (selectedRow >= 0) {
            WorkRequest wr = (WorkRequest) individualWRequestJTable.getValueAt(selectedRow, 0);
            
            if (wr.getStatus().equals("Completed") || wr.getStatus().equalsIgnoreCase("Request Completed")) {
                FeedbackJPanel feedbackJPanel = new FeedbackJPanel(rightJPanel, userAccount, wr, individual, facilityList);
                rightJPanel.add("FeedbackJPanel", feedbackJPanel);
                CardLayout layout = (CardLayout) rightJPanel.getLayout();
                layout.next(rightJPanel);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to proceed");
        }
    }//GEN-LAST:event_requestFacilityBtn1ActionPerformed

    private boolean passwordPatternCorrect() {
        Pattern q = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=_])(?=\\S+$).{6,20}$");
        Matcher n = q.matcher(String.valueOf(passwordJField.getPassword()));
        Boolean c = n.matches();
        return c;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvailableFacility;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPasswordField confirmJPassword;
    private javax.swing.JLabel confirmLabel;
    private javax.swing.JTable facilityJTable;
    private javax.swing.JTextField firstNamejTextField;
    private javax.swing.JTable individualWRequestJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastNamejTextField;
    private javax.swing.JPasswordField passwordJField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton requestFacilityBtn;
    private javax.swing.JButton requestFacilityBtn1;
    private javax.swing.JLabel requestJLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNamejTextField;
    // End of variables declaration//GEN-END:variables
}
