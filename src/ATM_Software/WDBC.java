/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ATM_Software;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author KRISH
 */
public class WDBC extends javax.swing.JFrame {

    /** Creates new form WDBC */
    public WDBC() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); /*** To stay maximized the jFrame***/
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        withdraw = new javax.swing.JButton();
        changepin = new javax.swing.JButton();
        deposite = new javax.swing.JButton();
        balance = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM  |  WDBC");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(41, 136, 41));
        jButton1.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("previous");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 42, -1, 60));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Please select your requirement :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 216, -1, -1));

        withdraw.setBackground(new java.awt.Color(0, 0, 204));
        withdraw.setFont(new java.awt.Font("Artifakt Element", 1, 48)); // NOI18N
        withdraw.setForeground(new java.awt.Color(255, 255, 255));
        withdraw.setText("WITHDRAW");
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });
        jPanel1.add(withdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, -1, -1));

        changepin.setBackground(new java.awt.Color(255, 255, 255));
        changepin.setFont(new java.awt.Font("Artifakt Element", 1, 48)); // NOI18N
        changepin.setText("CHANGE PIN");
        changepin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepinActionPerformed(evt);
            }
        });
        jPanel1.add(changepin, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 560, -1, -1));

        deposite.setBackground(new java.awt.Color(0, 0, 0));
        deposite.setFont(new java.awt.Font("Artifakt Element", 1, 48)); // NOI18N
        deposite.setForeground(new java.awt.Color(255, 255, 255));
        deposite.setText("DEPOSITE");
        deposite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositeActionPerformed(evt);
            }
        });
        jPanel1.add(deposite, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 300, -1));

        balance.setBackground(new java.awt.Color(102, 204, 0));
        balance.setFont(new java.awt.Font("Artifakt Element", 1, 48)); // NOI18N
        balance.setForeground(new java.awt.Color(255, 255, 255));
        balance.setText("ACCOUNT BALANCE");
        balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceActionPerformed(evt);
            }
        });
        jPanel1.add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 680, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home (4).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 20, 60, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallpaperflare.com_wallpaper (48).jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
        selectMethod toselectMethod = null;
        try {
            toselectMethod = new selectMethod();
            
        } catch (Exception e) {
            Logger.getLogger(selectMethod.class.getName()).log(Level.SEVERE, null, e);
        }
        toselectMethod.setVisible(true);
        setVisible(false); 
         dispose();    }//GEN-LAST:event_jButton1ActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
       
        
        Withdraw towithdraw = null;
        try {
            towithdraw = new Withdraw();
            
        } catch (Exception e) {
            Logger.getLogger(Withdraw.class.getName()).log(Level.SEVERE, null, e);
        }
        towithdraw.setVisible(true);
         setVisible(false); 
         dispose();
                        
        
   
        
        
        
        
    }//GEN-LAST:event_withdrawActionPerformed

    private void changepinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepinActionPerformed
        
        ChangePin tochangepin = null;
        try {
            tochangepin = new ChangePin();
            
        } catch (Exception e) {
            Logger.getLogger(ChangePin.class.getName()).log(Level.SEVERE, null, e);
        }
        tochangepin.setVisible(true);
         setVisible(false); 
         dispose();
                   
    }//GEN-LAST:event_changepinActionPerformed

    private void depositeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositeActionPerformed
         Deposit todeposit = null;
        try {
            todeposit = new Deposit();
            
        } catch (Exception e) {
            Logger.getLogger(Withdraw.class.getName()).log(Level.SEVERE, null, e);
        }
        todeposit.setVisible(true);
         setVisible(false); 
         dispose();
    }//GEN-LAST:event_depositeActionPerformed

    private void balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceActionPerformed
                    
         Balance tobalance = null;
        try {
            tobalance = new Balance();
            
        } catch (Exception e) {
            Logger.getLogger(Balance.class.getName()).log(Level.SEVERE, null, e);
        }
        tobalance.setVisible(true);
         setVisible(false); 
         dispose();

    }//GEN-LAST:event_balanceActionPerformed

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
            java.util.logging.Logger.getLogger(WDBC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WDBC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WDBC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WDBC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WDBC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton balance;
    private javax.swing.JButton changepin;
    private javax.swing.JButton deposite;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables

}
