/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaveManagementSystem;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Anojithan
 */
public class OptionManager_Class {
    
    int count;
    ResultSet rs=null;
    PreparedStatement  pst=null;
    Connection conn = Connect.ConnectDB();
    String EmployeeID;
    java.sql.Statement stmt = null;
    
    
    
    public int Search_Employee(String EmployeeID)
    {
        
        Connection conn = Connect.ConnectDB();
        this.EmployeeID=EmployeeID;
         try
            {
                
                String sql="SELECT * FROM employee WHERE EmployeeID = '"+this.EmployeeID+"'";
                pst = conn.prepareStatement(sql);
		rs = pst.executeQuery();
                
                while(rs.next())
                {
                    count++;
                    
                }
            }
        catch(SQLException ex)
            {
                 System.out.println(ex.getMessage());
            }
        
        
        
        return count;
    }
    
    
    public void RemoveEmployee(String EmployeeID)
    {
        Connection conn = Connect.ConnectDB();
        this.EmployeeID=EmployeeID;
         try
            {
                stmt = conn.createStatement();
                String sql = "DELETE FROM employee WHERE EmployeeID = '"+this.EmployeeID+"'";
                stmt.executeUpdate(sql);
            }
         catch(SQLException ex)
            {
                System.out.println(ex.getMessage());
            }
    }
    
}
