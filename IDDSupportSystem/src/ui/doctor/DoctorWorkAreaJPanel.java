/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.doctor;

import business.useraccount.UserAccount;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.caregivers.AssignToDoctorJPanel;

/**
 *
 * @author sayalipathare
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount userAccount;
    WorkRequest wr;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        manageApplicantsJTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnDecline = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        jBtnViewReport = new javax.swing.JButton();

        jLabel1.setText("Doctor Work Area");

        manageApplicantsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Registration Id", "Applicant Name", "Sender", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(manageApplicantsJTable);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDecline.setText("Decline");
        btnDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineActionPerformed(evt);
            }
        });

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        jBtnViewReport.setText("View Report");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAccept)
                                .addGap(18, 18, 18)
                                .addComponent(btnDecline))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jBtnViewReport)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jBtnViewReport)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDecline)
                    .addComponent(btnBack)
                    .addComponent(btnAccept))
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) manageApplicantsJTable.getModel();
        dtm.setRowCount(0);
        if (this.userAccount.getWorkQueue().getWorkRequestList().size() > 0) {
            for (WorkRequest w : this.userAccount.getWorkQueue().getWorkRequestList()) {
                if (w.getIndividual() != null) {
                    Object row[] = new Object[5];
                    row[0] = w.getIndividual().getRegistrationId();
                    row[1] = w.getIndividual().getFirstName() + " " + w.getIndividual().getLastName();
                    row[2] = w.getSender();
                    row[3] = w.getStatus();
                    dtm.addRow(row);
                }

            }
        }
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineActionPerformed
        // TODO add your handling code here:
        int selectedRow = manageApplicantsJTable.getSelectedRow();
        //  UserAccount selectedUserAccount = null;
        if (selectedRow >= 0) {
            Integer registrationId = (Integer) manageApplicantsJTable.getValueAt(selectedRow, 0);
            for (WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()) {
                if (wr.getIndividual().getRegistrationId() == registrationId) {
                    if (wr.getStatus().equalsIgnoreCase("Requested to Doctor")) {
                        wr.setStatus("Declined");
                        wr.setSender(userAccount);
                        JOptionPane.showMessageDialog(null, "Request Declined successfully");
                        populateTable();
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "You cannot decline this request");
                    }
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a work request to take action.");
        }
    }//GEN-LAST:event_btnDeclineActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
       int selectedRow = manageApplicantsJTable.getSelectedRow();
       if(selectedRow >= 0)
       {
           int  id = (Integer) manageApplicantsJTable.getValueAt(selectedRow, 0);
           for (WorkRequest w : this.userAccount.getWorkQueue().getWorkRequestList()) {
                if (w.getIndividual().getRegistrationId() == id) 
                {
                   wr = w;
                   if(wr.getStatus().equalsIgnoreCase("Requested to Doctor"))
                   {
                       wr.setStatus("Accepted");
                       JOptionPane.showMessageDialog(null, "Request Accepted by doctor " + this.userAccount);
                       this.populateTable();
                       
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null, "You cannot accept this work request");
                   }
                   break;
                }

            }
       }
       else
       {
           JOptionPane.showMessageDialog(null, "Please select a work request to accept");
       }
    }//GEN-LAST:event_btnAcceptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDecline;
    private javax.swing.JButton jBtnViewReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable manageApplicantsJTable;
    // End of variables declaration//GEN-END:variables
}
