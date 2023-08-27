
package ATM_Software;

import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Slip_Request extends javax.swing.JFrame {

    public Slip_Request() {
        initComponents();
        stopMaxButton();
    }
    
    
     public void stopMaxButton() {      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
       
    }
//++++++++++++++++++++++++++++++++++++++ Class for creating an object relevant to 'Deposit' class. ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++     
    
     public void New_Object_Respect_to_Deposit() throws PrinterException{
     Deposit deposit = new Deposit();  /* An object relevant to Deposite class */
     
         /* Now below methods of Deposit class can be accessed via that object */  
     deposit.summaryHead();
     deposit.TransactionSummary();
     deposit.Print_the_Slip();

     
   
     
     }

   
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        yes = new javax.swing.JButton();
        no = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM  |  Slip Request");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Do you need a bank slip for this transaction?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        yes.setBackground(new java.awt.Color(0, 0, 102));
        yes.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 48)); // NOI18N
        yes.setForeground(new java.awt.Color(255, 255, 255));
        yes.setText("YES");
        yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesActionPerformed(evt);
            }
        });
        jPanel1.add(yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        no.setBackground(new java.awt.Color(51, 51, 51));
        no.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 48)); // NOI18N
        no.setForeground(new java.awt.Color(255, 255, 255));
        no.setText("NO");
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        jPanel1.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Transcation Success.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 990, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(968, 387));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
       JOptionPane.showMessageDialog(this, "Thank You for Banking With Us !\nCollect Your Card");
       
       Loading toLoading = null;
        try {
            toLoading = new Loading();
            
        } catch (Exception e) {
            Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, null, e);
        }
        toLoading.setVisible(true);
        setVisible(false); 
         dispose();
       
       
       Welcome towelcome = null;
        try {
            towelcome = new Welcome();
            
        } catch (Exception e) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, e);
        }
        towelcome.setVisible(true);
         setVisible(false); 
         dispose();
    }//GEN-LAST:event_noActionPerformed

    private void yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesActionPerformed

        setVisible(false); 
         dispose();
        try {
            New_Object_Respect_to_Deposit(); /* This prints the slip when clicking YES button of this Slip_Request class */
        } catch (PrinterException ex) {
            Logger.getLogger(Slip_Request.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_yesActionPerformed

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
            java.util.logging.Logger.getLogger(Slip_Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Slip_Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Slip_Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Slip_Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Slip_Request().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton no;
    private javax.swing.JButton yes;
    // End of variables declaration//GEN-END:variables
}
