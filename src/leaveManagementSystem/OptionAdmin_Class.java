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
public class OptionAdmin_Class {
    
    private String ManagerId;
    private int count;
    
    ResultSet rs=null;
    PreparedStatement  pst=null;
    Connection conn = Connect.ConnectDB();
    
    
    java.sql.Statement stmt = null;
   
    public int Search_Manager(String ManagerId)
    {
        
        Connection conn = Connect.ConnectDB();
        this.ManagerId=ManagerId;
         try
            {
                String sql="SELECT * FROM manager WHERE ManagerID = '"+this.ManagerId+"'";
                pst = conn.prepareStatement(sql);
                //Customers are searched based on policy number
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
    
    public void Delete_Manager(String ManagerId)
    {
        
        Connection conn = Connect.ConnectDB();
        this.ManagerId=ManagerId;
         try
            {
                stmt = conn.createStatement();
                String sql = "DELETE FROM manager  WHERE ManagerID = '"+this.ManagerId+"'";
                stmt.executeUpdate(sql);
            }
         catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
         
    }

    
}
