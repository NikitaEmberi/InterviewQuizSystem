import java.sql.*;
import Project.ConnectionProvider;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class addNewQuestion extends javax.swing.JFrame {

    /**
     * Creates new form addNewQuestion
     */static String id;
     int id2;
     int id1;
     //String id;
     String str;
    public addNewQuestion() {
        initComponents();
        String compID=chooseComp.compId;
           jLabel14.setText(compID);
           
           
           String sec=StudentQuizSection1.type;
           jLabel15.setText(sec);
          // String id=adminHome.str;
          //jLabel4.setText(id);
       
           
           
            
            
            if(sec.equals("English")){
                 try{
          // String compID=chooseComp.compId;
           //jLabel14.setText(compID);
                         Connection con=ConnectionProvider.getCon();
                          Statement st=con.createStatement();
//                           Connection conn=Project.ConnectionProvider.con();
//                              PreparedStatement pq=conn.prepareStatement("select count(id) from engprof_questions where company_id=?");
//                              pq.setString(1,compID);
//                              pq.executeUpdate();
                       ResultSet rs=st.executeQuery("select count(id) from engprof_questions where company_id="+compID);
                        if(rs.first()){
                           id2=rs.getInt(1);
                           id2=id2+1;
                            str=String.valueOf(id2);
                          jLabel4.setText(str);
                         id=jLabel4.getText();
                         }else{
                        jLabel4.setText("1");
               // id2=1;//jLabel4.getText();
                     str=String.valueOf(1);
            }//new adminHome().jMenu1MouseClicked(evt);
                    // new addNewQuestion().setVisible(true);
        }catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,e);
        } 
             
           
                  // new addNewQuestion().setVisible(true);
           }else if(sec.equals("Logical")){
              // new addNewQuestion().setVisible(true);
           
                  try{
           
                        Connection con=ConnectionProvider.getCon();
                        Statement st=con.createStatement();

                        ResultSet rs=st.executeQuery("select count(id) from logical_questions where company_id="+compID);
                        if(rs.first()){
                           id2=rs.getInt(1);
                           id2+=1;
                           str=String.valueOf(id2);
                          jLabel4.setText(str);
                           id=jLabel4.getText();
                        }else{
                            jLabel4.setText("1");
                           // id2=1;//jLabel4.getText();
                           str=String.valueOf(1);
                        }//new adminHome().jMenu1MouseClicked(evt);
                       // new addNewQuestion().setVisible(true);
                     }catch(Exception e){
                            JFrame jf=new JFrame();
                            jf.setAlwaysOnTop(true);
                            JOptionPane.showMessageDialog(jf,e);
                        }
                 
              }
                  else if(sec.equals("Technical")){
                  try{
           
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            
            ResultSet rs=st.executeQuery("select count(id) from technical_questions where company_id="+compID);
            if(rs.first()){
               id2=rs.getInt(1);
               id2+=1;
              str=String.valueOf(id2);
              jLabel4.setText(str);
              id=jLabel4.getText();
            }else{
                //jLabel4.setText("1");
               // id2=1;//jLabel4.getText();
           str=String.valueOf(1);
            }//new adminHome().jMenu1MouseClicked(evt);
            //new addNewQuestion().setVisible(true);

        }catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,e);
        }
                  
                   
              }
           else if(sec.equals("Situational")){
                  try{
           
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            
            ResultSet rs=st.executeQuery("select count(id) from situational_questions where company_id="+compID);
            
            if(rs.first()){
                id2=rs.getInt(1);
               id2+=1;
               str=String.valueOf(id2);
               jLabel4.setText(str);
               id=jLabel4.getText();
            }else{
                jLabel4.setText("1");
              // id2=1;//jLabel4.getText();
               str=String.valueOf(1);
               
            }//new adminHome().jMenu1MouseClicked(evt);
            //new addNewQuestion().setVisible(true);

        }catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,e);
        }
           //new adminHome().jMenu1MouseClicked(evt);
         // new addNewQuestion().setVisible(true);
           }
         /*else{
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "One form is already Open");
        }*/
        /*
        
        try{
                 Connection con=Project.ConnectionProvider.con();
                 Statement st=con.createStatement();
                 if(section.equals("English"))
                 {
                     ResultSet rs=st.executeQuery("select count(id) from engprof_questions");
                    if(rs.first()){
                       id1=rs.getInt(1);
                       id=id+1;
                       String str=String.valueOf(id);
                    }
                    else id1=1;}
                 }catch(Exception e){
                    JFrame jf=new JFrame();
                    jf.setAlwaysOnTop(true);
                    JOptionPane.showMessageDialog(jf,e);
             }*/
    
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
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(150, 183));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add new question.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 40)); // NOI18N
        jLabel2.setText("Add New Question");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 31, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(934, 16, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 91, 1066, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Question ID: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Question: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("Option 1: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("Option 2: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setText("Option 3: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setText("Option 4: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setText("Answer : ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setText("Company ID:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 150, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setText("Section: ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("00");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel15.setText("Technical");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 140, 30));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 700, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 700, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 700, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 700, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 700, 70));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option 1", "Option 2", "Option 3", "Option 4" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 700, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("00");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        jButton4.setText("Save");
        jButton4.setAutoscrolls(true);
        jButton4.setMaximumSize(new java.awt.Dimension(109, 33));
        jButton4.setMinimumSize(new java.awt.Dimension(109, 33));
        jButton4.setPreferredSize(new java.awt.Dimension(109, 33));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear.png"))); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addquestionbg.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        if(id2%10==0){
//           // JOptionPane.showMessageDialog(null, "Hilp");
//             setVisible(false);
//        }
//        else{
            
            setVisible(false);
//            int result = JOptionPane.showConfirmDialog(this,"You need to write atleast 10 questions at a time!! If you still want to exit, questions written in this session will be deleted", "More Questions Needed",
//               JOptionPane.YES_NO_OPTION,
//               JOptionPane.QUESTION_MESSAGE);
//            
//            if(result == JOptionPane.YES_OPTION){
//                String companyId=chooseComp.compId;
//                String section=StudentQuizSection.section;
//                
//               try{
//                        for(int i=id2%10;i!=0;i--){
//                            
//                        Connection conn=Project.ConnectionProvider.con();
//                         
//                    
//                        String id=String.valueOf(i);
//                        if(section.equals("English")){
//                            PreparedStatement pq1=conn.prepareStatement("delete from engprof_questions where company_id=? and id=?");
//                                pq1.setString(1,companyId);
//                                pq1.setString(2,id);
//                                pq1.executeUpdate();
//                        }
//                        else if(section.equals("Technical")){
//                            PreparedStatement pq1=conn.prepareStatement("delete from technical_questions where company_id=? and id=?");
//                                pq1.setString(1,companyId);
//                                pq1.setString(2,id);
//                                pq1.executeUpdate();
//                        }
//                        else if(section.equals("Logical")){
//                            PreparedStatement pq1=conn.prepareStatement("delete from logical_questions where company_id=? and id=?");
//                                pq1.setString(1,companyId);
//                                pq1.setString(2,id);
//                                pq1.executeUpdate();
//                        }
//                        else if(section.equals("Situational")){
//                            PreparedStatement pq1=conn.prepareStatement("delete from situational_questions where company_id=? and id=?");
//                                pq1.setString(1,companyId);
//                                pq1.setString(2,id);
//                                pq1.executeUpdate();
//                        }
//                         
//                        }
//                        }catch (SQLException ex) {
//                        Logger.getLogger(addNewQuestion.class.getName()).log(Level.SEVERE, null, ex);
//                                     JOptionPane.showMessageDialog(null,"Problem");
//
//                    }
//                JOptionPane.showMessageDialog(null, "Successfully deleted");
//
//              
//                            
//              
//        }
//            else if (result == JOptionPane.NO_OPTION){
//               new addNewQuestion().setVisible(true);
//               
//            }
//             //new addNewQuestion().setVisible(true);
//    
//        
        //}
       //}
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        
        
       // jLabel14.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
           String id1=jLabel4.getText();
           String id=jLabel14.getText();
           String section=jLabel15.getText();
           String question=jTextArea1.getText();
           String opt1=jTextField2.getText();
           String opt2=jTextField3.getText();
           String opt3=jTextField4.getText();
           String opt4=jTextField5.getText();
           String ans=jComboBox2.getSelectedItem().toString();
          String ans2="" ;
           if(ans=="Option 1"){
               ans2=opt1;
           }
           else if(ans=="Option 2"){
               ans2=opt2;
           }
           else if(ans=="Option 3"){
               ans2=opt3;
           }
           else if(ans=="Option 4"){
               ans2=opt4;
           }
           //System.out.println(id+id+section+question+op1+op2+op3+op4+ans);
          if( question.equals("") || opt1.equals("") || opt2.equals("") || opt3.equals("")|| opt4.equals("") )
        {
           // System.out.println(id+id+section+question+op1+op2+op3+op4+ans);
          // JOptionPane.showMessageDialog(null, "Please fill all the fields");
            JFrame jf=new JFrame();
                    jf.setAlwaysOnTop(true);
                    JOptionPane.showMessageDialog(jf,"Please fill all fields!!!");
        }
          else
              if(section.equals("English")){
                  
                  try{
                              Connection conn=ConnectionProvider.getCon();
                              PreparedStatement pq=conn.prepareStatement("insert into engprof_questions values(?,?,?,?,?,?,?,?)");
                              pq.setString(1,id1);
                             // 
                              //pq.setString(3,section);
                              pq.setString(2,question);
                              pq.setString(3,opt1);
                              pq.setString(4,opt2);
                              pq.setString(5,opt3);
                              pq.setString(6,opt4);
                              pq.setString(7,ans2);
                              pq.setString(8,id);
                              pq.executeUpdate();
                              JFrame jf=new JFrame();
                              jf.setAlwaysOnTop(true);
                              JOptionPane.showMessageDialog(jf,"Successfully Added");
                              setVisible(false);
                              new addNewQuestion().setVisible(true);
                               }
                               catch(Exception e){
                                   JFrame jf=new JFrame();
                              jf.setAlwaysOnTop(true);
                              JOptionPane.showMessageDialog(jf,e);  
                               }
              }
              else if(section.equals("Logical")){
//                try{
//           
//            Connection con=Project.ConnectionProvider.con();
//            Statement st=con.createStatement();
//            
//            ResultSet rs=st.executeQuery("select count(id) from logical_questions");
//            if(rs.first()){
//               int id2=rs.getInt(1);
//               id2=id2+1;
//               String str=String.valueOf(id2);
//               jLabel4.setText(str);
//               id=jLabel4.getText();
//            }else{
//                jLabel4.setText("1");
//                id=jLabel4.getText();
//            }
//        }catch(Exception e){
//            JFrame jf=new JFrame();
//            jf.setAlwaysOnTop(true);
//            JOptionPane.showMessageDialog(jf,e);
//        }
                  
                   try{
                              Connection conn=ConnectionProvider.getCon();
                              PreparedStatement pq=conn.prepareStatement("insert into logical_questions values(?,?,?,?,?,?,?,?)");
                              pq.setString(1,id1);
                             // pq.setString(2,id);
                              //pq.setString(3,section);
                              pq.setString(2,question);
                              pq.setString(3,opt1);
                              pq.setString(4,opt2);
                              pq.setString(5,opt3);
                              pq.setString(6,opt4);
                              pq.setString(7,ans2);
                              pq.setString(8,id);
                              pq.executeUpdate();
                              JFrame jf=new JFrame();
                              jf.setAlwaysOnTop(true);
                              JOptionPane.showMessageDialog(jf,"Successfully Added");
                              setVisible(false);
                              jLabel4.setText(id+1);
                              new addNewQuestion().setVisible(true);
                              
                               }
                               catch(Exception e){
                                   JFrame jf=new JFrame();
                              jf.setAlwaysOnTop(true);
                              JOptionPane.showMessageDialog(jf,e);  
                               }
              }
               else if(section.equals("Technical")){
                 /* try{
           
            Connection con=Project.ConnectionProvider.con();
            Statement st=con.createStatement();
            
            ResultSet rs=st.executeQuery("select count(id) from technical_questions");
            if(rs.first()){
               int id2=rs.getInt(1);
               id2=id2+1;
               String str=adminHome.str;
               jLabel4.setText(str);
               id=jLabel4.getText();
            }else{
                jLabel4.setText("1");
                id=jLabel4.getText();
            }
        }catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,e);
        }*/
                  
                   try{
                              Connection conn=ConnectionProvider.getCon();
                              PreparedStatement pq=conn.prepareStatement("insert into technical_questions values(?,?,?,?,?,?,?,?)");
                              pq.setString(1,id1);
                             // pq.setString(2,id);
                              //pq.setString(3,section);
                              pq.setString(2,question);
                              pq.setString(3,opt1);
                              pq.setString(4,opt2);
                              pq.setString(5,opt3);
                              pq.setString(6,opt4);
                              pq.setString(7,ans2);
                              pq.setString(8,id);
                              pq.executeUpdate();
                              JFrame jf=new JFrame();
                              jf.setAlwaysOnTop(true);
                              JOptionPane.showMessageDialog(jf,"Successfully Added");
                              setVisible(false);
                              new addNewQuestion().setVisible(true);
                               }
                               catch(Exception e){
                                   JFrame jf=new JFrame();
                              jf.setAlwaysOnTop(true);
                              JOptionPane.showMessageDialog(jf,e);  
                               }
              }
           else if(section.equals("Situational")){
              /*    try{
           
            Connection con=Project.ConnectionProvider.con();
            Statement st=con.createStatement();
            
            ResultSet rs=st.executeQuery("select count(id) from situational_questions");
            if(rs.first()){
               int id2=rs.getInt(1);
               id2=id2+1;
               String str=String.valueOf(id2);
               jLabel4.setText(str);
               id=jLabel4.getText();
            }else{
                jLabel4.setText("1");
                id=jLabel4.getText();
            }
        }catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,e);
        }
           */       
                   try{
                              Connection conn=ConnectionProvider.getCon();
                              PreparedStatement pq=conn.prepareStatement("insert into situational_questions values(?,?,?,?,?,?,?,?)");
                              pq.setString(1,id1);
                             // pq.setString(2,id);
                              //pq.setString(3,section);
                              pq.setString(2,question);
                              pq.setString(3,opt1);
                              pq.setString(4,opt2);
                              pq.setString(5,opt3);
                              pq.setString(6,opt4);
                              pq.setString(7,ans2);
                              pq.setString(8,id);
                              pq.executeUpdate();
                              JFrame jf=new JFrame();
                              jf.setAlwaysOnTop(true);
                              JOptionPane.showMessageDialog(jf,"Successfully Added");
                              setVisible(false);
                              new addNewQuestion().setVisible(true);
                              
                               }
                               catch(Exception e){
                                   JFrame jf=new JFrame();
                              jf.setAlwaysOnTop(true);
                              JOptionPane.showMessageDialog(jf,e);  
                               }
              }
                 /*PreparedStatement pr=con.prepareStatement("select * from question where id=?");
                 pr.setString(1,id);
                 ResultSet rs=pr.executeQuery();
                 if(rs.first()){
                    JOptionPane.showMessageDialog(null, "This question ID already exists!");
                 }
                 else{
                     try{
                              Connection conn=Project.ConnectionProvider.con();
                              PreparedStatement pq=con.prepareStatement("insert into question values(?,?,?,?,?,?,?,?,?)");
                              pq.setString(1,id);
                              pq.setString(2,id);
                              pq.setString(3,section);
                              pq.setString(4,question);
                              pq.setString(5,op1);
                              pq.setString(6,op2);
                              pq.setString(7,op3);
                              pq.setString(8,op4);
                              pq.setString(9,ans);
                              pq.executeUpdate();
                              JFrame jf=new JFrame();
                              jf.setAlwaysOnTop(true);
                              JOptionPane.showMessageDialog(jf,"Successfully Added");
                              setVisible(false);
                              new addNewQuestion().setVisible(true);
                               }
                               catch(Exception e){
                                   JFrame jf=new JFrame();
                              jf.setAlwaysOnTop(true);
                              JOptionPane.showMessageDialog(jf,e);  
                               }
                 }
                 }catch(Exception e){
                    JFrame jf=new JFrame();
                    jf.setAlwaysOnTop(true);
                    JOptionPane.showMessageDialog(jf,e);
             }
          }*/
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
            java.util.logging.Logger.getLogger(addNewQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addNewQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addNewQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addNewQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addNewQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}/*
 String id=jTextField7.getText();
           String id=jTextField8.getText();
           String section=jComboBox1.getSelectedItem().toString();
           String question=jTextField1.getText();
           String op1=jTextField2.getText();
           String op2=jTextField3.getText();
           String op3=jTextField4.getText();
           String op4=jTextField5.getText();
           String ans=jTextField6.getText();
           //System.out.println(id+id+section+question+op1+op2+op3+op4+ans);
          if(id.equals("") || id.equals("") || section.equals("") )//|| question.equals("") || op1.equals("") || op2.equals("") || op3.equals("")|| op4.equals("") || ans.equals(""))
        {
           // System.out.println(id+id+section+question+op1+op2+op3+op4+ans);
           JOptionPane.showMessageDialog(null, "Please fill all the fields");
        }/*
            else{
                try{
                 Connection con=Project.ConnectionProvider.con();
                 Statement st=con.createStatement();
                 PreparedStatement pr=con.prepareStatement("select * from question where id=?");
                 pr.setString(1,id);
                 ResultSet rs=pr.executeQuery();
                 if(rs.first()){
                    JOptionPane.showMessageDialog(null, "This question ID already exists!");
                 }
                 else{
                     try{
                              Connection conn=Project.ConnectionProvider.con();
                              PreparedStatement pq=con.prepareStatement("insert into question values(?,?,?,?,?,?,?,?,?)");
                              pq.setString(1,id);
                              pq.setString(2,id);
                              pq.setString(3,section);
                              pq.setString(4,question);
                              pq.setString(5,op1);
                              pq.setString(6,op2);
                              pq.setString(7,op3);
                              pq.setString(8,op4);
                              pq.setString(9,ans);
                              pq.executeUpdate();
                              JFrame jf=new JFrame();
                              jf.setAlwaysOnTop(true);
                              JOptionPane.showMessageDialog(jf,"Successfully Added");
                              setVisible(false);
                              new addNewQuestion().setVisible(true);
                               }
                               catch(Exception e){
                                   JFrame jf=new JFrame();
                              jf.setAlwaysOnTop(true);
                              JOptionPane.showMessageDialog(jf,e);  
                               }
                 }
                 }catch(Exception e){
                    JFrame jf=new JFrame();
                    jf.setAlwaysOnTop(true);
                    JOptionPane.showMessageDialog(jf,e);
             }
            */