/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaveManagementSystem;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Anojithan
 */
public class Connect {
    
    
    static String JDBC_DRIVER ="com.mysql.jdbc.Driver";
    static String DB_URL="jdbc:mysql://localhost:3306/Leavemangementsystem";
    static String USER="root";
    static String PASS="";
    
    public static Connection ConnectDB()
    {
        try
        {
            java.sql.Connection conn = null;
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");
            return conn;
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            return null;
        }
    }
    
}
