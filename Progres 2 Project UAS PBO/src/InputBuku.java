/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpustakaan;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
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
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author SHOFYYAH
 */
public class InputBuku extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
        private Timer refreshTimer;

    public InputBuku() {
        try {
            dataBuku = new ArrayList<>();
            initComponents();
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProjectUAS", "postgres", "1234");
            tampil();

            // Membuat dan mengatur timer untuk auto-refresh setiap 5 detik (5000 milidetik)
//            refreshTimer = new Timer(5000, new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    tampil();
//                }
//                });
//                refreshTimer.start();
        } catch (SQLException ex) {
            Logger.getLogger(Tampilan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void peringatan(String pesan) {
        JOptionPane.showMessageDialog(rootPane, pesan);
    }
    ArrayList<DataBuku> dataBuku;

    private void tampil() {
        dataBuku.clear();
            EntityManager entityManager = Persistence.createEntityManagerFactory("UASPU").createEntityManager();
            entityManager.getTransaction().begin();
            TypedQuery<Buku> querySelectAll = entityManager.createNamedQuery("Buku.findAll", Buku.class);
            List<Buku> results = querySelectAll.getResultList();
            
                DefaultTableModel model = (DefaultTableModel) jTableDataBuku.getModel();
                model.setRowCount(0);
                for (Buku data : results) {

                    Object[] baris = new Object[6];
                    baris[0] = data.getIsbn();
                    baris[1] = data.getJudul_buku();
                    baris[2] = data.getPenerbit();
                    baris[3] = data.getPengarang();
                    baris[4] = data.getTahun_terbit();
                    baris[5] = data.getJumlah_halaman();
                    
                    model.addRow(baris);
                }
                entityManager.getTransaction().commit();
                entityManager.close();

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
        jButtonDelete = new javax.swing.JButton();
        jLabelwelcomme = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        jTextFieldISBN = new javax.swing.JTextField();
        jLabelJudulBuku = new javax.swing.JLabel();
        jTextFieldJudulBuku = new javax.swing.JTextField();
        jLabelPenerbit = new javax.swing.JLabel();
        jTextFieldPenerbit = new javax.swing.JTextField();
        jLabelPengarang = new javax.swing.JLabel();
        jTextFieldPengarang = new javax.swing.JTextField();
        jLabelTahunTerbit = new javax.swing.JLabel();
        jTextFieldTahunTerbit = new javax.swing.JTextField();
        jButtonSimpan = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDataBuku = new javax.swing.JTable();
        jLabelJumlahHalaman = new javax.swing.JLabel();
        jTextFieldJumlahHalaman = new javax.swing.JTextField();
        jLabelISBN1 = new javax.swing.JLabel();
        jComboBoxKategori = new javax.swing.JComboBox<>();
        jTextFieldSearching = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabelwelcomme1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonDelete.setBackground(new java.awt.Color(25, 133, 167));
        jButtonDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 130, 40));

        jLabelwelcomme.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelwelcomme.setForeground(new java.awt.Color(6, 128, 153));
        jLabelwelcomme.setText("Buku & Skripsi UINSA");
        getContentPane().add(jLabelwelcomme, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 260, -1));

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\SHOFYYAH\\Downloads\\1a.png")); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 60));

        jTextFieldISBN.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(4, 123, 153), null));
        jTextFieldISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldISBNActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 200, 30));

        jLabelJudulBuku.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelJudulBuku.setForeground(new java.awt.Color(1, 143, 158));
        jLabelJudulBuku.setText("Judul Buku");
        getContentPane().add(jLabelJudulBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 95, -1));

        jTextFieldJudulBuku.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(4, 123, 153), null));
        jTextFieldJudulBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJudulBukuActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldJudulBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 200, 30));

        jLabelPenerbit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPenerbit.setForeground(new java.awt.Color(1, 143, 158));
        jLabelPenerbit.setText("Penerbit");
        getContentPane().add(jLabelPenerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 95, -1));

        jTextFieldPenerbit.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(4, 123, 153), null));
        jTextFieldPenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPenerbitActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPenerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 200, 30));

        jLabelPengarang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPengarang.setForeground(new java.awt.Color(1, 143, 158));
        jLabelPengarang.setText("Pengarang");
        getContentPane().add(jLabelPengarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 95, -1));

        jTextFieldPengarang.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(4, 123, 153), null));
        jTextFieldPengarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPengarangActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPengarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 200, 30));

        jLabelTahunTerbit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTahunTerbit.setForeground(new java.awt.Color(1, 143, 158));
        jLabelTahunTerbit.setText("Tahun Terbit");
        getContentPane().add(jLabelTahunTerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 95, -1));

        jTextFieldTahunTerbit.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(4, 123, 153), null));
        jTextFieldTahunTerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTahunTerbitActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTahunTerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 200, 30));

        jButtonSimpan.setBackground(new java.awt.Color(25, 133, 167));
        jButtonSimpan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSimpan.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSimpan.setText("SIMPAN");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 130, 40));

        jButtonUpdate.setBackground(new java.awt.Color(25, 133, 167));
        jButtonUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 130, 40));

        jTableDataBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Kategori", "ISBN", "Judul Buku", "Penerbit", "Pengarang", "Tahun Terbit", "Jumlah Halaman"
            }
        ));
        jTableDataBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDataBukuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableDataBuku);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 660, 170));

        jLabelJumlahHalaman.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelJumlahHalaman.setForeground(new java.awt.Color(1, 143, 158));
        jLabelJumlahHalaman.setText("Jumlah Halaman");
        getContentPane().add(jLabelJumlahHalaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 120, -1));

        jTextFieldJumlahHalaman.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(4, 123, 153), null));
        jTextFieldJumlahHalaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJumlahHalamanActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldJumlahHalaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 200, 30));

        jLabelISBN1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelISBN1.setForeground(new java.awt.Color(1, 143, 158));
        jLabelISBN1.setText("ISBN");
        getContentPane().add(jLabelISBN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 95, -1));

        jComboBoxKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ISBN", "Judul Buku", "Penerbit", "Pengarang", "Tahun Terbit", "Jumlah Halaman", " " }));
        jComboBoxKategori.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(37, 145, 172), null));
        jComboBoxKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxKategoriActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 110, 30));

        jTextFieldSearching.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 107, 153), null));
        jTextFieldSearching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchingActionPerformed(evt);
            }
        });
        jTextFieldSearching.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchingKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldSearching, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 200, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("SHORT BY");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 60, -1));

        jLabelwelcomme1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelwelcomme1.setForeground(new java.awt.Color(6, 128, 153));
        jLabelwelcomme1.setText("BUKU");
        getContentPane().add(jLabelwelcomme1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 110, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("CARI");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 30, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
    String ISBN = jTextFieldISBN.getText().trim();

    // awal persistence
        EntityManager entityManager = Persistence.createEntityManagerFactory("UASPU").createEntityManager();
        entityManager.getTransaction().begin();
        Buku b = entityManager.find(Buku.class, ISBN);
        entityManager.remove(b);
        entityManager.getTransaction().commit();
        
        // awal persistence
        try {
            
        JOptionPane.showMessageDialog(null, "Delete Berhasil", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Delete Gagal : " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        jTextFieldISBN.setText("");
        jTextFieldJudulBuku.setText("");
        jTextFieldPenerbit.setText("");
        jTextFieldPengarang.setText("");
        jTextFieldTahunTerbit.setText("");
        jTextFieldJumlahHalaman.setText("");
        
        DefaultTableModel model = (DefaultTableModel) jTableDataBuku.getModel();
                model.setRowCount(0);
                tampil();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTextFieldISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldISBNActionPerformed

    private void jTextFieldJudulBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJudulBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJudulBukuActionPerformed

    private void jTextFieldPenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPenerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPenerbitActionPerformed

    private void jTextFieldPengarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPengarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPengarangActionPerformed

    private void jTextFieldTahunTerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTahunTerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTahunTerbitActionPerformed

    
    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        // TODO add your handling code here:
        String ISBN = jTextFieldISBN.getText().trim();
        String Judul_Buku = jTextFieldJudulBuku.getText();
        String Penerbit = jTextFieldPenerbit.getText();
        String Pengarang = jTextFieldPengarang.getText();
        String Tahun_Terbit = jTextFieldTahunTerbit.getText();
        String Jumlah_Halaman = jTextFieldJumlahHalaman.getText();
        
        // awal persistence
        try {
            
            EntityManager entityManager = Persistence.createEntityManagerFactory("UASPU").createEntityManager();
            entityManager.getTransaction().begin();
            Buku b = new Buku();
            b.setIsbn(ISBN);
            b.setJudulBuku(Judul_Buku);
            b.setPenerbit(Penerbit);
            b.setPengarang(Pengarang);
            b.setTahunTerbit(Tahun_Terbit);
            b.setJumlahHalaman(Jumlah_Halaman);
            entityManager.persist(b);
            entityManager.getTransaction().commit();

            entityManager.persist(b);
//            entityManager.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Gagal menyimpan data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        // akhir persistence
        jTextFieldISBN.setText("");
        jTextFieldJudulBuku.setText("");
        jTextFieldPenerbit.setText("");
        jTextFieldPengarang.setText("");
        jTextFieldTahunTerbit.setText("");
        jTextFieldJumlahHalaman.setText("");
        
        DefaultTableModel model = (DefaultTableModel) jTableDataBuku.getModel();
                model.setRowCount(0);
                tampil();
        
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        
                
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTextFieldJumlahHalamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJumlahHalamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJumlahHalamanActionPerformed

    private void jTableDataBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDataBukuMouseClicked
        // TODO add your handling code here:
        int baris = jTableDataBuku.rowAtPoint(evt.getPoint());

        String ISBN = jTableDataBuku.getValueAt(baris, 0).toString();
        jTextFieldISBN.setText(ISBN);

        String JudulBuku = jTableDataBuku.getValueAt(baris, 1).toString();
        jTextFieldJudulBuku.setText(JudulBuku);
        
        String Penerbit = jTableDataBuku.getValueAt(baris, 2).toString();
        jTextFieldPenerbit.setText(Penerbit);
        
        String Pengarang = jTableDataBuku.getValueAt(baris, 3).toString();
        jTextFieldPengarang.setText(Pengarang);

        String TahunTerbit = jTableDataBuku.getValueAt(baris, 4).toString();
        jTextFieldTahunTerbit.setText(TahunTerbit);
        
        String JumlahHalaman = jTableDataBuku.getValueAt(baris, 5).toString();
        jTextFieldJumlahHalaman.setText(JumlahHalaman);
        
//        new AddBuku().setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_jTableDataBukuMouseClicked

    private void jComboBoxKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxKategoriActionPerformed

    private void jTextFieldSearchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchingActionPerformed

    private void jTextFieldSearchingKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchingKeyReleased
        // TODO add your handling code here:
        try {
            String selection = (String) jComboBoxKategori.getSelectedItem();
            String searchTerm = jTextFieldSearching.getText().trim();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT b FROM Buku b WHERE ";

            switch (selection) {
                case "ISBN":
                    queryString += "LOWER(b.isbn) LIKE LOWER(:searchTerm)";
                    break;
                case "Judul Buku":
                    queryString += "LOWER(b.judulBuku) LIKE LOWER(:searchTerm)";
                    break;
                case "Penerbit":
                    queryString += "LOWER(b.penerbit) LIKE LOWER(:searchTerm)";
                    break;
                case "Pengarang":
                    queryString += "LOWER(b.pengarang) LIKE LOWER(:searchTerm)";
                    break;
                case "Tahun Terbit":
                    queryString += "LOWER(b.tahunTerbit) LIKE LOWER(:searchTerm)";
                    break;
                case "Jumlah Halaman":
                    queryString += "LOWER(b.jumlahHalaman) LIKE LOWER(:searchTerm)";
                    break;
                default:
                    throw new IllegalArgumentException("No search criteria selected.");
            }

            // Create and execute the JPA query
            EntityManager em = null;

            try {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("UASPU");
                em = emf.createEntityManager();

                TypedQuery<Buku> query = em.createQuery(queryString, Buku.class);
                query.setParameter("searchTerm", "%" + searchTerm + "%");

                List<Buku> results = query.getResultList();

                DefaultTableModel dataModel = new DefaultTableModel();

                // Add columns to the model
                dataModel.addColumn("ISBN");
                dataModel.addColumn("Judul");
                dataModel.addColumn("Penerbit");
                dataModel.addColumn("Pengarang");
                dataModel.addColumn("Tahun Terbit");
                dataModel.addColumn("Jumlah Halaman");
                // ... tambahkan kolom lain sesuai kebutuhan

                // Add rows to the model
                for (Buku result : results) {
                    Object[] rowData = {
                        result.getIsbn(),
                        result.getJudul_buku(),
                        result.getPenerbit(),
                        result.getPengarang(),
                        result.getTahun_terbit(),
                        result.getJumlah_halaman(),};
                    dataModel.addRow(rowData);
                }

                // Set jTableBuku with the created model
                jTableDataBuku.setModel(dataModel);

            } catch (IllegalArgumentException ex) {
                // Handle the case where no search criteria selected
                ex.printStackTrace();
            } catch (Exception ex) {
                // Handle other exceptions
                ex.printStackTrace();
            } finally {
                if (em != null && em.isOpen()) {
                    em.close();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jTextFieldSearchingKeyReleased

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
            java.util.logging.Logger.getLogger(InputBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new InputBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelISBN1;
    private javax.swing.JLabel jLabelJudulBuku;
    private javax.swing.JLabel jLabelJumlahHalaman;
    private javax.swing.JLabel jLabelPenerbit;
    private javax.swing.JLabel jLabelPengarang;
    private javax.swing.JLabel jLabelTahunTerbit;
    private javax.swing.JLabel jLabelwelcomme;
    private javax.swing.JLabel jLabelwelcomme1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDataBuku;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldJudulBuku;
    private javax.swing.JTextField jTextFieldJumlahHalaman;
    private javax.swing.JTextField jTextFieldPenerbit;
    private javax.swing.JTextField jTextFieldPengarang;
    private javax.swing.JTextField jTextFieldSearching;
    private javax.swing.JTextField jTextFieldTahunTerbit;
    // End of variables declaration//GEN-END:variables
}