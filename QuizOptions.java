
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AKSHAYA
 */
public class QuizOptions extends javax.swing.JFrame {
    
    /**
     * Creates new form QuizOptions
     */
    public QuizOptions() {
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

        button1 = new java.awt.Button();
        label1 = new java.awt.Label();
        button3 = new java.awt.Button();
        button2 = new java.awt.Button();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button1.setLabel("button1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        label1.setText("label1");

        button3.setLabel("button2");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button2.setLabel("button2");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button4.setLabel("button4");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button5.setLabel("Back");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        /*Connection con=Project.ConnectionProvider.con();
         PreparedStatement ps;
        try {
                if(allCompanies.c1==1){
                        allCompanies.c1++;
                         ps = con.prepareStatement("update counter set count1=? where rollno=? ");
                        ps.setInt(1, allCompanies.c1);         
                        ps.setString(2,LoginStudent.user);
                        ps.executeUpdate();
                        setVisible(false);
                        new instructionStudent().setVisible(true);
                }
                else if(allCompanies.c5==2){
                        allCompanies.c5++;
                         ps = con.prepareStatement("update counter1 set count1=? where rollno=? ");
                        ps.setInt(1, allCompanies.c5);         
                        ps.setString(2,LoginStudent.user);
                        ps.executeUpdate();
                        setVisible(false);
                        new instructionStudent().setVisible(true);
                }
                else if(allCompanies.c9==4){
                        allCompanies.c9++;
                         ps = con.prepareStatement("update counter2 set count1=? where rollno=? ");
                        ps.setInt(1, allCompanies.c9);         
                        ps.setString(2,LoginStudent.user);
                        ps.executeUpdate();
                        setVisible(false);
                        new instructionStudent().setVisible(true);
                }
                else JOptionPane.showMessageDialog(null, "You have already given this test");
             } catch (SQLException ex) {
            Logger.getLogger(allCompanies.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }//GEN-LAST:event_button1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
       /* Connection con=Project.ConnectionProvider.con();
         PreparedStatement ps;
        try {
                if(allCompanies.c2==1){
                        allCompanies.c2=2;
                         ps = con.prepareStatement("update counter set count2=? where rollno=? ");
                        ps.setInt(1, allCompanies.c2);         
                        ps.setString(2,LoginStudent.user);
                        ps.executeUpdate();
                        setVisible(false);
                        new instructionStudent().setVisible(true);
                }
                else if(allCompanies.c6==2){
                        allCompanies.c6++;
                         ps = con.prepareStatement("update counter2 set count2=? where rollno=? ");
                        ps.setInt(1, allCompanies.c6);         
                        ps.setString(2,LoginStudent.user);
                        ps.executeUpdate();
                        setVisible(false);
                        new instructionStudent().setVisible(true);
                }
                else if(allCompanies.c10==4){
                        allCompanies.c10++;
                         ps = con.prepareStatement("update counter3 set count2=? where rollno=? ");
                        ps.setInt(1, allCompanies.c10);         
                        ps.setString(2,LoginStudent.user);
                        ps.executeUpdate();
                        setVisible(false);
                        new instructionStudent().setVisible(true);
                }
                else JOptionPane.showMessageDialog(null, "You have already given this test");
             } catch (SQLException ex) {
            Logger.getLogger(allCompanies.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_button3ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
       /* Connection con=Project.ConnectionProvider.con();
         PreparedStatement ps;
        try {
                if(allCompanies.c3==1){
                        allCompanies.c3++;
                         ps = con.prepareStatement("update counter set count3=? where rollno=? ");
                        ps.setInt(1, allCompanies.c3);         
                        ps.setString(2,LoginStudent.user);
                        ps.executeUpdate();
                        setVisible(false);
                        new instructionStudent().setVisible(true);
                }
                else if(allCompanies.c7==2){
                        allCompanies.c7++;
                         ps = con.prepareStatement("update counter2 set count3=? where rollno=? ");
                        ps.setInt(1, allCompanies.c7);         
                        ps.setString(2,LoginStudent.user);
                        ps.executeUpdate();
                        setVisible(false);
                        new instructionStudent().setVisible(true);
                }
                else if(allCompanies.c11==4){
                        allCompanies.c11++;
                         ps = con.prepareStatement("update counter3 set count3=? where rollno=? ");
                        ps.setInt(1, allCompanies.c11);         
                        ps.setString(2,LoginStudent.user);
                        ps.executeUpdate();
                        setVisible(false);
                        new instructionStudent().setVisible(true);
                }
                else JOptionPane.showMessageDialog(null, "You have already given this test");
             } catch (SQLException ex) {
            Logger.getLogger(allCompanies.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_button2ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        /*
         
        try {
            Connection con=Project.ConnectionProvider.con();
            PreparedStatement ps;
                if(allCompanies.c4==1){
                        allCompanies.c4=2;
                         ps = con.prepareStatement("update counter set count4=? where rollno=? ");
                        ps.setInt(1, allCompanies.c4);         
                        ps.setString(2,LoginStudent.user);
                        ps.executeUpdate();
                        setVisible(false);
                        new instructionStudent().setVisible(true);
                }
                else if(allCompanies.c8==2){
                        allCompanies.c8++;
                         ps = con.prepareStatement("update counter2 set count4=? where rollno=? ");
                        ps.setInt(1, allCompanies.c8);         
                        ps.setString(2,LoginStudent.user);
                        ps.executeUpdate();
                        setVisible(false);
                        new instructionStudent().setVisible(true);
                }
                else if(allCompanies.c12==4){
                        allCompanies.c12++;
                         ps = con.prepareStatement("update counter3 set count4=? where rollno=? ");
                        ps.setInt(1, allCompanies.c12);         
                        ps.setString(2,LoginStudent.user);
                        ps.executeUpdate();
                        setVisible(false);
                        new instructionStudent().setVisible(true);
                }
                else JOptionPane.showMessageDialog(null, "You have already given this test");
             } catch (SQLException ex) {
            Logger.getLogger(allCompanies.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       */
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        /* setVisible(false);
        new allCompanies().setVisible(true);*/
    }//GEN-LAST:event_button5ActionPerformed

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
            java.util.logging.Logger.getLogger(QuizOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizOptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}