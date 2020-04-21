/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.trainers;

import business.enterprise.Enterprise;
import business.history.IndividualHistory;
import business.useraccount.UserAccount;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.reviewer.ManageIndividuals;

/**
 *
 * @author kales
 */
public class AddHistoryJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    WorkRequest workRequest;

    /**
     * Creates new form AddHistoryJPanel
     */
    public AddHistoryJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, WorkRequest workRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.workRequest = workRequest;
        populateStatus();
    }

    public void populateStatus() {
        dpdStatus.removeAllItems();;
        dpdStatus.insertItemAt("--Select--", 0);
        dpdStatus.insertItemAt("Completed", 1);
        dpdStatus.insertItemAt("Rescheduled", 2);
        dpdStatus.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        appointmentDate = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        commentsTxtArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dpdStatus = new javax.swing.JComboBox<>();
        saveBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel2.setText("Appointment Date:");
        add(jLabel2);
        jLabel2.setBounds(50, 140, 119, 16);

        appointmentDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(appointmentDate);
        appointmentDate.setBounds(250, 140, 124, 26);

        jLabel5.setText("Comments:");
        add(jLabel5);
        jLabel5.setBounds(50, 210, 72, 16);

        commentsTxtArea.setColumns(20);
        commentsTxtArea.setRows(5);
        jScrollPane2.setViewportView(commentsTxtArea);

        add(jScrollPane2);
        jScrollPane2.setBounds(220, 210, 244, 84);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/SCHEDULINGHISTORY.png"))); // NOI18N
        jLabel8.setText("Meeting History Information");
        add(jLabel8);
        jLabel8.setBounds(26, 12, 410, 70);

        jLabel1.setText("Status:");
        add(jLabel1);
        jLabel1.setBounds(50, 340, 119, 26);

        dpdStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dpdStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpdStatusActionPerformed(evt);
            }
        });
        add(dpdStatus);
        dpdStatus.setBounds(220, 340, 244, 27);

        saveBtn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/save.png"))); // NOI18N
        saveBtn.setText("Save Details");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn);
        saveBtn.setBounds(280, 410, 180, 60);

        backBtn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/backbutton.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(20, 420, 120, 42);
    }// </editor-fold>//GEN-END:initComponents

    private void dpdStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpdStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpdStatusActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        if (commentsTxtArea.getText().equals("") || dpdStatus.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please enter all details");
        } else {
            for (IndividualHistory indHistory : workRequest.getIndividual().getHistory()) {
                if (indHistory.getStatus().equals("Meeting Scheduled")) {
                    indHistory.setComments(commentsTxtArea.getText());
                    indHistory.setStatus(dpdStatus.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(null, "Details Saved Successfully");
                }
            }

        }

    }//GEN-LAST:event_saveBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AddDetailsJPanel addDetailsJPanel = (AddDetailsJPanel) component;
        addDetailsJPanel.populateHistoryDetails();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appointmentDate;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextArea commentsTxtArea;
    private javax.swing.JComboBox<Object> dpdStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
