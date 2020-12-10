import java.sql.*;
import Project.ConnectionProvider;
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
public class deleteQuestion extends javax.swing.JFrame {

    /**
     * Creates new form deleteQuestion
     */
    String companyID;
    String section;
    String sec;
    public deleteQuestion() {
       
        initComponents();
        companyID=chooseComp.compId;
       jLabel13.setText(companyID);
       sec=StudentQuizSection1.type;
           jLabel14.setText(sec);
    }
    public void shift(int id){
        int id2 = 0;
        String id3,id4;
        if(sec.equals("English")){
             try{
           
                        Connection con=ConnectionProvider.getCon();
                        Statement st=con.createStatement();
       
                        ResultSet rs=st.executeQuery("select max(id) from engprof_questions");
                        if(rs.first()){
                           id2=rs.getInt(1);
                            System.out.println(id2);
                        }
                        for(int i=id;i<=id2;i++){
                            id3=String.valueOf(i);
                            id4=String.valueOf(i+1);
                            System.out.println(id3+id4);
                            
                           try{
                            Connection conn=ConnectionProvider.getCon();
                            PreparedStatement ps=conn.prepareStatement("update engprof_questions set id=? where id=?");
                            ps.setString(1,id3);
                            ps.setString(2, id4);
                            ps.executeUpdate();
                           } catch(Exception e){
                                JFrame jf=new JFrame();
                                jf.setAlwaysOnTop(true);
                                JOptionPane.showMessageDialog(jf, e);
                             }
                        }
                
            
             }catch(Exception e){
                 JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
                                
                                }
        }
        else if(sec.equals("Logical")){
             try{
           
                        Connection con=ConnectionProvider.getCon();
                        Statement st=con.createStatement();
       
                        ResultSet rs=st.executeQuery("select max(id) from logical_questions");
                        if(rs.first()){
                           id2=rs.getInt(1);
                            System.out.println(id2);
                        }
                        for(int i=id;i<=id2;i++){
                            id3=String.valueOf(i);
                            id4=String.valueOf(i+1);
                            System.out.println(id3+id4);
                            
                           try{
                            Connection conn=ConnectionProvider.getCon();
                            PreparedStatement ps=conn.prepareStatement("update logical_questions set id=? where id=?");
                            ps.setString(1,id3);
                            ps.setString(2, id4);
                            ps.executeUpdate();
                           } catch(Exception e){
                                JFrame jf=new JFrame();
                                jf.setAlwaysOnTop(true);
                                JOptionPane.showMessageDialog(jf, e);
                             }
                        }
                
            
             }catch(Exception e){
                 JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
                                
                                }}
             else if(sec.equals("Technical")){
             try{
           
                        Connection con=ConnectionProvider.getCon();
                        Statement st=con.createStatement();
       
                        ResultSet rs=st.executeQuery("select max(id) from technical_questions");
                        if(rs.first()){
                           id2=rs.getInt(1);
                            System.out.println(id2);
                        }
                        for(int i=id;i<=id2;i++){
                            id3=String.valueOf(i);
                            id4=String.valueOf(i+1);
                            System.out.println(id3+id4);
                            
                           try{
                            Connection conn=ConnectionProvider.getCon();
                            PreparedStatement ps=conn.prepareStatement("update technical_questions set id=? where id=?");
                            ps.setString(1,id3);
                            ps.setString(2, id4);
                            ps.executeUpdate();
                           } catch(Exception e){
                                JFrame jf=new JFrame();
                                jf.setAlwaysOnTop(true);
                                JOptionPane.showMessageDialog(jf, e);
                             }
                        }
                
            
             }catch(Exception e){
                 JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
                                
                                }}
             else if(sec.equals("Situational")){
             try{
           
                        Connection con=ConnectionProvider.getCon();
                        Statement st=con.createStatement();
       
                        ResultSet rs=st.executeQuery("select max(id) from situational_questions");
                        if(rs.first()){
                           id2=rs.getInt(1);
                            System.out.println(id2);
                        }
                        for(int i=id;i<=id2;i++){
                            id3=String.valueOf(i);
                            id4=String.valueOf(i+1);
                            System.out.println(id3+id4);
                            
                           try{
                            Connection conn=ConnectionProvider.getCon();
                            PreparedStatement ps=conn.prepareStatement("update situational_questions set id=? where id=?");
                            ps.setString(1,id3);
                            ps.setString(2, id4);
                            ps.executeUpdate();
                           } catch(Exception e){
                                JFrame jf=new JFrame();
                                jf.setAlwaysOnTop(true);
                                JOptionPane.showMessageDialog(jf, e);
                             }
                        }
                
            
             }catch(Exception e){
                 JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
                                
                                }
            /* try{
           
                        Connection con=Project.ConnectionProvider.con();
                        Statement st=con.createStatement();
       
                        ResultSet rs=st.executeQuery("select max(id) from company");
                        if(rs.first()){
                           id2=rs.getInt(1);
                            System.out.println(id2);
                        }
                        for(int i=id;i<=id2;i++){
                            id3=String.valueOf(i);
                            id4=String.valueOf(i+1);
                            System.out.println(id3+id4);
                            
                           try{
                            Connection conn=Project.ConnectionProvider.con();
                            PreparedStatement ps=conn.prepareStatement("update company set id=? where id=?");
                            ps.setString(1,id3);
                            ps.setString(2, id4);
                            ps.executeUpdate();
                           } catch(Exception e){
                                JFrame jf=new JFrame();
                                jf.setAlwaysOnTop(true);
                                JOptionPane.showMessageDialog(jf, e);
                             }
                        }
                
            
             }catch(Exception e){
                 JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
                                
                     }\                       }*/
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(150, 183));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete Question.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 26, -1, -1));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 40)); // NOI18N
        jLabel2.setText("Delete Question");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 32, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 97, 1075, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Question Id: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 129, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Question :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 176, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Option 1: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 225, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("Option 2: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 274, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("Option 3: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 323, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setText("Option 4: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 372, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setText("Answer: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 421, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setText("Company ID:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 150, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel12.setText("Section:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 90, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("00");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 30, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel14.setText("Logical");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 140, 20));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option 1", "Option 2", "Option 3", "Option 4" }));
        jComboBox1.setSelectedItem(null
        );
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 700, 30));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 126, 50, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 176, 700, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 225, 700, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 274, 700, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 323, 700, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 372, 700, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 479, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear.png"))); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 479, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addquestionbg.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        adminHome.open=0;
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String id=jTextField1.getText();
        section=jLabel14.getText();
       
        if(section.equals("English")){
             try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            PreparedStatement pr=con.prepareStatement("select * from engprof_questions where id=?");
            pr.setString(1,id);
            ResultSet rs=pr.executeQuery();
            if(rs.first()){
               //jLa.setText(rs.getString(2));
              // jTextField9.setText(rs.getString(3));
               jTextField2.setText(rs.getString(2));
               jTextField3.setText(rs.getString(3));
               jTextField4.setText(rs.getString(4));
               jTextField5.setText(rs.getString(5));
               jTextField6.setText(rs.getString(6));
               jComboBox1.setSelectedItem(rs.getString(7));
               jTextField1.setEditable(false);
            }else{
                JFrame jf=new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf,"Question Id does not exist");
            }
        }catch(Exception e){
               JFrame jf=new JFrame();
               jf.setAlwaysOnTop(true);
               JOptionPane.showMessageDialog(jf,e);
        }
        }
        else if(section.equals("Logical")){
             try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            PreparedStatement pr=con.prepareStatement("select * from logical_questions where id=?");
            pr.setString(1,id);
            ResultSet rs=pr.executeQuery();
            if(rs.first()){
               //jLa.setText(rs.getString(2));
              // jTextField9.setText(rs.getString(3));
               jTextField2.setText(rs.getString(2));
               jTextField3.setText(rs.getString(3));
               jTextField4.setText(rs.getString(4));
               jTextField5.setText(rs.getString(5));
               jTextField6.setText(rs.getString(6));
               jComboBox1.setSelectedItem(rs.getString(7));
               jTextField1.setEditable(false);
            }else{
                JFrame jf=new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf,"Question Id does not exist");
            }
        }catch(Exception e){
               JFrame jf=new JFrame();
               jf.setAlwaysOnTop(true);
               JOptionPane.showMessageDialog(jf,e);
        }
        }
        else if(section.equals("Technical")){
             try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            PreparedStatement pr=con.prepareStatement("select * from technical_questions where id=?");
            pr.setString(1,id);
            ResultSet rs=pr.executeQuery();
            if(rs.first()){
               //jLa.setText(rs.getString(2));
              // jTextField9.setText(rs.getString(3));
               jTextField2.setText(rs.getString(2));
               jTextField3.setText(rs.getString(3));
               jTextField4.setText(rs.getString(4));
               jTextField5.setText(rs.getString(5));
               jTextField6.setText(rs.getString(6));
               jComboBox1.setSelectedItem(rs.getString(7));
               jTextField1.setEditable(false);
            }else{
                JFrame jf=new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf,"Question Id does not exist");
            }
        }catch(Exception e){
               JFrame jf=new JFrame();
               jf.setAlwaysOnTop(true);
               JOptionPane.showMessageDialog(jf,e);
        }
        }
        else if(section.equals("Situational")){
             try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            PreparedStatement pr=con.prepareStatement("select * from situational_questions where id=?");
            pr.setString(1,id);
            ResultSet rs=pr.executeQuery();
            if(rs.first()){
               //jLa.setText(rs.getString(2));
              // jTextField9.setText(rs.getString(3));
               jTextField2.setText(rs.getString(2));
               jTextField3.setText(rs.getString(3));
               jTextField4.setText(rs.getString(4));
               jTextField5.setText(rs.getString(5));
               jTextField6.setText(rs.getString(6));
               jComboBox1.setSelectedItem(rs.getString(7));
               jTextField1.setEditable(false);
            }else{
                JFrame jf=new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf,"Question Id does not exist");
            }
        }catch(Exception e){
               JFrame jf=new JFrame();
               jf.setAlwaysOnTop(true);
               JOptionPane.showMessageDialog(jf,e);
        }
        }
      
        /*
        if(section.equals("English")){
            try{
            Connection con=Project.ConnectionProvider.con();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from engprof_questions where id='"+id+"'");
            if(rs.first()){
               // jTextField8.setText(rs.getString(2));
                //jTextField9.setText(rs.getString(3));
                jTextField2.setText(rs.getString(2));
                jTextField3.setText(rs.getString(3));
                jTextField4.setText(rs.getString(4));
                jTextField5.setText(rs.getString(5));
                jTextField6.setText(rs.getString(6));
                jTextField7.setText(rs.getString(7));
                jTextField1.setEditable(false);
            }else{
                JFrame jf=new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, "Question Id does not Exist!");
            }
        }catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
        }
        }
        else if(section.equals("Logical")){
            try{
            Connection con=Project.ConnectionProvider.con();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from logical_questions where id='"+id+"'");
            if(rs.first()){
               // jTextField8.setText(rs.getString(2));
                //jTextField9.setText(rs.getString(3));
                jTextField2.setText(rs.getString(4));
                jTextField3.setText(rs.getString(5));
                jTextField4.setText(rs.getString(6));
                jTextField5.setText(rs.getString(7));
                jTextField6.setText(rs.getString(8));
                jTextField7.setText(rs.getString(9));
                jTextField1.setEditable(false);
            }else{
                JFrame jf=new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, "Question Id does not Exist!");
            }
        }catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
        }
        }
        else if(section.equals("Technical")){
            try{
            Connection con=Project.ConnectionProvider.con();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from technical_questions where id='"+id+"'");
            if(rs.first()){
               // jTextField8.setText(rs.getString(2));
                //jTextField9.setText(rs.getString(3));
                jTextField2.setText(rs.getString(4));
                jTextField3.setText(rs.getString(5));
                jTextField4.setText(rs.getString(6));
                jTextField5.setText(rs.getString(7));
                jTextField6.setText(rs.getString(8));
                jTextField7.setText(rs.getString(9));
                jTextField1.setEditable(false);
            }else{
                JFrame jf=new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, "Question Id does not Exist!");
            }
        }catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
        }
        }
        else if(section.equals("Situational")){
            try{
            Connection con=Project.ConnectionProvider.con();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from situational_questions where id='"+id+"'");
            if(rs.first()){
               // jTextField8.setText(rs.getString(2));
                //jTextField9.setText(rs.getString(3));
                jTextField2.setText(rs.getString(4));
                jTextField3.setText(rs.getString(5));
                jTextField4.setText(rs.getString(6));
                jTextField5.setText(rs.getString(7));
                jTextField6.setText(rs.getString(8));
                jTextField7.setText(rs.getString(9));
                jTextField1.setEditable(false);
            }else{
                JFrame jf=new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, "Question Id does not Exist!");
            }
        }catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
        }
        }*/
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String id=jTextField1.getText();
        int id5=Integer.parseInt(id);
        if(section.equals("English")){
            try{
            Connection con=ConnectionProvider.getCon();
            PreparedStatement ps=con.prepareStatement("delete from engprof_questions where id=?");
            ps.setString(1,id);
            ps.executeUpdate();
            shift(id5);
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "Question Successfully deleted");
            setVisible(false);
            new deleteQuestion().setVisible(true);
        }catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
        }
        }
        else if(section.equals("Logical")){
            try{
            Connection con=ConnectionProvider.getCon();
            PreparedStatement ps=con.prepareStatement("delete from logical_questions where id=?");
            ps.setString(1,id);
            ps.executeUpdate();
            shift(id5);
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "Question Successfully deleted");
            setVisible(false);
            new deleteQuestion().setVisible(true);
        }catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
        }
        }
        else if(section.equals("Technical")){
            try{
            Connection con=ConnectionProvider.getCon();
            PreparedStatement ps=con.prepareStatement("delete from technical_questions where id=?");
            ps.setString(1,id);
            ps.executeUpdate();
                shift(id5);
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "Question Successfully deleted");
            setVisible(false);
            new deleteQuestion().setVisible(true);
        }catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
        }
        }
        else if(section.equals("Situational")){
            try{
            Connection con=ConnectionProvider.getCon();
            PreparedStatement ps=con.prepareStatement("delete from situational_questions where id=?");
            ps.setString(1,id);
            ps.executeUpdate();
            shift(id5);
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "Question Successfully deleted");
            setVisible(false);
            new deleteQuestion().setVisible(true);
        }catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        //jTextField7.setText("");
        jTextField1.setEditable(true);
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
            java.util.logging.Logger.getLogger(deleteQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deleteQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deleteQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deleteQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deleteQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
