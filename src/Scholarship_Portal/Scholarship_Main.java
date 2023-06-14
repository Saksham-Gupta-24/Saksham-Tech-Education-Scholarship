/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Scholarship_Portal;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Scholarship_Main extends javax.swing.JFrame 
{
    Allotment_Result f;
    public Scholarship_Main() 
    {
        initComponents();
    }
    public Scholarship_Main(Allotment_Result e) 
    {
        initComponents();
          f= e;    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SAKSHAM TECH EDUCATION SCHOLARSHIP PORTAL");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("WELCOME TO SAKSHAM TECH EDUCATION SCHOLARSHIP");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("1. DETAILS OF SCHOLARSHIP");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("2. * ADMIN LOGIN *");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("5. COLLEGE SELECTION PORTAL");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("# ENTER CHOICE #");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton1.setText("PROCEED");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("3. CHECK SAKSHAM TECH EDUCATION COMMON ENTRANCE TEST RESULT");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("4. CHECK ENTRANCE RANK AND ELIGIBILITY FOR COLLEGE SELECTION");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("6. CHECK COLLEGE ALLOTMENT LIST");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(325, 325, 325))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(378, 378, 378))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(58, 58, 58)
                .addComponent(jLabel8)
                .addGap(26, 26, 26)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//proceed button    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    if(jTextField1.getText().length()>1)
    {
        JOptionPane.showMessageDialog(jPanel1,"ENTER ONLY ONE DIGIT 1-6 !!!","ERROR_MESSAGE",JOptionPane.ERROR_MESSAGE);
        jTextField1.setText(null);
    }
    else if(jTextField1.getText().length()==0)
    {
        JOptionPane.showMessageDialog(jPanel1,"FIRST ENTER CHOICE THEN PROCEED !!!","WARNING_MESSAGE",JOptionPane.WARNING_MESSAGE);
    }
    
    //Details page
    else if (jTextField1.getText().equals("1"))
    {
        Scholarship_Details frame1=new Scholarship_Details();
        frame1.setVisible(true);
        dispose();
    }
    
    //Admin login
    else if (jTextField1.getText().equals("2"))
    {
        Admin_Login_page frame2=new Admin_Login_page();
        frame2.setVisible(true);
        dispose();
    }
    
    //Entrance result
    else if (jTextField1.getText().equals("3"))
    {
        if (Admin_Welcome.s.equals("Done1")|| Admin_Welcome.e.equals("doms1"))
        {
            Entrance_Result frame3= new Entrance_Result();
            frame3.setVisible(true);
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(jPanel1,"ENTERANCE IS RESULT NOT DECLARED YET !!!","WARNING_MESSAGE",JOptionPane.WARNING_MESSAGE);
            jTextField1.setText(null);
        }
    }
    
    //Rank check
    else if (jTextField1.getText().equals("4"))
    {
        if (Admin_Welcome.s.equals("Done1")||Admin_Welcome.e.equals("doms1"))
        {
            Rank_Eligibility_Check frame4= new Rank_Eligibility_Check();
            frame4.setVisible(true);
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(jPanel1,"ENTERANCE IS RESULT NOT DECLARED YET !!!","WARNING_MESSAGE",JOptionPane.WARNING_MESSAGE);
            jTextField1.setText(null);
        }
    }
    
    //College selection
    else if (jTextField1.getText().equals("5"))
    {
        if((Admin_Welcome.s.equals("Done1"))&&!Admin_Welcome.e.equals("doms1")&&!Admin_Welcome.t.equals("tos1"))
        {
            Student_Login frame3= new Student_Login();
            frame3.setVisible(true);
            dispose();
        }     
        else if(Admin_Welcome.t.equals("tos1"))
        {
            JOptionPane.showMessageDialog(jPanel1,"COLLEGE SELECTION PORTAL IS CLOSED !!!","WARNING_MESSAGE",JOptionPane.WARNING_MESSAGE);
            jTextField1.setText(null);
        }
        else
        { 
            JOptionPane.showMessageDialog(jPanel1,"ENTERANCE IS RESULT NOT DECLARED YET !!!","WARNING_MESSAGE",JOptionPane.WARNING_MESSAGE);
            jTextField1.setText(null);
        }
    }
    
    //Allotment result
    else if (jTextField1.getText().equals("6"))
    {
        if (Admin_Welcome.s.equals("Done1")&&Admin_Welcome.t.equals("tos1")&& Student_Proceed.r.equals("Do1")&& Admin_Welcome.e.equals("doms1"))
        {
            Allotment_Result frr = new  Allotment_Result();
            frr.setVisible(true);
            dispose();    
        }
        else if(Admin_Welcome.s.equals("Done1")&& !Admin_Welcome.t.equals("tos1")&& !Student_Proceed.r.equals("Do1")&& !Admin_Welcome.e.equals("doms1"))
        {
            JOptionPane.showMessageDialog(jPanel1,"COLLEGE SELECTION IS NOT DONE YET YET !!!","WARNING_MESSAGE",JOptionPane.WARNING_MESSAGE);
            jTextField1.setText(null);
        }
        else if(Admin_Welcome.s.equals("Done1")&&Admin_Welcome.t.equals("tos1")&& !Student_Proceed.r.equals("Do1")&& !Admin_Welcome.e.equals("doms1"))
        {
          JOptionPane.showMessageDialog(jPanel1,"NO STUDENT HAD DONE THE COLLEGE SELECTION PROCESS \n SCHOLARSHIP FOR 2022 SESSION IS FAILED !!!","INFORMATION_MESSAGE",JOptionPane.ERROR_MESSAGE);    
          jTextField1.setText(null);   
        }
        else if(Admin_Welcome.s.equals("Done1")&& Student_Proceed.r.equals("Do1")&& !Admin_Welcome.t.equals("tos1")&& !Admin_Welcome.e.equals("doms1"))
        {
            JOptionPane.showMessageDialog(jPanel1,"COLLEGE SELECTION PROCESS IS STILL GOING !!!","WARNING_MESSAGE",JOptionPane.WARNING_MESSAGE);
            jTextField1.setText(null);
        }
        else if(Admin_Welcome.s.equals("Done1")&& Student_Proceed.r.equals("Do1")&& Admin_Welcome.t.equals("tos1")&& !Admin_Welcome.e.equals("doms1"))
        {
            JOptionPane.showMessageDialog(jPanel1,"COLLEGE ALLOTMENT RESULT IS NOT DECLARED YET !!!","WARNING_MESSAGE",JOptionPane.WARNING_MESSAGE);
            jTextField1.setText(null);
        }
        else 
        {
            JOptionPane.showMessageDialog(jPanel1,"ENTERANCE RESULT IS NOT DECLARED, COLLEGE SELECTION IS NOT DONE \n COLLEGE ALLOTMENT RESULT IS NOT DECLARED YET! !!","WARNING_MESSAGE",JOptionPane.WARNING_MESSAGE);
            jTextField1.setText(null);
        }
    }
    }//GEN-LAST:event_jButton1ActionPerformed
   
    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained

    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
 
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped

        String value=jTextField1.getText();
        value.length();
        if(evt.getKeyChar()>='1'&&evt.getKeyChar()<='6'||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)
        {
            jTextField1.setEditable(true);
        }
        else
        {
            jTextField1.setEditable(false);
            JOptionPane.showMessageDialog(jPanel1,"INVALID CHOICE !!!","ERROR_MESSAGE",JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jTextField1KeyTyped

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
            java.util.logging.Logger.getLogger(Scholarship_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scholarship_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scholarship_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scholarship_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scholarship_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
