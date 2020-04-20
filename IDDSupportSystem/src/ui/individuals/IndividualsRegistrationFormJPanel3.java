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
import business.network.Network;
import business.organization.Organization;
import business.role.ReviewerRole;
import business.role.Role;
import business.role.Role.RoleType;
import business.useraccount.UserAccount;
import business.workqueue.WorkQueue;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sayalipathare
 */
public class IndividualsRegistrationFormJPanel3 extends javax.swing.JPanel {

    /**
     * Creates new form IndividualsRegistrationFormJPanel3
     */
    EcoSystem ecoSystem;
    JPanel rightJPanel;
    Individual individual;
    UserAccount userAccount;
    ArrayList<Enterprise> facilityList;

    public IndividualsRegistrationFormJPanel3(JPanel rightJPanel, UserAccount userAccount, Individual individual, ArrayList<Enterprise> facilityList) {
        initComponents();
        this.facilityList = facilityList;
        this.rightJPanel = rightJPanel;
        this.individual = individual;
        this.userAccount = userAccount;
        populateFacilities();
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
        facilityJTable = new javax.swing.JTable();
        requestFacilityBtn = new javax.swing.JButton();

        jLabel1.setText("**Welcome to IDD Massachusetts Centre**");

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
        jScrollPane1.setViewportView(facilityJTable);

        requestFacilityBtn.setText("Request Facility ");
        requestFacilityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestFacilityBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(requestFacilityBtn)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(requestFacilityBtn)
                .addContainerGap(345, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
            System.out.println("Helo" + selectedUserAccount);
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
                rightJPanel.remove(this);
                IndividualMyAccountJPanel individualMyAccount = new IndividualMyAccountJPanel(rightJPanel, userAccount, individual,facilityList);
                rightJPanel.add("individualMyAccount", individualMyAccount);
                CardLayout layout = (CardLayout) rightJPanel.getLayout();
                layout.next(rightJPanel);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a facility");
        }


    }//GEN-LAST:event_requestFacilityBtnActionPerformed

    private void populateFacilities() {
        DefaultTableModel model = (DefaultTableModel) facilityJTable.getModel();
        model.setRowCount(0);
        for (Enterprise e : facilityList) {
            Object[] row = new Object[2];
            row[0] = e;
            model.addRow(row);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable facilityJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton requestFacilityBtn;
    // End of variables declaration//GEN-END:variables
}
