/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.nurse;

/**
 *
 * @author sayalipathare
 */
public class GenerateReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GenerateReportJPanel
     */
    public GenerateReportJPanel() {
        initComponents();
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
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jBtnSubmit = new javax.swing.JButton();
        jBtnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setText("Blood Pressure");
        add(jLabel1);
        jLabel1.setBounds(120, 110, 92, 16);
        add(jTextField1);
        jTextField1.setBounds(260, 110, 94, 26);

        jLabel2.setText("Heart Rate");
        add(jLabel2);
        jLabel2.setBounds(120, 170, 65, 16);
        add(jTextField2);
        jTextField2.setBounds(260, 160, 94, 26);

        jLabel3.setText("Height");
        add(jLabel3);
        jLabel3.setBounds(130, 220, 42, 16);
        add(jTextField3);
        jTextField3.setBounds(260, 210, 94, 26);

        jLabel4.setText("Weight");
        add(jLabel4);
        jLabel4.setBounds(130, 270, 43, 16);
        add(jTextField4);
        jTextField4.setBounds(260, 260, 94, 26);

        jBtnSubmit.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jBtnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/survey.png"))); // NOI18N
        jBtnSubmit.setText("Submit Report");
        jBtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSubmitActionPerformed(evt);
            }
        });
        add(jBtnSubmit);
        jBtnSubmit.setBounds(210, 330, 200, 60);

        jBtnBack.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jBtnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/backbutton.png"))); // NOI18N
        jBtnBack.setText("Back");
        jBtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackActionPerformed(evt);
            }
        });
        add(jBtnBack);
        jBtnBack.setBounds(10, 330, 110, 60);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/report.png"))); // NOI18N
        jLabel5.setText("REPORT GENERATION");
        add(jLabel5);
        jLabel5.setBounds(30, 30, 350, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnSubmitActionPerformed

    private void jBtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBack;
    private javax.swing.JButton jBtnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
