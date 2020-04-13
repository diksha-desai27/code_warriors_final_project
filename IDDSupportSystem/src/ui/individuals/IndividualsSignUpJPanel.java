/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.individuals;

import business.DB4OUtil.DB4OUtil;
import business.EcoSystem;
import business.individuals.Individual;
import business.individuals.IndividualDirectory;
import business.role.IndividualRole;
import business.useraccount.UserAccount;
import business.useraccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sayalipathare
 */
public class IndividualsSignUpJPanel extends javax.swing.JPanel {

    private JPanel rightJPanel;
    private UserAccountDirectory userAccountDirectory;
    private IndividualDirectory individualDirectory;
    private EcoSystem system;
    private DB4OUtil dB4OUtil;

    /**
     * Creates new form IndividualsSignUpJPanel
     */
    public IndividualsSignUpJPanel(JPanel rightJPanel,EcoSystem system,DB4OUtil dB4OUtil) {
        initComponents();
        this.rightJPanel = rightJPanel;
        this.system = system;
        this.dB4OUtil =dB4OUtil;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstNamejTextField = new javax.swing.JTextField();
        lastNamejTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        zipCodejTextField = new javax.swing.JTextField();
        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        userNamejTextField = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        birthDayChooser = new com.toedter.calendar.JDateChooser();
        confirmLabel = new javax.swing.JLabel();
        passwordJField = new javax.swing.JPasswordField();
        confirmJPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        addressjTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Sign Up Form");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Birth Date");

        jLabel6.setText("Address:");

        jLabel7.setText("Zipcode");

        userNameLabel.setText("User Name");

        passwordLabel.setText("Password");

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnLogout.setText("Sign Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        confirmLabel.setText("Confirm Password");

        jLabel5.setText("Address Line 1:");

        jLabel8.setText("City");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)
                                        .addComponent(userNameLabel)
                                        .addComponent(jLabel6)
                                        .addComponent(passwordLabel))
                                    .addGap(74, 74, 74)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(birthDayChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(firstNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(passwordJField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(userNamejTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(confirmLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(confirmJPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(zipCodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(117, 117, 117)
                                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(addressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(86, 86, 86)
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38)
                        .addComponent(lastNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(565, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLogout)
                                .addGap(75, 75, 75)
                                .addComponent(btnRegister)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firstNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lastNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(birthDayChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(addressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(zipCodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordJField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmJPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout)
                    .addComponent(btnRegister))
                .addContainerGap(125, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        Date date1 = birthDayChooser.getDate();
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String birthDateFormatted = simpleDateFormat.format(date1);
        if (firstNamejTextField.getText().equals("") || lastNamejTextField.getText().equals("") || birthDayChooser.equals("") || addressjTextField.getText().equals("") || zipCodejTextField.getText().equals("") || userNamejTextField.getText().equals("") || passwordJField.getPassword().equals("") || confirmJPassword.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill out all the details");
            return;
        } else {
            if (usernamePatternCorrect()) {
                if (passwordPatternCorrect()) {
                    if (String.valueOf(passwordJField.getPassword()).equals(String.valueOf(confirmJPassword.getPassword()))) {
                        if (firstNamePatternCorrect() && lastNamePatternCorrect()) {
                            if (zipCodePatternCorrect()) {
                                if (system.getUserAccountDirectory().checkIfUsernameIsUnique(userNamejTextField.getText())) {
                                    Individual ind = new Individual();
                                    if (ind != null) {
                                        ind.setFirstName(firstNamejTextField.getText());
                                        ind.setLastName(lastNamejTextField.getText());
                                        ind.setUserName(userNamejTextField.getText());
                                        ind.setAddress(addressjTextField.getText());
                                        ind.setCity(cityTextField.getText());
                                        ind.setBirthDate(birthDateFormatted);
                                        ind.setZipCode(Integer.parseInt(zipCodejTextField.getText()));
                                        system.getIndividualDirectory().getIndividualList().add(ind);
                                        system.getUserAccountDirectory().createUserAccount(userNamejTextField.getText(), String.valueOf(passwordJField.getPassword()), new IndividualRole());
                                        JOptionPane.showMessageDialog(null, "Account created successfully. Please sign out to login.");
                                        clearFields();
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(null, "Account already exists.");
                                    return;
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "Please enter valid zip code.");
                                return;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Please enter valid first and last name.");
                            return;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Password and Confirm Password do not match.");
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter valid password");
                    return;
                }
            } else {

                JOptionPane.showMessageDialog(null, "Username is invalid. Username must be in the format: xx_xx@xx.xx");
                return;
            }
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here: 
        JPanel blankJP = new JPanel();
        rightJPanel.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) rightJPanel.getLayout();
        crdLyt.next(rightJPanel);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void clearFields() {
        firstNamejTextField.setText("");
        lastNamejTextField.setText("");
        userNamejTextField.setText("");
        passwordJField.setText("");
        confirmJPassword.setText("");
        addressjTextField.setText("");
        cityTextField.setText("");
        zipCodejTextField.setText("");
        birthDayChooser.setDate(new Date());
    }

    private boolean usernamePatternCorrect() {
        Pattern p = Pattern.compile("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
        Matcher m = p.matcher(userNamejTextField.getText());
        Boolean b = m.matches();
        return b;
    }

    private boolean passwordPatternCorrect() {
        Pattern q = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=_])(?=\\S+$).{6,20}$");
        Matcher n = q.matcher(passwordJField.getPassword().toString());
        Boolean c = n.matches();
        return c;
    }

    private boolean firstNamePatternCorrect() {
        Pattern p = Pattern.compile("[A-Z][a-z]*");
        Matcher m = p.matcher(firstNamejTextField.getText());
        Boolean b = m.matches();
        return b;
    }

    private boolean lastNamePatternCorrect() {
        Pattern p = Pattern.compile("[A-Z][a-z]*");
        Matcher m = p.matcher(lastNamejTextField.getText());
        Boolean b = m.matches();
        return b;
    }

    private boolean zipCodePatternCorrect() {
        Pattern p = Pattern.compile("^[0-9]{5}(?:-[0-9]{4})?$");
        Matcher m = p.matcher(zipCodejTextField.getText());
        Boolean b = m.matches();
        return b;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressjTextField;
    private com.toedter.calendar.JDateChooser birthDayChooser;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegister;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JPasswordField confirmJPassword;
    private javax.swing.JLabel confirmLabel;
    private javax.swing.JTextField firstNamejTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lastNamejTextField;
    private javax.swing.JPasswordField passwordJField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNamejTextField;
    private javax.swing.JTextField zipCodejTextField;
    // End of variables declaration//GEN-END:variables
}
