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
public class Login_Class {
    private String Users;
    private String UserName;
    private String Password;
    int count=0;
    static String ManagerID;
    static String EmployeeID;
    
    
    
    ResultSet rs=null;
    PreparedStatement  pst=null;
    Connection conn = Connect.ConnectDB();
    
    public Login_Class(String Users,String UserName,String Password)
    {
       
        this.Users=Users;
        this.Password=Password;
        this.UserName=UserName;
        
    }
    
    public int Check_Admin()
    {
         try
            {
                   String sql="SELECT * FROM admin WHERE UserName = '"+this.UserName+"' and Password='"+this.Password+"'";
                    pst = conn.prepareStatement(sql);
                    rs = pst.executeQuery();
                
                    while(rs.next())
                    {
                        count++;
                    
                    }
                
            }
                
            catch(SQLException ex)
            {
                System.out.println("Data base is not connected !!!!!");
                
            }
            catch(Exception e)
            {
               e.getMessage();
            }
            
          
        return count;
    }
    
    
     public int Check_Manager()
     {
         try
         {
                
            String sql="SELECT * FROM manager WHERE UserName = '"+this.UserName+"' and Password='"+this.Password+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next())
                {
                    ManagerID=rs.getString("ManagerID");
                    count++;  
                }
            
         }
         catch(SQLException ex)
            {
                System.out.println("Data base is not connected !!!!!");
                
            }
         catch(Exception e)
            {
               e.getMessage();
            }
         
         
         return count;
     }
   
    
     public int Check_Employee()
     {
         try
         {
             String sql="SELECT * FROM employee WHERE UserName = '"+this.UserName+"' and Password='"+this.Password+"'";
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             
             while(rs.next())
                {
                    EmployeeID=rs.getString("EmployeeID");
                    count++;
                    
                }
         }
         catch(SQLException ex)
            {
                System.out.println("Data base is not connected !!!!!");
                
            }
         catch(Exception e)
            {
               e.getMessage();
            }
         return count;
     }

}


