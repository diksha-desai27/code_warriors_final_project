/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.trainers;

import business.enterprise.Enterprise;
import business.history.IndividualHistory;
import business.individuals.Individual;
import business.network.Network;
import business.schedule.Schedule;
import business.useraccount.UserAccount;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
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
import ui.systemadmin.ManageNetworkJPanel;

/**
 *
 * @author kales
 */
public class AddDetailsJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    WorkRequest workRequest;
    Schedule sch;
    Map<Date, Map<String, Boolean>> dateSchedule;
    List<String> slotList = new ArrayList<>();

    /**
     * Creates new form AddDetailsJPanel
     */
    public AddDetailsJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, WorkRequest workRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.workRequest = workRequest;
        populateHistoryDetails();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);//15 year before
        Date min = cal.getTime();
        Calendar cal1 = Calendar.getInstance();
        cal1.add(Calendar.DATE, 30);//15 year before
        Date max = cal1.getTime();//actual date
        appointmentDatehooser.setSelectableDateRange(min, max);
        this.firstNameValue.setText(workRequest.getIndividual().getFirstName());
        this.lastNameValue.setText(workRequest.getIndividual().getLastName());
        Iterator empIterator = enterprise.getSchedule().entrySet().iterator();
        while (empIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) empIterator.next();
            UserAccount user = ((UserAccount) mapElement.getKey());
            sch = ((Schedule) mapElement.getValue());
            if (user.equals(account)) {
                dateSchedule = sch.getDateSchedule();
                break;
            }
        }
    }

    public void populateTimeSlot(List<String> slotList) {
        dpdTime.removeAllItems();
        dpdTime.insertItemAt("--Select--", 0);
        dpdTime.setSelectedIndex(0);
        for (String s : slotList) {
            dpdTime.addItem(s);
        }

    }

    public void populateHistoryDetails() {
        
           String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        DefaultTableModel model = (DefaultTableModel) historyJTable.getModel();
        model.setRowCount(0);

        for (IndividualHistory ins : workRequest.getIndividual().getHistory()) {

            Object[] row = new Object[5];
            row[0] = ins;
            row[1] = simpleDateFormat.format(ins.getMeetingDate());
            row[2] = ins.getComments();
            row[3] = ins.getStatus();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstNameValue = new javax.swing.JLabel();
        lastNameValue = new javax.swing.JLabel();
        birthDateValue = new javax.swing.JLabel();
        disabilityValue = new javax.swing.JLabel();
        durationValue = new javax.swing.JLabel();
        servicesValue = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        scheduleAppointmentBtn = new javax.swing.JButton();
        cityValue = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        appointmentDatehooser = new com.toedter.calendar.JDateChooser();
        dpdTime = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        disabailityValue = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyJTable = new javax.swing.JTable();
        meetingDetailsBtn = new javax.swing.JButton();
        completedBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setText("First Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 190, 72, 20);

        jLabel3.setText("Last Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 190, 80, 20);

        firstNameValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(firstNameValue);
        firstNameValue.setBounds(160, 190, 130, 26);

        lastNameValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lastNameValue);
        lastNameValue.setBounds(450, 190, 160, 26);

        birthDateValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(birthDateValue);
        birthDateValue.setBounds(630, 230, 150, 30);
        jPanel1.add(disabilityValue);
        disabilityValue.setBounds(646, 415, 132, 20);
        jPanel1.add(durationValue);
        durationValue.setBounds(1397, 140, 90, 20);
        jPanel1.add(servicesValue);
        servicesValue.setBounds(1015, 459, 400, 26);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Individual Information");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(250, 120, 229, 32);

        scheduleAppointmentBtn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        scheduleAppointmentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/time.png"))); // NOI18N
        scheduleAppointmentBtn.setText("Schedule Appointment");
        scheduleAppointmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleAppointmentBtnActionPerformed(evt);
            }
        });
        jPanel1.add(scheduleAppointmentBtn);
        scheduleAppointmentBtn.setBounds(420, 330, 206, 42);

        cityValue.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cityValue);
        cityValue.setBounds(646, 370, 108, 16);

        jLabel7.setText("Appointment Date:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(310, 240, 143, 20);

        appointmentDatehooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                appointmentDatehooserPropertyChange(evt);
            }
        });
        jPanel1.add(appointmentDatehooser);
        appointmentDatehooser.setBounds(450, 230, 160, 30);

        dpdTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(dpdTime);
        dpdTime.setBounds(450, 280, 174, 27);

        jLabel9.setText("Appointment Time:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(310, 280, 143, 20);
        jPanel1.add(disabailityValue);
        disabailityValue.setBounds(375, 186, 768, 26);

        btnBack.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/backbutton.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(50, 650, 130, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Meeting History");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(280, 390, 145, 36);

        historyJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Appointment ID", "Date", "Comments", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(historyJTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 450, 594, 112);

        meetingDetailsBtn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        meetingDetailsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/workSchedule.png"))); // NOI18N
        meetingDetailsBtn.setText("Add Meeting Details");
        meetingDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meetingDetailsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(meetingDetailsBtn);
        meetingDetailsBtn.setBounds(420, 580, 220, 50);

        completedBtn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        completedBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewImages/check.png"))); // NOI18N
        completedBtn.setText("Mark as Completed");
        completedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completedBtnActionPerformed(evt);
            }
        });
        jPanel1.add(completedBtn);
        completedBtn.setBounds(420, 650, 220, 50);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/teacher.png"))); // NOI18N
        jLabel5.setText("ADD INDIVIDUAL DETAILS");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 30, 390, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void completedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completedBtnActionPerformed
        // TODO add your handling code here:
        Individual ind = workRequest.getIndividual();
        Boolean flag = false;
        for (IndividualHistory indHistory : ind.getHistory()) {

            workRequest.setStatus("Completed");
            flag = true;
            JOptionPane.showMessageDialog(null, "Status updated successfully");
            break;
        }
        if (!flag) {
            JOptionPane.showMessageDialog(null, "You cannot mark the request as compeleted");
        } else {
            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
            TrainerWorkAreaJPanel dwjp = (TrainerWorkAreaJPanel) component;
            dwjp.populateTable();
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }
    }//GEN-LAST:event_completedBtnActionPerformed

    private void meetingDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meetingDetailsBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = historyJTable.getSelectedRow();
        if (selectedRow >= 0) {
            IndividualHistory history = (IndividualHistory) historyJTable.getValueAt(selectedRow, 0);
            String status = (String) historyJTable.getValueAt(selectedRow, 4);
            if (status.equalsIgnoreCase("Meeting Scheduled")) {
                AddHistoryJPanel addDetails = new AddHistoryJPanel(userProcessContainer, account, enterprise, workRequest);
                userProcessContainer.add("AddDetailsJPanel", addDetails);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else {
                JOptionPane.showMessageDialog(null, "You cannot add Details for this appointment");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_meetingDetailsBtnActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TrainerWorkAreaJPanel dwjp = (TrainerWorkAreaJPanel) component;
        //dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void appointmentDatehooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_appointmentDatehooserPropertyChange
        // TODO add your handling code here:
        Date date1 = appointmentDatehooser.getDate();
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        if (appointmentDatehooser.getDate() != null) {
            String appointmentFormatted = simpleDateFormat.format(date1);
            Iterator appointmentIterator = dateSchedule.entrySet().iterator();

            while (appointmentIterator.hasNext()) {
                Map.Entry mappedElement = (Map.Entry) appointmentIterator.next();
                Date date = ((Date) mappedElement.getKey());
                String newDate = simpleDateFormat.format(date);
                //  sch = ((  System.out.println("in if");Schedule) mapElement.getValue());
                System.out.println(appointmentFormatted);

                System.out.println(newDate);
                if (appointmentFormatted.equals(newDate)) {
                    System.out.println("in if");
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
                    populateTimeSlot(slotList);
                    break;
                }
            }
        }
    }//GEN-LAST:event_appointmentDatehooserPropertyChange

    private void scheduleAppointmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleAppointmentBtnActionPerformed
        Date date1 = appointmentDatehooser.getDate();
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        if (appointmentDatehooser.getDate() != null && dpdTime.getSelectedIndex() != 0) {
            Boolean flag = false;
            Individual ind = workRequest.getIndividual();
            for (IndividualHistory history : workRequest.getIndividual().getHistory()) {
                if (history.getMeetingDate().compareTo(date1) > 0 || history.getMeetingDate().compareTo(date1) == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                JOptionPane.showMessageDialog(null, "You cannot schedule appointment for this date");
                return;
            }

            for(IndividualHistory history : workRequest.getIndividual().getHistory()){
                if(history.getStatus().equalsIgnoreCase("Meeting Scheduled")){
                    JOptionPane.showMessageDialog(null, "you have a previous appoinment open.Please close it before creating new one.");
                    return;
                }

            }

            String appointmentFormatted = simpleDateFormat.format(date1);
            Iterator appointmentIterator = dateSchedule.entrySet().iterator();

            while (appointmentIterator.hasNext()) {
                Map.Entry mappedElement = (Map.Entry) appointmentIterator.next();
                Date date = ((Date) mappedElement.getKey());
                String newDate = simpleDateFormat.format(date);
                //  sch = ((Schedule) mapElement.getValue());
                Map<String, Boolean> getTime = ((Map<String, Boolean>) mappedElement.getValue());
                if (appointmentFormatted.equals(newDate)) {
                    Iterator timeIterator = getTime.entrySet().iterator();

                    while (timeIterator.hasNext()) {
                        Map.Entry mappingElement = (Map.Entry) timeIterator.next();
                        String slot = ((String) mappingElement.getKey());
                        Boolean status = ((Boolean) mappingElement.getValue());
                        if (!dpdTime.getSelectedItem().equals("")) {
                            if (slot.equals(dpdTime.getSelectedItem())) {
                                status = false;
                                mappingElement.setValue(false);
                                break;
                            }
                        }
                    }
                    // populateTimeSlot(slotList);
                    workRequest.setSender(account);
                    if (workRequest.getIndividual().getHistory().size() == 0) {
                        workRequest.setStatus("Initial Appointment scheduled by Trainer");
                        IndividualHistory indHistory = new IndividualHistory();
                        indHistory.setMeetingDate(date1);
                        indHistory.setStatus("Meeting Scheduled");
                        populateTimeSlot(slotList);
                        workRequest.getIndividual().getHistory().add(indHistory);
                        populateHistoryDetails();
                    } else {
                        IndividualHistory indHistory = new IndividualHistory();
                        indHistory.setMeetingDate(date1);
                        indHistory.setStatus("Meeting Scheduled");
                        workRequest.getIndividual().getHistory().add(indHistory);
                        populateHistoryDetails();
                        populateTimeSlot(slotList);
                        workRequest.setStatus("Training in progress");
                    }
                    JOptionPane.showMessageDialog(null, "Appointment Scheduled Successfully");
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select both time and date to schedule appointment");
        }
    }//GEN-LAST:event_scheduleAppointmentBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser appointmentDatehooser;
    private javax.swing.JLabel birthDateValue;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel cityValue;
    private javax.swing.JButton completedBtn;
    private javax.swing.JLabel disabailityValue;
    private javax.swing.JLabel disabilityValue;
    private javax.swing.JComboBox<Object> dpdTime;
    private javax.swing.JLabel durationValue;
    private javax.swing.JLabel firstNameValue;
    private javax.swing.JTable historyJTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameValue;
    private javax.swing.JButton meetingDetailsBtn;
    private javax.swing.JButton scheduleAppointmentBtn;
    private javax.swing.JLabel servicesValue;
    // End of variables declaration//GEN-END:variables
}
