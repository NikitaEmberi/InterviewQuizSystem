

import Project.ConnectionProvider;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
public class quizExamStudent extends javax.swing.JFrame {
public String company_id,type,rollNo;
public String questionId;
public String answer;
public int min=0;
public int sec=0;
public int marks=0;
public String next_id;
public int question_count=0;
ArrayList<Integer> random_questions=new ArrayList<Integer>();

public void generate_random_questions(int max){
     int min=1;
     int random_question_id=(int)(Math.random() * (max - min + 1) + min);
//     ArrayList<Integer> random_questions=new ArrayList<Integer>();
        while(random_questions.size()<10){
            if (!random_questions.contains(random_question_id)) { 
            random_questions.add(random_question_id); 
            generate_random_questions(max);
//              return random_question_id;
           }else{
           generate_random_questions(max);
           }
        }
    
//    System.out.println(random_questions);
}

public void answerCheck(){
    String studentAnswer="";
    if(jRadioButton1.isSelected()){
        studentAnswer=jRadioButton1.getText();
    }else if(jRadioButton2.isSelected()){
        studentAnswer=jRadioButton2.getText();
    }else if(jRadioButton3.isSelected()){
        studentAnswer=jRadioButton3.getText();
    }else{
        studentAnswer=jRadioButton4.getText();
    }
    if(studentAnswer.equals(answer)){
        marks=marks+1;
    }
    
    //change question number
//    int questionId1=Integer.parseInt(questionId);
//    questionId1=questionId1+1;
//    questionId=String.valueOf(questionId1);
      question_count++;
    
    //clear radio button
    jRadioButton1.setSelected(false);
    jRadioButton2.setSelected(false);
    jRadioButton3.setSelected(false);
    jRadioButton4.setSelected(false);
    
     String id;
    
    //if u reach last question (Suppose last question is 10th) hide next button
    //if(jLabel23.getText().equals("10")){
    if(question_count==9){
        jButton1.setVisible(false);
    }
//    try{
//        Connection con=ConnectionProvider.getCon();
//        Statement st=con.createStatement();
//        int comp_id=Integer.parseInt(company_id);
//        if(type.equals("Technical")){
//          ResultSet rs1=st.executeQuery("select count(id) from technical_questions where company_id='"+comp_id+"'");
//          rs1.next();
//          id=rs1.getString(1);
//          if(questionId.equals(id)){
//             jButton1.setVisible(false);
//          }
//        } 
//        if(type.equals("Logical")){
//          ResultSet rs2=st.executeQuery("select count(id) from logical_questions where company_id='"+comp_id+"'");
//          rs2.next();
//          id=rs2.getString(1);
//          if(questionId.equals(id)){
//             jButton1.setVisible(false);
//          }
//        }
//        if(type.equals("English Proficiency")){
//          ResultSet rs3=st.executeQuery("select count(id) from engprof_questions where company_id='"+comp_id+"'");
//          rs3.next();
//          id=rs3.getString(1);
//          if(questionId.equals(id)){
//             jButton1.setVisible(false);
//          }
//        }
//        if(type.equals("Situational Skills")){
//          ResultSet rs4=st.executeQuery("select count(id) from situation_questions where company_id='"+comp_id+"'");
//          rs4.next();
//          id=rs4.getString(1);
//          if(questionId.equals(id)){
//             jButton1.setVisible(false);
//          }
//        }
//    }catch(Exception e){
//        JOptionPane.showMessageDialog(null, e);
//    }    
//  

}

public void question(){
   
    try{
          Connection con=ConnectionProvider.getCon();
          Statement st=con.createStatement();
          int comp_id=Integer.parseInt(company_id);
          //ResultSet rs1=st.executeQuery("select * from question where id='"+questionId+"' and type='"+type+"' and company_id='"+comp_id+"'");
          if(type.equals("Technical")){
              ResultSet rs=st.executeQuery("select * from technical_questions where id='"+random_questions.get(question_count)+"' and company_id='"+comp_id+"'");
              while(rs.next()){
                  jLabel23.setText(String.valueOf(question_count+1));
                  jLabel20.setText(rs.getString(2));
                  jRadioButton1.setText(rs.getString(3));
                  jRadioButton2.setText(rs.getString(4));
                  jRadioButton3.setText(rs.getString(5));
                  jRadioButton4.setText(rs.getString(6));
                  answer=rs.getString(7); 
                  System.out.println(question_count+" "+random_questions.get(question_count));
              }
              //question_count++;
          }
          if(type.equals("Logical")){
                ResultSet rs=st.executeQuery("select * from logical_questions where id='"+random_questions.get(question_count)+"' and company_id='"+comp_id+"'");
              while(rs.next()){
                  jLabel23.setText(String.valueOf(question_count+1));
                  jLabel20.setText(rs.getString(2));
                  jRadioButton1.setText(rs.getString(3));
                  jRadioButton2.setText(rs.getString(4));
                  jRadioButton3.setText(rs.getString(5));
                  jRadioButton4.setText(rs.getString(6));
                  answer=rs.getString(7); 
                  System.out.println(question_count+" "+random_questions.get(question_count));
              }
              //question_count++;
          }
          if(type.equals("Situational Skills")){
               ResultSet rs=st.executeQuery("select * from situation_questions where id='"+random_questions.get(question_count)+"' and company_id='"+comp_id+"'");
              while(rs.next()){
                  jLabel23.setText(String.valueOf(question_count+1));
                   //jLabel20.setText("<html>a verry longg text a verry longg text a verry longg text a verry longg text a verry longg text a verry longg text a verry longg text a verry longg text a verry longg text a verry longg text </html>");
                  jLabel20.setText(rs.getString(2));
                  jRadioButton1.setText(rs.getString(3));
                  jRadioButton2.setText(rs.getString(4));
                  jRadioButton3.setText(rs.getString(5));
                  jRadioButton4.setText(rs.getString(6));
                  answer=rs.getString(7);
              }
              //question_count++;
          }
          if(type.equals("English Proficiency")){
             ResultSet rs=st.executeQuery("select * from engprof_questions where id='"+random_questions.get(question_count)+"' and company_id='"+comp_id+"'");
              while(rs.next()){
                  jLabel23.setText(String.valueOf(question_count+1));
                  jLabel20.setText(rs.getString(2));
                  jRadioButton1.setText(rs.getString(3));
                  jRadioButton2.setText(rs.getString(4));
                  jRadioButton3.setText(rs.getString(5));
                  jRadioButton4.setText(rs.getString(6));
                  answer=rs.getString(7);
              }
              //question_count++;
          }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    
       
}

public void submit(){
    String rollNo=jLabel11.getText(); 
    answerCheck();
    int comp_id=Integer.parseInt(company_id); 
    try{
       Connection con=ConnectionProvider.getCon();
       Statement st=con.createStatement();
       if(type.equals("Technical")){
         st.executeUpdate("update company_student set technical_marks='"+marks+"' where student_id='"+rollNo+"' and company_id='"+comp_id+"'");
       }
       if(type.equals("Logical")){
         st.executeUpdate("update company_student set logical_marks='"+marks+"' where student_id='"+rollNo+"' and company_id='"+comp_id+"'");
       }
       if(type.equals("Situational Skills")){
          st.executeUpdate("update company_student set situation_marks='"+marks+"' where student_id='"+rollNo+"' and company_id='"+comp_id+"'"); 
       }
       if(type.equals("English Proficiency")){
          st.executeUpdate("update company_student set engProf_marks='"+marks+"' where student_id='"+rollNo+"' and company_id='"+comp_id+"'"); 
       }
//else{
//           st.executeUpdate("update company_student set engProf_marks='"+marks+"' where student_id='"+rollNo+"' and company_id='"+comp_id+"'");
//       }
       Statement st1=con.createStatement();
       ResultSet rs=st1.executeQuery("select technical_marks,logical_marks,engProf_marks,situation_marks from company_student where student_id='"+rollNo+"' and company_id='"+comp_id+"'");
       rs.next();
       String tech=rs.getString(1);
       String logical=rs.getString(2);
       String english_proficiency=rs.getString(3);
       String sit=rs.getString(4);
       if(tech.equals("none") || logical.equals("none") || english_proficiency.equals("none") || sit.equals("none")){
            setVisible(false);
            new StudentQuizSection(company_id,rollNo).setVisible(true);
       }else{
           int techmarks=Integer.parseInt(tech);
           int logmarks=Integer.parseInt(logical);
           int enPro=Integer.parseInt(english_proficiency);
           int sitmarks=Integer.parseInt(sit);
           int total_marks=techmarks+logmarks+enPro+sitmarks;
           String tot_marks=String.valueOf(total_marks);
           Statement st10=con.createStatement();
           st10.executeUpdate("update company_student set total='"+tot_marks+"' where student_id='"+rollNo+"' and company_id='"+comp_id+"'");
           if(total_marks>=5){
               setVisible(false);
               new successfullySubmitted(tot_marks,rollNo,company_id).setVisible(true);
           }else{
               setVisible(false);
               new failedQuiz(tot_marks).setVisible(true);
           }
       }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
}

    /**
     * Creates new form quizExam
     */
    public quizExamStudent() {
        initComponents();
        //Date (u first write this code below at 116)
//        SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
//        Date date=new Date();
//        jLabel4.setText(dFormat.format(date));
//        
        //after inserting database remove the code from 112-131 and uncomment lines from 161-180
        setLocationRelativeTo(this);
        time=new Timer(1000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent a){
                jLabel9.setText(String.valueOf(sec));
                jLabel8.setText(String.valueOf(min));
                if(sec==60){
                    sec=0;
                    min++;
                    if(min==10){
                        time.stop();
                        answerCheck();
                        submit();
                    }
                }
                sec++;
            }
        });
        time.start();
        
//        generate_random_questions(15);
//        System.out.println(random_questions);
       
    }
    Timer time;
    public quizExamStudent(String rollNo1,String company_id1,String type1) {
        initComponents();
        //Current Date
        SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
        Date date=new Date();
        jLabel4.setText(dFormat.format(date));
        
        
        rollNo=rollNo1;
        company_id=company_id1;
        type=type1;
        jLabel11.setText(rollNo);
        jLabel27.setText(type);
        int comp_id=Integer.parseInt(company_id);
        int questionId1;
        int question_id_max;
        try{
           Connection con=ConnectionProvider.getCon();
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select * from student where rollNo='"+rollNo+"'");
           //student details 
           while(rs.next()){
               jLabel13.setText(rs.getString(2)+" "+rs.getString(4));
           }
           Statement st1=con.createStatement();
           ResultSet rs1=st1.executeQuery("select * from company where id='"+comp_id+"'");
           if(rs1.next()){
               jLabel24.setText(rs1.getString(2));
           }
           if(type.equals("Technical")){
               Statement st21=con.createStatement();
               ResultSet rs21=st21.executeQuery("select max(id) from technical_questions where company_id='"+comp_id+"'");
               rs21.next();
               jLabel19.setText("10");
               question_id_max=Integer.parseInt(rs21.getString(1));
               generate_random_questions(question_id_max);
               System.out.println(random_questions);
           }else if(type.equals("Logical")){
               Statement st31=con.createStatement();
               ResultSet rs31=st31.executeQuery("select max(id) from logical_questions where company_id='"+comp_id+"'");
               rs31.next();
               jLabel19.setText("10");
               question_id_max=Integer.parseInt(rs31.getString(1));
               generate_random_questions(question_id_max);
               System.out.println(random_questions);
           }else if(type.equals("Situational Skills")){
               Statement st41=con.createStatement();
               ResultSet rs41=st41.executeQuery("select max(id) from situation_questions where company_id='"+comp_id+"'");
               rs41.next();
               jLabel19.setText("10");
               question_id_max=Integer.parseInt(rs41.getString(1));
               generate_random_questions(question_id_max);
           }else{
               Statement st51=con.createStatement();
               ResultSet rs51=st51.executeQuery("select max(id) from engProf_questions where company_id='"+comp_id+"'");
               rs51.next();
               jLabel19.setText("10");
               question_id_max=Integer.parseInt(rs51.getString(1));
               generate_random_questions(question_id_max);
           }
           
          
           if(type.equals("Technical")){
               Statement st2=con.createStatement();
               ResultSet rs2=st2.executeQuery("select * from technical_questions where id='"+random_questions.get(0)+"' and company_id='"+comp_id+"'");
               while(rs2.next()){
                   jLabel23.setText(String.valueOf(question_count+1));
                   jLabel20.setText(rs2.getString(2));
                   jRadioButton1.setText(rs2.getString(3));
                   jRadioButton2.setText(rs2.getString(4));
                   jRadioButton3.setText(rs2.getString(5));
                   jRadioButton4.setText(rs2.getString(6));
                   answer=rs2.getString(7);
                   System.out.println(question_count+" "+random_questions.get(question_count));
               }
               //question_count++;
           }
           if(type.equals("Logical")){
               Statement st3=con.createStatement();
               ResultSet rs3=st3.executeQuery("select * from logical_questions where id='"+random_questions.get(0)+"' and company_id='"+comp_id+"'");
               while(rs3.next()){
                   jLabel23.setText(String.valueOf(question_count+1));
                   jLabel20.setText(rs3.getString(2));
                   jRadioButton1.setText(rs3.getString(3));
                   jRadioButton2.setText(rs3.getString(4));
                   jRadioButton3.setText(rs3.getString(5));
                   jRadioButton4.setText(rs3.getString(6));
                   answer=rs3.getString(7);
                   System.out.println(question_count+" "+random_questions.get(question_count));
               }
               //question_count++;
           }
           if(type.equals("Situational Skills")){
               Statement st4=con.createStatement();
               ResultSet rs4=st4.executeQuery("select * from situation_questions where id='"+random_questions.get(0)+"' and company_id='"+comp_id+"'");
       
               while(rs4.next()){
                   jLabel23.setText(String.valueOf(question_count+1));
                   jLabel20.setText("<html>"+rs4.getString(2)+"</html>");
                   jRadioButton1.setText(rs4.getString(3));
                   jRadioButton2.setText(rs4.getString(4));
                   jRadioButton3.setText(rs4.getString(5));
                   jRadioButton4.setText(rs4.getString(6));
                   answer=rs4.getString(7);
               }
               //question_count++;
          }
           if(type.equals("English Proficiency")){
              Statement st5=con.createStatement();
               ResultSet rs5=st5.executeQuery("select * from engprof_questions where id='"+random_questions.get(0)+"' and company_id='"+comp_id+"'");
              
               while(rs5.next()){
                   jLabel23.setText(String.valueOf(question_count+1));
                   jLabel20.setText(rs5.getString(2));
                   jRadioButton1.setText(rs5.getString(3));
                   jRadioButton2.setText(rs5.getString(4));
                   jRadioButton3.setText(rs5.getString(5));
                   jRadioButton4.setText(rs5.getString(6));
                   answer=rs5.getString(7);
               }
               //question_count++;
           }
           
//else{
//               Statement st5=con.createStatement();
//               ResultSet rs5=st5.executeQuery("select * from engProf_questions where id='"+questionId+"' and company_id='"+comp_id+"'");
//               while(rs5.next()){
//                   jLabel23.setText(rs5.getString(1));
//                   jLabel20.setText(rs5.getString(2));
//                   jRadioButton1.setText(rs5.getString(3));
//                   jRadioButton2.setText(rs5.getString(4));
//                   jRadioButton3.setText(rs5.getString(5));
//                   jRadioButton4.setText(rs5.getString(6));
//                   answer=rs5.getString(7);
//               } 
//           }
                     
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        //time
        setLocationRelativeTo(this);
        time=new Timer(1000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent a){
                jLabel9.setText(String.valueOf(sec));
                jLabel8.setText(String.valueOf(min));
                if(sec==60){
                    sec=0;
                    min++;
                    if(min==10){
                        time.stop();
                        answerCheck();
                        submit();
                    }
                }
                sec++;
            }
        });
        time.start();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index student.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 90, 70));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 60)); // NOI18N
        jLabel2.setText("Welcome!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Date:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 73, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 73, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Total Time: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("10 Minutes");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("Time Taken: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText(" 00 ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 70, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("00");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Roll Number: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("JLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Name: ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Total Questions:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("10");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Question Type:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, 31));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText(" Total Questions: ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, 31));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("00");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 30, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel20.setText("Question");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 870, 100));

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Next.png"))); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 640, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 640, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel21.setText(":");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 70, 10, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel22.setText("Question No. : ");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 51));
        jLabel23.setText("00");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel26.setText("Company Name: ");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 73, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 51, 255));
        jLabel24.setText("jLabel24");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 73, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("jLabel27");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 352, -1, -1));

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jRadioButton4.setText("jRadioButton4");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizscreenbg.png"))); // NOI18N
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        answerCheck();
        question();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null, "Do you really want to Submit?","Select",JOptionPane.YES_NO_OPTION);
        
        if(a==0){
            //answerCheck();
            submit();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()){
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton2.isSelected()){
            jRadioButton1.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here
        if(jRadioButton3.isSelected()){
            jRadioButton2.setSelected(false);
            jRadioButton1.setSelected(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton4.isSelected()){
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed
    
     
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
            java.util.logging.Logger.getLogger(quizExamStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quizExamStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quizExamStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quizExamStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quizExamStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
