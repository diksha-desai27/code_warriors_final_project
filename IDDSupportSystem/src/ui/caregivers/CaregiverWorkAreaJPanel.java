/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.caregivers;

import business.EcoSystem;
import business.employee.Employee;
import business.enterprise.Enterprise;
import business.history.IndividualHistory;
import business.individuals.Individual;
import business.useraccount.UserAccount;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sayalipathare
 */
public class CaregiverWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount userAccount;
    Individual individual;
    Enterprise enterprise;
    EcoSystem system;

    /**
     * Creates new form CaregiverWorkAreaJPanel
     *
     * @param userProcessContainer
     * @param userAccount
     * @param enterprise
     * @param system
     */
    public CaregiverWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, EcoSystem system) {
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
        manageApplicantsTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        individualHistoryTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnShowHistory = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnMarkAsComplete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        manageApplicantsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(manageApplicantsTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(50, 120, 594, 125);

        btnBack.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/backbutton.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(20, 270, 100, 42);

        btnAssign.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnAssign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/request.png"))); // NOI18N
        btnAssign.setText("Assign to Doctor");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign);
        btnAssign.setBounds(280, 270, 171, 42);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Manage Applicants");
        add(jLabel1);
        jLabel1.setBounds(260, 90, 190, 36);

        individualHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Meeting ID", "Date", "Comments", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        individualHistoryTable.setToolTipText("");
        jScrollPane2.setViewportView(individualHistoryTable);

        add(jScrollPane2);
        jScrollPane2.setBounds(50, 430, 594, 112);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Appointment History");
        add(jLabel2);
        jLabel2.setBounds(260, 390, 200, 36);

        btnShowHistory.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnShowHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/SCHEDULINGHISTORY.png"))); // NOI18N
        btnShowHistory.setText("Show Appointment History");
        btnShowHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowHistoryActionPerformed(evt);
            }
        });
        add(btnShowHistory);
        btnShowHistory.setBounds(490, 350, 260, 50);
        add(jSeparator1);
        jSeparator1.setBounds(20, 330, 745, 12);

        btnMarkAsComplete.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnMarkAsComplete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewImages/check.png"))); // NOI18N
        btnMarkAsComplete.setText("Mark As Complete");
        btnMarkAsComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkAsCompleteActionPerformed(evt);
            }
        });
        add(btnMarkAsComplete);
        btnMarkAsComplete.setBounds(470, 270, 195, 49);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/caregiver.png"))); // NOI18N
        jLabel3.setText("CAREGIVER WORK AREA");
        add(jLabel3);
        jLabel3.setBounds(30, 30, 370, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/BackgroundBlue.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4);
        jLabel4.setBounds(75, 36, 730, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/disability12.gif"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(420, 540, 370, 140);
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) manageApplicantsTable.getModel();
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

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = manageApplicantsTable.getSelectedRow();
        if (selectedRow >= 0) {
            int id = (Integer) manageApplicantsTable.getValueAt(selectedRow, 0);
            if (this.userAccount.getWorkQueue().getWorkRequestList().size() > 0) {
                for (WorkRequest w : this.userAccount.getWorkQueue().getWorkRequestList()) {
                    if (w.getIndividual().getRegistrationId() == id) {
                        if (w.getStatus().equalsIgnoreCase("Assigned to caregiver") || w.getStatus().equalsIgnoreCase("Declined")) {
                            individual = w.getIndividual();
                            AssignToDoctorJPanel assignToDoctorJPanel = new AssignToDoctorJPanel(userProcessContainer, userAccount, individual, enterprise, system);
                            userProcessContainer.add("assignToDoctorJPanel", assignToDoctorJPanel);
                            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                            layout.next(userProcessContainer);
                        } else {
                            JOptionPane.showMessageDialog(null, "You cannot procces this request.");
                        }

                    }
                    break;

                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select the individual to schedule an appointment with the Doctor.");
        }


    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnShowHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowHistoryActionPerformed
        // TODO add your handling code here:
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        int selectedRow = manageApplicantsTable.getSelectedRow();
        if (selectedRow >= 0) {
            int id = (Integer) manageApplicantsTable.getValueAt(selectedRow, 0);
            for (Individual i : system.getIndividualDirectory().getIndividualList()) {
                if (i.getRegistrationId() == id) {
                    this.individual = i;
                    break;
                }
            }
            DefaultTableModel dtm = (DefaultTableModel) individualHistoryTable.getModel();
            dtm.setRowCount(0);
            if (!individual.getHistory().isEmpty()) {
                for (IndividualHistory inh : individual.getHistory()) {
                    Object row[] = new Object[4];
                    row[0] = inh;
                    row[1] = simpleDateFormat.format(inh.getMeetingDate());
                    row[2] = inh.getComments();
                    row[3] = inh.getStatus();
                    dtm.addRow(row);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No appointments to show");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select the individual to show Appointment History.");
        }
    }//GEN-LAST:event_btnShowHistoryActionPerformed

    private void btnMarkAsCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkAsCompleteActionPerformed
        // TODO add your handling code here:
        Individual ind = null;
        int selectedRow = manageApplicantsTable.getSelectedRow();
        if (selectedRow >= 0) {
            int id = (Integer) manageApplicantsTable.getValueAt(selectedRow, 0);
            for (Individual i : system.getIndividualDirectory().getIndividualList()) {
                if (i.getRegistrationId() == id) {
                    ind = i;
                    break;
                }
            }

            if (userAccount.getWorkQueue().getWorkRequestList().size() > 0) {
                for (WorkRequest w : userAccount.getWorkQueue().getWorkRequestList()) {
                    if (w.getIndividual().equals(ind)) {
                        if (w.getStatus().equalsIgnoreCase("Medication Completed")) {
                            w.setStatus("Request Completed");
                            JOptionPane.showMessageDialog(null, "Meication Request Completed Successflly");
                            sendEmail(w);
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "You cannot mark it as complete.");
                        }

                    }

                }
            }

            Iterator map = enterprise.getEmpMap().entrySet().iterator();

            while (map.hasNext()) {
                Map.Entry mapElement = (Map.Entry) map.next();
                Employee e = ((Employee) mapElement.getKey());
                UserAccount ua = ((UserAccount) mapElement.getValue());

                if (userAccount.equals(ua)) {
                    e.setStatus("Available");
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select the individual.");
        }
        this.populateTable();
    }//GEN-LAST:event_btnMarkAsCompleteActionPerformed

    public void sendEmail(WorkRequest workRequest) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        String string1 = "Hello,<br/>Thank you for choosing IDD Service System. We are glad to let you know that you medical service has been successfully completed.<br/>Please provide feedback for your services by going into your MYACCOUNT section.<br/>Thanks,IDD Support Team";
        Session session = Session.getDefaultInstance(props);
        try {
            InternetAddress fromAddress = new InternetAddress("growinggreen04@gmail.com");
            InternetAddress toAddress = new InternetAddress(workRequest.getIndividual().getUserName());

            Message message = new MimeMessage(session);
            message.setFrom(fromAddress);
            message.setRecipient(Message.RecipientType.TO, toAddress);
            message.setSubject("IDD System Appointment Confirmation");
            message.setContent(string1, "text/html");

            Transport.send(message, "growinggreen04@gmail.com", "growinggreen@123");
        } catch (MessagingException ex) {
            ex.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnMarkAsComplete;
    private javax.swing.JButton btnShowHistory;
    private javax.swing.JTable individualHistoryTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable manageApplicantsTable;
    // End of variables declaration//GEN-END:variables
}
