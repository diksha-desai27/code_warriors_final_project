/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.reviewer;

import business.employee.Employee;
import business.enterprise.Enterprise;
import business.individuals.IndividualDirectory;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;

/**
 *
 * @author kales
 */
public class ReviewerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReviewerWorkAreaJPanel
     */
    
    JPanel userProcessContainer;
    UserAccount userAccount;
    IndividualDirectory individualDirectory;
    Enterprise enterprise;
    public ReviewerWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount, IndividualDirectory individualDirectory, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.individualDirectory = individualDirectory;
        this.enterprise = enterprise;
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
        btnManageNetwork = new javax.swing.JButton();
        btnManageNetwork1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btnManageNetwork.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnManageNetwork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/user1.png"))); // NOI18N
        btnManageNetwork.setText("Manage Individuals");
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageNetwork);
        btnManageNetwork.setBounds(230, 150, 340, 120);

        btnManageNetwork1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnManageNetwork1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewImages/reportGEN.png"))); // NOI18N
        btnManageNetwork1.setText("View Statistics");
        btnManageNetwork1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetwork1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageNetwork1);
        btnManageNetwork1.setBounds(230, 310, 340, 120);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewImages/reviewER.png"))); // NOI18N
        jLabel2.setText("REVIEWER WORK AREA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 40, 439, 50);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/BackgroundBlue.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(85, 36, 630, 60);

        add(jPanel1);
        jPanel1.setBounds(-8, -4, 840, 580);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageNetwork1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetwork1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageNetwork1ActionPerformed

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed
        // TODO add your handling code here:
        ManageIndividuals manageIndividuals = new ManageIndividuals(userProcessContainer,userAccount, this.individualDirectory, this.enterprise);
        userProcessContainer.add("ManageIndividuals",manageIndividuals);

        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageNetworkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JButton btnManageNetwork1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
