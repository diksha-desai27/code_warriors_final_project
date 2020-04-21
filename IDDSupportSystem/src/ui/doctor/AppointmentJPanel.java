/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.doctor;

import business.employee.Employee;
import business.enterprise.Enterprise;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kales
 */
public class AppointmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AppointmentJPanel
     */
    JPanel userJProcessContainer;
    UserAccount userAccount;
    WorkRequest workRequest;
    Enterprise enterprise;
    Schedule sch;
    Map<Date, Map<String, Boolean>> dateSchedule;
    List<String> slotList = new ArrayList<>();
    Individual individual;

    public AppointmentJPanel(JPanel userProcessContainer, UserAccount userAccount, WorkRequest workRequest, Enterprise enterprise) {
        initComponents();
        this.workRequest = workRequest;
        this.userAccount = userAccount;
        this.userJProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        Iterator empIterator = enterprise.getSchedule().entrySet().iterator();
        this.individual = workRequest.getIndividual();

        this.firstNameValue.setText(this.individual.getFirstName());
        this.lastNameValue.setText(this.individual.getLastName());
        this.birthDateValue.setText(this.individual.getBirthDate());
        this.disabailityValue.setText(this.individual.getIddInfo().getdName());
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);//15 year before
        Date min = cal.getTime();
        Calendar cal1 = Calendar.getInstance();
        cal1.add(Calendar.DATE, 30);//15 year before
        Date max = cal1.getTime();//actual date
        appointmentDatehooser.setSelectableDateRange(min, max);

        while (empIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) empIterator.next();
            UserAccount user = ((UserAccount) mapElement.getKey());
            sch = ((Schedule) mapElement.getValue());
            if (user.equals(userAccount)) {
                dateSchedule = sch.getDateSchedule();
                break;
            }
        }
        //  populateTimeSlot();
    }

    public void populateTimeSlot(List<String> slotList) {
        dpdTime.removeAllItems();
        dpdTime.insertItemAt("--Select--", 0);
        dpdTime.setSelectedIndex(0);
        for (String s : slotList) {
            dpdTime.addItem(s);
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
        jLabel4 = new javax.swing.JLabel();
        firstNameValue = new javax.swing.JLabel();
        lastNameValue = new javax.swing.JLabel();
        birthDateValue = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        disabilityValue = new javax.swing.JLabel();
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Birth Date:");

        jLabel5.setText("Disability:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(servicesValue, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(448, 448, 448))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(disabilityValue, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(disabailityValue, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dpdTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(appointmentDatehooser, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addComponent(birthDateValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(firstNameValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(90, 90, 90)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(436, 436, 436))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(cityValue, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(scheduleAppointmentBtn)
                .addGap(0, 552, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnBack)
                .addGap(161, 161, 161)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBack))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(firstNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel3))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lastNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(birthDateValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(disabailityValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(appointmentDatehooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dpdTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(58, 58, 58)
                        .addComponent(cityValue, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scheduleAppointmentBtn)))
                .addGap(29, 29, 29)
                .addComponent(disabilityValue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(servicesValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userJProcessContainer.remove(this);
        Component[] componentArray = userJProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userJProcessContainer.getLayout();
        layout.previous(userJProcessContainer);
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
                    workRequest.setSender(userAccount);
                    workRequest.setStatus("Appointment Confirmed");
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
    private javax.swing.JLabel disabailityValue;
    private javax.swing.JLabel disabilityValue;
    private javax.swing.JComboBox<Object> dpdTime;
    private javax.swing.JLabel firstNameValue;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastNameValue;
    private javax.swing.JButton scheduleAppointmentBtn;
    private javax.swing.JLabel servicesValue;
    // End of variables declaration//GEN-END:variables
}
