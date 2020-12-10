import Project.ConnectionProvider;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import static java.lang.constant.ConstantDescs.NULL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
public class studentDetails extends javax.swing.JFrame {
    public static boolean valEmail(String input){
        String emailRegex="^[A-Z0-9_]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPat=Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
        Matcher matcher=emailPat.matcher(input);
        return matcher.find();
    }
    public static boolean valPhone(String input){
        String phoneRegex="^[789]\\d{9}$";
        Pattern emailPat=Pattern.compile(phoneRegex,Pattern.CASE_INSENSITIVE);
        Matcher matcher=emailPat.matcher(input);
        return matcher.find();
    }
//    public  boolean checkPass(String password){
//        if(password.length()>7){
//            if(valPass(password)){
//                return true;
//            }
//            else return false;
//           
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(null, "Password should contain atleast 8 characters");
//            return false;
//        }
//       
//    }
//    boolean hasNum=false,hasLow=false,hasUpp=false,hasSpec=false;
//    public  boolean valPass(String setpassword)
//    {
//      
//            for(int i=0;i<setpassword.length();i++)
//            {
//                char c=setpassword.charAt(i);
//                if(Character.isDigit(c))
//                {
//                    hasNum=true;
//                }
//                else if(Character.isLowerCase(c))
//                {
//                    hasLow=true;
//                }
//                else if(Character.isUpperCase(c));
//                {
//                    hasUpp=true;
//                }
//                if(hasNum && hasLow && hasUpp)
//                {
//                    hasSpec=true;
//                }
//               
//            }
//        return false;
//    }

private static void isValid(String password) throws InvalidPasswordException{
    if(password.length()<8){
        throw new InvalidPasswordException(1);
    }
    if(true){
        int count=0;
        for(int i=0;i<=9;i++){
            String str1=Integer.toString(i);
            if(password.contains(str1)){
                count=1;
            }
        }
        if(count==0){
            throw new InvalidPasswordException(2);
        }
    }
    Pattern specialCharPattern=Pattern.compile("[^a-z0-9]",Pattern.CASE_INSENSITIVE);
    if(!specialCharPattern.matcher(password).find()){
        throw new InvalidPasswordException(3);
    }
    
}
    /**
     * Creates new form studentDetails
     */
    public studentDetails() {
        initComponents();
        SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
        
        Date date=new Date();
        jLabel4.setText(dFormat.format(date));
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index student.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Date : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 11, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backhome.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, 761, 12));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Roll Number: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 98, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("First Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 142, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Middle Name: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 181, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Last Name: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Branch: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Division: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Year: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Email: ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Gender: ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Contact: ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("C.G.P.A :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, -1, 16));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 300, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 300, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 300, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 300, -1));

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 300, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 300, -1));

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 300, -1));

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 300, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Set Password:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordField1MousePressed(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 300, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Confirm Password:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, -1, -1));

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 300, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N
        jButton3.setText("Sign Up");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 680, 188, -1));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CMPN", "INFT", "EXTC", "ETRX", "BIOMED" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 300, -1));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 300, -1));

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SE", "TE ", "BE" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 300, -1));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 640, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sign Up To Help Us Prepare You For Interview.gif"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Index().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      int a=JOptionPane.showConfirmDialog(null,"Do You Really Want To Exit?","SELECT",JOptionPane.YES_NO_OPTION);
      if(a==0){
          System.exit(0);
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().trim().isEmpty() || jTextField2.getText().trim().isEmpty() || jTextField3.getText().trim().isEmpty() || jTextField4.getText().trim().isEmpty() ||  jTextField8.getText().trim().isEmpty() || jTextField9.getText().trim().isEmpty() || jTextField10.getText().trim().isEmpty() || jPasswordField1.getText().trim().isEmpty() || jPasswordField2.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please fill all fields!");
        }
        else{
        String rollno=jTextField1.getText();
        String fname=jTextField2.getText();
        String mname=jTextField3.getText();
        String lname=jTextField4.getText();
        String branch=(String)jComboBox2.getSelectedItem();
        String division=(String)jComboBox3.getSelectedItem();
        String year=(String)jComboBox4.getSelectedItem();
        String email=jTextField8.getText();
        String gender=(String)jComboBox1.getSelectedItem();
        String contact=jTextField9.getText();
        String cgpa=jTextField10.getText();
        String setpassword=jPasswordField1.getText();
        String confirmpassword=jPasswordField2.getText();
        String total_marks="0";
        String tech_marks="none";
        String log_marks="none";
        String eng_marks="none";
        String sit_marks="none";
        String company_id="0";
        
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st1=con.createStatement();
            ResultSet rs1=st1.executeQuery("select rollNo from student where rollNo='"+rollno+"'");
            if(rs1.next()){
                JOptionPane.showMessageDialog(null, "This account already exists! Please login...");
           }else{
               if(valPhone(contact)){
                   if(valEmail(email)){
                  if(setpassword.equals(confirmpassword)) {
                     int c=Integer.parseInt(jTextField10.getText());
                     if(c>10 || c<0){
                       JOptionPane.showMessageDialog(null,"Enter Valid C.G.P.A.");
                    }else{
                       try{
                         isValid(setpassword);
                         PreparedStatement ps=con.prepareStatement("insert into student values (?,?,?,?,?,?,?,?,?,?,?,?)");
                         ps.setString(1,rollno);
                         ps.setString(2,fname);
                         ps.setString(3,mname);
                         ps.setString(4,lname);
                         ps.setString(5,branch);
                         ps.setString(6,division);
                         ps.setString(7,year);
                         ps.setString(8,email);
                         ps.setString(9,gender);
                         ps.setString(10,contact);
                         ps.setString(11,cgpa);
                         ps.setString(12,confirmpassword);
                         ps.executeUpdate();
                         JOptionPane.showMessageDialog(null,"<html><b style=\"color: blue; font-size: 10px\">User resgistered Successfully!</b><br><b style=\" font-size: 10px\">To Login later:-</b><br><b style=\"color: red; font-size: 10px\">Your Roll Number is your Username.</b></html>");
                         setVisible(false);
                         new instructionStudent(rollno).setVisible(true);
                       }catch(InvalidPasswordException e){
                         JOptionPane.showMessageDialog(null,e.printMessage());
                       }
                    }
           
                  }else{
                      JOptionPane.showMessageDialog(null,"Confirm Password must be same as Set Password");
                  }
               }else{
                   JOptionPane.showMessageDialog(null,"<html><b style=\"color:red;\">please enter valid Email </b><html>");
               }
               }else{
                   JOptionPane.showMessageDialog(null,"<html><b style=\"color:red;\">please enter valid Phone number</b><html>");
               }
            }
//else if(!setpassword.equals(confirmpassword)){
//               JOptionPane.showMessageDialog(null,"Confirm password must be same as Set password");
//            }
 //           else {
//                try {
//                    if(checkPass(confirmpassword)){
//                        PreparedStatement ps=con.prepareStatement("insert into student values (?,?,?,?,?,?,?,?,?,?,?,?)");
//                        ps.setString(1,rollno);
//                        ps.setString(2,fname);
//                        ps.setString(3,mname);
//                        ps.setString(4,lname);
//                        ps.setString(5,branch);
//                        ps.setString(6,division);
//                        ps.setString(7,year);
//                        ps.setString(8,email);
//                        ps.setString(9,gender);
//                        ps.setString(10,contact);
//                        ps.setString(11,cgpa);
//                        ps.setString(12,confirmpassword);
//                        ps.executeUpdate();
//            JOptionPane.showMessageDialog(null,"<html><b style=\"color: blue; font-size: 10px\">User resgistered Successfully!</b><br><b style=\" font-size: 10px\">To Login later:-</b><br><b style=\"color: red; font-size: 10px\">Your Roll Number is your Username.</b></html>");
//            setVisible(false);
//            new instructionStudent(rollno).setVisible(true);
//                    }
//                    
//                 } catch (Exception ex) {
//                     JOptionPane.showMessageDialog(null, ex);
//                }
//            PreparedStatement ps=con.prepareStatement("insert into student values (?,?,?,?,?,?,?,?,?,?,?,?)");
//            ps.setString(1,rollno);
//            ps.setString(2,fname);
//            ps.setString(3,mname);
//            ps.setString(4,lname);
//            ps.setString(5,branch);
//            ps.setString(6,division);
//            ps.setString(7,year);
//            ps.setString(8,email);
//            ps.setString(9,gender);
//            ps.setString(10,contact);
//            ps.setString(11,cgpa);
//            ps.setString(12,confirmpassword);
//            ps.executeUpdate();
//            JOptionPane.showMessageDialog(null,"<html><b style=\"color: blue; font-size: 10px\">User resgistered Successfully!</b><br><b style=\" font-size: 10px\">To Login later:-</b><br><b style=\"color: red; font-size: 10px\">Your Roll Number is your Username.</b></html>");
//            setVisible(false);
//            new instructionStudent(rollno).setVisible(true);
            /*new instructionStudent(rollNo).setVisible(true);*/
 //           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased
        // TODO add your handling code here:
        //.showMessageDialog(null,"enter correct password");
    }//GEN-LAST:event_jPasswordField1KeyReleased

    private void jPasswordField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MousePressed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"<html><b style=\"color:red\">Instructions :</b><br><b>1. Password Length should be 8 characters.<br>2.Password should contain atleast one digit(0-9).</b><br><b>3.Password should contain atleast one special character.</b></html>");
    }//GEN-LAST:event_jPasswordField1MousePressed

    private void jPasswordField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseEntered
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null,"enter correct password");
    }//GEN-LAST:event_jPasswordField1MouseEntered

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null,"enter correct password");
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()){
            jPasswordField1.setEchoChar((char)0);
            jPasswordField2.setEchoChar((char)0);
        }else{
            jPasswordField1.setEchoChar('*');
            jPasswordField2.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private static class InvalidPasswordException extends Exception {
        int passwordConditionViolated=0;
        public InvalidPasswordException(int conditionViolated) {
            passwordConditionViolated=conditionViolated;
        }
        public String printMessage(){
            switch(passwordConditionViolated) {
		case 1: return("Password Length should be 8 characters");
		case 2: return("Password should contain at least one digit(0-9)");
		case 3: return("Password should contain at least one special character");
        }
            return("");
    }
  }
}
