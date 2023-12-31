/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpustakaan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author SHOFYYAH
 */
public class Login extends javax.swing.JFrame {
    
    user.setText("");
    pass.setText("");

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        kosongkan_form();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonSignUp = new javax.swing.JButton();
        jButtonLogin = new javax.swing.JButton();
        jTextFieldPassword = new javax.swing.JTextField();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jLabelwelcomme = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("Skripsi UINSA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 80, 100, 16);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("Buku &");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 60, 50, 16);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 60, 100, 40);

        jButtonSignUp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSignUp.setForeground(new java.awt.Color(48, 140, 168));
        jButtonSignUp.setText("SIGN UP");
        jButtonSignUp.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(56, 131, 168), null));
        jButtonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSignUp);
        jButtonSignUp.setBounds(260, 460, 130, 40);

        jButtonLogin.setBackground(new java.awt.Color(25, 133, 167));
        jButtonLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("LOGIN");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin);
        jButtonLogin.setBounds(100, 460, 130, 40);

        jTextFieldPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(4, 123, 153), null));
        jTextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPassword);
        jTextFieldPassword.setBounds(100, 390, 290, 40);

        jTextFieldUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(4, 123, 153), null));
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsername);
        jTextFieldUsername.setBounds(100, 300, 290, 40);

        jLabelPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(1, 143, 158));
        jLabelPassword.setText("Password");
        getContentPane().add(jLabelPassword);
        jLabelPassword.setBounds(100, 360, 95, 20);

        jLabelUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(1, 143, 158));
        jLabelUsername.setText("Username");
        getContentPane().add(jLabelUsername);
        jLabelUsername.setBounds(100, 270, 95, 20);

        jLabelwelcomme.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelwelcomme.setForeground(new java.awt.Color(6, 128, 153));
        jLabelwelcomme.setText("Login");
        getContentPane().add(jLabelwelcomme);
        jLabelwelcomme.setBounds(200, 200, 110, 48);

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\SHOFYYAH\\Downloads\\1aa.png")); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 905, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // TODO add your handling code here:
        String Username = jTextFieldUsername.getText();
        String Password = new String(pass.getPassword());
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UASPU");
        EntityManager em = emf.createEntityManager();
        
        try {
        em.getTransaction().begin();
            Query query = em.createQuery("SELECT p FROM login.petugas p WHERE p.username = :username AND p.password_petugas = :password");
            query.setParameter("Username", Username);
            query.setParameter("Password", Password);

            java.util.List resultList = query.getResultList();
        
        if (!query.getResultList().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Login Successful!");

            // Open the Dashboard window
            Dashboard dashboardFrame = new Dashboard();
            dashboardFrame.setVisible(true);
            dashboardFrame.setLocationRelativeTo(null);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password!");
        }
    
            em.getTransaction().commit();
        } finally {
            em.close();
            emf.close();
        }
        
                                                
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSignUpActionPerformed

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jTextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JLabel jLabelwelcomme;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
