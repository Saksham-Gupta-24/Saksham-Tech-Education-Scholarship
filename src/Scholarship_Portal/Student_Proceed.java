
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Scholarship_Portal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import javax.swing.JOptionPane;

public class Student_Proceed extends javax.swing.JFrame {
public  static String r = "Do";
public static String x="yes";
String details="C:\\Users\\saksh\\Desktop\\student details.txt";
   
    public Student_Proceed() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SAKSHAM TECH EDUCATION SCHOLARSHIP PORTAL");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 33)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("SELECT COURSE AND COLLEGE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("SELECT COURSE");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "ARTIFICIAL INTELLIGENCE AND MACHINE LEARNING", "AEROSPACE ENGINEERING", "COMPUTER SCIENCE AND ENGINEERING", "COMPUTER ENGINEERING", "CIVIL ENGINEERING", "CHEMICAL ENGINEERING", "ELECTRONICS AND COMMUNICATION ENGINEERING", "ELECTRICAL AND ELECTRONICS ENGINEERING", "INDUSTRIAL ENGINEERING", "MECHANICAL ENGINEERING" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("SELECT COLLEGE");

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "IIT-MADRAS", "IIT-DELHI", "IIT-BOMBAY", "IIT-KANPUR", "IIT-KHARAGPUR", "IIT-ROORKEE", "IIT-GUWAHATI", "IIT-HYDERABAD", "IIT-DHANBAD", "IIT-INDORE" }));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(181, 181, 181))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
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

    //submit button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        if(jComboBox1.getSelectedIndex()==0 || jComboBox2.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(jPanel1,"INPUT MISSING !!!","WARNING_MESSAGE",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            String [] connect={ "YES","NO"};
            int response=JOptionPane.showOptionDialog(this,"DO YOU WANT TO SUBMIT THE FORM ??","CHECK DETAILS",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,connect,"NO");
            switch(response)
            {
                case 0:    
                        //course 
                        String fname3 = "C:\\Users\\saksh\\Desktop\\saku course.txt";
                        File f12345=new File(fname3);
                        try
                        {
                            if (!f12345.exists())
                            {
                                f12345.createNewFile();
                            }
                            Writer output = new FileWriter(fname3,true);
                            output.append("\n"+ jComboBox1.getSelectedItem());
                            output.close();
                        }
                        catch(IOException pqr)
                        {
                            pqr.printStackTrace();
                        }
      
                        //college
                        String fname4 = "C:\\Users\\saksh\\Desktop\\saku college.txt";
                        File f12=new File(fname3);
                        try
                        {
                            if (!f12.exists())
                            {
                                f12.createNewFile();
                            }
                            Writer output = new FileWriter(fname4,true);
                            output.append("\n     "+ jComboBox2.getSelectedItem());
                            output.close();
                        }
                        catch(IOException pqrs)
                        {
                            pqrs.printStackTrace();
                        }
                        //details
                        File student_details=new File(details);
                        try
                        {
                            if (!student_details.exists())
                            {
                                student_details.createNewFile();    
                            }
                            Writer output = new FileWriter(details,true);
                            output.append("\nCOUSRE SELECTED :\t\t"+jComboBox1.getItemAt(jComboBox1.getSelectedIndex()));
                            output.append("\nCOLLEGE SELECTED :\t\t"+jComboBox2.getItemAt(jComboBox2.getSelectedIndex()));
                            output.append("\n");
                            output.append("\n");
                            output.append("""  
                                            WAIT FOR THE ALLOTMENT RESULT ONCE YOUR COLLEGE AND COURSE GET CONFIRM 
                                            U CAN GO TO YOUR ALLOTED COLLEGE AND CAN COMPLETE YOUR ADMISSION ON TIME""");
                            output.append("\n                      ALL THE BEST FOR YOUR FUTURE!!!                          ");
                            output.append("\n");
                            output.append("\n");
                            output.append("********************************** THANK YOU !!! **********************************");
                            output.close();

                        }
                        catch(IOException pq)
                        {
                            pq.printStackTrace();
                        } 
                        r="Do1";
                        JOptionPane.showMessageDialog(jPanel1," YOUR FORM IS SUBMIT SUCESSFULLY !!!","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                        Student_Submit frame1=new Student_Submit();
                        frame1.setVisible(true);
                        dispose();
                        break;
                case 1:
                        JOptionPane.getRootFrame().dispose();
                        break;
                default:
                        JOptionPane.getRootFrame().dispose();
                        break;
            }
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Student_Proceed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Proceed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Proceed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Proceed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Proceed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
