/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM_Software;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class selectMethod extends javax.swing.JFrame {

    public selectMethod() {
        initComponents();
                setExtendedState(JFrame.MAXIMIZED_BOTH); /*** To stay maximized the jFrame ***/

                
                
       
    }
    
    
        

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        usecard = new javax.swing.JButton();
        withoutcard = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM  |   Card  |  Without Card");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usecard.setBackground(new java.awt.Color(51, 153, 255));
        usecard.setFont(new java.awt.Font("Artifakt Element", 1, 48)); // NOI18N
        usecard.setForeground(new java.awt.Color(255, 255, 255));
        usecard.setText("USE CARD");
        usecard.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        usecard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usecardActionPerformed(evt);
            }
        });
        jPanel1.add(usecard, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, -1, -1));

        withoutcard.setBackground(new java.awt.Color(255, 51, 255));
        withoutcard.setFont(new java.awt.Font("Artifakt Element", 1, 48)); // NOI18N
        withoutcard.setForeground(new java.awt.Color(255, 255, 255));
        withoutcard.setText("WITHOUT CARD");
        withoutcard.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        withoutcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withoutcardActionPerformed(evt);
            }
        });
        jPanel1.add(withoutcard, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 480, -1, -1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Please select your method :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 216, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Select Method.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1950, 1090));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1963, 1136));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usecardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usecardActionPerformed
         WDBC towdbc = null;
        try {
            towdbc = new WDBC();
            
        } catch (Exception e) {
            Logger.getLogger(Withdraw.class.getName()).log(Level.SEVERE, null, e);
        }
        towdbc.setVisible(true);
         setVisible(false); 
         dispose();
    }//GEN-LAST:event_usecardActionPerformed

    private void withoutcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withoutcardActionPerformed
        
        
        Password toPassword= null;
        try {
            toPassword = new Password();
            
        } catch (Exception e) {
            Logger.getLogger(Password.class.getName()).log(Level.SEVERE, null, e);
        }
        toPassword.setVisible(true);
         setVisible(false); 
         dispose();
    }//GEN-LAST:event_withoutcardActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(selectMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selectMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selectMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selectMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selectMethod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton usecard;
    private javax.swing.JButton withoutcard;
    // End of variables declaration//GEN-END:variables
}
