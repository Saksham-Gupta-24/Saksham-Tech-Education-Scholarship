/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Scholarship_Portal;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Student_Login extends javax.swing.JFrame 
{
    public static  String LOGIN="stud";
    public Student_Login() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SAKSHAM TECH EDUCATION SCHOLARSHIP PORTAL");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("STUDENT LOGIN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("CANDIDATE ID");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("CANDIDATE PASSWORD");

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(204, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(51, 0, 51));
        jCheckBox1.setText("show Password");
        jCheckBox1.setOpaque(true);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(325, 325, 325))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(323, 323, 323))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(132, 132, 132)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(jPasswordField1)
                            .addComponent(jTextField1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(743, 743, 743)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jCheckBox1)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    //Candidate Id texfield
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        
        String value=jTextField1.getText();
        value.length();
        if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9'||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)
        {
            jTextField1.setEditable(true);
        }
        else
        {
            jTextField1.setEditable(false);
            JOptionPane.showMessageDialog(jPanel1,"INVALID CHOICE !!!","WARNING_MESSAGE",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    //Checkbox
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

            if(jCheckBox1.isSelected())
            {
                jPasswordField1.setEchoChar((char)0);
            }
            else
            {
                jPasswordField1.setEchoChar('*');
            }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    //Reset button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

            jTextField1.setText(null);
            jPasswordField1.setText(null);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    //Exit button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   
        Scholarship_Main frame1=new Scholarship_Main();
        frame1.setVisible(true);
        dispose();
            
    }//GEN-LAST:event_jButton3ActionPerformed

    //Login Button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        String Username= jTextField1.getText();
  
    // 1ST STUDENT LOGIN 
        if(((jTextField1.getText().equals("2022021"))&&jPasswordField1.getText().equals("sahil")))
        {
            if(Student_Welcome.ID.equals("IDEA1"))
            {
                JOptionPane.showMessageDialog(jPanel1,"YOU HAVE ALREADY COMPLETED THE COLLEGE SELECTION PROCESS !!!","INFORMATION_MESSAGE",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(jPanel1,"LOGIN SUCCESSFUL !!!","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                Student_Welcome frame1=new Student_Welcome();
                frame1.setVisible(true);
                dispose();
                LOGIN="stud1";
            }   
      }
   
   //2nd Student Login
       
        else if (jTextField1.getText().equals("2022033")&&jPasswordField1.getText().equals("sahil"))
        {
            if(Student_Welcome.ID1.equals("IDE1"))
            {
                JOptionPane.showMessageDialog(jPanel1,"YOU HAVE ALREADY COMPLETED THE COLLEGE SELECTION PROCESS !!!","INFORMATION_MESSAGE",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(jPanel1,"LOGIN SUCCESSFULL !!!","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                Student_Welcome frame1=new Student_Welcome();
                frame1.setVisible(true);
                dispose();
                LOGIN="stud2";
            }
        }
        //conditions
        else if(jTextField1.getText().length()==0&&jPasswordField1.getText().length()==0)
        {
            JOptionPane.showMessageDialog(jPanel1,"ENTER CANDIDATE-ID AND PASSWORD !!!","WARNING_MESSAGE",JOptionPane.WARNING_MESSAGE);
        }
        else if((jTextField1.getText().equals("2022021") || jTextField1.getText().equals("2022033"))&&jPasswordField1.getText().length()==0)
        {
            JOptionPane.showMessageDialog(jPanel1,"ENTER CANDIDATE PASSWORD !!!","WARNING_MESSAGE",JOptionPane.WARNING_MESSAGE);
        }
        else if(jPasswordField1.getText().equals("sahil")&&jTextField1.getText().length()==0)
        {
            JOptionPane.showMessageDialog(jPanel1,"ENTER CANDIDATE ID !!!","WARNING_MESSAGE",JOptionPane.WARNING_MESSAGE);
        }
        else if(jTextField1.getText().length()==0&&!jPasswordField1.getText().equals("sahil"))
        {
            JOptionPane.showMessageDialog(jPanel1,"WRONG CANDIDATE PASSWORD AND ENTER CANDIDATE-ID !!!","ERROR_MESSAGE",JOptionPane.ERROR_MESSAGE);
        }
        else if(jTextField1.getText().equals("2022021")||jTextField1.getText().equals("2022033")&&!jPasswordField1.getText().equals("sahil"))
        {
            JOptionPane.showMessageDialog(jPanel1," WRONG CANDIDATE PASSWORD !!!","ERROR_MESSAGE",JOptionPane.ERROR_MESSAGE);
        }
        else if((!(jTextField1.getText().equals("2022021")|| jTextField1.getText().equals("2022033")))&&jPasswordField1.getText().equals("sahil"))
        {
            JOptionPane.showMessageDialog(jPanel1,"WRONG CANDIDATE ID !!!","ERROR_MESSAGE",JOptionPane.ERROR_MESSAGE);
        }
        else if((!(jTextField1.getText().equals("2022021")|| jTextField1.getText().equals("2022033")))&&jPasswordField1.getText().length()==0)
        {
            JOptionPane.showMessageDialog(jPanel1,"WRONG CANDIDATE ID AND ENTER CANDIDATE PASSWORD !!!","ERROR_MESSAGE",JOptionPane.ERROR_MESSAGE);
        }
        else 
        {
            JOptionPane.showMessageDialog(jPanel1,"WRONG CANDIDATE ID AND PASSWORD !!!","ERROR_MESSAGE",JOptionPane.ERROR_MESSAGE);
        }
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed

        
    }//GEN-LAST:event_jPasswordField1KeyPressed

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
            java.util.logging.Logger.getLogger(Student_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
