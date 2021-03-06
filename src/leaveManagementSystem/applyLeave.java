/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaveManagementSystem;

import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
import static leaveManagementSystem.overView.UserName;

/**
 *
 * @author Anojithan
 */
public class applyLeave extends javax.swing.JFrame {

    
    static String EmployeeID;
    static String DateJoined;
    //static String UserName;
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
    static int Leave;
    
    static final String Status="NO";
    
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement  pst=null;
    
    
    static String  UserName;
    /**
     * Creates new form login
     */
    public applyLeave() {
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
    
    public applyLeave(String UserName,String EmployeeID)
    {
        this.UserName=UserName;
        this.EmployeeID=EmployeeID;
        initComponents();
        txt_EmployeeID.setText(this.EmployeeID);
        lb_UserName.setText(this.UserName);
        
        conn=Connect.ConnectDB();
        
        
        String sql = "SELECT * employee " + " WHERE EmployeeID = '"+this.EmployeeID+"'";
                try
                {
                
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
            Leave=rs.getInt("Leave");
            
            
        }
            txt_EmployeeID.setText(EmployeeID);
            txt_EmployeeName.setText(FirstName+" "+LastName);
            txt_BalanceLeave.setText(""+Leave);
            
            
        
        
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
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_EmployeeID = new javax.swing.JTextField();
        txt_EmployeeName = new javax.swing.JTextField();
        txt_BalanceLeave = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txa_Purpose = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        com_NoOfDays = new javax.swing.JComboBox();
        com_Month = new javax.swing.JComboBox();
        com_Year = new javax.swing.JComboBox();
        com_Date = new javax.swing.JComboBox();
        lb_ApplyLeave = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
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

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Employee ID");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(160, 140, 90, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Employee Name");
        jPanel6.add(jLabel9);
        jLabel9.setBounds(160, 180, 120, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Balance Leave");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(160, 240, 110, 20);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText(":");
        jPanel6.add(jLabel23);
        jLabel23.setBounds(280, 240, 10, 20);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText(":");
        jPanel6.add(jLabel19);
        jLabel19.setBounds(280, 180, 10, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText(":");
        jPanel6.add(jLabel18);
        jLabel18.setBounds(280, 140, 10, 20);

        txt_EmployeeID.setEditable(false);
        txt_EmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmployeeIDActionPerformed(evt);
            }
        });
        jPanel6.add(txt_EmployeeID);
        txt_EmployeeID.setBounds(310, 140, 220, 30);

        txt_EmployeeName.setEditable(false);
        txt_EmployeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmployeeNameActionPerformed(evt);
            }
        });
        jPanel6.add(txt_EmployeeName);
        txt_EmployeeName.setBounds(310, 180, 220, 30);

        txt_BalanceLeave.setEditable(false);
        txt_BalanceLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BalanceLeaveActionPerformed(evt);
            }
        });
        jPanel6.add(txt_BalanceLeave);
        txt_BalanceLeave.setBounds(310, 240, 220, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Remarks / Purpose");
        jPanel6.add(jLabel12);
        jLabel12.setBounds(630, 210, 160, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("No. of Days");
        jPanel6.add(jLabel13);
        jLabel13.setBounds(630, 170, 90, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Start Date");
        jPanel6.add(jLabel14);
        jLabel14.setBounds(630, 130, 120, 20);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText(":");
        jPanel6.add(jLabel24);
        jLabel24.setBounds(750, 130, 10, 20);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText(":");
        jPanel6.add(jLabel25);
        jLabel25.setBounds(750, 170, 10, 20);

        txa_Purpose.setColumns(20);
        txa_Purpose.setRows(5);
        jScrollPane2.setViewportView(txa_Purpose);

        jPanel6.add(jScrollPane2);
        jScrollPane2.setBounds(630, 240, 460, 60);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2);
        jButton2.setBounds(970, 360, 120, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3);
        jButton3.setBounds(830, 360, 110, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Apply Leave");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4);
        jButton4.setBounds(650, 360, 150, 30);

        com_NoOfDays.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        com_NoOfDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_NoOfDaysActionPerformed(evt);
            }
        });
        jPanel6.add(com_NoOfDays);
        com_NoOfDays.setBounds(780, 170, 60, 30);

        com_Month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));
        com_Month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_MonthActionPerformed(evt);
            }
        });
        jPanel6.add(com_Month);
        com_Month.setBounds(860, 130, 100, 30);

        com_Year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2013", "2014", "2015", " " }));
        com_Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_YearActionPerformed(evt);
            }
        });
        jPanel6.add(com_Year);
        com_Year.setBounds(980, 130, 100, 30);

        com_Date.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        com_Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_DateActionPerformed(evt);
            }
        });
        jPanel6.add(com_Date);
        com_Date.setBounds(780, 130, 60, 30);

        lb_ApplyLeave.setForeground(new java.awt.Color(204, 0, 0));
        lb_ApplyLeave.setText("*");
        jPanel6.add(lb_ApplyLeave);
        lb_ApplyLeave.setBounds(280, 40, 240, 40);

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
        jLabel2.setText("Apply Leave");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 300, 110);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(550, 30, 300, 110);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leaveManagementSystem/Background/applyLeave.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_EmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmployeeIDActionPerformed

    private void txt_EmployeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmployeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmployeeNameActionPerformed

    private void txt_BalanceLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BalanceLeaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BalanceLeaveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.hide();
        new overView(FirstName,EmployeeID).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int LeaveDays;
        String StartDate;
        String Purpose;
        
   
        LeaveDays=Integer.parseInt(com_NoOfDays.getSelectedItem().toString());
        if(Leave>=LeaveDays)
        {
        Purpose=txa_Purpose.getText();
        StartDate=com_Date.getSelectedItem().toString()+"/"+com_Month.getSelectedItem()+"/"+com_Year.getSelectedItem();
                
        try
            {
               Statement statement = conn.createStatement();
               statement.executeUpdate("insert into ApplyLeave (`EmployeeID`, `StartDate`, `LeaveDays`, `Purpose`, `Status`)  values  ('"+EmployeeID+"','"+StartDate+"','"+LeaveDays+"','"+Purpose+"','"+Status+"')");
               //lb_ApplyLeave.setText("Your Leave Stored");
               JOptionPane.showMessageDialog(null,"Your Leave Request is sent to Manager \n Kindly wait until he response");
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
            JOptionPane.showMessageDialog(null,"Leave Denied.. \n For further Clarification meet the Manager");
        }
            
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void com_NoOfDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_NoOfDaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_NoOfDaysActionPerformed

    private void com_MonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_MonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_MonthActionPerformed

    private void com_YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_YearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_YearActionPerformed

    private void com_DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_DateActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.hide();
        new login().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(applyLeave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(applyLeave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(applyLeave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(applyLeave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new applyLeave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox com_Date;
    private javax.swing.JComboBox com_Month;
    private javax.swing.JComboBox com_NoOfDays;
    private javax.swing.JComboBox com_Year;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JLabel lb_ApplyLeave;
    private javax.swing.JLabel lb_UserName;
    private javax.swing.JTextArea txa_Purpose;
    private javax.swing.JTextField txt_BalanceLeave;
    private javax.swing.JTextField txt_EmployeeID;
    private javax.swing.JTextField txt_EmployeeName;
    // End of variables declaration//GEN-END:variables
}
