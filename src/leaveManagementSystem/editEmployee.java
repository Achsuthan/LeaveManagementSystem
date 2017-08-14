/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaveManagementSystem;

import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Anojithan
 */
public class editEmployee extends javax.swing.JFrame {
    
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement  pst=null;
    
    static String leave;
    static String DateJoined;
    static String UserName;
    static String Password;
    static String Sex;
    static String Type;
    static String FirstName;
    static String LastName;
    static String ContactNumber;
    static String Address;
    static String District;
    static String City;
    static String DateOfBirth;
    static String Email;
    static String MangerName;
    static boolean Next=false;
    static String ManagerID;
    
    

    String EmployeeID;
    String Name;
    String Status;
    /**
     * Creates new form login
     */
    public editEmployee() {
        //this.setUndecorated(true);
        this.setAlwaysOnTop(false);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        Toolkit tk= Toolkit.getDefaultToolkit();
            int xsize = (int) tk.getScreenSize().getWidth();
            int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
        conn=Connect.ConnectDB();
    }
    
    public editEmployee(String Name,String EmployeeID,String Status,String ManagerID)
    {
        initComponents();
        this.ManagerID=ManagerID;
        this.EmployeeID=EmployeeID;
        this.Name=Name;
        lb_UserName.setText(this.Name);
        lb_EmployeeID.setText(this.EmployeeID);
        this.Status=Status;
        
            conn=Connect.ConnectDB();
                try
                {
               
                pst = conn.prepareStatement("select * from employee where EmployeeID='"+this.EmployeeID+"' ");
                rs=pst.executeQuery();
                        
        
                while (rs.next()) {
            
        
            
                 UserName = rs.getString("UserName");
                 this.EmployeeID=rs.getString("EmployeeID");
                 Password =rs.getString("Password");
                 FirstName=rs.getString("FirstName");
                 LastName=rs.getString("LastName");
                ContactNumber=rs.getString("ContatctNumber");
                Address=rs.getString("Address");
                District=rs.getString("District");
                City=rs.getString("City");
                DateOfBirth=rs.getString("DateOfBirth");
                DateJoined=rs.getString("DateOfJoined");
                Sex=rs.getString("Sex");
                Type=rs.getString("WorkType");
                Email=rs.getString("Email");
                leave=rs.getString("Leave");
            }

                txt_FirstName.setText(FirstName);
                txt_LastName.setText(LastName);
                txt_ContactNumber.setText(ContactNumber);
                txt_Address.setText(Address);
                txt_District.setText(District);
                txt_City.setText(City);
                txt_Email.setText(Email);
        
        
        }
                
                catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }

        
    }
    
    public editEmployee(String Name,String EmployeeID,String Status)
    {
        initComponents();
        this.ManagerID=ManagerID;
        this.EmployeeID=EmployeeID;
        this.Name=Name;
        lb_UserName.setText(this.Name);
        lb_EmployeeID.setText(this.EmployeeID);
        this.Status=Status;
        
            conn=Connect.ConnectDB();
                try
                {
               
                pst = conn.prepareStatement("select * from employee where EmployeeID='"+this.EmployeeID+"' ");
                rs=pst.executeQuery();
                        
        
                while (rs.next()) {
            
        
            
                 UserName = rs.getString("UserName");
                 EmployeeID=rs.getString("EmployeeID");
                 Password =rs.getString("Password");
                 FirstName=rs.getString("FirstName");
                 LastName=rs.getString("LastName");
                ContactNumber=rs.getString("ContatctNumber");
                Address=rs.getString("Address");
                District=rs.getString("District");
                City=rs.getString("City");
                DateOfBirth=rs.getString("DateOfBirth");
                DateJoined=rs.getString("DateOfJoined");
                Sex=rs.getString("Sex");
                Type=rs.getString("WorkType");
                Email=rs.getString("Email");
                leave=rs.getString("Leave");
            }

                txt_FirstName.setText(FirstName);
                txt_LastName.setText(LastName);
                txt_ContactNumber.setText(ContactNumber);
                txt_Address.setText(Address);
                txt_District.setText(District);
                txt_City.setText(City);
                txt_Email.setText(Email);
        
        
        }
                
                catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
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

        jPanel6 = new javax.swing.JPanel();
        bt_Exit = new javax.swing.JButton();
        bt_Update = new javax.swing.JButton();
        bt_Cancel = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txt_Address = new javax.swing.JTextField();
        txt_District = new javax.swing.JTextField();
        txt_City = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txt_ContactNumber = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_FirstName = new javax.swing.JTextField();
        txt_LastName = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        com_DateOfBirth = new javax.swing.JComboBox();
        com_MonthOfBirth = new javax.swing.JComboBox();
        com_YearOfBirth = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        bt_Button = new javax.swing.JButton();
        lb_EmployeeID = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lb_LogOut = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lb_UserName = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel6.setOpaque(false);
        jPanel6.setLayout(null);

        bt_Exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_Exit.setText("Exit");
        bt_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ExitActionPerformed(evt);
            }
        });
        jPanel6.add(bt_Exit);
        bt_Exit.setBounds(1100, 390, 120, 30);

        bt_Update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_Update.setText("Update");
        bt_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_UpdateActionPerformed(evt);
            }
        });
        jPanel6.add(bt_Update);
        bt_Update.setBounds(830, 390, 110, 30);

        bt_Cancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_Cancel.setText("Cancel");
        bt_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CancelActionPerformed(evt);
            }
        });
        jPanel6.add(bt_Cancel);
        bt_Cancel.setBounds(970, 390, 110, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Address");
        jPanel6.add(jLabel15);
        jLabel15.setBounds(190, 260, 70, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("District");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(190, 300, 60, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("City");
        jPanel6.add(jLabel6);
        jLabel6.setBounds(190, 340, 40, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText(":");
        jPanel6.add(jLabel8);
        jLabel8.setBounds(290, 340, 10, 20);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText(":");
        jPanel6.add(jLabel27);
        jLabel27.setBounds(290, 300, 10, 20);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText(":");
        jPanel6.add(jLabel26);
        jLabel26.setBounds(290, 260, 10, 20);

        txt_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AddressActionPerformed(evt);
            }
        });
        jPanel6.add(txt_Address);
        txt_Address.setBounds(320, 260, 220, 30);

        txt_District.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DistrictActionPerformed(evt);
            }
        });
        jPanel6.add(txt_District);
        txt_District.setBounds(320, 300, 220, 30);

        txt_City.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CityActionPerformed(evt);
            }
        });
        jPanel6.add(txt_City);
        txt_City.setBounds(320, 340, 220, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("First Name");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(170, 90, 90, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Last Name");
        jPanel6.add(jLabel9);
        jLabel9.setBounds(170, 130, 90, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Employee ID");
        jPanel6.add(jLabel10);
        jLabel10.setBounds(170, 50, 90, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Contact No");
        jPanel6.add(jLabel13);
        jLabel13.setBounds(170, 180, 80, 20);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Address");
        jPanel6.add(jLabel28);
        jLabel28.setBounds(170, 220, 60, 20);

        txt_ContactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ContactNumberActionPerformed(evt);
            }
        });
        jPanel6.add(txt_ContactNumber);
        txt_ContactNumber.setBounds(320, 180, 220, 30);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText(":");
        jPanel6.add(jLabel25);
        jLabel25.setBounds(290, 180, 10, 20);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText(":");
        jPanel6.add(jLabel20);
        jLabel20.setBounds(290, 130, 10, 20);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText(":");
        jPanel6.add(jLabel19);
        jLabel19.setBounds(290, 90, 10, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText(":");
        jPanel6.add(jLabel18);
        jLabel18.setBounds(290, 50, 10, 20);

        txt_FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FirstNameActionPerformed(evt);
            }
        });
        jPanel6.add(txt_FirstName);
        txt_FirstName.setBounds(320, 90, 220, 30);

        txt_LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LastNameActionPerformed(evt);
            }
        });
        jPanel6.add(txt_LastName);
        txt_LastName.setBounds(320, 130, 220, 30);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Date of Birth");
        jPanel6.add(jLabel29);
        jLabel29.setBounds(660, 90, 90, 20);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText(":");
        jPanel6.add(jLabel37);
        jLabel37.setBounds(780, 90, 10, 20);

        com_DateOfBirth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        com_DateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_DateOfBirthActionPerformed(evt);
            }
        });
        jPanel6.add(com_DateOfBirth);
        com_DateOfBirth.setBounds(830, 90, 60, 30);

        com_MonthOfBirth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));
        com_MonthOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_MonthOfBirthActionPerformed(evt);
            }
        });
        jPanel6.add(com_MonthOfBirth);
        com_MonthOfBirth.setBounds(910, 90, 100, 30);

        com_YearOfBirth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", " " }));
        com_YearOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_YearOfBirthActionPerformed(evt);
            }
        });
        jPanel6.add(com_YearOfBirth);
        com_YearOfBirth.setBounds(1030, 90, 100, 30);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("E-mail");
        jPanel6.add(jLabel32);
        jLabel32.setBounds(660, 140, 80, 20);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText(":");
        jPanel6.add(jLabel33);
        jLabel33.setBounds(780, 140, 10, 20);

        txt_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailActionPerformed(evt);
            }
        });
        jPanel6.add(txt_Email);
        txt_Email.setBounds(830, 140, 300, 30);

        bt_Button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_Button.setText("Back");
        bt_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ButtonActionPerformed(evt);
            }
        });
        jPanel6.add(bt_Button);
        bt_Button.setBounds(720, 390, 80, 30);
        jPanel6.add(lb_EmployeeID);
        lb_EmployeeID.setBounds(320, 0, 70, 50);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(30, 180, 1300, 460);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leaveManagementSystem/Background/user.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 0, 120, 110);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1200, 30, 120, 110);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(null);

        lb_LogOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_LogOut.setText("Logout");
        lb_LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_LogOutMouseClicked(evt);
            }
        });
        jPanel5.add(lb_LogOut);
        lb_LogOut.setBounds(110, 0, 60, 30);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(1040, 90, 190, 30);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        lb_UserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_UserName.setText("User Name");
        jPanel3.add(lb_UserName);
        lb_UserName.setBounds(10, 0, 90, 30);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("User Name");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(140, 0, 90, 30);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(990, 60, 250, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(1130, 60, 110, 30);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(null);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setText("Copyright © 2015 by Hexa Group Ptv Ltd");
        jPanel8.add(jLabel22);
        jLabel22.setBounds(160, 10, 450, 30);

        getContentPane().add(jPanel8);
        jPanel8.setBounds(270, 690, 820, 50);

        jPanel7.setOpaque(false);
        jPanel7.setLayout(null);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leaveManagementSystem/Background/logoSmall.png"))); // NOI18N
        jPanel7.add(jLabel21);
        jLabel21.setBounds(70, 0, 350, 110);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(40, 30, 500, 110);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Microsoft Uighur", 1, 70)); // NOI18N
        jLabel2.setText("Edit Employee");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 320, 110);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(550, 30, 330, 110);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leaveManagementSystem/Background/addDetail1.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_ExitActionPerformed

    private void bt_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_UpdateActionPerformed
        // TODO add your handling code here:
        boolean StatusFirstname=Validate.ValidateName(txt_FirstName.getText());
        FirstName=txt_FirstName.getText();
        
        boolean StatusLastname=Validate.ValidateName(txt_LastName.getText());
        LastName=txt_LastName.getText();
       
        boolean StatusContactNumber=Validate.ValidateContactNumber(txt_ContactNumber.getText());
        ContactNumber=txt_ContactNumber.getText();
        
        boolean StatusAddress=Validate.ValidateAddress(txt_Address.getText());
        Address=txt_Address.getText();
        
        boolean StatusDistrict=Validate.ValidateDistrictandCity(txt_District.getText());
        District=txt_District.getText();
        
        boolean StatusCity=Validate.ValidateDistrictandCity(txt_City.getText());
        City=txt_City.getText();
        
        
        boolean StatusEmail=Validate.ValidateEmail(txt_Email.getText());
        Email=txt_Email.getText();
        
        
        //End of Email Validation
         DateOfBirth=com_DateOfBirth.getSelectedItem().toString()+"/"+com_MonthOfBirth.getSelectedItem()+"/"+com_YearOfBirth.getSelectedItem().toString();//date input
        
        
        
        if( StatusFirstname==true && StatusLastname==true && StatusContactNumber==true && StatusAddress==true && StatusDistrict==true && StatusCity==true  && StatusEmail==true)
        {
        try
            {
                
                Statement statement = conn.createStatement(); 
                statement.executeUpdate("update employee " + "set  UserName='"+UserName+"',Password='"+Password+"',FirstName='"+FirstName+"',LastName='"+LastName+"',ContatctNumber='"+ContactNumber+"',Address='"+Address+"',District='"+District+"',City='"+City+"',DateOfBirth='"+DateOfBirth+"',DateOfJoined='"+DateJoined+"',WorkType='"+Type+"',Sex='"+Sex+"',Email='"+Email+"' where EmployeeID='"+EmployeeID+"' ");
                
                JOptionPane.showMessageDialog(null, "Data Updateded Successfully");
            }
            catch(SQLException ex)
            {
                System.out.println(ex.getMessage());
                
            }
            catch(Exception e)
            {
               e.getMessage();
            }

        
        }
        
        else
        {
            if(UserName.length()<4)
            {
                 JOptionPane.showMessageDialog(null,"Invalid Data!! \n User name must contain atleast 4 characters");
            }
            else if(ContactNumber.length()<10)
            {
                 JOptionPane.showMessageDialog(null,"Invalid Data!! \n Contact Number should have minimum of 9 Digits");
            }
        }

        
    }//GEN-LAST:event_bt_UpdateActionPerformed

    private void bt_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_CancelActionPerformed

    private void txt_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AddressActionPerformed

    private void txt_DistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DistrictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DistrictActionPerformed

    private void txt_CityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CityActionPerformed

    private void txt_ContactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ContactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ContactNumberActionPerformed

    private void txt_FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FirstNameActionPerformed

    private void txt_LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LastNameActionPerformed

    private void com_DateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_DateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_DateOfBirthActionPerformed

    private void com_MonthOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_MonthOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_MonthOfBirthActionPerformed

    private void com_YearOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_YearOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_YearOfBirthActionPerformed

    private void txt_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmailActionPerformed

    private void bt_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ButtonActionPerformed
        // TODO add your handling code here:
        if(Status=="false")
        {
            this.hide();
            new OptionManager(Name,ManagerID).setVisible(true);
        }
        else if(Status=="true")
        {
            this.hide();
            new overView(Name,EmployeeID).setVisible(true);
        }
        
    }//GEN-LAST:event_bt_ButtonActionPerformed

    private void lb_LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_LogOutMouseClicked
        // TODO add your handling code here:
        this.hide();
        new login().setVisible(true);
    }//GEN-LAST:event_lb_LogOutMouseClicked

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
            java.util.logging.Logger.getLogger(editEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Button;
    private javax.swing.JButton bt_Cancel;
    private javax.swing.JButton bt_Exit;
    private javax.swing.JButton bt_Update;
    private javax.swing.JComboBox com_DateOfBirth;
    private javax.swing.JComboBox com_MonthOfBirth;
    private javax.swing.JComboBox com_YearOfBirth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lb_EmployeeID;
    private javax.swing.JLabel lb_LogOut;
    private javax.swing.JLabel lb_UserName;
    private javax.swing.JTextField txt_Address;
    private javax.swing.JTextField txt_City;
    private javax.swing.JTextField txt_ContactNumber;
    private javax.swing.JTextField txt_District;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_FirstName;
    private javax.swing.JTextField txt_LastName;
    // End of variables declaration//GEN-END:variables
}
