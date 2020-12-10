
import Project.ConnectionProvider;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
public class StudentQuizSection extends javax.swing.JFrame {
    public String rollNo,company_id;
    public int comp_id;
    public String quest_id;

    /**
     * Creates new form StudentQuizSection
     */
    public StudentQuizSection() {
        initComponents();
    }

    public StudentQuizSection(String company_id1, String rollNo1) {
        initComponents();
        company_id=company_id1;
        rollNo=rollNo1;
        comp_id=Integer.parseInt(company_id);
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select technical_marks,logical_marks,engProf_marks,situation_marks from company_student where student_id='"+rollNo+"' and company_id='"+comp_id+"'");
            rs.next();
            String t_marks=rs.getString(1);
            String l_marks=rs.getString(2);
            String e_marks=rs.getString(3);
            String s_marks=rs.getString(4);
            if(!t_marks.equals("none")){
                jButton1.setEnabled(false);
            }
            if(!l_marks.equals("none")){
                jButton2.setEnabled(false);
            }
            if(!e_marks.equals("none")){
                jButton3.setEnabled(false);
            }
            if(!s_marks.equals("none")){
                jButton4.setEnabled(false);
            }
            Statement st1=con.createStatement();
            ResultSet rs1=st1.executeQuery("select count(id) from technical_questions where company_id='"+comp_id+"'");
            rs1.next();
            quest_id=rs1.getString(1);
            if(quest_id.equals("0")){
               jButton1.setText("<html>No questions<br> for this section</html>");
               jButton1.setEnabled(false);
            }
            Statement st2=con.createStatement();
            ResultSet rs2=st2.executeQuery("select count(id) from logical_questions where company_id='"+comp_id+"'");
            rs2.next();
            quest_id=rs2.getString(1);
            if(quest_id.equals("0")){
               jButton2.setText("<html>No questions<br> for this section</html>");
               jButton2.setEnabled(false);
            }
            Statement st3=con.createStatement();
            ResultSet rs3=st3.executeQuery("select count(id) from engProf_questions where company_id='"+comp_id+"'");
            rs3.next();
            quest_id=rs3.getString(1);
            if(quest_id.equals("0")){
               jButton3.setText("<html>No questions<br> for this section</html>");
               jButton3.setEnabled(false);
            }
            Statement st4=con.createStatement();
            ResultSet rs4=st4.executeQuery("select count(id) from technical_questions where company_id='"+comp_id+"'");
            rs4.next();
            quest_id=rs4.getString(1);
            if(quest_id.equals("0")){
               jButton4.setText("<html>No questions<br> for this section</html>");
               jButton4.setEnabled(false);
            }
        }catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,e);
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setText("Choose Section!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, 1366, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 119, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 137, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setText("Proceed");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 314, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 332, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton3.setText("Proceed");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 670, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 630, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton4.setText("Proceed");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 660, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setText("Go Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizsectionbg.gif"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new studentCompany(rollNo).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String type="Technical";
        try{
           Connection con=ConnectionProvider.getCon();
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select technical_marks from company_student where student_id='"+rollNo+"' and company_id='"+comp_id+"'");
           // ResultSet rs=st.executeQuery("select technical_marks from company_student where student_id='19101A0090' and company_id='1'");
           rs.next();
           String tech_marks=rs.getString(1);
           if(tech_marks.equals("none")){
               setVisible(false);
//               new quizExamStudent().setVisible(true);
               new quizExamStudent(rollNo,company_id,type).setVisible(true);
          }//else{
//               jButton1.setEnabled(false);
//           }
        }catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String type="Logical";
        try{
           Connection con=ConnectionProvider.getCon();
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select logical_marks from company_student where student_id='"+rollNo+"' and company_id='"+comp_id+"'");
           rs.next();
           String log_marks=rs.getString(1);
           if(log_marks.equals("none")){
//               jButton2.setEnabled(true);
               setVisible(false);
               new quizExamStudent(rollNo,company_id,type).setVisible(true);
           //else{
//               jButton2.setEnabled(false);
          }
        }catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String type="English Proficiency";
        try{
           Connection con=ConnectionProvider.getCon();
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select engProf_marks from company_student where student_id='"+rollNo+"' and company_id='"+comp_id+"'");
           rs.next();
           String eng_marks=rs.getString(1);
           if(eng_marks.equals("none")){
               //jButton3.setEnabled(true);
               setVisible(false);
               new quizExamStudent(rollNo,company_id,type).setVisible(true);
//           }else{
//               jButton3.setEnabled(false);
           }
        }catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       String type="Situational Skills";
        try{
           Connection con=ConnectionProvider.getCon();
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select situation_marks from company_student where student_id='"+rollNo+"' and company_id='"+comp_id+"'");
           rs.next();
           String sit_marks=rs.getString(1);
           if(sit_marks.equals("none")){
              // jButton1.setEnabled(true);
               setVisible(false);
               new quizExamStudent(rollNo,company_id,type).setVisible(true);
//           }else{
//               jButton1.setEnabled(false);
           }
        }catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentQuizSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentQuizSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentQuizSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentQuizSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentQuizSection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}