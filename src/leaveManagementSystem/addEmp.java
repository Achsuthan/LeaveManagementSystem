/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaveManagementSystem;

import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Anojithan
 */
public class addEmp extends javax.swing.JFrame {

    private String ManagerName;
    final static int Leave=5;
    
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement  pst=null;
    
    
        
    String FirstName;
    String LastName;
    String UserName;
    String Password;
    String ContactNumber;
    String Address;
    String District;
    String Sex;
    String City;
    String DateOfBirth;
    String DateOfJoined;
    String Email;
    String WorkType;
    String ManagerID;
    
    
    /**
     * Creates new form login
     */
    public addEmp() {
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
        
        addEmp_Class addemp_class=new addEmp_Class();
        txt_EmployeeID.setText(addemp_class.getID());
    }
    
    public addEmp(String ManagerName,String ManagerID)
    {
        this.ManagerID=ManagerID;
        initComponents();
        this.ManagerName=ManagerName;
        lb_UserName.setText(this.ManagerName);
        conn=Connect.ConnectDB();
        
        try
        {
                                
           
            String SqlQuery="SELECT EmployeeID from employee order by EmployeeID desc LIMIT 1 " ;
            pst=conn.prepareStatement(SqlQuery);
            rs=pst.executeQuery();
            
            
            if(rs.next())
            {
                String EmployeeId="";
                System.out.println(EmployeeId);
                String empS=rs.getString("EmployeeID");
               
                int emp=Integer.parseInt(empS.substring(3))+1;
                String insert="EMP"+emp;
                EmployeeId=insert;
                txt_EmployeeID.setText(EmployeeId);
                
            
            }
 
        }
        
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
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

        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txt_City = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt_FirstName = new javax.swing.JTextField();
        txt_LastName = new javax.swing.JTextField();
        txt_EmployeeID = new javax.swing.JTextField();
        txt_UserName = new javax.swing.JTextField();
        txt_Password = new javax.swing.JTextField();
        txt_ContactNumber = new javax.swing.JTextField();
        txt_Email = new javax.swing.JTextField();
        txt_District = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txt_Address = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        com_Sex = new javax.swing.JComboBox();
        com_WorkType = new javax.swing.JComboBox();
        com_YearOfJoined = new javax.swing.JComboBox();
        com_DateOfBirth = new javax.swing.JComboBox();
        com_MonthOfBirth = new javax.swing.JComboBox();
        com_YearOfBirth = new javax.swing.JComboBox();
        com_DateOfJoined = new javax.swing.JComboBox();
        com_MonthOfJoined = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        bt_Back = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lb_UserName = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
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

        jPanel9.setOpaque(false);
        jPanel9.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("City");
        jPanel9.add(jLabel6);
        jLabel6.setBounds(110, 410, 40, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText(":");
        jPanel9.add(jLabel8);
        jLabel8.setBounds(210, 410, 10, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Last Name");
        jPanel9.add(jLabel9);
        jLabel9.setBounds(90, 90, 90, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Employee ID");
        jPanel9.add(jLabel10);
        jLabel10.setBounds(90, 130, 90, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("User name");
        jPanel9.add(jLabel11);
        jLabel11.setBounds(90, 170, 90, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Password");
        jPanel9.add(jLabel12);
        jLabel12.setBounds(90, 210, 80, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Contact No");
        jPanel9.add(jLabel13);
        jLabel13.setBounds(90, 250, 80, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Address");
        jPanel9.add(jLabel14);
        jLabel14.setBounds(90, 290, 60, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Address");
        jPanel9.add(jLabel15);
        jLabel15.setBounds(110, 330, 70, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("District");
        jPanel9.add(jLabel16);
        jLabel16.setBounds(110, 370, 60, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("First Name");
        jPanel9.add(jLabel17);
        jLabel17.setBounds(90, 50, 90, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText(":");
        jPanel9.add(jLabel18);
        jLabel18.setBounds(210, 50, 10, 20);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText(":");
        jPanel9.add(jLabel19);
        jLabel19.setBounds(210, 90, 10, 20);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText(":");
        jPanel9.add(jLabel20);
        jLabel20.setBounds(210, 130, 10, 20);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText(":");
        jPanel9.add(jLabel23);
        jLabel23.setBounds(210, 170, 10, 20);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText(":");
        jPanel9.add(jLabel24);
        jLabel24.setBounds(210, 210, 10, 20);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText(":");
        jPanel9.add(jLabel25);
        jLabel25.setBounds(210, 250, 10, 20);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText(":");
        jPanel9.add(jLabel26);
        jLabel26.setBounds(210, 330, 10, 20);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText(":");
        jPanel9.add(jLabel27);
        jLabel27.setBounds(210, 370, 10, 20);

        txt_City.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CityActionPerformed(evt);
            }
        });
        jPanel9.add(txt_City);
        txt_City.setBounds(240, 410, 220, 30);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton1);
        jButton1.setBounds(930, 413, 90, 30);

        txt_FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FirstNameActionPerformed(evt);
            }
        });
        jPanel9.add(txt_FirstName);
        txt_FirstName.setBounds(240, 50, 220, 30);

        txt_LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LastNameActionPerformed(evt);
            }
        });
        jPanel9.add(txt_LastName);
        txt_LastName.setBounds(240, 90, 220, 30);

        txt_EmployeeID.setEditable(false);
        txt_EmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmployeeIDActionPerformed(evt);
            }
        });
        jPanel9.add(txt_EmployeeID);
        txt_EmployeeID.setBounds(240, 130, 220, 30);

        txt_UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UserNameActionPerformed(evt);
            }
        });
        jPanel9.add(txt_UserName);
        txt_UserName.setBounds(240, 170, 220, 30);

        txt_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PasswordActionPerformed(evt);
            }
        });
        jPanel9.add(txt_Password);
        txt_Password.setBounds(240, 210, 220, 30);

        txt_ContactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ContactNumberActionPerformed(evt);
            }
        });
        jPanel9.add(txt_ContactNumber);
        txt_ContactNumber.setBounds(240, 250, 220, 30);

        txt_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailActionPerformed(evt);
            }
        });
        jPanel9.add(txt_Email);
        txt_Email.setBounds(750, 210, 300, 30);

        txt_District.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DistrictActionPerformed(evt);
            }
        });
        jPanel9.add(txt_District);
        txt_District.setBounds(240, 370, 220, 30);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Date of Birth");
        jPanel9.add(jLabel28);
        jLabel28.setBounds(580, 50, 90, 20);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Date joined");
        jPanel9.add(jLabel29);
        jLabel29.setBounds(580, 90, 90, 20);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Work type");
        jPanel9.add(jLabel30);
        jLabel30.setBounds(580, 130, 90, 20);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Sex");
        jPanel9.add(jLabel31);
        jLabel31.setBounds(580, 170, 90, 20);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("E-mail");
        jPanel9.add(jLabel32);
        jLabel32.setBounds(580, 210, 80, 20);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText(":");
        jPanel9.add(jLabel33);
        jLabel33.setBounds(700, 210, 10, 20);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText(":");
        jPanel9.add(jLabel34);
        jLabel34.setBounds(700, 170, 10, 20);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText(":");
        jPanel9.add(jLabel35);
        jLabel35.setBounds(700, 130, 10, 20);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText(":");
        jPanel9.add(jLabel36);
        jLabel36.setBounds(700, 90, 10, 20);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText(":");
        jPanel9.add(jLabel37);
        jLabel37.setBounds(700, 50, 10, 20);

        txt_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AddressActionPerformed(evt);
            }
        });
        jPanel9.add(txt_Address);
        txt_Address.setBounds(240, 330, 220, 30);

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton2);
        jButton2.setBounds(1171, 413, 90, 30);

        com_Sex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        com_Sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_SexActionPerformed(evt);
            }
        });
        jPanel9.add(com_Sex);
        com_Sex.setBounds(750, 170, 100, 30);

        com_WorkType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Permanent", "Temporary" }));
        com_WorkType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_WorkTypeActionPerformed(evt);
            }
        });
        jPanel9.add(com_WorkType);
        com_WorkType.setBounds(750, 130, 100, 30);

        com_YearOfJoined.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", " " }));
        com_YearOfJoined.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_YearOfJoinedActionPerformed(evt);
            }
        });
        jPanel9.add(com_YearOfJoined);
        com_YearOfJoined.setBounds(950, 90, 100, 30);

        com_DateOfBirth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        com_DateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_DateOfBirthActionPerformed(evt);
            }
        });
        jPanel9.add(com_DateOfBirth);
        com_DateOfBirth.setBounds(750, 50, 60, 30);

        com_MonthOfBirth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));
        com_MonthOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_MonthOfBirthActionPerformed(evt);
            }
        });
        jPanel9.add(com_MonthOfBirth);
        com_MonthOfBirth.setBounds(830, 50, 100, 30);

        com_YearOfBirth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", " " }));
        com_YearOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_YearOfBirthActionPerformed(evt);
            }
        });
        jPanel9.add(com_YearOfBirth);
        com_YearOfBirth.setBounds(950, 50, 100, 30);

        com_DateOfJoined.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        com_DateOfJoined.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_DateOfJoinedActionPerformed(evt);
            }
        });
        jPanel9.add(com_DateOfJoined);
        com_DateOfJoined.setBounds(750, 90, 60, 30);

        com_MonthOfJoined.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));
        com_MonthOfJoined.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_MonthOfJoinedActionPerformed(evt);
            }
        });
        jPanel9.add(com_MonthOfJoined);
        com_MonthOfJoined.setBounds(830, 90, 100, 30);

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton3);
        jButton3.setBounds(1050, 413, 90, 30);

        bt_Back.setText("Back");
        bt_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_BackActionPerformed(evt);
            }
        });
        jPanel9.add(bt_Back);
        bt_Back.setBounds(815, 413, 80, 30);

        getContentPane().add(jPanel9);
        jPanel9.setBounds(50, 190, 1280, 460);

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
        jPanel3.setBounds(1140, 60, 100, 30);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leaveManagementSystem/Background/user.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 0, 120, 110);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1200, 30, 120, 110);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Logout");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel5);
        jLabel5.setBounds(110, 0, 60, 30);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(1040, 90, 190, 30);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(null);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setText("Copyright © 2015 by Hexa Group Ptv Ltd");
        jPanel8.add(jLabel22);
        jLabel22.setBounds(160, 10, 450, 30);
        jPanel8.add(jPanel6);
        jPanel6.setBounds(40, 240, 10, 10);

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
        jLabel2.setText("Add Employee Detail");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 10, 510, 110);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(450, 30, 490, 110);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leaveManagementSystem/Background/addDetail.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 10, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    
    
    String EmployeeID;
    FirstName=txt_FirstName.getText();
    LastName=txt_LastName.getText();
    UserName=txt_UserName.getText();
    Password=txt_Password.getText();
    ContactNumber=txt_ContactNumber.getText();
    Address=txt_Address.getText();
    District=txt_District.getText();
    City=txt_City.getText();
    Email=txt_Email.getText();
    Sex=com_Sex.getSelectedItem().toString();
    DateOfBirth=com_DateOfBirth.getSelectedItem().toString()+"/"+com_MonthOfBirth.getSelectedItem()+"/"+com_YearOfBirth.getSelectedItem();//date input
    DateOfJoined=com_DateOfJoined.getSelectedItem().toString()+"/"+com_MonthOfJoined.getSelectedItem()+"/"+com_YearOfJoined.getSelectedItem();//date input
    WorkType=com_WorkType.getSelectedItem().toString();
    EmployeeID=txt_EmployeeID.getText();    
        
        
            
            
             boolean Status_UserName,Status_Password,Status_FirstName,Status_LastName,Status_ContactNumber,Status_Address,Status_District,Status_City,Status_Email;
             Status_UserName=false;
             if(UserName.length()>=4)
                 Status_UserName=true;

            Status_Password=false;
            if(Password.length()>=4)
                Status_Password=true;
 
    
        Status_FirstName=Validate.ValidateName(FirstName);
        Status_LastName=Validate.ValidateName(LastName);
        Status_ContactNumber=Validate.ValidateContactNumber(ContactNumber);
        Status_Address=Validate.ValidateAddress(Address);    
        Status_District=Validate.ValidateDistrictandCity(District);
        Status_City=Validate.ValidateDistrictandCity(City);
        Status_Email=Validate.ValidateEmail(Email);
 
        if(Status_UserName==true && Status_Password==true && Status_FirstName==true && Status_LastName==true && Status_ContactNumber==true && Status_Address==true && Status_District==true && Status_City==true &&  Status_Email==true)
            {
                //lb_Error.setText("Data Validated");
                JOptionPane.showMessageDialog(null,"Employee "+this.UserName+" added Successfully");
                
        try
            {
               Statement statement = conn.createStatement();
               //Resultset rs=
               statement.executeUpdate("insert into employee " + " values  ('"+EmployeeID+"','"+FirstName+"','"+LastName+"','"+UserName+"','"+Password+"','"+ContactNumber+"','"+Address+"','"+District+"','"+City+"','"+DateOfBirth+"','"+DateOfJoined+"','"+Sex+"','"+Email+"','"+WorkType+"','"+Leave+"')");
            }
        catch(SQLException ex)
            {
                System.out.println("Data base is not connected !!!!!");  
            }
        catch(Exception e)
            {
               e.getMessage();
            }
            
        }
        else
        {
            //lb_Error.setText("Data is not Valide");
            //JOptionPane.showMessageDialog(null,"Your Entered Data are wrong : All Name Must Have Minimum 3 charecters and Contact Number Have Minimum 9 digits");
            if(UserName.length()<4)
            {
                 JOptionPane.showMessageDialog(null,"Invalid Data!! \n User name must contain atleast 4 characters");
            }
            else if(ContactNumber.length()<10)
            {
                 JOptionPane.showMessageDialog(null,"Invalid Data!! \n Contact Number should have minimum of 9 Digits");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_CityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CityActionPerformed

    private void txt_FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FirstNameActionPerformed

    private void txt_LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LastNameActionPerformed

    private void txt_EmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmployeeIDActionPerformed

    private void txt_UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UserNameActionPerformed

    private void txt_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PasswordActionPerformed

    private void txt_ContactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ContactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ContactNumberActionPerformed

    private void txt_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmailActionPerformed

    private void txt_DistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DistrictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DistrictActionPerformed

    private void txt_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AddressActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void com_SexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_SexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_SexActionPerformed

    private void com_WorkTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_WorkTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_WorkTypeActionPerformed

    private void com_YearOfJoinedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_YearOfJoinedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_YearOfJoinedActionPerformed

    private void com_DateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_DateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_DateOfBirthActionPerformed

    private void com_MonthOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_MonthOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_MonthOfBirthActionPerformed

    private void com_YearOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_YearOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_YearOfBirthActionPerformed

    private void com_DateOfJoinedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_DateOfJoinedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_DateOfJoinedActionPerformed

    private void com_MonthOfJoinedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_MonthOfJoinedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_MonthOfJoinedActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.hide();
        new login().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void bt_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_BackActionPerformed
        // TODO add your handling code here:
        this.hide();
        new OptionManager(ManagerName, ManagerID).setVisible(true);
    }//GEN-LAST:event_bt_BackActionPerformed

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
            java.util.logging.Logger.getLogger(addEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Back;
    private javax.swing.JComboBox com_DateOfBirth;
    private javax.swing.JComboBox com_DateOfJoined;
    private javax.swing.JComboBox com_MonthOfBirth;
    private javax.swing.JComboBox com_MonthOfJoined;
    private javax.swing.JComboBox com_Sex;
    private javax.swing.JComboBox com_WorkType;
    private javax.swing.JComboBox com_YearOfBirth;
    private javax.swing.JComboBox com_YearOfJoined;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lb_UserName;
    private javax.swing.JTextField txt_Address;
    private javax.swing.JTextField txt_City;
    private javax.swing.JTextField txt_ContactNumber;
    private javax.swing.JTextField txt_District;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_EmployeeID;
    private javax.swing.JTextField txt_FirstName;
    private javax.swing.JTextField txt_LastName;
    private javax.swing.JTextField txt_Password;
    private javax.swing.JTextField txt_UserName;
    // End of variables declaration//GEN-END:variables
}
