
import Project.ConnectionProvider;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
class Users{
    String Fname,Lname,Total;
    public Users(String fname,String lname,String total){
        this.Fname=fname;
        this.Lname=lname;
        this.Total=total;
    }
     public String getFname(){
        return this.Fname;
    }
    
    public String getLname(){
        return this.Lname;
    }
    public String getTotal(){
        return this.Total;
    }
}

public class DashboardCompanyWise extends javax.swing.JFrame {
String rollNo,company_id,page;
double tech_percent,log_percent,eng_percent,sit_percent;
static String max_marks;
        int[] marks_desc;
        /**
     * Creates new form dummy
     */
    static ArrayList<Users> getUsers(){
        ArrayList<Users> users=new ArrayList<Users>();
        Users u;    
        String rank,total;
        int tot;


        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select fname,lname,total from student s inner join company_student c\n" +
"on c.student_id=s.rollNo and company_id=1\n" +
"order by convert(total,int) desc;");
            Statement st1=con.createStatement();
            ResultSet rs1=st1.executeQuery("select max(CONVERT(total,int)) from company_student where company_id=1;");
            rs1.next();
            max_marks=rs1.getString(1);
            while(rs.next()){
              
                u=new Users(rs.getString(1),rs.getString(2),rs.getString(3));
                users.add(u);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return users;
      }
      
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) 
    { 
  
        // Create a new ArrayList 
        ArrayList<T> newList = new ArrayList<T>(); 
  
        // Traverse through the first list 
        for (T element : list) { 
  
            // If this element is not present in newList 
            // then add it 
            if (!newList.contains(element)) { 
  
                newList.add(element); 
            } 
        } 
  
        // return the new list 
        return newList; 
    } 

    /**
     * Creates new form DashboardCompanyWise
     */
    public DashboardCompanyWise() {
        initComponents(); 
    }
    public DashboardCompanyWise(String rollNo1,String company_id1,String page1) {
        initComponents();
        rollNo=rollNo1;
        company_id=company_id1;
        page=page1;
    
        int comp_id=Integer.parseInt(company_id);
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st0=con.createStatement();
            ResultSet rs0=st0.executeQuery("select fname,lname from student where rollNo='"+rollNo+"'");
            rs0.next();
            String fname=rs0.getString(1);
            String lname=rs0.getString(2);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select name from company where id='"+comp_id+"'");
            rs.next();
            jLabel19.setText("<html>"+rs.getString(1)+"</html>");
            Statement st1=con.createStatement();
            ResultSet rs1=st1.executeQuery("select technical_marks,logical_marks,engProf_marks,situation_marks from company_student where student_id='"+rollNo+"' and company_id='"+company_id+"'");
            rs1.next();
            int tech_marks=Integer.parseInt(rs1.getString(1));
            int log_marks=Integer.parseInt(rs1.getString(2));
            int eng_marks=Integer.parseInt(rs1.getString(3));
            int sit_marks=Integer.parseInt(rs1.getString(4));
            jLabel13.setText(rs1.getString(1));
            jLabel14.setText(rs1.getString(2));
            jLabel15.setText(rs1.getString(3));
            jLabel16.setText(rs1.getString(4));
            Statement st2=con.createStatement();
            ResultSet rs2=st2.executeQuery("select sum(technical_marks),sum(logical_marks),sum(engProf_marks),sum(situation_marks) from company_student where company_id='"+comp_id+"'");
            rs2.next();
            int total_tech_marks=Integer.parseInt(rs2.getString(1));
            int total_log_marks=Integer.parseInt(rs2.getString(2));
            int total_eng_marks=Integer.parseInt(rs2.getString(3));
            int total_sit_marks=Integer.parseInt(rs2.getString(4));
            tech_percent=(tech_marks*100)/total_tech_marks;
            log_percent=(log_marks*100)/total_log_marks;
            eng_percent=(eng_marks*100)/total_eng_marks;                    
            sit_percent=(sit_marks*100)/total_sit_marks;
            new Thread(new Runnable(){
                @Override
                public void run() {
                    for(double num=0.000;num<=tech_percent;num++){
                        customPanel1.UpdateProgress(num);
                       
                        customPanel1.repaint();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }
                }
                
            }).start();
            
             new Thread(new Runnable(){
                @Override
                public void run() {
                    for(double num=0.000;num<=log_percent;num++){
                        customPanel2.UpdateProgress(num);
                       
                        customPanel2.repaint();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }
                }
                
            }).start();
             
              new Thread(new Runnable(){
                @Override
                public void run() {
                    for(double num=0.000;num<=eng_percent;num++){
                        customPanel3.UpdateProgress(num);
                       
                        customPanel3.repaint();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }
                }
                
            }).start();
              
             new Thread(new Runnable(){
                @Override
                public void run() {
                    for(double num=0.000;num<=log_percent;num++){
                        customPanel4.UpdateProgress(num);
                       
                        customPanel4.repaint();
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }
                }
                
            }).start();
             
             DefaultListModel dlm=new DefaultListModel();
            if(tech_marks>=log_marks && tech_marks>=eng_marks && tech_marks>=sit_marks){
                if(log_marks>=eng_marks && log_marks>=sit_marks){
                    dlm.addElement("<html>1) Computer Support Specialist</html>");
                    dlm.addElement("<html>2) Software Developer</html>");
                    dlm.addElement("<html>3) Solution Architect</html>");
                    dlm.addElement("<html>4) BackEnd Developer</html>");
                }else{
                   dlm.addElement("<html>1) Computer Support Specialist</html>");
                   dlm.addElement("<html>2) FrontEnd Developer</html>");
                }
            }else if(log_marks>=eng_marks && log_marks>=sit_marks){
                if(tech_marks>=eng_marks && tech_marks>=sit_marks){
                    dlm.addElement("<html>1) Network Designer</html>");
                    dlm.addElement("<html>2) Programmer</html>");
                    dlm.addElement("<html>3) Data Scientist</html>");
                    dlm.addElement("<html>4) BackEnd developer</html>");
                    dlm.addElement("<html>5) SQL Developer</html>");
                }else{
                    dlm.addElement("<html>1) System Architect</html>");
                    dlm.addElement("<html>2) FrontEnd Developer</html>");
                    dlm.addElement("<html>3) Network Designer</html>");
                }
            }else if(eng_marks>=sit_marks){
                    dlm.addElement("<html>1) Computer System Analyst.</html>");
                    dlm.addElement("<html>2) Solution Architect</html>");
                    dlm.addElement("<html>3) FrontEnd Developer</html>");
                    dlm.addElement("<html>4) Network Designer</html>");
            }else{
                dlm.addElement("<html>1) FrontEnd Developer</html>");
                dlm.addElement("<html>2) Computer System Analyst</html>");
                dlm.addElement("<html>3) System Architect</html>");
            }
            jList1.setModel(dlm);
        Users u;
    ArrayList<Integer> tot_marks=new ArrayList<Integer>();
    for(int i=0;i<getUsers().size();i++){
           tot_marks.add(Integer.parseInt(getUsers().get(i).getTotal()));
        }
            
        tot_marks=removeDuplicates(tot_marks);
        
        DefaultTableModel model = new DefaultTableModel();
                
         Object[] columnsName=new Object[3];
         columnsName[0]="Fname";
         columnsName[1]="Lname";
          columnsName[2]="Rank";
         
         model.setColumnIdentifiers(columnsName);
         
         Object[] rowData = new Object[4];
        
        for(int i = 0; i < getUsers().size(); i++){
            
            rowData[0] = getUsers().get(i).getFname();
             rowData[1] = getUsers().get(i).getLname();
             int rank=tot_marks.indexOf(Integer.parseInt(getUsers().get(i).getTotal()))+1;
             rowData[2]=rank;
            String f_name=getUsers().get(i).getFname();
            String l_name=getUsers().get(i).getLname();
            if(f_name.equals(fname) && l_name.equals(lname)){
                jLabel2.setText(String.valueOf(rank));
                if(rank==1){
                     jLabel21.setVisible(false);
                     jLabel22.setVisible(false);
                }else if(rank==2){
                    jLabel20.setVisible(false);
                    jLabel22.setVisible(false);
                }else if(rank==3){
                    jLabel20.setVisible(false);
                    jLabel21.setVisible(false);
                }else{
                    jLabel20.setVisible(false);
                    jLabel21.setVisible(false);
                    jLabel22.setVisible(false);
                }
            }
             model.addRow(rowData);
             
        }
        jTable1.setModel(model);
        for(int i=0;i<getUsers().size();i++){
            String f_name=getUsers().get(i).getFname();
            String l_name=getUsers().get(i).getLname();
            if(f_name.equals(fname) && l_name.equals(lname)){
                 jTable1.addRowSelectionInterval(i,i);
                 jTable1.setSelectionBackground(Color.BLUE);
                 jTable1.setSelectionForeground(Color.WHITE);
                 
             }
        }
        JTableHeader table_header=jTable1.getTableHeader();
        table_header.setFont(new Font("Tahoma",Font.BOLD,14));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        customPanel1 = new CustomPanel();
        customPanel2 = new CustomPanel();
        customPanel3 = new CustomPanel();
        customPanel4 = new CustomPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1208, 12, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backhome.png"))); // NOI18N
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1017, 12, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backlg.png"))); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(836, 11, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, 1366, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Rank :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 116, -1, -1));

        customPanel1.setBackground(new java.awt.Color(251, 239, 220));
        customPanel1.setForeground(new java.awt.Color(251, 239, 220));

        javax.swing.GroupLayout customPanel1Layout = new javax.swing.GroupLayout(customPanel1);
        customPanel1.setLayout(customPanel1Layout);
        customPanel1Layout.setHorizontalGroup(
            customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );
        customPanel1Layout.setVerticalGroup(
            customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );

        getContentPane().add(customPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 159, -1, -1));

        customPanel2.setBackground(new java.awt.Color(251, 239, 220));

        javax.swing.GroupLayout customPanel2Layout = new javax.swing.GroupLayout(customPanel2);
        customPanel2.setLayout(customPanel2Layout);
        customPanel2Layout.setHorizontalGroup(
            customPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );
        customPanel2Layout.setVerticalGroup(
            customPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(customPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 159, -1, 223));

        customPanel3.setBackground(new java.awt.Color(251, 239, 220));

        javax.swing.GroupLayout customPanel3Layout = new javax.swing.GroupLayout(customPanel3);
        customPanel3.setLayout(customPanel3Layout);
        customPanel3Layout.setHorizontalGroup(
            customPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );
        customPanel3Layout.setVerticalGroup(
            customPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(customPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 159, -1, 223));

        customPanel4.setBackground(new java.awt.Color(251, 239, 220));

        javax.swing.GroupLayout customPanel4Layout = new javax.swing.GroupLayout(customPanel4);
        customPanel4.setLayout(customPanel4Layout);
        customPanel4Layout.setHorizontalGroup(
            customPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );
        customPanel4Layout.setVerticalGroup(
            customPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(customPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1138, 159, -1, 223));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 51, 0));
        jLabel4.setText("<html>Situational Skills<br>Analysis</html>");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("<html>English Proficiency<br>Analysis</html>");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("<html>Logical Skills<br>Analysis</html>");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 387, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("<html>Technical Skills<br>Analysis</html>");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 387, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Leaderboard :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 468, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, 260));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Technical Marks: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 508, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Logical Marks: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 548, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("<html>English Proficiency<br> marks:</html>");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 588, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("<html>Situational Skills<br>marks:</html>");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 650, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("00");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 508, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("00");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 548, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setText("00");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 604, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 51));
        jLabel16.setText("00");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 672, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 153));
        jLabel17.setText("<html>Most likely to grab<br> following Positions at this Company: </html>");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 470, 279, 75));

        jList1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "<html>Computer Support Specialist</html>" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, 279, -1));

        jLabel18.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 28)); // NOI18N
        jLabel18.setText("Company :");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 28, -1, -1));

        jLabel19.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 28)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("jLabel19");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 28, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gold.jpg"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 60, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver.jpg"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bronze.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all student result.png"))); // NOI18N
        jLabel24.setText("Dashboard");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plain Background.png"))); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new studentCompany(rollNo).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do You Really Want To Exit?","SELECT",JOptionPane.YES_NO_OPTION);
        if(a==0){
          System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(page.equals("0")){
            setVisible(false);
            new Dashboard(rollNo).setVisible(true);
        }else{
            setVisible(false);
            new CompanyDashboard(company_id).setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardCompanyWise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardCompanyWise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardCompanyWise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardCompanyWise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardCompanyWise().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomPanel customPanel1;
    private CustomPanel customPanel2;
    private CustomPanel customPanel3;
    private CustomPanel customPanel4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
