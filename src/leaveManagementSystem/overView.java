/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaveManagementSystem;

import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;
import static leaveManagementSystem.applyLeave.EmployeeID;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Anojithan
 */
public class overView extends javax.swing.JFrame {

    String EmployeeName;
    
    
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement  pst=null;
    
    
    static String EmployeeID;
    static String DateJoined;
    static String UserName;
    static String Password;
    static String Sex;
    static String Type;
    static String FirstName;
    static String LastName;
    static int ContactNumber;
    static String Address;
    static String District;
    static String City;
    static String DateOfBirth;
    static String Email;
    static String MangerName;
    
    
     
    /**
     * Creates new form login
     */
    public overView() {
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
    
    public overView(String EmployeeName,String EmployeeID)
    {
        initComponents();
        this.EmployeeName=EmployeeName;
        this.EmployeeID=EmployeeID;
        lb_UserName.setText(EmployeeName);
        txt_EmployeeID.setText(this.EmployeeID);
        
        conn=Connect.ConnectDB();
        
        
                try
                {
                String sql = "SELECT * employee " + " WHERE EmployeeID = '"+this.EmployeeID+"'";
                PreparedStatement pst = conn.prepareStatement("select * from employee where EmployeeID='"+this.EmployeeID+"' ");
                ResultSet rs=pst.executeQuery();
                        
        
        while (rs.next()) {
            UserName = rs.getString("UserName");
            Password =rs.getString("Password");
            FirstName=rs.getString("FirstName");
            LastName=rs.getString("LastName");
            ContactNumber=Integer.parseInt(rs.getString("ContatctNumber"));
            Address=rs.getString("Address");
            District=rs.getString("District");
            City=rs.getString("City");
            DateOfBirth=rs.getString("DateOfBirth");
            DateJoined=rs.getString("DateOfJoined");
            Sex=rs.getString("Sex");
            Type=rs.getString("WorkType");
            Email=rs.getString("Email");
            
        }
            
            txt_Name.setText(FirstName+" "+LastName);
            txt_WorkType.setText(Type);
            txt_DateJoined.setText(DateJoined);
        
        
        }
                
                catch(SQLException ex)
                {
                    System.out.println(ex.getMessage());
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
        bt_EditProfile = new javax.swing.JButton();
        bt_ApplayNewLeave = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_DateJoined = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_EmployeeID = new javax.swing.JTextField();
        txt_Name = new javax.swing.JTextField();
        txt_WorkType = new javax.swing.JTextField();
        bt_ViewLatestLeave = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
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
        bt_Exit.setBounds(890, 360, 120, 30);

        bt_EditProfile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_EditProfile.setText("Edit Profile");
        bt_EditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_EditProfileActionPerformed(evt);
            }
        });
        jPanel6.add(bt_EditProfile);
        bt_EditProfile.setBounds(410, 360, 110, 30);

        bt_ApplayNewLeave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_ApplayNewLeave.setText("Apply New Leave");
        bt_ApplayNewLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ApplayNewLeaveActionPerformed(evt);
            }
        });
        jPanel6.add(bt_ApplayNewLeave);
        bt_ApplayNewLeave.setBounds(560, 360, 140, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Full Name");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(290, 160, 90, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Work type");
        jPanel6.add(jLabel9);
        jLabel9.setBounds(290, 210, 90, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("OverView of the Leave");
        jPanel6.add(jLabel10);
        jLabel10.setBounds(710, 120, 170, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Joined Date");
        jPanel6.add(jLabel13);
        jLabel13.setBounds(290, 260, 90, 20);

        txt_DateJoined.setEditable(false);
        txt_DateJoined.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DateJoinedActionPerformed(evt);
            }
        });
        jPanel6.add(txt_DateJoined);
        txt_DateJoined.setBounds(440, 260, 220, 30);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText(":");
        jPanel6.add(jLabel25);
        jLabel25.setBounds(410, 260, 10, 20);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText(":");
        jPanel6.add(jLabel20);
        jLabel20.setBounds(410, 210, 10, 20);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText(":");
        jPanel6.add(jLabel19);
        jLabel19.setBounds(410, 160, 10, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText(":");
        jPanel6.add(jLabel18);
        jLabel18.setBounds(410, 120, 10, 20);

        txt_EmployeeID.setEditable(false);
        txt_EmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmployeeIDActionPerformed(evt);
            }
        });
        jPanel6.add(txt_EmployeeID);
        txt_EmployeeID.setBounds(440, 120, 220, 30);

        txt_Name.setEditable(false);
        txt_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NameActionPerformed(evt);
            }
        });
        jPanel6.add(txt_Name);
        txt_Name.setBounds(440, 160, 220, 30);

        txt_WorkType.setEditable(false);
        txt_WorkType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_WorkTypeActionPerformed(evt);
            }
        });
        jPanel6.add(txt_WorkType);
        txt_WorkType.setBounds(440, 210, 220, 30);

        bt_ViewLatestLeave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_ViewLatestLeave.setText("View Latest Leave");
        bt_ViewLatestLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ViewLatestLeaveActionPerformed(evt);
            }
        });
        jPanel6.add(bt_ViewLatestLeave);
        bt_ViewLatestLeave.setBounds(720, 360, 150, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Employee ID");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(290, 120, 90, 20);

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Emp_No", "Start_Date", "Leave_Days", "Purpose"
            }
        ));
        jScrollPane2.setViewportView(Table1);

        jPanel6.add(jScrollPane2);
        jScrollPane2.setBounds(730, 150, 450, 180);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(30, 180, 1300, 460);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leaveManagementSystem/Background/user.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 120, 110);

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
        jPanel3.setBounds(1140, 60, 100, 30);

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
        jLabel2.setText("Over View");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 300, 110);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(550, 30, 300, 110);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leaveManagementSystem/Background/overview.JPG"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_ExitActionPerformed

    private void bt_EditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_EditProfileActionPerformed
        this.hide();
        new editEmployee(UserName,EmployeeID,"true").setVisible(true);
    }//GEN-LAST:event_bt_EditProfileActionPerformed

    private void bt_ApplayNewLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ApplayNewLeaveActionPerformed
        // TODO add your handling code here:
        this.hide();
        new applyLeave(UserName,EmployeeID).setVisible(true);
    }//GEN-LAST:event_bt_ApplayNewLeaveActionPerformed

    private void txt_DateJoinedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DateJoinedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DateJoinedActionPerformed

    private void txt_EmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmployeeIDActionPerformed

    private void txt_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NameActionPerformed

    private void txt_WorkTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_WorkTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_WorkTypeActionPerformed

    private void bt_ViewLatestLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ViewLatestLeaveActionPerformed
        // TODO add your handling code here:
        
         try
        {
            String Status="YES";
            String sql="Select * from applyleave where Status='"+Status+"' and EmployeeID='"+EmployeeID+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            
            
          Table1.setModel(DbUtils.resultSetToTableModel(rs));
        }
         catch(SQLException ex)
         {
             System.out.println(ex.getMessage());
         }
    }//GEN-LAST:event_bt_ViewLatestLeaveActionPerformed

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
            java.util.logging.Logger.getLogger(overView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(overView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(overView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(overView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new overView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JButton bt_ApplayNewLeave;
    private javax.swing.JButton bt_EditProfile;
    private javax.swing.JButton bt_Exit;
    private javax.swing.JButton bt_ViewLatestLeave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_LogOut;
    private javax.swing.JLabel lb_UserName;
    private javax.swing.JTextField txt_DateJoined;
    private javax.swing.JTextField txt_EmployeeID;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_WorkType;
    // End of variables declaration//GEN-END:variables
}