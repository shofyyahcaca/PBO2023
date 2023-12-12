/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author SHOFYYAH
 */
@Entity
@Table(name = "peminjaman")
@NamedQueries({
    @NamedQuery(name = "Peminjaman.findAll", query = "SELECT p FROM Peminjaman p"),
    @NamedQuery(name = "Peminjaman.findByIdPeminjaman", query = "SELECT p FROM Peminjaman p WHERE p.idPeminjaman = :idPeminjaman"),
    @NamedQuery(name = "Peminjaman.findByNamaPeminjam", query = "SELECT p FROM Peminjaman p WHERE p.namaPeminjam = :namaPeminjam"),
    @NamedQuery(name = "Peminjaman.findByKategori", query = "SELECT p FROM Peminjaman p WHERE p.kategori = :kategori"),
    @NamedQuery(name = "Peminjaman.findByNim", query = "SELECT p FROM Peminjaman p WHERE p.nim = :nim"),
    @NamedQuery(name = "Peminjaman.findBySemester", query = "SELECT p FROM Peminjaman p WHERE p.semester = :semester"),
    @NamedQuery(name = "Peminjaman.findByProdi", query = "SELECT p FROM Peminjaman p WHERE p.prodi = :prodi"),
    @NamedQuery(name = "Peminjaman.findByStatus", query = "SELECT p FROM Peminjaman p WHERE p.status = :status"),
    @NamedQuery(name = "Peminjaman.findByTanggalPeminjaman", query = "SELECT p FROM Peminjaman p WHERE p.tanggalPeminjaman = :tanggalPeminjaman"),
    @NamedQuery(name = "Peminjaman.findByTanggalPengembalian", query = "SELECT p FROM Peminjaman p WHERE p.tanggalPengembalian = :tanggalPengembalian")})
public class Peminjaman implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_peminjaman")
    private String idPeminjaman;
    @Column(name = "nama_peminjam")
    private String namaPeminjam;
    @Column(name = "kategori")
    private String kategori;
    @Column(name = "nim")
    private String nim;
    @Column(name = "semester")
    private String semester;
    @Column(name = "prodi")
    private String prodi;
    @Column(name = "status")
    private String status;
    @Column(name = "tanggal_peminjaman")
    private String tanggalPeminjaman;
    @Column(name = "tanggal_pengembalian")
    private String tanggalPengembalian;

    public Peminjaman() {
    }

    public Peminjaman(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public String getId_peminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public String getNama_peminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTanggal_peminjaman() {
        return tanggalPeminjaman;
    }

    public void setTanggalPeminjaman(String tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public String getTanggal_pengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(String tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPeminjaman != null ? idPeminjaman.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peminjaman)) {
            return false;
        }
        Peminjaman other = (Peminjaman) object;
        if ((this.idPeminjaman == null && other.idPeminjaman != null) || (this.idPeminjaman != null && !this.idPeminjaman.equals(other.idPeminjaman))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "perpustakaan.Peminjaman[ idPeminjaman=" + idPeminjaman + " ]";
    }
    
}
