/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AKSHAYA
 */
public class ConnectionCompany {
    public static Statement st;
    public static Connection conn;
    public static PreparedStatement getData;
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
        conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/interview_quiz","root","");
        st=conn.createStatement();
        getData=conn.prepareStatement("select * from company where name like ?");
        }
        catch(Exception e){
            e.getMessage();
            Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Not Connected");
    }
       
    }
    
     public static ResultSet getData(String name) throws SQLException{
            getData.setString(1, "%"+name+"%");
            return getData.executeQuery();
        }
}
