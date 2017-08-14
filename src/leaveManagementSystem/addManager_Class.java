/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaveManagementSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anojithan
 */
public class addManager_Class {
    
    
    ResultSet rs=null;
    PreparedStatement  pst=null;
    Connection conn = Connect.ConnectDB();
    String ManagerId="";
    
    public String getID()
    { 
        try
        {
            
            String SqlQuery="SELECT ManagerID from manager order by ManagerID desc LIMIT 1 " ;
            pst=conn.prepareStatement(SqlQuery);
            rs=pst.executeQuery();
            
            
            if(rs.next())
            {
                System.out.println(ManagerId);
                String empS=rs.getString("ManagerID");
               
                int emp=Integer.parseInt(empS.substring(3))+1;
                String insert="MAA"+emp;
                ManagerId=insert;
            }
 
        }
        
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        
        
        
        return ManagerId;
    }
    
}
