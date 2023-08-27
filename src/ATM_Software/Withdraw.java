
package ATM_Software;

import Database_Connection.dbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Withdraw extends javax.swing.JFrame {

     Connection conn = null;
     PreparedStatement pst = null;
     ResultSet rs = null;
   
   
    public Withdraw() {
        initComponents();
       
        conn = dbConnection.getConnection();
        setExtendedState(JFrame.MAXIMIZED_BOTH); /*** To stay maximized the jFrame***/
    
    }
    
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++    
    public void TransactionSummary(){
    
     
      try{
         String old_balance = showOldBalance.getText();
         String withdrawal_amount = withamount.getText();
         
         double oldBalance = Double.parseDouble(old_balance);
         double withdrawalAmount = Double.parseDouble(withdrawal_amount);

 
        double new_balance = oldBalance - withdrawalAmount;
        
        if(oldBalance < withdrawalAmount){
            
            JOptionPane.showMessageDialog(null, "Account balance not enough !");
            summary.setText("");
        }
        else{
            //pin.setText("");
         
           
        showNewBalance.setText(String.valueOf(new_balance));
    }
        if(withdrawalAmount >= 200000){
        
           JOptionPane.showMessageDialog(null, "The maximum withdrawal limit is RS.200000.00 !");     
        
        }
        else{
        showNewBalance.setText(String.valueOf(new_balance));
     
        }
    }catch(Exception e){
        
          System.err.println("e");
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        withamount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        no = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        summary = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pin = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        incorrect = new javax.swing.JButton();
        correct = new javax.swing.JButton();
        showOldBalance = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        showNewBalance = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM  |  Withdraw");

        jPanel1.setBackground(new java.awt.Color(51, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Withdrawal Amount (RS) : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        withamount.setFont(new java.awt.Font("Tw Cen MT", 1, 40)); // NOI18N
        withamount.setForeground(new java.awt.Color(0, 0, 153));
        withamount.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        withamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withamountActionPerformed(evt);
            }
        });
        jPanel1.add(withamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 294, 53));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("The maximum withdrawal limit is RS.200000.00.  If you want to withdraw more than that, you have to directly contact the bank.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 970, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("*");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 970, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("*");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        jButton1.setBackground(new java.awt.Color(41, 136, 41));
        jButton1.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("previous");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 44, -1, 60));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\home (4).png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 20, 60, 60));

        no.setBackground(new java.awt.Color(255, 43, 43));
        no.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross.png"))); // NOI18N
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        jPanel1.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 460, 45, 45));

        summary.setEditable(false);
        summary.setBackground(new java.awt.Color(51, 51, 51));
        summary.setColumns(20);
        summary.setFont(new java.awt.Font("Monospac821 BT", 1, 24)); // NOI18N
        summary.setForeground(new java.awt.Color(255, 255, 255));
        summary.setRows(5);
        jScrollPane1.setViewportView(summary);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 160, 760, 370));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Summary");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 45)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Please enter 3-digit pin :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 510, -1));

        pin.setBackground(new java.awt.Color(0, 0, 102));
        pin.setFont(new java.awt.Font("Swis721 BT", 1, 80)); // NOI18N
        pin.setForeground(new java.awt.Color(255, 255, 255));
        pin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        jPanel1.add(pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, 175, 60));

        jLabel11.setFont(new java.awt.Font("Swis721 Lt BT", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("New Balance :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, 330, 50));

        ok.setBackground(new java.awt.Color(68, 156, 49));
        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/right (1).png"))); // NOI18N
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        jPanel1.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 460, 45, 45));

        incorrect.setBackground(new java.awt.Color(204, 204, 204));
        incorrect.setFont(new java.awt.Font("Artifakt Element", 1, 36)); // NOI18N
        incorrect.setText("INCORRECT");
        incorrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incorrectActionPerformed(evt);
            }
        });
        jPanel1.add(incorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 560, -1, -1));

        correct.setBackground(new java.awt.Color(0, 0, 0));
        correct.setFont(new java.awt.Font("Artifakt Element", 1, 36)); // NOI18N
        correct.setForeground(new java.awt.Color(204, 204, 204));
        correct.setText("CORRECT");
        correct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctActionPerformed(evt);
            }
        });
        jPanel1.add(correct, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 560, -1, -1));

        showOldBalance.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        showOldBalance.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(showOldBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 580, 310, 40));

        jLabel12.setFont(new java.awt.Font("Swis721 Lt BT", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Old Balance :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, 250, 50));

        showNewBalance.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        showNewBalance.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(showNewBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 650, 310, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallpaperflare.com_wallpaper (56).jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1050));

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

        setSize(new java.awt.Dimension(1920, 1080));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++    

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed

        String PIN = pin.getText();

        try {
              

            String sql = "SELECT * FROM accholder WHERE pin = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, PIN);

            rs = pst.executeQuery();

            if (rs.next()) {
               
                
              
            String accountNumber = rs.getString("accountNo"); /* getting account number from db */
            String Name = rs.getString("name");               /*     "   name            "     */
            String Balance = rs.getString("balance");         /*     "   balance       "    */
          
            String WithAmount = withamount.getText();   /* getting amount from TEXTFIELD */
            
            showOldBalance.setText(Balance);
            summary.setText(" Account Holder's Name  : " + Name + "\n\n\n\n Account Number         : " + accountNumber + "\n\n\n\n Withdrawal Amount (RS)  : " + WithAmount);
         
            }else {
                
                JOptionPane.showMessageDialog(this, "Incorrect PIN");
            }

        } catch (Exception e) {

            System.err.println(e);
            JOptionPane.showMessageDialog(null, "error");

        }
        
        TransactionSummary();
       
    }//GEN-LAST:event_okActionPerformed

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

    private void withamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withamountActionPerformed

    private void incorrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incorrectActionPerformed
        
        withamount.setText("");
        pin.setText("");
        showOldBalance.setText("");
        showNewBalance.setText("");
        summary.setText("");
        
        
        
        
    }//GEN-LAST:event_incorrectActionPerformed

    private void correctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctActionPerformed

        /**** Updating the new balance in database ****/
        String pinupdate = pin.getText();
        String balanceupdate = showNewBalance.getText(); 
        
         String sql = "update accholder set balance =  '"+balanceupdate+"' where pin = '"+pinupdate+"'";
         try {
             pst = conn.prepareStatement(sql);
         } catch (SQLException ex) {
             Logger.getLogger(Withdraw.class.getName()).log(Level.SEVERE, null, ex);
         }
         try {
             pst.execute();
             
           withdrawalSuccess towithdrawalSuccess = null;
        try {
            towithdrawalSuccess = new withdrawalSuccess();
            
        } catch (Exception e) {
            Logger.getLogger(withdrawalSuccess.class.getName()).log(Level.SEVERE, null, e);
        }
        towithdrawalSuccess.setVisible(true);
         setVisible(false); 
         dispose();
   

        
             
         } catch (SQLException ex) {
             Logger.getLogger(Withdraw.class.getName()).log(Level.SEVERE, null, ex);
         }
                        

                   
        
        
        
    }//GEN-LAST:event_correctActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        pin.setText("");
    }//GEN-LAST:event_noActionPerformed

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
         dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton correct;
    private javax.swing.JButton incorrect;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton no;
    private javax.swing.JButton ok;
    private javax.swing.JPasswordField pin;
    private javax.swing.JLabel showNewBalance;
    private javax.swing.JLabel showOldBalance;
    private javax.swing.JTextArea summary;
    private javax.swing.JTextField withamount;
    // End of variables declaration//GEN-END:variables
}
