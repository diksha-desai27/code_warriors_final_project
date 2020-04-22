/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.nurse;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.individuals.Individual;
import business.useraccount.UserAccount;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sayalipathare
 */
public class NurseWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount userAccount;
    Enterprise enterprise;
    EcoSystem system;
    Individual individual;
    /**
     * Creates new form NurseWorkAreaJPanel
     * @param userProcessContainer
     * @param userAccount
     * @param enterprise
     * @param system
     */
    public NurseWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        individualsListTable = new javax.swing.JTable();
        btnSchedule = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        individualsListTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(individualsListTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 100, 594, 125);

        btnSchedule.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/workSchedule.png"))); // NOI18N
        btnSchedule.setText("Schedule Meeting");
        btnSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleActionPerformed(evt);
            }
        });
        add(btnSchedule);
        btnSchedule.setBounds(410, 250, 200, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/nurseScheduling.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(550, 280, 310, 340);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/nurse.png"))); // NOI18N
        jLabel3.setText("   NURSE WORK AREA");
        add(jLabel3);
        jLabel3.setBounds(30, 6, 410, 50);
    }// </editor-fold>//GEN-END:initComponents
    
    public void populateTable() {
         DefaultTableModel dtm = (DefaultTableModel) individualsListTable.getModel();
            dtm.setRowCount(0);
            if(this.userAccount.getWorkQueue().getWorkRequestList().size() > 0) 
            {
                for (WorkRequest w : this.userAccount.getWorkQueue().getWorkRequestList()) 
                {
                    if(w.getIndividual()!= null)
                    {
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
    
    private void btnScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleActionPerformed
        // TODO add your handling code here:
        int selectedRow = individualsListTable.getSelectedRow();
        if(selectedRow >= 0) 
        {
            int id = (Integer)individualsListTable.getValueAt(selectedRow, 0);
            for(Individual i: system.getIndividualDirectory().getIndividualList()){
                if(i.getRegistrationId() == id)
                {
                    individual = i;
                }
            }
            
            for(WorkRequest w: this.userAccount.getWorkQueue().getWorkRequestList())
            {
                if(w.getIndividual().equals(individual))
                {
                    if(w.getStatus().equalsIgnoreCase("Assigned to Nurse"))
                    {
                        ScheduleMeetingJPanel schedule = new ScheduleMeetingJPanel(userProcessContainer, userAccount, individual, enterprise, system);
                        userProcessContainer.add("schedule",schedule);

                        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                        layout.next(userProcessContainer);
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "You cannot schedule the meeting.");
                       
                    }
                    break;
                }
            }

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select an individual to view details.");
        }
    }//GEN-LAST:event_btnScheduleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSchedule;
    private javax.swing.JTable individualsListTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
