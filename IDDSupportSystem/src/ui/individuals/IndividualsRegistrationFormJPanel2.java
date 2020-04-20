/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.individuals;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.individuals.IDD;
import business.individuals.Individual;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sayalipathare
 */
public class IndividualsRegistrationFormJPanel2 extends javax.swing.JPanel {

    /**
     * Creates new form IndividualsRegistrationFormJPanel2
     */
    EcoSystem ecoSystem;
    JPanel rightJPanel;
    Individual individual;
    UserAccount userAccount;
    ArrayList<Enterprise> facilityList;

    public IndividualsRegistrationFormJPanel2(UserAccount userAccount, Individual individual, JPanel rightJPanel, ArrayList<Enterprise> facilityList) {
        initComponents();
        this.facilityList = facilityList;
        this.rightJPanel = rightJPanel;
        this.individual = individual;
        this.userAccount = userAccount;
        nextBtn.setEnabled(false);
        System.out.println(facilityList);
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
        jLabel2 = new javax.swing.JLabel();
        nervousSystemJBtn = new javax.swing.JRadioButton();
        sensorySystemJBtn = new javax.swing.JRadioButton();
        fragileJBtn = new javax.swing.JRadioButton();
        downsJBtn = new javax.swing.JRadioButton();
        pradeWillisSyndromeBtn = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        durationTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        serviceJTxtArea = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        employmentDurationJTxtArea = new javax.swing.JTextArea();
        jbtnSubmit = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("WELCOME TO IDD SUPPORT CENTRE");
        add(jLabel1);
        jLabel1.setBounds(130, 40, 451, 40);

        jLabel2.setText("2. Select which IDD are you facing:");
        add(jLabel2);
        jLabel2.setBounds(43, 114, 219, 16);

        nervousSystemJBtn.setText("Nervous System");
        add(nervousSystemJBtn);
        nervousSystemJBtn.setBounds(43, 142, 133, 23);

        sensorySystemJBtn.setText("Sensory System");
        add(sensorySystemJBtn);
        sensorySystemJBtn.setBounds(43, 177, 130, 23);

        fragileJBtn.setText("Fragile X Syndrome");
        add(fragileJBtn);
        fragileJBtn.setBounds(43, 208, 152, 23);

        downsJBtn.setText("Down's Syndrome");
        add(downsJBtn);
        downsJBtn.setBounds(43, 243, 144, 23);

        pradeWillisSyndromeBtn.setText("Prade willi's Syndrome");
        pradeWillisSyndromeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pradeWillisSyndromeBtnActionPerformed(evt);
            }
        });
        add(pradeWillisSyndromeBtn);
        pradeWillisSyndromeBtn.setBounds(43, 278, 172, 23);

        jLabel4.setText("3.For How Long are you Facing this disability?");
        add(jLabel4);
        jLabel4.setBounds(43, 343, 289, 16);

        durationTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationTxtActionPerformed(evt);
            }
        });
        add(durationTxt);
        durationTxt.setBounds(350, 333, 86, 26);

        jLabel3.setText("years");
        add(jLabel3);
        jLabel3.setBounds(448, 338, 33, 16);

        jLabel6.setText("4. Describe the services and supervision needed");
        add(jLabel6);
        jLabel6.setBounds(43, 388, 303, 16);

        serviceJTxtArea.setColumns(20);
        serviceJTxtArea.setRows(5);
        jScrollPane3.setViewportView(serviceJTxtArea);

        add(jScrollPane3);
        jScrollPane3.setBounds(66, 422, 242, 84);

        jLabel7.setText("6. Describe the expected duration and goals of placement");
        add(jLabel7);
        jLabel7.setBounds(43, 518, 541, 16);

        employmentDurationJTxtArea.setColumns(20);
        employmentDurationJTxtArea.setRows(5);
        jScrollPane4.setViewportView(employmentDurationJTxtArea);

        add(jScrollPane4);
        jScrollPane4.setBounds(69, 546, 250, 84);

        jbtnSubmit.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jbtnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/submit.png"))); // NOI18N
        jbtnSubmit.setText("Submit");
        jbtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubmitActionPerformed(evt);
            }
        });
        add(jbtnSubmit);
        jbtnSubmit.setBounds(70, 660, 150, 40);

        nextBtn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        nextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/next.png"))); // NOI18N
        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        add(nextBtn);
        nextBtn.setBounds(530, 660, 120, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubmitActionPerformed
        // TODO add your handling code here:
        if (!nervousSystemJBtn.isSelected() && !sensorySystemJBtn.isSelected() && !pradeWillisSyndromeBtn.isSelected() && !downsJBtn.isSelected() && !fragileJBtn.isSelected()) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
            return;
        }
        if (durationTxt.getText().equals("") && serviceJTxtArea.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
            return;
        }
        if (individual.getServiceType().equals("LongTermService")) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
            return;
        }
        IDD id_info;

        if (nervousSystemJBtn.isSelected()) {
            individual.getIddInfo().setdName("Nervous System");
        } else if (sensorySystemJBtn.isSelected()) {
            individual.getIddInfo().setdName("Sensory System");
        } else if (pradeWillisSyndromeBtn.isSelected()) {
            individual.getIddInfo().setdName("Prade Willis Syndrome");
        } else if (downsJBtn.isSelected()) {
            individual.getIddInfo().setdName("Down's Syndrome");
        } else {
            individual.getIddInfo().setdName("Fragile X Syndrome");
        }

        //  if( individual.getIddInfo()==null){
        //}
        individual.getIddInfo().setDuration(Integer.parseInt(durationTxt.getText()));
        individual.getIddInfo().setEmploymentDetails(employmentDurationJTxtArea.getText());
        individual.getIddInfo().setServices(serviceJTxtArea.getSelectedText());
        JOptionPane.showMessageDialog(null, "Details Saved Successfully");
        clearFields();
        nextBtn.setEnabled(true);


    }//GEN-LAST:event_jbtnSubmitActionPerformed

    private void clearFields() {
        downsJBtn.setSelected(false);
        nervousSystemJBtn.setSelected(false);
        sensorySystemJBtn.setSelected(false);
        pradeWillisSyndromeBtn.setSelected(false);
        fragileJBtn.setSelected(false);
        durationTxt.setText("");
        serviceJTxtArea.setText("");
        employmentDurationJTxtArea.setText("");
    }


    private void durationTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationTxtActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        IndividualsRegistrationFormJPanel3 individualFacilityPanel = new IndividualsRegistrationFormJPanel3(rightJPanel, userAccount, individual, facilityList);
        rightJPanel.add("individualFacilityPanel", individualFacilityPanel);

        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);

    }//GEN-LAST:event_nextBtnActionPerformed

    private void pradeWillisSyndromeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pradeWillisSyndromeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pradeWillisSyndromeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton downsJBtn;
    private javax.swing.JTextField durationTxt;
    private javax.swing.JTextArea employmentDurationJTxtArea;
    private javax.swing.JRadioButton fragileJBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbtnSubmit;
    private javax.swing.JRadioButton nervousSystemJBtn;
    private javax.swing.JButton nextBtn;
    private javax.swing.JRadioButton pradeWillisSyndromeBtn;
    private javax.swing.JRadioButton sensorySystemJBtn;
    private javax.swing.JTextArea serviceJTxtArea;
    // End of variables declaration//GEN-END:variables
}
