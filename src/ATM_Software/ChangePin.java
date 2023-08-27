
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


public class ChangePin extends javax.swing.JFrame {

     Connection conn = null;
     PreparedStatement pst = null;
     ResultSet rs = null;
    public ChangePin() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); /*** To stay maximized the jFrame***/
        
        conn = dbConnection.getConnection(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pin = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        newpin = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM  |  Change Pin");

        jPanel1.setBackground(new java.awt.Color(153, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 45)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Please enter the new pin :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        pin.setBackground(new java.awt.Color(204, 204, 204));
        pin.setFont(new java.awt.Font("Swis721 BT", 1, 80)); // NOI18N
        pin.setForeground(new java.awt.Color(51, 51, 51));
        pin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        jPanel1.add(pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 175, 60));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 45)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Please enter the current pin :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 610, -1));

        confirm.setBackground(new java.awt.Color(0, 0, 255));
        confirm.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        confirm.setForeground(new java.awt.Color(255, 255, 255));
        confirm.setText("CONFIRM");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        jPanel1.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 480, -1, -1));

        jButton1.setBackground(new java.awt.Color(41, 136, 41));
        jButton1.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 26)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("previous");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 60));

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\home (4).png")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1730, 20, 60, 60));

        newpin.setBackground(new java.awt.Color(153, 153, 255));
        newpin.setFont(new java.awt.Font("Swis721 Lt BT", 1, 60)); // NOI18N
        newpin.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(newpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 175, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Change Pin.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

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

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed


    String pinOld = pin.getText();  /***** Getting Old Pin from Text Field *****/
    String pinUpdate = newpin.getText();/***** Getting New Pin from Text Field *****/
    String sql = "update accholder set pin =  '"+pinUpdate+"' where pin = '"+pinOld+"'";


    try {
    pst = conn.prepareStatement(sql);
    pst.execute();
        JOptionPane.showMessageDialog(this, "Pin Changed !");

    
    } catch (SQLException ex) {
    Logger.getLogger(Withdraw.class.getName()).log(Level.SEVERE, null, ex);
}

    }//GEN-LAST:event_confirmActionPerformed

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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        Loading toLoading = null;
        try {
            toLoading = new Loading();
            
        } catch (Exception e) {
            Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, null, e);
        }
        toLoading.setVisible(true);
        setVisible(false); 
         dispose();    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField newpin;
    private javax.swing.JPasswordField pin;
    // End of variables declaration//GEN-END:variables
}
