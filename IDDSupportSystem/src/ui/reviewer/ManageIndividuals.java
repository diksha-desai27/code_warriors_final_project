/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.reviewer;

import business.employee.Employee;
import business.enterprise.Enterprise;
import business.individuals.Individual;
import business.individuals.IndividualDirectory;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kales
 */
public class ManageIndividuals extends javax.swing.JPanel {

    /**
     * Creates new form ManageIndividuals
     */
    
    JPanel userProcessContainer;
    UserAccount userAccount;
    IndividualDirectory individualDirectory;
    Individual individual;
    Enterprise enterprise;
    
    public ManageIndividuals(JPanel userProcessContainer,UserAccount userAccount, IndividualDirectory individualDirectory, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.individualDirectory = individualDirectory;
        this.enterprise = enterprise;
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
        individualTable = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstNameValue = new javax.swing.JLabel();
        lastNameValue = new javax.swing.JLabel();
        birthDateValue = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        disabilityValue = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        durationValue = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        servicesValue = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        assignCareGiverBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cityValue = new javax.swing.JLabel();
        assignTrainerBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Manage Individuals");

        individualTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Individual Registration ID", "Individual Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(individualTable);

        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Birth Date:");

        jLabel5.setText("Disability:");

        jLabel6.setText("Duration of Disability:");

        jLabel7.setText("Service Requested:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Individual Information");

        assignCareGiverBtn.setText("Assign Caregiver");
        assignCareGiverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignCareGiverBtnActionPerformed(evt);
            }
        });

        jLabel9.setText("City:");

        assignTrainerBtn.setText("Assign Trainer");
        assignTrainerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignTrainerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(servicesValue, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(disabilityValue, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(firstNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(birthDateValue, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(cityValue, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lastNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(durationValue, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(448, 448, 448))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(assignCareGiverBtn)
                        .addGap(30, 30, 30)
                        .addComponent(assignTrainerBtn)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewDetails))
                .addGap(23, 23, 23)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(firstNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel4))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(cityValue, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(birthDateValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(disabilityValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(durationValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(servicesValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lastNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignCareGiverBtn)
                    .addComponent(assignTrainerBtn))
                .addGap(154, 154, 154))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) individualTable.getModel();
        model.setRowCount(0);
        for(Individual i: this.individualDirectory.getIndividualList()) {
                Object[] row = new Object[4];
                row[0] = i.getRegistrationId();
                row[1] = i.getFirstName() + " " + i.getLastName();
                model.addRow(row);
        }
    }
    
    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
       int selectedRow = individualTable.getSelectedRow();
       if(selectedRow >= 0) {
           int id = (Integer)individualTable.getValueAt(selectedRow, 0);
           for(Individual i: this.individualDirectory.getIndividualList()) {
               if(i.getRegistrationId() == id)
               {
                   individual = i;
                   break;
               }
           }
           firstNameValue.setText(individual.getFirstName());
           lastNameValue.setText(individual.getLastName());
           birthDateValue.setText(individual.getBirthDate());
           cityValue.setText(individual.getCity());
           disabilityValue.setText(individual.getIddInfo().getdName());
           durationValue.setText(String.valueOf(individual.getIddInfo().getDuration()));
           servicesValue.setText(individual.getServiceType());
       }
       else
       {
           JOptionPane.showMessageDialog(null, "Please select a row");
       }
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void assignCareGiverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignCareGiverBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = individualTable.getSelectedRow();
        if(selectedRow >= 0) {
            int id = (Integer)individualTable.getValueAt(selectedRow, 0);
            for(Individual i: this.individualDirectory.getIndividualList()) {
                if(i.getRegistrationId() == id)
                {
                    individual = i;
                    break;
                }
            }
            AssignCareGiverJPanel assignCareGiver = new AssignCareGiverJPanel(userProcessContainer,userAccount, individual, this.enterprise);
            userProcessContainer.add("AssignCareGiver",assignCareGiver);

            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select an individual to assign it to the caregiver.");
        }
    }//GEN-LAST:event_assignCareGiverBtnActionPerformed

    private void assignTrainerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignTrainerBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = individualTable.getSelectedRow();
        if(selectedRow >= 0) {
            int id = (Integer)individualTable.getValueAt(selectedRow, 0);
            for(Individual i: this.individualDirectory.getIndividualList()) {
                if(i.getRegistrationId() == id)
                {
                    individual = i;
                    break;
                }
            }
            AssignCareGiverJPanel assignCareGiver = new AssignCareGiverJPanel(userProcessContainer,userAccount, individual, this.enterprise);
            userProcessContainer.add("AssignCareGiver",assignCareGiver);

            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select an individual to assign it to the trainer.");
        }
        
    }//GEN-LAST:event_assignTrainerBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignCareGiverBtn;
    private javax.swing.JButton assignTrainerBtn;
    private javax.swing.JLabel birthDateValue;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JLabel cityValue;
    private javax.swing.JLabel disabilityValue;
    private javax.swing.JLabel durationValue;
    private javax.swing.JLabel firstNameValue;
    private javax.swing.JTable individualTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameValue;
    private javax.swing.JLabel servicesValue;
    // End of variables declaration//GEN-END:variables
}
