/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Scholarship_Portal;

import javax.swing.JOptionPane;

public class Admin_Welcome extends javax.swing.JFrame
{
    public  static String s = "Done";
    public static String e="doms";
    public static String t="tos";
    public static String x="lay";

    public Admin_Welcome() 
    {
        initComponents();
    }

    public Admin_Welcome(String Username) 
    {
       initComponents();
       jLabel1.setText("WELCOME "+ Username.toUpperCase());
       
       if(Admin_Welcome.s.equals("Done1") && (!Admin_Welcome.t.equals("tos1")&&!Admin_Welcome.e.equals("doms1")))
       {
            jLabel4.setText("COLLEGE SELECTION PORTAL IS OPENED !!!");
       }
       else if(Admin_Welcome.s.equals("Done1")&& Admin_Welcome.t.equals("tos1")&&!Admin_Welcome.e.equals("doms1")&& !Admin_Welcome.x.equals("lay1"))
       {
            jLabel4.setText("COLLEGE SELECTION PORTAL IS CLOSED !!!");
       }
       else if(Admin_Welcome.x.equals("lay1"))
       {
            jLabel4.setText("SCHOLARSHIP FOR 2022 SESSION IS FAILED !!");  
       }
       else if(Admin_Welcome.e.equals("doms1"))
       {
            jLabel4.setText("COLLEGE ALLOTMENT FOR 2022 SESSION IS COMPLETED !!!");
       }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SAKSHAM TECH EDUCATION SCHOLARSHIP PORTAL");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("NAMASTE");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel1KeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("CLICK 1 TO DECLARE  ENTRANCE TEST RESULT");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("CLICK 3 TO DECLARE COLLEGE ALLOTMENT RESULT");

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton2.setText("3");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("RESULT  NOT DECLARED  !!!!");

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setText("LOGOUT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("CLICK 2 TO CLOSE THE COLLEGE SELECTION PORTAL");
        jLabel5.setPreferredSize(new java.awt.Dimension(412, 25));

        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton4.setText("2");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(123, 123, 123)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
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

    //Button 1
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
	if(!Admin_Welcome.s.equals("Done1"))
        {
            JOptionPane.showMessageDialog(jPanel1,"ENTRANCE RESULT DECLARED !!!","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
            jLabel4.setText("COLLEGE SELECTION PORTAL IS OPEN NOW !!!");
            s ="Done1";  
        } 
        else
        {  
            if(Admin_Welcome.s.equals("Done1")&& Admin_Welcome.t.equals("tos1")&&!Admin_Welcome.e.equals("doms1")&& !Admin_Welcome.x.equals("lay1"))
            {
                JOptionPane.showMessageDialog(jPanel1,"ENTRANCE RESULT ALREADY DECLARED !!!","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                jLabel4.setText("COLLEGE SELECTION PORTAL IS CLOSED !!!");
            }          
            else if(Admin_Welcome.s.equals("Done1")&& Admin_Welcome.t.equals("tos1")&&Admin_Welcome.e.equals("doms1")&& !Admin_Welcome.x.equals("lay1"))
            {   
                JOptionPane.showMessageDialog(jPanel1,"ENTRANCE RESULT ALREADY DECLARED !!!","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                jLabel4.setText("COLLEGE ALLOTMENT FOR 2022 SESSION IS COMPLETED !!!");
            }
            else if(Admin_Welcome.s.equals("Done1")&& Admin_Welcome.t.equals("tos1")&&!Admin_Welcome.e.equals("doms1")&& Admin_Welcome.x.equals("lay1"))
            {
                JOptionPane.showMessageDialog(jPanel1,"ENTRANCE RESULT ALREADY DECLARED !!!","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                jLabel4.setText("SCHOLARSHIP FOR 2022 SESSION IS FAILED !!!");
            }
            else
            {
                JOptionPane.showMessageDialog(jPanel1,"ENTRANCE RESULT ALREADY DECLARED !!!","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                jLabel4.setText("COLLEGE SELECTION PORTAL IS OPENED !!!");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    //Button 3
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        if ((Admin_Welcome.s.equals("Done1"))&&(Student_Proceed.r.equals("Do1"))&&  Admin_Welcome.t.equals("tos1")&& !Admin_Welcome.e.equals("doms1"))
        {
            JOptionPane.showMessageDialog(jPanel1,"COLLEGE ALLOTMENT RESULT DECLARED !!!","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
            jLabel4.setText("COLLEGE ALLOTMENT FOR 2022 SESSION IS COMPLETED !!!");
            e="doms1";
        }
        else if ((Admin_Welcome.s.equals("Done1"))&& (!Student_Proceed.r.equals("Do1")&& !Admin_Welcome.t.equals("tos1")&& !Admin_Welcome.e.equals("doms1")))
        {
            JOptionPane.showMessageDialog(jPanel1,"COLLEGE SELECTION IS STILL GOING !!!","WARNING_MESSAGE",JOptionPane.WARNING_MESSAGE);
        }
        else if ((Admin_Welcome.s.equals("Done1"))&& (Student_Proceed.r.equals("Do1")&& !Admin_Welcome.t.equals("tos1")&& !Admin_Welcome.e.equals("doms1")))
        {
            JOptionPane.showMessageDialog(jPanel1,"COLLEGE SELECTION IS STILL GOING !!!","WARNING_MESSAGE",JOptionPane.WARNING_MESSAGE);
        }
        else if (Admin_Welcome.s.equals("Done1")&& Admin_Welcome.t.equals("tos1")&& !Student_Proceed.r.equals("Do1") && !Admin_Welcome.e.equals("doms1"))
        {
            JOptionPane.showMessageDialog(jPanel1,"NO STUDENT HAD DONE THE COLLEGE SELECTION PROCESS \n SO SCHOLARSHIP FOR 2022 SESSION IS FAILED!!!","INFORMATION_MESSAGE",JOptionPane.ERROR_MESSAGE);
            jLabel4.setText("SCHOLARSHIP FOR 2022 SESSION IS FAILED !!!");
            x="lay1";          
        }   
        else if(Admin_Welcome.s.equals("Done1")&& Student_Proceed.r.equals("Do1")&& Admin_Welcome.t.equals("tos1")&& Admin_Welcome.e.equals("doms1"))
        {
            JOptionPane.showMessageDialog(jPanel1,"COLLEGE ALLOTMENT RESULT ALREADY DECLARED !!!","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
            jLabel4.setText("COLLEGE ALLOTMENT FOR 2022 SESSION IS COMPLETED !!!");
        }      
        else
        {
            JOptionPane.showMessageDialog(jPanel1,"ENTRANCE RESULT IS NOT DECLARED YET !!!","WARNING_MESSAGE",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    //Logout Button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        JOptionPane.showMessageDialog(jPanel1,"LOGOUT SUCESSFULLY !!!","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        Scholarship_Main frame1=new Scholarship_Main();
        frame1.setVisible(true);
        dispose();
     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:    
    }//GEN-LAST:event_jButton1KeyPressed

    private void jLabel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1KeyPressed

    //Button 2
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (Admin_Welcome.s.equals("Done1")&& !Admin_Welcome.e.equals("doms1")&& !Admin_Welcome.t.equals("tos1") && !Admin_Welcome.x.equals("lay1"))
        {
            JOptionPane.showMessageDialog(jPanel1,"COLLEGE SELECTION PORTAL IS CLOSE NOW !!!","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
            jLabel4.setText("COLLEGE SELECTION PORTAL IS CLOSE NOW !!!");
            t="tos1";
        }
        else if ( (Admin_Welcome.s.equals("Done1")&& Admin_Welcome.t.equals("tos1"))&& !Admin_Welcome.e.equals("doms1") && !Admin_Welcome.x.equals("lay1"))
        {
            JOptionPane.showMessageDialog(jPanel1,"COLLEGE SELECTION PORTAL IS ALREADY CLOSED !!!","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
            jLabel4.setText("COLLEGE SELECTION PORTAL IS CLOSED !!!");
        }
        else   if(Admin_Welcome.s.equals("Done1")&&Admin_Welcome.t.equals("tos1")&&Admin_Welcome.e.equals("doms1") && !Admin_Welcome.x.equals("lay1"))
        {
            JOptionPane.showMessageDialog(jPanel1,"COLLEGE SELECTION PORTAL IS ALREADY CLOSED !!!","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
            jLabel4.setText("COLLEGE ALLOTMENT FOR 2022 SESSION IS COMPLETED !!!");
        }    
        else   if(Admin_Welcome.s.equals("Done1")&& Admin_Welcome.t.equals("tos1")&& !Admin_Welcome.e.equals("doms1")&& Admin_Welcome.x.equals("lay1"))
        {
            JOptionPane.showMessageDialog(jPanel1,"COLLEGE SELECTION PORTAL IS ALREADY CLOSED !!!","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
            jLabel4.setText("SCHOLARSHIP FOR 2022 SESSION IS FAILED !!!");
        }    
        else
        {
            JOptionPane.showMessageDialog(jPanel1,"ENTRANCE RESULT IS NOT DECLARED YET !!!","WARNING_MESSAGE",JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

   
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
            java.util.logging.Logger.getLogger(Admin_Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
