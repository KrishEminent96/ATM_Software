/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM_Software;

import Database_Connection.dbConnection;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Deposit extends javax.swing.JFrame {

   Connection conn = null;
     PreparedStatement pst = null;
     ResultSet rs = null;
     
    public Deposit() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); /*** To stay maximized the jFrame***/
       
        
                conn = dbConnection.getConnection(); 

    }
    
    public void Print_the_Slip() throws PrinterException{
    
    summary2.print();
    }
    
     public void summaryHead(){
         summary2.setText( "                          ----------NSB----------                        \n"
                     + "                         $ NATIONAL SAVINGS BANK $                     \n"
                     + "                             NO 20, KANDY ROAD,                              \n" 
                     + "                                  COLOMBO                                  \n"
                     + "     tel : 011xxxxxxx | email : nsb20@gmail.com | web : www.nsb.com    \n"            
                     + "****************************************************************************        \n\n"
                     + "                            Transaction Details \n"
                     + "                           ``````````````````````\n\n"); 
                     
                     
    
    }

      public void TransactionSummary() {
      
           String ACCOUNTNO = reciveracc.getText();

        try {

            String sql = "SELECT * FROM accholder WHERE accountNo = ?";
            
            pst = conn.prepareStatement(sql);
            pst.setString(1, ACCOUNTNO);
   
            rs = pst.executeQuery();
            
        
            if (rs.next()) {

                String accountNumber = rs.getString("accountNo"); /* getting Reciever's account number from db */
                String Name = rs.getString("name");               /*     "   Reciever's name            "     */
                String Balance = rs.getString("balance");         /*     "   Reciever's balance       "    */
 
                String DipAmount = dipamount.getText();      /* getting Diposit Amount  number from Text Field */
                String SendersNic = sendersNic.getText();    /* getting Sender's NIC  number from Text Field */

                showRecieversOldBalance.setText(Balance);
                
                summary2.append(" Reciever's Name                : " + Name + "\n\n\n Reciever's Account Number      : " + accountNumber +"\n\n\n Sender's NIC Number            : " + SendersNic+ "\n\n\n Deposite Amount (RS)           : " + DipAmount+ "\n\n\n Transaction Status             : SUCCESSFUL" + "\n\n\n                         Thank You For Banking With Us !");

            }else {

               // JOptionPane.showMessageDialog(this, "Account number not found !");
            }

        } catch (Exception e) {

            System.err.println(e);
            JOptionPane.showMessageDialog(null, "error");

        }
     
      
      }
      
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Calculate Reciever's New Balance ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++      
       
      public void Caculate_New_Balance(){
     
      try{
         String recievers_old_balance = showRecieversOldBalance.getText();
         String diposit_amount = dipamount.getText();
         
         double RecieversOldBalance = Double.parseDouble(recievers_old_balance);
         double DipositAmount = Double.parseDouble(diposit_amount);

 
         double recievers_new_balance = RecieversOldBalance + DipositAmount;
         
                 showRecieversNewBalance.setText(String.valueOf(recievers_new_balance));
    
    }catch(Exception e){
        
          System.err.println(e);
    }
    }
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++     
      
      
      public void Tr(){
              String NIC = sendersNic.getText();
        
        
        try {
  
            
            String sql1 = "SELECT * FROM accholder WHERE nicNo = ?"; 
            pst = conn.prepareStatement(sql1);
            pst.setString(1, NIC);
            rs = pst.executeQuery();

             if (rs.next()) {
             
                     String Name2 = rs.getString("name");   /***** Getting Senders name  from DB *****/
                     summary2.append("\nSender's Name     : " + Name2); 
                     
             
             }
       
        } catch (Exception e) {
            System.err.println(e);
        }
      }
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dipamount = new javax.swing.JTextField();
        sendersNic = new javax.swing.JTextField();
        reciveracc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        summary2 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        showRecieversOldBalance = new javax.swing.JLabel();
        showRecieversNewBalance = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        no = new javax.swing.JButton();
        incorrect = new javax.swing.JButton();
        correct = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM  |  Deposite");

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sender's NIC Number :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 293, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 45)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reciever's Account Number :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 160, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 45)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Amount to Deposit (RS) : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 417, -1, -1));

        dipamount.setBackground(new java.awt.Color(0, 51, 102));
        dipamount.setFont(new java.awt.Font("Tw Cen MT", 1, 40)); // NOI18N
        dipamount.setForeground(new java.awt.Color(255, 255, 255));
        dipamount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(dipamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 425, 316, 45));

        sendersNic.setBackground(new java.awt.Color(0, 51, 102));
        sendersNic.setFont(new java.awt.Font("Tw Cen MT", 1, 40)); // NOI18N
        sendersNic.setForeground(new java.awt.Color(255, 255, 255));
        sendersNic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sendersNic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendersNicActionPerformed(evt);
            }
        });
        jPanel1.add(sendersNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 301, 316, 45));

        reciveracc.setBackground(new java.awt.Color(0, 51, 102));
        reciveracc.setFont(new java.awt.Font("Tw Cen MT", 1, 40)); // NOI18N
        reciveracc.setForeground(new java.awt.Color(255, 255, 255));
        reciveracc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(reciveracc, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 168, 316, 45));

        jButton1.setBackground(new java.awt.Color(41, 136, 41));
        jButton1.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 26)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("previous");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 60));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\home (4).png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1848, 13, 60, 60));

        summary2.setColumns(20);
        summary2.setFont(new java.awt.Font("Monospac821 BT", 0, 18)); // NOI18N
        summary2.setRows(5);
        jScrollPane1.setViewportView(summary2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 110, 850, 660));

        jLabel12.setFont(new java.awt.Font("Swis721 Lt BT", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Old Balance :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 660, 250, 50));

        jLabel11.setFont(new java.awt.Font("Swis721 Lt BT", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("New Balance :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 730, 330, 50));

        showRecieversOldBalance.setBackground(new java.awt.Color(102, 102, 102));
        showRecieversOldBalance.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        showRecieversOldBalance.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(showRecieversOldBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 670, 310, 40));

        showRecieversNewBalance.setBackground(new java.awt.Color(102, 102, 102));
        showRecieversNewBalance.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        showRecieversNewBalance.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(showRecieversNewBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 740, 310, 40));

        ok.setBackground(new java.awt.Color(68, 156, 49));
        ok.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\right (1).png")); // NOI18N
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        jPanel1.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, 45, 45));

        no.setBackground(new java.awt.Color(255, 43, 43));
        no.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\cross.png")); // NOI18N
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        jPanel1.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 490, 45, 45));

        incorrect.setBackground(new java.awt.Color(204, 204, 204));
        incorrect.setFont(new java.awt.Font("Artifakt Element", 1, 36)); // NOI18N
        incorrect.setText("INCORRECT");
        incorrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incorrectActionPerformed(evt);
            }
        });
        jPanel1.add(incorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 800, -1, -1));

        correct.setBackground(new java.awt.Color(0, 0, 0));
        correct.setFont(new java.awt.Font("Artifakt Element", 1, 36)); // NOI18N
        correct.setForeground(new java.awt.Color(204, 204, 204));
        correct.setText("CORRECT");
        correct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctActionPerformed(evt);
            }
        });
        jPanel1.add(correct, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 800, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Deposit.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1920, 1090));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1938, 1127));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sendersNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendersNicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendersNicActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        summaryHead();
        TransactionSummary();
        
        Caculate_New_Balance();
      

    }//GEN-LAST:event_okActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        reciveracc.setText("");
    }//GEN-LAST:event_noActionPerformed

    private void incorrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incorrectActionPerformed

        reciveracc.setText("");
        
        sendersNic.setText("");
        dipamount.setText("");
        summary2.setText("");

    }//GEN-LAST:event_incorrectActionPerformed
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Update the Database +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++     

    private void correctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctActionPerformed

        
         Slip_Request tosliprequest = null;
        try {
            tosliprequest = new Slip_Request();
            
        } catch (Exception e) {
            Logger.getLogger(Withdraw.class.getName()).log(Level.SEVERE, null, e);
        }
        tosliprequest.setVisible(true);
        setVisible(false); 
         dispose();
        
        
        
        /**** Updating the new balance in database ****/
        String accountNoupdate = reciveracc.getText();
        String balanceupdate = showRecieversNewBalance.getText();

        String sql = "update accholder set balance =  '"+balanceupdate+"' where accountNo = '"+accountNoupdate+"'";
        try {
            pst = conn.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Withdraw.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Withdraw.class.getName()).log(Level.SEVERE, null, ex);
        }
        //JOptionPane.showMessageDialog(null, "UPDATED!");
        
       

    }//GEN-LAST:event_correctActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        WDBC toWDBC = null;
        try {
            toWDBC = new WDBC();
            
        } catch (Exception e) {
            Logger.getLogger(WDBC.class.getName()).log(Level.SEVERE, null, e);
        }
        toWDBC.setVisible(true);
        setVisible(false); 
         dispose();     }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Loading toLoading = null;
        try {
            toLoading = new Loading();
            
        } catch (Exception e) {
            Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, null, e);
        }
        toLoading.setVisible(true);
        setVisible(false); 
         dispose();    }//GEN-LAST:event_jButton2ActionPerformed
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
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
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton correct;
    private javax.swing.JTextField dipamount;
    private javax.swing.JButton incorrect;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton no;
    private javax.swing.JButton ok;
    private javax.swing.JTextField reciveracc;
    private javax.swing.JTextField sendersNic;
    private javax.swing.JLabel showRecieversNewBalance;
    private javax.swing.JLabel showRecieversOldBalance;
    private javax.swing.JTextArea summary2;
    // End of variables declaration//GEN-END:variables
}
