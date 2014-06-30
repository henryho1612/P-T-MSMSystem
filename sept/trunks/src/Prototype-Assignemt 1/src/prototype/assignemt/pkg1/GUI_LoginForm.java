
package prototype.assignemt.pkg1;

import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import prototype.assignemt.pkg1.Controller.LogInController;

/**
 *
 * @author Thong
 */

public class GUI_LoginForm extends javax.swing.JFrame implements Observer{

    public GUI_LoginForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        usernameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        applicationLabel = new javax.swing.JLabel();
        logIn = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usernameLabel.setText("UserName");
        getContentPane().add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 20));

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 110, 20));
        getContentPane().add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 110, 20));

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordLabel.setText("Password");
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, 20));

        applicationLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        applicationLabel.setText("Noodle's Management Application");
        getContentPane().add(applicationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        logIn.setText("Log in");
        getContentPane().add(logIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        exit.setText("Cancel");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel applicationLabel;
    private javax.swing.JButton exit;
    private javax.swing.JButton logIn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

    public JButton getExit() {
        return exit;
    }

    public JButton getLogIn() {
        return logIn;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JTextField getUsernameField() {
        return usernameField;
    }
    
    public void closeWindow() {
        this.processWindowEvent(
            new WindowEvent(
                  this, WindowEvent.WINDOW_CLOSING));
    }
    
    public void showError() {
        JOptionPane.showMessageDialog(this, "Incorrect ID/Password. Please retype.", "Invalid login", JOptionPane.ERROR_MESSAGE);
    }
    public void addLoginController(LogInController loginController){
        List<JTextField> textFields = new ArrayList<>();
        textFields.add(usernameField);
        textFields.add(passwordField);
        loginController.setMessage(textFields);
        logIn.addActionListener(loginController);
    }
    @Override
    public void update(Observable o, Object arg) {
       if(arg instanceof Boolean){
           boolean flag = (Boolean) arg;
           System.out.println(flag);
           if(flag){
               setVisible(false);
           }
       }
    }
}
