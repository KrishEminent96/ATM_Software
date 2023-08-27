
package ATM_Software;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Summery1 extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;



    public Summery1() {
        initComponents();
        stopMaxButton();
    }

    public void stopMaxButton() {      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        account = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        accNo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        accName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        wAmount = new javax.swing.JLabel();
        correct = new javax.swing.JButton();
        incorrect = new javax.swing.JButton();
        balancedisplay = new javax.swing.JLabel();
        accnodisplay = new javax.swing.JLabel();
        namedisplay = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        amountdisplay1 = new javax.swing.JLabel();

        account.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\wallpaperflare.com_wallpaper (51).jpg")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\wallpaperflare.com_wallpaper (51).jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM  |  Summery");

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 Lt BT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Account Number :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        accNo.setFont(new java.awt.Font("Swis721 Lt BT", 1, 36)); // NOI18N
        accNo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(accNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Swis721 Lt BT", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Account Holder's Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 240, -1, -1));

        accName.setFont(new java.awt.Font("Swis721 Lt BT", 1, 36)); // NOI18N
        accName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(accName, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Swis721 Lt BT", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Account Balance :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, -1, -1));

        wAmount.setFont(new java.awt.Font("Swis721 Lt BT", 1, 36)); // NOI18N
        wAmount.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(wAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 354, -1, -1));

        correct.setBackground(new java.awt.Color(0, 0, 0));
        correct.setFont(new java.awt.Font("Artifakt Element", 1, 36)); // NOI18N
        correct.setForeground(new java.awt.Color(204, 204, 204));
        correct.setText("CORRECT");
        correct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctActionPerformed(evt);
            }
        });
        jPanel1.add(correct, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 600, -1, -1));

        incorrect.setBackground(new java.awt.Color(204, 204, 204));
        incorrect.setFont(new java.awt.Font("Artifakt Element", 1, 36)); // NOI18N
        incorrect.setText("INCORRECT");
        incorrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incorrectActionPerformed(evt);
            }
        });
        jPanel1.add(incorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 600, -1, -1));
        jPanel1.add(balancedisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 370, 30));
        jPanel1.add(accnodisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 370, 30));
        jPanel1.add(namedisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 370, 30));

        jLabel5.setFont(new java.awt.Font("Swis721 Lt BT", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Withdrawal Amount :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 354, -1, -1));
        jPanel1.add(amountdisplay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 370, 30));

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

        setSize(new java.awt.Dimension(1000, 1007));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void incorrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incorrectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incorrectActionPerformed

    private void correctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctActionPerformed
       
             //*** selectCurrentBalance(); ***

    }//GEN-LAST:event_correctActionPerformed

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
            java.util.logging.Logger.getLogger(Summery1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Summery1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Summery1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Summery1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Summery1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accName;
    private javax.swing.JLabel accNo;
    private javax.swing.JLabel accnodisplay;
    private javax.swing.JLabel account;
    private javax.swing.JLabel amountdisplay1;
    private javax.swing.JLabel balancedisplay;
    private javax.swing.JButton correct;
    private javax.swing.JButton incorrect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel namedisplay;
    private javax.swing.JLabel wAmount;
    // End of variables declaration//GEN-END:variables
}
