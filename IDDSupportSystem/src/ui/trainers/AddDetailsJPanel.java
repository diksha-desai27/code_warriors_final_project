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
            row[0] = workRequest.getIndividual().getRegistrationId();
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

        jLabel1 = new javax.swing.JLabel();
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

        jLabel1.setText("Provide Details");

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Individual Information");

        scheduleAppointmentBtn.setText("Schedule Appointment");
        scheduleAppointmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleAppointmentBtnActionPerformed(evt);
            }
        });

        jLabel7.setText("Appointment Date:");

        appointmentDatehooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                appointmentDatehooserPropertyChange(evt);
            }
        });

        dpdTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Appointment Time:");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Meeting History");

        historyJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Registration ID", "Date", "Comments", "Status"
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

        meetingDetailsBtn.setText("Add Meeting Details");
        meetingDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meetingDetailsBtnActionPerformed(evt);
            }
        });

        completedBtn.setText("Mark as Completed");
        completedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completedBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(servicesValue, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(appointmentDatehooser, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dpdTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(disabailityValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(birthDateValue, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(firstNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(221, 221, 221)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(completedBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(meetingDetailsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(disabilityValue, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cityValue, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 360, Short.MAX_VALUE)))
                        .addGap(254, 254, 254)
                        .addComponent(durationValue, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(109, 109, 109)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(scheduleAppointmentBtn)))
                .addContainerGap(864, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(firstNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(durationValue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(birthDateValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(appointmentDatehooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(disabailityValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(dpdTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(scheduleAppointmentBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cityValue, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(disabilityValue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(servicesValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addComponent(meetingDetailsBtn)
                        .addGap(30, 30, 30)
                        .addComponent(completedBtn)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lastNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1047, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(694, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TrainerWorkAreaJPanel dwjp = (TrainerWorkAreaJPanel) component;
        //dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void meetingDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meetingDetailsBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = historyJTable.getSelectedRow();
        if (selectedRow >= 0) {
            int id = (Integer) historyJTable.getValueAt(selectedRow, 0);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
