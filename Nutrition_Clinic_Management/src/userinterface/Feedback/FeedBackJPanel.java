/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Feedback;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author abhilashgp
 */
public class FeedBackJPanel extends javax.swing.JPanel {
    
    boolean invalidEmployee = false;

    /**
     * Creates new form FeedBack
     */
    public FeedBackJPanel() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fComment = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fName = new javax.swing.JTextField();
        fEmail = new javax.swing.JTextField();
        fPhoneNum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cErrName = new javax.swing.JLabel();
        cErrEmail = new javax.swing.JLabel();
        cErrPhone = new javax.swing.JLabel();

        setBackground(new java.awt.Color(230, 224, 224));
        setLayout(null);

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel3.setText("Feedback");
        add(jLabel3);
        jLabel3.setBounds(540, 80, 213, 64);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel1.setText("Email:");
        add(jLabel1);
        jLabel1.setBounds(410, 250, 69, 32);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel2.setText("Name:");
        add(jLabel2);
        jLabel2.setBounds(410, 180, 74, 32);

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel4.setText("Phone:");
        add(jLabel4);
        jLabel4.setBounds(400, 320, 79, 32);

        fComment.setColumns(20);
        fComment.setRows(5);
        jScrollPane1.setViewportView(fComment);

        add(jScrollPane1);
        jScrollPane1.setBounds(520, 390, 278, 113);

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel5.setText("Comments:");
        add(jLabel5);
        jLabel5.setBounds(350, 390, 129, 32);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(680, 540, 117, 33);

        fName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fNameKeyReleased(evt);
            }
        });
        add(fName);
        fName.setBounds(520, 170, 276, 44);

        fEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fEmailKeyReleased(evt);
            }
        });
        add(fEmail);
        fEmail.setBounds(520, 240, 276, 44);

        fPhoneNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fPhoneNumKeyReleased(evt);
            }
        });
        add(fPhoneNum);
        fPhoneNum.setBounds(520, 310, 276, 44);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Pictures\\Images\\icons8-comments-100.png")); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(390, 70, 100, 100);

        cErrName.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        add(cErrName);
        cErrName.setBounds(860, 170, 275, 44);

        cErrEmail.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        add(cErrEmail);
        cErrEmail.setBounds(860, 240, 275, 40);

        cErrPhone.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        add(cErrPhone);
        cErrPhone.setBounds(860, 310, 275, 44);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(fName.getText().trim().equalsIgnoreCase("")||
                fEmail.getText().trim().equalsIgnoreCase("")||
                fPhoneNum.getText().trim().equalsIgnoreCase("")||
                fComment.getText().trim().equalsIgnoreCase("")){
                        JOptionPane.showMessageDialog(this, "Empty TextFields");
        }else{
            if(invalidEmployee == true){
                        JOptionPane.showMessageDialog(this, "Error Fields");
            }else{
                    String Name = fName.getText();
                    String Email = fEmail.getText();
                    String PhoneString = fPhoneNum.getText();
                    String TextString = fComment.getText();
                    String msg = Name +"\n"+ Email +"\n"+ PhoneString +"\n"+ TextString;
                    SendMail spm= new SendMail();
                    spm.send(msg,Email);
                    JOptionPane.showMessageDialog(this, "Email sent Successfully");
                    fName.setText("");
                    fEmail.setText("");
                    fPhoneNum.setText("");
                    fComment.setText("");
                
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void fNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNameKeyReleased
        // TODO add your handling code here:
        String regexString = "^[a-zA-Z\\s]+";
        Pattern pattern = Pattern.compile(regexString,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(fName.getText());
        if(!matcher.matches()){
            cErrName.setText("Please enter a valid Name");
            invalidEmployee = true;
        }else{
            cErrName.setText("");
            invalidEmployee = false;
        }
    }//GEN-LAST:event_fNameKeyReleased

    private void fEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fEmailKeyReleased
        // TODO add your handling code here:
        String regexString = "^(.+)@(\\S+)$";
        Pattern pattern = Pattern.compile(regexString,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(fEmail.getText());
        if(!matcher.matches()){
            cErrEmail.setText("Please enter a valid Email");
            invalidEmployee = true;
        }else{
            cErrEmail.setText("");
            invalidEmployee = false;
        }
    }//GEN-LAST:event_fEmailKeyReleased

    private void fPhoneNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fPhoneNumKeyReleased
        // TODO add your handling code here:
        String regexString = "^\\d{10}$";
        Pattern pattern = Pattern.compile(regexString,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(fPhoneNum.getText());
        if(!matcher.matches()){
            cErrPhone.setText("Please enter a valid Phonenumber");
            invalidEmployee = true;
        }else{
            cErrPhone.setText("");
            invalidEmployee = false;
        }
    }//GEN-LAST:event_fPhoneNumKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cErrEmail;
    private javax.swing.JLabel cErrName;
    private javax.swing.JLabel cErrPhone;
    private javax.swing.JTextArea fComment;
    private javax.swing.JTextField fEmail;
    private javax.swing.JTextField fName;
    private javax.swing.JTextField fPhoneNum;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
