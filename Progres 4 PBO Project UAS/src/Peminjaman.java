/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author SHOFYYAH
 */
@Entity
@Table(name = "peminjaman")
@NamedQueries({
    @NamedQuery(name = "Peminjaman.findAll", query = "SELECT p FROM Peminjaman p"),
    @NamedQuery(name = "Peminjaman.findByNoPeminjaman", query = "SELECT p FROM Peminjaman p WHERE p.noPeminjaman = :noPeminjaman"),
    @NamedQuery(name = "Peminjaman.findByTanggalPeminjaman", query = "SELECT p FROM Peminjaman p WHERE p.tanggalPeminjaman = :tanggalPeminjaman"),
    @NamedQuery(name = "Peminjaman.findByTanggalPengembalian", query = "SELECT p FROM Peminjaman p WHERE p.tanggalPengembalian = :tanggalPengembalian"),
    @NamedQuery(name = "Peminjaman.findByNamaPeminjam", query = "SELECT p FROM Peminjaman p WHERE p.namaPeminjam = :namaPeminjam"),
    @NamedQuery(name = "Peminjaman.findByNim", query = "SELECT p FROM Peminjaman p WHERE p.nim = :nim"),
    @NamedQuery(name = "Peminjaman.findByProdi", query = "SELECT p FROM Peminjaman p WHERE p.prodi = :prodi"),
    @NamedQuery(name = "Peminjaman.findByFakultas", query = "SELECT p FROM Peminjaman p WHERE p.fakultas = :fakultas"),
    @NamedQuery(name = "Peminjaman.findByAngkatan", query = "SELECT p FROM Peminjaman p WHERE p.angkatan = :angkatan"),
    @NamedQuery(name = "Peminjaman.findByNoTelp", query = "SELECT p FROM Peminjaman p WHERE p.noTelp = :noTelp")})
public class Peminjaman implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "no_peminjaman")
    private String noPeminjaman;
    @Column(name = "tanggal_peminjaman")
    @Temporal(TemporalType.DATE)
    private Date tanggalPeminjaman;
    @Column(name = "tanggal_pengembalian")
    @Temporal(TemporalType.DATE)
    private Date tanggalPengembalian;
    @Column(name = "nama_peminjam")
    private String namaPeminjam;
    @Column(name = "nim")
    private String nim;
    @Column(name = "prodi")
    private String prodi;
    @Column(name = "fakultas")
    private String fakultas;
    @Column(name = "angkatan")
    private Integer angkatan;
    @Column(name = "no_telp")
    private Integer noTelp;

    public Peminjaman() {
    }

    public Peminjaman(String noPeminjaman) {
        this.noPeminjaman = noPeminjaman;
    }

    public String getNoPeminjaman() {
        return noPeminjaman;
    }

    public void setNoPeminjaman(String noPeminjaman) {
        this.noPeminjaman = noPeminjaman;
    }

    public Date getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public void setTanggalPeminjaman(Date tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public Integer getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(Integer angkatan) {
        this.angkatan = angkatan;
    }

    public Integer getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(Integer noTelp) {
        this.noTelp = noTelp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noPeminjaman != null ? noPeminjaman.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peminjaman)) {
            return false;
        }
        Peminjaman other = (Peminjaman) object;
        if ((this.noPeminjaman == null && other.noPeminjaman != null) || (this.noPeminjaman != null && !this.noPeminjaman.equals(other.noPeminjaman))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "perpustakaan.Peminjaman[ noPeminjaman=" + noPeminjaman + " ]";
    }
    
}
