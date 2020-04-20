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
public class AssignCareGiverJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AssignCareGiverJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    Individual individual;
    Map<Employee, UserAccount> map;
    Enterprise enterprise;

    public AssignCareGiverJPanel(JPanel userProcessContainer, UserAccount userAccount, Individual individual, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.individual = individual;
        this.enterprise = enterprise;
        this.displayData();
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
        caregiverTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        firstNameValue = new javax.swing.JLabel();
        assignCareGiverBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lastNameValue = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        registrationValue = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Assign Care Giver");

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
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(caregiverTable);

        jLabel2.setText("First Name");

        assignCareGiverBtn.setText("Assign ");
        assignCareGiverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignCareGiverBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Last Name");

        jLabel4.setText("Registration #");

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(assignCareGiverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(firstNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(54, 54, 54)
                                    .addComponent(jLabel3)
                                    .addGap(28, 28, 28)
                                    .addComponent(lastNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(registrationValue, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(291, 291, 291)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(backBtn)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(199, 199, 199)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(150, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(registrationValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(firstNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lastNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(assignCareGiverBtn)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(416, Short.MAX_VALUE)))
        );
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
                if (ua.getRoleType().getValue().equalsIgnoreCase("Caregiver")) {
                    if (e.getStatus().equals("Available")) {
                        Object row[] = new Object[3];
                        row[0] = e;
                        row[1] = e.getStatus();
                        dtm.addRow(row);
                    }
                }

            }
        }
    }

    private void assignCareGiverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignCareGiverBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = caregiverTable.getSelectedRow();
        if (selectedRow >= 0) {
            UserAccount ua = null;
            Employee emp = null;
            Employee e = (Employee) caregiverTable.getValueAt(selectedRow, 0);
            Iterator empIterator = enterprise.getEmpMap().entrySet().iterator();

            while (empIterator.hasNext()) {
                Map.Entry mapElement = (Map.Entry) empIterator.next();
                Employee e1 = ((Employee) mapElement.getKey());
                UserAccount caregiver = ((UserAccount) mapElement.getValue());
                if (e1.equals(e)) {
                    ua = caregiver;
                    emp = e1;
                    break;
                }
            }
            if (ua != null) {
                for (WorkRequest w : this.userAccount.getWorkQueue().getWorkRequestList()) {
                    if ((w.getIndividual() != null) && (w.getIndividual().getRegistrationId() == this.individual.getRegistrationId())) {
                        w.setSender(this.userAccount);
                        w.setStatus("Assigned to Caregiver");
                        w.setMessage("");
                        w.setIndividual(this.individual);
                        ua.getWorkQueue().getWorkRequestList().add(w);
                        emp.setStatus("Reserved");
                        JOptionPane.showMessageDialog(null, individual.getFirstName() + " " + individual.getLastName() + " assigned to caregiver " + emp);
                        break;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameValue;
    private javax.swing.JLabel registrationValue;
    // End of variables declaration//GEN-END:variables
}
