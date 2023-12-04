/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpustakaan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SHOFYYAH
 */
public class InputSkripsi extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
        private Timer refreshTimer;

    public InputSkripsi() {
        try {
            dataBuku = new ArrayList<>();
            initComponents();
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProjectUAS", "postgres", "1234");
            tampil(conn);

            // Membuat dan mengatur timer untuk auto-refresh setiap 5 detik (5000 milidetik)
            refreshTimer = new Timer(5000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tampil(conn);
                }
            });
            refreshTimer.start();
        } catch (SQLException ex) {
            Logger.getLogger(Tampilan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

        public void peringatan(String pesan) {
            JOptionPane.showMessageDialog(rootPane, pesan);
        }
        ArrayList<DataBuku> dataBuku;


        private void tampil(Connection conn) {
            dataBuku.clear();
            EntityManager entityManager = Persistence.createEntityManagerFactory("UASPU").createEntityManager();
            entityManager.getTransaction().begin();
            TypedQuery<Skripsi> querySelectAll = entityManager.createNamedQuery("Skripsi.findAll", Skripsi.class);
            List<Skripsi> results = querySelectAll.getResultList();
            
                DefaultTableModel model = (DefaultTableModel) jTableDataSkripsi.getModel();
                model.setRowCount(0);
                for (DataBuku data : dataBuku) {

                    Object[] baris = new Object[8];
                    baris[0] = data.getId_Skripsi();
                    baris[1] = data.getJudul_Skripsi();
                    baris[2] = data.getFakultas();
                    baris[3] = data.getProgram_Studi();
                    baris[4] = data.getPembimbing();
                    baris[5] = data.getTahun();
                    baris[6] = data.getPenulis();
                    baris[7] = data.getJumlah_Halaman();
                    
                    
                    model.addRow(baris);
                }

            }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonDelete = new javax.swing.JButton();
        jTextFieldIDSkripsi = new javax.swing.JTextField();
        jLabelIDSkripsi = new javax.swing.JLabel();
        jLabelwelcomme = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        jLabelFakultas = new javax.swing.JLabel();
        jTextFieldFakultas = new javax.swing.JTextField();
        jLabelPembimbing = new javax.swing.JLabel();
        jTextFieldPembimbing = new javax.swing.JTextField();
        jLabelTahun = new javax.swing.JLabel();
        jTextFieldSearching = new javax.swing.JTextField();
        jLabelPenulis = new javax.swing.JLabel();
        jTextFieldPenulis = new javax.swing.JTextField();
        jLabelJumlahHalaman = new javax.swing.JLabel();
        jTextFieldJumlahHalaman = new javax.swing.JTextField();
        jButtonSimpan = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDataSkripsi = new javax.swing.JTable();
        jTextFieldTahun = new javax.swing.JTextField();
        jLabelJudulSkripsi = new javax.swing.JLabel();
        jTextFieldJudulSkripsi = new javax.swing.JTextField();
        jLabelProgramStudi = new javax.swing.JLabel();
        jTextFieldProgramStudi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jButtonDelete.setBackground(new java.awt.Color(25, 133, 167));
        jButtonDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete);
        jButtonDelete.setBounds(580, 390, 130, 40);

        jTextFieldIDSkripsi.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(4, 123, 153), null));
        jTextFieldIDSkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDSkripsiActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIDSkripsi);
        jTextFieldIDSkripsi.setBounds(190, 170, 200, 30);

        jLabelIDSkripsi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelIDSkripsi.setForeground(new java.awt.Color(1, 143, 158));
        jLabelIDSkripsi.setText("ID Skripsi");
        getContentPane().add(jLabelIDSkripsi);
        jLabelIDSkripsi.setBounds(80, 170, 95, 20);

        jLabelwelcomme.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelwelcomme.setForeground(new java.awt.Color(6, 128, 153));
        jLabelwelcomme.setText("SKRIPSI");
        getContentPane().add(jLabelwelcomme);
        jLabelwelcomme.setBounds(230, 20, 140, 48);

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\SHOFYYAH\\Downloads\\Tanpa judul (100 x 100 piksel) (1).png")); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 200, 120);

        jLabelFakultas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelFakultas.setForeground(new java.awt.Color(1, 143, 158));
        jLabelFakultas.setText("Fakultas");
        getContentPane().add(jLabelFakultas);
        jLabelFakultas.setBounds(80, 270, 110, 20);

        jTextFieldFakultas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(4, 123, 153), null));
        jTextFieldFakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFakultasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldFakultas);
        jTextFieldFakultas.setBounds(190, 270, 200, 30);

        jLabelPembimbing.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPembimbing.setForeground(new java.awt.Color(1, 143, 158));
        jLabelPembimbing.setText("Pembimbing");
        getContentPane().add(jLabelPembimbing);
        jLabelPembimbing.setBounds(490, 170, 95, 20);

        jTextFieldPembimbing.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(4, 123, 153), null));
        jTextFieldPembimbing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPembimbingActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPembimbing);
        jTextFieldPembimbing.setBounds(620, 170, 200, 30);

        jLabelTahun.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTahun.setForeground(new java.awt.Color(1, 143, 158));
        jLabelTahun.setText("Tahun");
        getContentPane().add(jLabelTahun);
        jLabelTahun.setBounds(490, 220, 95, 20);

        jTextFieldSearching.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(4, 123, 153), null));
        jTextFieldSearching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchingActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSearching);
        jTextFieldSearching.setBounds(590, 100, 200, 30);

        jLabelPenulis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPenulis.setForeground(new java.awt.Color(1, 143, 158));
        jLabelPenulis.setText("Penulis");
        getContentPane().add(jLabelPenulis);
        jLabelPenulis.setBounds(490, 270, 95, 20);

        jTextFieldPenulis.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(4, 123, 153), null));
        jTextFieldPenulis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPenulisActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPenulis);
        jTextFieldPenulis.setBounds(620, 270, 200, 30);

        jLabelJumlahHalaman.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelJumlahHalaman.setForeground(new java.awt.Color(1, 143, 158));
        jLabelJumlahHalaman.setText("Jumlah Halaman");
        getContentPane().add(jLabelJumlahHalaman);
        jLabelJumlahHalaman.setBounds(490, 320, 130, 20);

        jTextFieldJumlahHalaman.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(4, 123, 153), null));
        jTextFieldJumlahHalaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJumlahHalamanActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldJumlahHalaman);
        jTextFieldJumlahHalaman.setBounds(620, 320, 200, 30);

        jButtonSimpan.setBackground(new java.awt.Color(25, 133, 167));
        jButtonSimpan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSimpan.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSimpan.setText("SIMPAN");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSimpan);
        jButtonSimpan.setBounds(280, 390, 130, 40);

        jButtonUpdate.setBackground(new java.awt.Color(25, 133, 167));
        jButtonUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUpdate);
        jButtonUpdate.setBounds(430, 390, 130, 40);

        jTableDataSkripsi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Judul Skripsi", "Program Studi", "Pembimbing", "Tahun", "Penulis", "Jumlah Halaman"
            }
        ));
        jScrollPane2.setViewportView(jTableDataSkripsi);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(190, 510, 620, 170);

        jTextFieldTahun.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(4, 123, 153), null));
        jTextFieldTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTahunActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTahun);
        jTextFieldTahun.setBounds(620, 220, 200, 30);

        jLabelJudulSkripsi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelJudulSkripsi.setForeground(new java.awt.Color(1, 143, 158));
        jLabelJudulSkripsi.setText("Judul Skripsi");
        getContentPane().add(jLabelJudulSkripsi);
        jLabelJudulSkripsi.setBounds(80, 220, 95, 20);

        jTextFieldJudulSkripsi.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(4, 123, 153), null));
        jTextFieldJudulSkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJudulSkripsiActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldJudulSkripsi);
        jTextFieldJudulSkripsi.setBounds(190, 220, 200, 30);

        jLabelProgramStudi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelProgramStudi.setForeground(new java.awt.Color(1, 143, 158));
        jLabelProgramStudi.setText("Program Studi");
        getContentPane().add(jLabelProgramStudi);
        jLabelProgramStudi.setBounds(80, 320, 110, 20);

        jTextFieldProgramStudi.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(4, 123, 153), null));
        jTextFieldProgramStudi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProgramStudiActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldProgramStudi);
        jTextFieldProgramStudi.setBounds(190, 320, 200, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        String IDSkripsi = jTextFieldIDSkripsi.getText().trim();

    // awal persistence
        EntityManager entityManager = Persistence.createEntityManagerFactory("UASPU").createEntityManager();
        entityManager.getTransaction().begin();
        Skripsi s = entityManager.find(Skripsi.class, IDSkripsi);
        entityManager.remove(s);
        entityManager.getTransaction().commit();
        
        jTextFieldIDSkripsi.setText("");
        jTextFieldJudulSkripsi.setText("");
        jTextFieldFakultas.setText("");
        jTextFieldProgramStudi.setText("");
        jTextFieldPembimbing.setText("");
        jTextFieldTahun.setText("");
        jTextFieldPenulis.setText("");
        jTextFieldJumlahHalaman.setText("");
         
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTextFieldIDSkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDSkripsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDSkripsiActionPerformed

    private void jTextFieldFakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFakultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFakultasActionPerformed

    private void jTextFieldPembimbingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPembimbingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPembimbingActionPerformed

    private void jTextFieldSearchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchingActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldSearchingActionPerformed

    private void jTextFieldPenulisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPenulisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPenulisActionPerformed

    private void jTextFieldJumlahHalamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJumlahHalamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJumlahHalamanActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        // TODO add your handling code here:
        String Id_Skripsi = jTextFieldIDSkripsi.getText().trim();
        String Judul_Skripsi = jTextFieldJudulSkripsi.getText();
        String Fakultas = jTextFieldFakultas.getText();
        String ProgramStudi = jTextFieldProgramStudi.getText();
        String Pembimbing = jTextFieldPembimbing.getText();
        String Tahun = jTextFieldTahun.getText();
        String Penulis = jTextFieldPenulis.getText();
        String Jumlah_Halaman = jTextFieldJumlahHalaman.getText();
        
        // awal persistence
        EntityManager entityManager = Persistence.createEntityManagerFactory("UASPU").createEntityManager();
        entityManager.getTransaction().begin();
        Skripsi s = new Skripsi();
        s.setIdSkripsi(Id_Skripsi);
        s.setJudulSkripsi(Judul_Skripsi);
        s.setFakultas(Fakultas);
        s.setProdi(Penulis);
        s.setPembimbing(Pembimbing);
        s.setTahun(WIDTH);
        s.setPenulis(Penulis);
        s.setJumlahHalaman(ALLBITS);
        entityManager.persist(s);
        entityManager.getTransaction().commit();
        // akhir persistence
        jTextFieldIDSkripsi.setText("");
        jTextFieldJudulSkripsi.setText("");
        jTextFieldFakultas.setText("");
        jTextFieldProgramStudi.setText("");
        jTextFieldPembimbing.setText("");
        jTextFieldTahun.setText("");
        jTextFieldPenulis.setText("");
        jTextFieldJumlahHalaman.setText("");
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        String Id_Skripsi = jTextFieldIDSkripsi.getText().trim();
        String Judul_Skripsi = jTextFieldJudulSkripsi.getText();
        String Fakultas = jTextFieldFakultas.getText();
        String ProgramStudi = jTextFieldProgramStudi.getText();
        String Pembimbing = jTextFieldPembimbing.getText();
        String Tahun = jTextFieldTahun.getText();
        String Penulis = jTextFieldPenulis.getText();
        String Jumlah_Halaman = jTextFieldJumlahHalaman.getText();
        // awal persistence
        EntityManager entityManager = Persistence.createEntityManagerFactory("UASPU").createEntityManager();
        entityManager.getTransaction().begin();
        Skripsi s = entityManager.find(Skripsi.class, Id_Skripsi);
        s.setIdSkripsi(Id_Skripsi);
        s.setJudulSkripsi(Judul_Skripsi);
        s.setFakultas(Fakultas);
        s.setProdi(Penulis);
        s.setPembimbing(Pembimbing);
        s.setTahun(WIDTH);
        s.setPenulis(Penulis);
        s.setJumlahHalaman(ALLBITS);
        entityManager.persist(s);
        entityManager.getTransaction().commit();
        // akhir persistence
        jTextFieldIDSkripsi.setText("");
        jTextFieldJudulSkripsi.setText("");
        jTextFieldFakultas.setText("");
        jTextFieldProgramStudi.setText("");
        jTextFieldPembimbing.setText("");
        jTextFieldTahun.setText("");
        jTextFieldPenulis.setText("");
        jTextFieldJumlahHalaman.setText("");
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTextFieldTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTahunActionPerformed

    private void jTextFieldJudulSkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJudulSkripsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJudulSkripsiActionPerformed

    private void jTextFieldProgramStudiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProgramStudiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProgramStudiActionPerformed

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
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Input().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelFakultas;
    private javax.swing.JLabel jLabelIDSkripsi;
    private javax.swing.JLabel jLabelJudulSkripsi;
    private javax.swing.JLabel jLabelJumlahHalaman;
    private javax.swing.JLabel jLabelPembimbing;
    private javax.swing.JLabel jLabelPenulis;
    private javax.swing.JLabel jLabelProgramStudi;
    private javax.swing.JLabel jLabelTahun;
    private javax.swing.JLabel jLabelwelcomme;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDataSkripsi;
    private javax.swing.JTextField jTextFieldFakultas;
    private javax.swing.JTextField jTextFieldIDSkripsi;
    private javax.swing.JTextField jTextFieldJudulSkripsi;
    private javax.swing.JTextField jTextFieldJumlahHalaman;
    private javax.swing.JTextField jTextFieldPembimbing;
    private javax.swing.JTextField jTextFieldPenulis;
    private javax.swing.JTextField jTextFieldProgramStudi;
    private javax.swing.JTextField jTextFieldSearching;
    private javax.swing.JTextField jTextFieldTahun;
    // End of variables declaration//GEN-END:variables
}