/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.nurse;

import business.EcoSystem;
import business.employee.Employee;
import business.enterprise.Enterprise;
import business.history.IndividualHistory;
import business.individuals.Individual;
import business.schedule.Schedule;
import business.useraccount.UserAccount;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.trainers.AddHistoryJPanel;

/**
 *
 * @author dikshadesai
 */
public class ScheduleMeetingJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    UserAccount userAccount;
    Individual individual;
    Enterprise enterprise;
    EcoSystem system;
    Schedule sch;
    List<String> slotList = new ArrayList<>();
    Map<Date, Map<String, Boolean>> dateSchedule;
    /**
     * Creates new form ScheduleMeetingJPanel
     * @param userProcessContainer
     * @param userAccount
     * @param individual
     * @param enterprise
     */
    public ScheduleMeetingJPanel(JPanel userProcessContainer, UserAccount userAccount, Individual individual, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.individual = individual;
        this.enterprise = enterprise;
        this.system = system;
        registrationIdValue.setText(String.valueOf(individual.getRegistrationId()));
        nameValue.setText(individual.getFirstName() + " " + individual.getLastName());
        
        //date validation
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);//15 year before
        Date min = cal.getTime();
        Calendar cal1 = Calendar.getInstance();
        cal1.add(Calendar.DATE, 30);//15 year before
        Date max = cal1.getTime();//actual date
        meetingDate.setSelectableDateRange(min, max);
        
        //iterate through map
        Iterator empIterator = enterprise.getSchedule().entrySet().iterator();
        System.out.println("empIterator: " + empIterator);
        while (empIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) empIterator.next();
            UserAccount user = ((UserAccount) mapElement.getKey());
            sch = ((Schedule) mapElement.getValue());
            if (user.equals(userAccount)) {
                dateSchedule = sch.getDateSchedule();
                break;
            }
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

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        individualHistoryTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        registrationIdValue = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameValue = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        meetingDate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        dpdMeetingTime = new javax.swing.JComboBox<>();
        btnConfirmMeeting = new javax.swing.JButton();
        btnAddDetails = new javax.swing.JButton();
        btnMarkAsCompleted = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        individualHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Meeting ID", "Name", "Date", "Comments", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        individualHistoryTable.setToolTipText("");
        jScrollPane1.setViewportView(individualHistoryTable);

        jLabel1.setText("Registration ID#");

        registrationIdValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Name");

        nameValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Date");

        meetingDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                meetingDatePropertyChange(evt);
            }
        });

        jLabel4.setText("Time");

        dpdMeetingTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnConfirmMeeting.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnConfirmMeeting.setIcon(new javax.swing.ImageIcon("/Users/sayalipathare/pathare_sayali_001029759/code_warriors_final_project/IDDSupportSystem/images/check.png")); // NOI18N
        btnConfirmMeeting.setText("Confirm Meeting");
        btnConfirmMeeting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmMeetingActionPerformed(evt);
            }
        });

        btnAddDetails.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnAddDetails.setIcon(new javax.swing.ImageIcon("/Users/sayalipathare/pathare_sayali_001029759/code_warriors_final_project/IDDSupportSystem/images/add.png")); // NOI18N
        btnAddDetails.setText("Add Details");
        btnAddDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDetailsActionPerformed(evt);
            }
        });

        btnMarkAsCompleted.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnMarkAsCompleted.setIcon(new javax.swing.ImageIcon("/Users/sayalipathare/pathare_sayali_001029759/code_warriors_final_project/IDDSupportSystem/images/checklist.png")); // NOI18N
        btnMarkAsCompleted.setText("Mark as Complete");
        btnMarkAsCompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkAsCompletedActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/time.png"))); // NOI18N
        jLabel5.setText("SCHEDULING MEETING");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 145, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnAddDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btnMarkAsCompleted, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 132, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dpdMeetingTime, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfirmMeeting)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meetingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrationIdValue, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(registrationIdValue, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(meetingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dpdMeetingTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(btnConfirmMeeting, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddDetails)
                    .addComponent(btnMarkAsCompleted))
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void meetingDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_meetingDatePropertyChange
        // TODO add your handling code here:
        Date date1 = meetingDate.getDate();
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        if (meetingDate.getDate() != null) {
            String appointmentFormatted = simpleDateFormat.format(date1);
            Iterator appointmentIterator = dateSchedule.entrySet().iterator();

            while (appointmentIterator.hasNext()) {
                Map.Entry mappedElement = (Map.Entry) appointmentIterator.next();
                Date date = ((Date) mappedElement.getKey());
                String newDate = simpleDateFormat.format(date);
                    
                if (appointmentFormatted.equals(newDate)) {
                    slotList.clear();
                    Map<String, Boolean> getTime = ((Map<String, Boolean>) mappedElement.getValue());
                    Iterator timeIterator = getTime.entrySet().iterator();

                    while (timeIterator.hasNext()) {
                        Map.Entry mappingElement = (Map.Entry) timeIterator.next();
                        String slot = ((String) mappingElement.getKey());
                        Boolean status = ((Boolean) mappingElement.getValue());
                        if (status) {
                            //  dateSchedule = sch.getDateSchedule();
                            slotList.add(slot);
                        }
                    }
                    populateDropdown(slotList);
                    break;
                }
            }
        }
    }//GEN-LAST:event_meetingDatePropertyChange

    private void btnConfirmMeetingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmMeetingActionPerformed
        // TODO add your handling code here:
        
        Date date1 = meetingDate.getDate();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dddd");

        if (date1 != null && dpdMeetingTime.getSelectedIndex() != 0) 
        {
            String meetingDate = simpleDateFormat.format(date1);
            Iterator meetingIterator = dateSchedule.entrySet().iterator();

            while (meetingIterator.hasNext()) {
                Map.Entry mappedElement = (Map.Entry) meetingIterator.next();
                Date date = ((Date) mappedElement.getKey());
                String newDate = simpleDateFormat.format(date);
                //  sch = ((Schedule) mapElement.getValue());
                Map<String, Boolean> getTime = ((Map<String, Boolean>) mappedElement.getValue());
                if (meetingDate.equals(newDate)) {
                    Iterator timeIterator = getTime.entrySet().iterator();

                    while (timeIterator.hasNext()) {
                        Map.Entry mappingElement = (Map.Entry) timeIterator.next();
                        String slot = ((String) mappingElement.getKey());
                        Boolean status = ((Boolean) mappingElement.getValue());
                        if (!dpdMeetingTime.getSelectedItem().equals("")) {
                            if (slot.equals(dpdMeetingTime.getSelectedItem())) {
                                status = false;
                                mappingElement.setValue(false);
                                break;
                            }
                        }
                    }
                    // populateTimeSlot(slotList);
                    if(individual.getHistory().isEmpty())
                    {
                        IndividualHistory history = new IndividualHistory();
                        history.setMeetingDate(date);
                        history.setStatus("Meeting Scheduled");
                        individual.getHistory().add(history);
                    }
                    else
                    {
                        for(IndividualHistory id: individual.getHistory())
                        {
                            if(date.equals(id.getMeetingDate()) || id.getMeetingDate().compareTo(date) > 0)
                            {
                                JOptionPane.showMessageDialog(null, "You can't schedule a meeting on this date.");
                                break;
                            }
                            else
                            {
                                IndividualHistory history = new IndividualHistory();
                                history.setMeetingDate(date);
                                history.setStatus("Meeting Scheduled");
                                individual.getHistory().add(history);
                                break;
                            }
                        }
                    }
                    

                    System.out.println("history " + individual.getHistory());
                }
            }
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Please select both time and date to schedule appointment");
        }
        this.populateTable(individual);
    }//GEN-LAST:event_btnConfirmMeetingActionPerformed

    private void btnAddDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = individualHistoryTable.getSelectedRow();
        if (selectedRow >= 0) 
        {
                IndividualHistory history = (IndividualHistory) individualHistoryTable.getValueAt(selectedRow, 0);
            String status = (String) individualHistoryTable.getValueAt(selectedRow, 4);
            if (status.equalsIgnoreCase("Meeting Scheduled")) 
            {
                AddMeetingHistoryJPanel addMeetingHistory = new AddMeetingHistoryJPanel(userProcessContainer, userAccount, enterprise, individual, history);
                userProcessContainer.add("addMeetingHistory", addMeetingHistory);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "You cannot add Details for this appointment");
            }

        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_btnAddDetailsActionPerformed

    private void btnMarkAsCompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkAsCompletedActionPerformed
        // TODO add your handling code here:
        int selectedRow = individualHistoryTable.getSelectedRow();
        if(selectedRow >= 0)
        {
            IndividualHistory history = (IndividualHistory) individualHistoryTable.getValueAt(selectedRow, 0);
            String status = (String) individualHistoryTable.getValueAt(selectedRow, 4);
            if(status.equalsIgnoreCase("Completed"))
            {
                for(WorkRequest w: userAccount.getWorkQueue().getWorkRequestList())
                {
                    if(w.getIndividual().equals(individual))
                    {
                        w.setSender(userAccount);
                        w.setStatus("Medication Completed");
                        JOptionPane.showMessageDialog(null, "Status updated successfully");
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You cannot mark the request as compeleted");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row.");
        }
    
        
    }//GEN-LAST:event_btnMarkAsCompletedActionPerformed
    
    public void populateTable(Individual individual)
    {
        DefaultTableModel dtm = (DefaultTableModel) individualHistoryTable.getModel();
        dtm.setRowCount(0);
        for(IndividualHistory history: individual.getHistory())
        {
            Object[] row = new Object[6];
            row[0] = history.getAppointmentId();
            row[1] = individual.getFirstName() + " " + individual.getLastName();
            row[2] = history.getMeetingDate();
            row[3] = history.getComments();
            row[4] = history.getStatus();
            dtm.addRow(row);
        }  
    }
    
    public void populateDropdown(List<String> slotList)
    {
        dpdMeetingTime.removeAllItems();
        dpdMeetingTime.insertItemAt("--Select--", 0);
        dpdMeetingTime.setSelectedIndex(0);
        for (String s : slotList) {
            dpdMeetingTime.addItem(s);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDetails;
    private javax.swing.JButton btnConfirmMeeting;
    private javax.swing.JButton btnMarkAsCompleted;
    private javax.swing.JComboBox<String> dpdMeetingTime;
    private javax.swing.JTable individualHistoryTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JDateChooser meetingDate;
    private javax.swing.JLabel nameValue;
    private javax.swing.JLabel registrationIdValue;
    // End of variables declaration//GEN-END:variables
}
