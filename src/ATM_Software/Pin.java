
package ATM_Software;

import Database_Connection.dbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Pin extends javax.swing.JFrame {
   Connection conn = null;
   PreparedStatement pst = null;
   ResultSet rs = null;
  

   
    public Pin() {
        initComponents();
        stopMaxButton();
        
        // Initialize the database connection
        conn = dbConnection.getConnection(); // Replace with your actual code to establish a connection
    }
    
    // *_*_*_Deactivating the Maximize button_*_*_* 
        public void stopMaxButton() {      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pin = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        no = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM  |  Pin");

        jPanel1.setBackground(new java.awt.Color(255, 102, 255));
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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 44, -1, 48));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Please enter 3-digit pin :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 216, -1, -1));

        pin.setBackground(new java.awt.Color(0, 0, 102));
        pin.setFont(new java.awt.Font("Swis721 BT", 1, 80)); // NOI18N
        pin.setForeground(new java.awt.Color(255, 255, 255));
        pin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        jPanel1.add(pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 360, 175, 77));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\home (4).png")); // NOI18N
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 40, 60, 60));

        ok.setBackground(new java.awt.Color(68, 156, 49));
        ok.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\right (1).png")); // NOI18N
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        jPanel1.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 448, 45, 45));

        no.setBackground(new java.awt.Color(255, 43, 43));
        no.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\cross.png")); // NOI18N
        jPanel1.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 448, 45, 45));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\Construction & Building Presentation Design.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -80, 1890, 880));

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

        setSize(new java.awt.Dimension(1500, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        
    }//GEN-LAST:event_pinActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
       
        
         String PIN = pin.getText();
        
        try {
            
        String sql = "SELECT * FROM accholder WHERE pin = ?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, PIN);

        rs = pst.executeQuery();
        
        if (rs.next()) {
            // PIN is correct
            JOptionPane.showMessageDialog(this, "PIN Correct");
        }else {
            // PIN is incorrect
            JOptionPane.showMessageDialog(this, "Incorrect PIN");
        }

        
        } catch (Exception e) {
            
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "error");
            
        }
   
    }//GEN-LAST:event_okActionPerformed

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
            java.util.logging.Logger.getLogger(Pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton no;
    private javax.swing.JButton ok;
    private javax.swing.JPasswordField pin;
    // End of variables declaration//GEN-END:variables
}
