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
public class addEmp_Class {
    
    
    ResultSet rs=null;
    PreparedStatement  pst=null;
    Connection conn = Connect.ConnectDB();
    String EmployeeId="";
    
    public String getID()
    {
        
         try
        {
            String SqlQuery="SELECT EmployeeID from employee order by EmployeeID desc LIMIT 1 " ;
            pst=conn.prepareStatement(SqlQuery);
            rs=pst.executeQuery();
            
            
            if(rs.next())
            {
                String empS=rs.getString("EmployeeID");
               
                int emp=Integer.parseInt(empS.substring(3))+1;
                String insert="EMP"+emp;
                EmployeeId=insert;
            
            }
 
        }
        
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        
        
        return EmployeeId;
    }
    
}
