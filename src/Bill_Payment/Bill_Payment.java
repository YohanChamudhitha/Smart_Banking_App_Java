/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill_Payment;

import Code.DBConnect4;
import Code.DBconnect;
import Code.DBconnect1;
import Code.DBconnect2;
import Code.DBconnect3;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Yohan Chamuditha
 */
public class Bill_Payment extends javax.swing.JFrame {
Connection conn;
Connection con;
Connection con1;
Connection con2;
Connection con4;

   PreparedStatement pst = null;
   ResultSet rs = null;
    /**
     * Creates new form Bill_Payment
     */
    public Bill_Payment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bill_Payment/Untitled-1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lucky Bank PLC");

        jLabel3.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bill Payment Portal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Bill Payment Portal");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Select Bill Type");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Account Number");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Amount");

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(102, 102, 102));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electricity", "Water", "SLT", "EZ Cash" }));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 204));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 204));
        jButton4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Main Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Your Pin_No");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 134, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(102, 102, 102))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         conn = DBconnect.ConnectDB();
         con = DBconnect1.ConnectDB1();
         con1 = DBconnect2.ConnectDB2();
         con2 = DBconnect3.ConnectDB3();
         con4 = DBConnect4.ConnectDB4();
         try{
         int acc_no = Integer.parseInt(jTextField1.getText());
         int amount = Integer.parseInt(jTextField2.getText());
         String pin = jPasswordField1.getText();
         String menu = jComboBox1.getSelectedItem().toString();
         if (menu == "Electricity"){
            try{
               String sql = "SELECT * FROM temp";
                    pst = conn.prepareStatement(sql);
                    rs = pst.executeQuery();
                if(rs.first()){
                    String t = (rs.getString("Pin_No"));
                    if(t.equals(pin)){
                    String est = "Select * From customer_details Where Pin_No = '"+t+"'";
                    pst = conn.prepareStatement(est);
                    rs = pst.executeQuery();
                    if(rs.first()){
                    int j = (rs.getInt("Account_No"));
                    int l = (rs.getInt("Balance"));
                    if (l<=amount){
                    JOptionPane.showMessageDialog(null,"Not Enough Balance !!!");
                 }
                    else{
                        String q = "Select * From bill_payments where Customer_acc_no = '"+acc_no+"'";
                        pst = con.prepareStatement(q);
                        rs = pst.executeQuery();
                        if(rs.first()){
                           //String date = (rs.getTimestamp("Timestamp").toString());
                            int acc_nob = (rs.getInt("Customer_acc_no"));
                            int acc_now = acc_nob;
                            
                            if(acc_now == acc_no){
                                 String ty = "select * from bill_payments where Customer_acc_no = '"+acc_no+"' order by Timestamp DESC";
                                 pst = con.prepareStatement(ty);
                                 rs = pst.executeQuery();
                                 if (rs.first()){
                                     int balance = (rs.getInt("Balance"));
                                     int balance1 = balance - amount;
                                     int bill_no = (rs.getInt("Bill_no"));
                                     int bill1 = (bill_no + 1);
                                     Calendar calendar = Calendar.getInstance();
                                     Timestamp currentTimestamp = new java.sql.Timestamp(calendar.getTime().getTime());
                                     String ins = "Insert Into bill_payments (Bill_no,Customer_acc_no,Payment_Type,Timestamp,Amount,Balance)"
                                             + "Values ('"+bill1+"','"+acc_no+"','Online','"+currentTimestamp+"','"+amount+"','"+balance1+"') ";
                                     pst = con.prepareStatement(ins);
                                     pst.execute();
                                     String up = "update customer_details set Balance = (Balance - '"+amount+"') where Pin_No = '"+pin+"'";
                                     pst = conn.prepareStatement(up);
                                     pst.execute();
                                     JOptionPane.showMessageDialog(null,"Your Electricity Bill_Payment Success !!!");
                                 }
                            } else {
                                 JOptionPane.showMessageDialog(null,"Check Your Account No !!!");
                            }
                            
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"System Error, Please Try Again Later...");
                        }
                         
                         }
                    }
                    }else{
                        JOptionPane.showMessageDialog(null,"Please Check Your Pin No !!!");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"System Error, Please Try Again Later...");
                }
            }
                   
        catch(Exception e){
             System.out.println(e.toString());
        }
       // }
         } else{
             if (menu == "Water"){
                 
            try{
               String sql = "SELECT * FROM temp";
                    pst = conn.prepareStatement(sql);
                    rs = pst.executeQuery();
                if(rs.first()){
                    String t = (rs.getString("Pin_No"));
                    if(t.equals(pin)){
                    String est = "Select * From customer_details Where Pin_No = '"+t+"'";
                    pst = conn.prepareStatement(est);
                    rs = pst.executeQuery();
                    if(rs.first()){
                    int j = (rs.getInt("Account_No"));
                    int l = (rs.getInt("Balance"));
                    if (l<=amount){
                    JOptionPane.showMessageDialog(null,"Not Enough Balance !!!");
                 }
                    else{
                        String q = "Select * From bill_payments where Customer_acc_no = '"+acc_no+"'";
                        pst = con1.prepareStatement(q);
                        rs = pst.executeQuery();
                        if(rs.first()){
                           //String date = (rs.getTimestamp("Timestamp").toString());
                            int acc_nob = (rs.getInt("Customer_acc_no"));
                            int acc_now = acc_nob;
                            
                            if(acc_now == acc_no){
                                 String ty = "select * from bill_payments where Customer_acc_no = '"+acc_no+"' order by Timestamp DESC";
                                 pst = con1.prepareStatement(ty);
                                 rs = pst.executeQuery();
                                 if (rs.first()){
                                     int balance = (rs.getInt("Balance"));
                                     int balance1 = balance - amount;
                                     int bill_no = (rs.getInt("Bill_no"));
                                     int bill1 = (bill_no + 1);
                                     Calendar calendar = Calendar.getInstance();
                                     Timestamp currentTimestamp = new java.sql.Timestamp(calendar.getTime().getTime());
                                     String ins = "Insert Into bill_payments (Bill_no,Customer_acc_no,Payment_Type,Timestamp,Amount,Balance)"
                                             + "Values ('"+bill1+"','"+acc_no+"','Online','"+currentTimestamp+"','"+amount+"','"+balance1+"') ";
                                     pst = con1.prepareStatement(ins);
                                     pst.execute();
                                     String up = "update customer_details set Balance = (Balance - '"+amount+"') where Pin_No = '"+pin+"'";
                                     pst = conn.prepareStatement(up);
                                     pst.execute();
                                     JOptionPane.showMessageDialog(null,"Your Water_Bill_Payment Success !!!");
                                 }
                            } else {
                                 JOptionPane.showMessageDialog(null,"Check Your Account No !!!");
                            }
                            
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"System Error, Please Try Again Later...");
                        }
                         
                         }
                    }
                    }else{
                        JOptionPane.showMessageDialog(null,"Please Check Your Pin No !!!");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"System Error, Please Try Again Later...");
                }
            }
                   
        catch(Exception e){
             e.printStackTrace();
        }
       
             }
             else{
                 if(menu == "SLT"){
                     
            try{
               String sql = "SELECT * FROM temp";
                    pst = conn.prepareStatement(sql);
                    rs = pst.executeQuery();
                if(rs.first()){
                    String t = (rs.getString("Pin_No"));
                    if(t.equals(pin)){
                    String est = "Select * From customer_details Where Pin_No = '"+t+"'";
                    pst = conn.prepareStatement(est);
                    rs = pst.executeQuery();
                    if(rs.first()){
                    int j = (rs.getInt("Account_No"));
                    int l = (rs.getInt("Balance"));
                    if (l<=amount){
                    JOptionPane.showMessageDialog(null,"Not Enough Balance !!!");
                 }
                    else{
                        String q = "Select * From bill_payments where Customer_acc_no = '"+acc_no+"'";
                        pst = con2.prepareStatement(q);
                        rs = pst.executeQuery();
                        if(rs.first()){
                           //String date = (rs.getTimestamp("Timestamp").toString());
                            int acc_nob = (rs.getInt("Customer_acc_no"));
                            int acc_now = acc_nob;
                            
                            if(acc_now == acc_no){
                                 String ty = "select * from bill_payments where Customer_acc_no = '"+acc_no+"' order by Timestamp DESC";
                                 pst = con2.prepareStatement(ty);
                                 rs = pst.executeQuery();
                                 if (rs.first()){
                                     int balance = (rs.getInt("Balance"));
                                     int balance1 = balance - amount;
                                     int bill_no = (rs.getInt("Bill_no"));
                                     int bill1 = (bill_no + 1);
                                     Calendar calendar = Calendar.getInstance();
                                     Timestamp currentTimestamp = new java.sql.Timestamp(calendar.getTime().getTime());
                                     String ins = "Insert Into bill_payments (Bill_no,Customer_acc_no,Payment_Type,Timestamp,Amount,Balance)"
                                             + "Values ('"+bill1+"','"+acc_no+"','Online','"+currentTimestamp+"','"+amount+"','"+balance1+"') ";
                                     pst = con2.prepareStatement(ins);
                                     pst.execute();
                                     String up = "update customer_details set Balance = (Balance - '"+amount+"') where Pin_No = '"+pin+"'";
                                     pst = conn.prepareStatement(up);
                                     pst.execute();
                                     JOptionPane.showMessageDialog(null,"Your SLT_Bill_Payment Success !!!");
                                 }
                            } else {
                                 JOptionPane.showMessageDialog(null,"Check Your Account No !!!");
                            }
                            
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"System Error, Please Try Again Later...");
                        }
                         
                         }
                    }
                    }else{
                        JOptionPane.showMessageDialog(null,"Please Check Your Pin No !!!");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"System Error, Please Try Again Later...");
                }
            }
                   
        catch(Exception e){
             System.out.println(e.toString());
        }
       // }
         
                 }else{
                                    
            try{
               String sql = "SELECT * FROM temp";
                    pst = conn.prepareStatement(sql);
                    rs = pst.executeQuery();
                if(rs.first()){
                    String t = (rs.getString("Pin_No"));
                    if(t.equals(pin)){
                    String est = "Select * From customer_details Where Pin_No = '"+t+"'";
                    pst = conn.prepareStatement(est);
                    rs = pst.executeQuery();
                    if(rs.first()){
                    int j = (rs.getInt("Account_No"));
                    int l = (rs.getInt("Balance"));
                    if (l<=amount){
                    JOptionPane.showMessageDialog(null,"Not Enough Balance !!!");
                 }
                    else{
                        String q = "Select * From ez_cash_balance where Account_no = '"+acc_no+"'";
                        pst = con4.prepareStatement(q);
                        rs = pst.executeQuery();
                        if(rs.first()){
                           //String date = (rs.getTimestamp("Timestamp").toString());
                            int acc_nob = (rs.getInt("Account_no"));
                            int acc_now = acc_nob;
                            
                            if(acc_now == acc_no){
                                 String ty = "select * from ez_cash_balance where Account_no = '"+acc_no+"' order by Last_Transaction_Timestamp DESC";
                                 pst = con4.prepareStatement(ty);
                                 rs = pst.executeQuery();
                                 if (rs.first()){
                                     int balance = (rs.getInt("Balance"));
                                     int balance1 = balance + amount;
                                     Calendar calendar = Calendar.getInstance();
                                     Timestamp currentTimestamp = new java.sql.Timestamp(calendar.getTime().getTime());
                                     String ins = "update ez_cash_balance set Last_Transaction_Timestamp = ('"+currentTimestamp+"'),Balance = (Balance + '"+amount+"') where Account_no = '"+acc_no+"'";
                                     pst = con4.prepareStatement(ins);
                                     pst.execute();
                                     String up = "update customer_details set Balance = (Balance - '"+amount+"') where Pin_No = '"+pin+"'";
                                     pst = conn.prepareStatement(up);
                                     pst.execute();
                                     JOptionPane.showMessageDialog(null,"Your EZ_Cash_Transaction Success !!!");
                                 }
                            } else {
                                 JOptionPane.showMessageDialog(null,"Check Your Account No !!!");
                            }
                            
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"System Error, Please Try Again Later...");
                        }
                         
                         }
                    }
                    }else{
                        JOptionPane.showMessageDialog(null,"Please Check Your Pin No !!!");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"System Error, Please Try Again Later...");
                }
            }
                   
        catch(Exception e){
             e.printStackTrace();
        }
       // }
         
                 }
              
                 }             
         }
         }catch(Exception e){
              JOptionPane.showMessageDialog(null,"Please Fill Your Details !!!");
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Main_Menu.Main_Menu m = new Main_Menu.Main_Menu();
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Bill_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill_Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
