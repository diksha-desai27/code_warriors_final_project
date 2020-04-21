/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import business.DB4OUtil.DB4OUtil;
import business.EcoSystem;
import business.enterprise.Enterprise;
import business.enterprise.EnterpriseDirectory;
import business.individuals.Individual;
import business.network.Network;
import business.organization.Organization;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.individuals.IndividualsSignUpJPanel;

/**
 *
 * @author dikshadesai
 */
public class MainJPanel extends javax.swing.JFrame {

    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    /**
     * Creates new form MainJPanel
     */
    public MainJPanel() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        // this.leftJPanel.setSize(300, 750);

        this.setSize(1350, 750);

        //  ImageIcon myImage= new ImageIcon(ToolKit.getDefaultToolKit)
        //   jLabel4.setIcon(new ImageIcon(new ImageIcon("IDD.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        for (int i = 0; i < system.getUserAccountDirectory().getUserAccountList().size(); i++) {
            System.out.println(system.getUserAccountDirectory().getUserAccountList().get(i).getUsername());

            System.out.println(system.getUserAccountDirectory().getUserAccountList().get(i).getPassword());
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

        workAreaJPanel = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        leftJPanel = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        btnSignUp = new javax.swing.JButton();
        rightJPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        workAreaJPanel.setLayout(new java.awt.CardLayout());

        leftJPanel.setBackground(new java.awt.Color(97, 191, 212));

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/login.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setMaximumSize(new java.awt.Dimension(200, 150));
        btnLogin.setMinimumSize(new java.awt.Dimension(200, 150));
        btnLogin.setPreferredSize(new java.awt.Dimension(200, 150));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/Logout2.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Password:");

        btnSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/signup.png"))); // NOI18N
        btnSignUp.setText("Sign up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftJPanelLayout = new javax.swing.GroupLayout(leftJPanel);
        leftJPanel.setLayout(leftJPanelLayout);
        leftJPanelLayout.setHorizontalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(usernameJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftJPanelLayout.setVerticalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSignUp)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(leftJPanel);

        rightJPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightJPanel.setLayout(new java.awt.CardLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/IDD1.png"))); // NOI18N
        rightJPanel.add(jLabel4, "card2");

        jSplitPane1.setRightComponent(rightJPanel);

        workAreaJPanel.add(jSplitPane1, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(workAreaJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1520, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(workAreaJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String userName = usernameJTextField.getText();
        this.btnSignUp.setEnabled(false);
        // Get Password
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        Individual individual = null;
        Enterprise isEnterprise = null;
        Organization isOrganization = null;
        System.out.println("user" + userAccount);
        //if (userAccount == null) {

            for (Network n : system.getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = e.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount == null) {
                        for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = o.getUserAccountDirectory().authenticateUser(userName, password);
                            if (userAccount != null) {
                                isEnterprise = e;
                                isOrganization = o;
                                break;
                            }
                        }
                    } else {
                        isEnterprise = e;
                        break;
                    }
                    if (isOrganization != null) {
                        break;
                    }
                }
                if (isEnterprise != null) {
                    break;
                }
            }

        //} else {
        if(isEnterprise==null && isOrganization==null){
            for (Individual ind : system.getIndividualDirectory().getIndividualList()) {
                System.out.println(ind.getUserName());
                if (ind.getUserName().equals(userName)) {
                    individual = ind;
                    break;
                }
            }
        }

        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            this.btnSignUp.setEnabled(true);

            return;
        } else {
            CardLayout layout = (CardLayout) rightJPanel.getLayout();
            rightJPanel.add("workArea", userAccount.getRole().createWorkArea(rightJPanel, userAccount, system, isEnterprise, individual));
            layout.next(rightJPanel);

        }

        btnLogin.setEnabled(false);
        btnLogout.setEnabled(true);
        usernameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        btnSignUp.setEnabled(true);
        btnLogout.setEnabled(false);
        usernameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        btnLogin.setEnabled(true);

        usernameJTextField.setText("");
        passwordField.setText("");

        rightJPanel.removeAll();
        JPanel blankJP = new JPanel();
        rightJPanel.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) rightJPanel.getLayout();
        crdLyt.next(rightJPanel);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:

        IndividualsSignUpJPanel signUpJPanel = new IndividualsSignUpJPanel(btnSignUp, rightJPanel, system, dB4OUtil);
        rightJPanel.add("signUpJPanel", signUpJPanel);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
        btnSignUp.setEnabled(false);
    }//GEN-LAST:event_btnSignUpActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJPanel().setVisible(true);
            }
        });
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(JButton btnLogin) {
        this.btnLogin = btnLogin;
    }

    public JButton getBtnLogout() {
        return btnLogout;
    }

    public void setBtnLogout(JButton btnLogout) {
        this.btnLogout = btnLogout;
    }

    public JButton getBtnSignUp() {
        return btnSignUp;
    }

    public void setBtnSignUp(JButton btnSignUp) {
        this.btnSignUp = btnSignUp;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftJPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPanel rightJPanel;
    private javax.swing.JTextField usernameJTextField;
    private javax.swing.JPanel workAreaJPanel;
    // End of variables declaration//GEN-END:variables
}
