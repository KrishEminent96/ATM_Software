
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


public class Password extends javax.swing.JFrame {
    
    Connection conn = null;
     PreparedStatement pst = null;
     ResultSet rs = null;

    
    public Password() {
        initComponents();
            conn = dbConnection.getConnection(); 
                    setExtendedState(JFrame.MAXIMIZED_BOTH);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        no = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM  |  Password");

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 45)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Please enter 6-digit password :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 640, -1));

        password.setBackground(new java.awt.Color(13, 13, 37));
        password.setFont(new java.awt.Font("Swis721 BT", 1, 50)); // NOI18N
        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 390, 235, 56));

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

        ok.setBackground(new java.awt.Color(68, 156, 49));
        ok.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\right (1).png")); // NOI18N
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        jPanel1.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 460, 45, 45));

        no.setBackground(new java.awt.Color(255, 43, 43));
        no.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\cross.png")); // NOI18N
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        jPanel1.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 460, 45, 45));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallpaperflare.com_wallpaper (58).jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 2004, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(2022, 1127));
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
         dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        
        String PASSWORD = password.getText();
        
        
        try {
            
            String sql1 = "SELECT * FROM accholder WHERE password = ?"; 
            pst = conn.prepareStatement(sql1);
            pst.setString(1, PASSWORD);
            rs = pst.executeQuery();

             if (rs.next()){
                 String storedPassword = rs.getString("password");
                 
                 if(PASSWORD.equals(storedPassword)){
                     
                     WDBC towdbc = null;
        try {
            towdbc = new WDBC();
            
        } catch (Exception e) {
            Logger.getLogger(Withdraw.class.getName()).log(Level.SEVERE, null, e);
        }
        towdbc.setVisible(true);
         setVisible(false); 
         dispose(); 
             }
           
             
        
        
            }else{
             
                        JOptionPane.showMessageDialog(this, "Incorrect Password");

            
            }
        } catch (SQLException ex) {
            Logger.getLogger(Password.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }//GEN-LAST:event_okActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        password.setText("");
    }//GEN-LAST:event_noActionPerformed

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
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton no;
    private javax.swing.JButton ok;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
