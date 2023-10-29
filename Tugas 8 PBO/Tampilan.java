/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package buku;

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
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author SHOFYYAH
 */
public class Tampilan extends javax.swing.JFrame {

    /**
     * Creates new form Tampilan
     */
    private Timer refreshTimer;

public Tampilan() {
    try {
        dataBuku = new ArrayList<>();
        initComponents();
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Buku", "postgres", "1234");
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
    ArrayList<BukuPOJO> dataBuku;

    private int masukkanData(Connection conn, String isbn, String judul_buku, String tahun_terbit, String penerbit) throws SQLException {
        PreparedStatement pst = (PreparedStatement) conn.prepareStatement("INSERT INTO buku (isbn,judul_buku,tahun_terbit,penerbit) VALUES(?,?,?,?)");
        pst.setString(1, isbn);
        pst.setString(2, judul_buku);
        pst.setString(3, tahun_terbit);
        pst.setString(4, penerbit);
        return pst.executeUpdate();
    }
    
    private int perbaruiData(Connection conn, String isbn, String judul_buku, String tahun_terbit, String penerbit) throws SQLException {
        PreparedStatement pst = (PreparedStatement) conn.prepareStatement("UPDATE buku SET judul_buku=?, tahun_terbit=?, penerbit=? WHERE isbn=?");
        pst.setString(4, isbn);
        pst.setString(1, judul_buku);
        pst.setString(2, tahun_terbit);
        pst.setString(3, penerbit);
        return pst.executeUpdate();
    }

    private int hapusData(Connection conn, String isbn) throws SQLException {
        PreparedStatement pst = (PreparedStatement) conn.prepareStatement("DELETE FROM buku WHERE isbn=?");
        pst.setString(1, isbn);
        return pst.executeUpdate();
    }
    
    private void tampil(Connection conn) {
        dataBuku.clear();
        try {
            String sql = "select * from buku";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                BukuPOJO data = new BukuPOJO();
                data.setISBN(String.valueOf(rs.getObject(1)));
                data.setJudul_Buku(String.valueOf(rs.getObject(2)));
                data.setTahun_Terbit(String.valueOf(rs.getObject(3)));
                data.setPenerbit(String.valueOf(rs.getObject(4)));
                dataBuku.add(data);
            }
            DefaultTableModel model = (DefaultTableModel) jTabledataBuku.getModel();
            model.setRowCount(0);
            for (BukuPOJO data : dataBuku) {

                Object[] baris = new Object[4];
                baris[0] = data.getISBN();
                baris[1] = data.getJudul_Buku();
                baris[2] = data.getTahun_Terbit();
                baris[3] = data.getPenerbit();
                

                model.addRow(baris);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Tampilan.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabelCACALIBRARY = new javax.swing.JLabel();
        jLabelISBN = new javax.swing.JLabel();
        jLabelJudulBuku = new javax.swing.JLabel();
        jLabelTahunTerbit = new javax.swing.JLabel();
        jLabelPenerbit = new javax.swing.JLabel();
        jTextFieldISBN = new javax.swing.JTextField();
        jTextFieldJudulBuku = new javax.swing.JTextField();
        jTextFieldTahunTerbit = new javax.swing.JTextField();
        jTextFieldPenerbit = new javax.swing.JTextField();
        jScrollPanedataBuku = new javax.swing.JScrollPane();
        jTabledataBuku = new javax.swing.JTable();
        jButtonSimpan = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonCetak = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelCACALIBRARY.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelCACALIBRARY.setForeground(new java.awt.Color(255, 255, 204));
        jLabelCACALIBRARY.setText("CACA LIBRARY");
        getContentPane().add(jLabelCACALIBRARY);
        jLabelCACALIBRARY.setBounds(400, 20, 180, 32);

        jLabelISBN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelISBN.setForeground(new java.awt.Color(255, 255, 204));
        jLabelISBN.setText("ISBN");
        getContentPane().add(jLabelISBN);
        jLabelISBN.setBounds(130, 90, 40, 20);

        jLabelJudulBuku.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelJudulBuku.setForeground(new java.awt.Color(255, 255, 204));
        jLabelJudulBuku.setText("JUDUL BUKU");
        getContentPane().add(jLabelJudulBuku);
        jLabelJudulBuku.setBounds(70, 130, 100, 20);

        jLabelTahunTerbit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTahunTerbit.setForeground(new java.awt.Color(255, 255, 204));
        jLabelTahunTerbit.setText("TAHUN TERBIT");
        getContentPane().add(jLabelTahunTerbit);
        jLabelTahunTerbit.setBounds(55, 171, 110, 20);

        jLabelPenerbit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPenerbit.setForeground(new java.awt.Color(255, 255, 204));
        jLabelPenerbit.setText("PENERBIT");
        getContentPane().add(jLabelPenerbit);
        jLabelPenerbit.setBounds(83, 211, 80, 20);

        jTextFieldISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldISBNActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldISBN);
        jTextFieldISBN.setBounds(200, 88, 121, 22);

        jTextFieldJudulBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJudulBukuActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldJudulBuku);
        jTextFieldJudulBuku.setBounds(200, 128, 168, 22);

        jTextFieldTahunTerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTahunTerbitActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTahunTerbit);
        jTextFieldTahunTerbit.setBounds(200, 168, 108, 22);

        jTextFieldPenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPenerbitActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPenerbit);
        jTextFieldPenerbit.setBounds(200, 208, 168, 22);

        jTabledataBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ISBN", "Judul Buku", "Tahun Terbit", "Penerbit"
            }
        ));
        jTabledataBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabledataBukuMouseClicked(evt);
            }
        });
        jScrollPanedataBuku.setViewportView(jTabledataBuku);

        getContentPane().add(jScrollPanedataBuku);
        jScrollPanedataBuku.setBounds(580, 90, 355, 315);

        jButtonSimpan.setBackground(new java.awt.Color(255, 255, 204));
        jButtonSimpan.setText("Simpan");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSimpan);
        jButtonSimpan.setBounds(100, 320, 72, 23);

        jButtonUpdate.setBackground(new java.awt.Color(255, 255, 204));
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUpdate);
        jButtonUpdate.setBounds(190, 320, 72, 23);

        jButtonDelete.setBackground(new java.awt.Color(255, 255, 204));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete);
        jButtonDelete.setBounds(280, 320, 72, 23);

        jButtonCetak.setBackground(new java.awt.Color(255, 255, 204));
        jButtonCetak.setText("Cetak");
        jButtonCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCetak);
        jButtonCetak.setBounds(100, 350, 252, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\SHOFYYAH\\Downloads\\wp10055149-library-aesthetic-wallpapers.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-3, -4, 1100, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldISBNActionPerformed

    private void jTextFieldJudulBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJudulBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJudulBukuActionPerformed

    private void jTextFieldTahunTerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTahunTerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTahunTerbitActionPerformed

    private void jTextFieldPenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPenerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPenerbitActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        // TODO add your handling code here:
        String ISBN = jTextFieldISBN.getText().trim();
        String Judul_Buku = jTextFieldJudulBuku.getText();
        String Tahun_Terbit = jTextFieldTahunTerbit.getText();
        String Penerbit = jTextFieldPenerbit.getText();
        // awal persistence
        EntityManager entityManager = Persistence.createEntityManagerFactory("BukuPU").createEntityManager();
        entityManager.getTransaction().begin();
        Buku b = new Buku();
        b.setIsbn(ISBN);
        b.setJudulBuku(Judul_Buku);
        b.setTahunTerbit(Tahun_Terbit);
        b.setPenerbit(Penerbit);
        entityManager.persist(b);
        entityManager.getTransaction().commit();
        // akhir persistence
        jTextFieldISBN.setText("");
        jTextFieldJudulBuku.setText("");
        jTextFieldTahunTerbit.setText("");
        jTextFieldPenerbit.setText("");
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        String ISBN = jTextFieldISBN.getText().trim();
    String Judul_Buku = jTextFieldJudulBuku.getText();
    String Tahun_Terbit = jTextFieldTahunTerbit.getText();
    String Penerbit = jTextFieldPenerbit.getText();
    // awal persistence
        EntityManager entityManager = Persistence.createEntityManagerFactory("BukuPU").createEntityManager();
        entityManager.getTransaction().begin();
        Buku b = entityManager.find(Buku.class, ISBN);
        b.setIsbn(ISBN);
        b.setJudulBuku(Judul_Buku);
        b.setTahunTerbit(Tahun_Terbit);
        b.setPenerbit(Penerbit);
        entityManager.persist(b);
        entityManager.getTransaction().commit();
        // akhir persistence
        jTextFieldISBN.setText("");
        jTextFieldJudulBuku.setText("");
        jTextFieldTahunTerbit.setText("");
        jTextFieldPenerbit.setText("");
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        String ISBN = jTextFieldISBN.getText().trim();

    // awal persistence
        EntityManager entityManager = Persistence.createEntityManagerFactory("BukuPU").createEntityManager();
        entityManager.getTransaction().begin();
        Buku b = entityManager.find(Buku.class, ISBN);
        entityManager.remove(b);
        entityManager.getTransaction().commit();
        // akhir persistence
        jTextFieldISBN.setText("");
        jTextFieldJudulBuku.setText("");
        jTextFieldTahunTerbit.setText("");
        jTextFieldPenerbit.setText("");
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTabledataBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabledataBukuMouseClicked
        // TODO add your handling code here:
        int baris = jTabledataBuku.rowAtPoint(evt.getPoint());

        String ISBN = jTabledataBuku.getValueAt(baris, 0).toString();
        jTextFieldISBN.setText(ISBN);

        String JudulBuku = jTabledataBuku.getValueAt(baris, 1).toString();
        jTextFieldJudulBuku.setText(JudulBuku);

        String TahunTerbit = jTabledataBuku.getValueAt(baris, 2).toString();
        jTextFieldTahunTerbit.setText(TahunTerbit);
        
        String Penerbit = jTabledataBuku.getValueAt(baris, 3).toString();
        jTextFieldPenerbit.setText(Penerbit);
    }//GEN-LAST:event_jTabledataBukuMouseClicked

    private void jButtonCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCetakActionPerformed
        // TODO add your handling code here:
        String reportPath = "src/buku/reportBuku.jrxml";

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BukuPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Buku> cq = cb.createQuery (Buku.class);
        Root<Buku> bok = cq.from(Buku.class);
        cq.select(bok);

        TypedQuery<Buku> q = em.createQuery(cq);
        List<Buku> list = q.getResultList();
        Query query = em.createQuery("SELECT b FROM Buku b");
        List<Buku> result = query.getResultList();

        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource (result);

        try {
            // TODO add your handling code here:
            JasperReport jr = JasperCompileManager.compileReport(reportPath);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, dataSource);
            JasperViewer vw = new JasperViewer (jp, false);
            vw.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Buku.class.getName()).log(Level.SEVERE, null, ex);
        }

        em.getTransaction().commit();
        em.close();
        emf.close();

    }//GEN-LAST:event_jButtonCetakActionPerformed

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
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tampilan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCetak;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCACALIBRARY;
    private javax.swing.JLabel jLabelISBN;
    private javax.swing.JLabel jLabelJudulBuku;
    private javax.swing.JLabel jLabelPenerbit;
    private javax.swing.JLabel jLabelTahunTerbit;
    private javax.swing.JScrollPane jScrollPanedataBuku;
    private javax.swing.JTable jTabledataBuku;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldJudulBuku;
    private javax.swing.JTextField jTextFieldPenerbit;
    private javax.swing.JTextField jTextFieldTahunTerbit;
    // End of variables declaration//GEN-END:variables
}
