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
@Table(name = "skripsi")
@NamedQueries({
    @NamedQuery(name = "Skripsi.findAll", query = "SELECT s FROM Skripsi s"),
    @NamedQuery(name = "Skripsi.findByIdSkripsi", query = "SELECT s FROM Skripsi s WHERE s.idSkripsi = :idSkripsi"),
    @NamedQuery(name = "Skripsi.findByJudulSkripsi", query = "SELECT s FROM Skripsi s WHERE s.judulSkripsi = :judulSkripsi"),
    @NamedQuery(name = "Skripsi.findByPenulis", query = "SELECT s FROM Skripsi s WHERE s.penulis = :penulis"),
    @NamedQuery(name = "Skripsi.findByProdi", query = "SELECT s FROM Skripsi s WHERE s.prodi = :prodi"),
    @NamedQuery(name = "Skripsi.findByFakultas", query = "SELECT s FROM Skripsi s WHERE s.fakultas = :fakultas"),
    @NamedQuery(name = "Skripsi.findByTahun", query = "SELECT s FROM Skripsi s WHERE s.tahun = :tahun"),
    @NamedQuery(name = "Skripsi.findByPembimbing", query = "SELECT s FROM Skripsi s WHERE s.pembimbing = :pembimbing"),
    @NamedQuery(name = "Skripsi.findByJumlahHalaman", query = "SELECT s FROM Skripsi s WHERE s.jumlahHalaman = :jumlahHalaman")})
public class Skripsi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_skripsi")
    private String idSkripsi;
    @Basic(optional = false)
    @Column(name = "judul_skripsi")
    private String judulSkripsi;
    @Basic(optional = false)
    @Column(name = "penulis")
    private String penulis;
    @Basic(optional = false)
    @Column(name = "prodi")
    private String prodi;
    @Basic(optional = false)
    @Column(name = "fakultas")
    private String fakultas;
    @Basic(optional = false)
    @Column(name = "tahun")
    private String tahun;
    @Basic(optional = false)
    @Column(name = "pembimbing")
    private String pembimbing;
    @Basic(optional = false)
    @Column(name = "jumlah_halaman")
    private String jumlahHalaman;

    public Skripsi() {
    }

    public Skripsi(String idSkripsi) {
        this.idSkripsi = idSkripsi;
    }

    public Skripsi(String idSkripsi, String judulSkripsi, String penulis, String prodi, String fakultas, String tahun, String pembimbing, String jumlahHalaman) {
        this.idSkripsi = idSkripsi;
        this.judulSkripsi = judulSkripsi;
        this.penulis = penulis;
        this.prodi = prodi;
        this.fakultas = fakultas;
        this.tahun = tahun;
        this.pembimbing = pembimbing;
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getIdSkripsi() {
        return idSkripsi;
    }

    public void setIdSkripsi(String idSkripsi) {
        this.idSkripsi = idSkripsi;
    }

    public String getJudulSkripsi() {
        return judulSkripsi;
    }

    public void setJudulSkripsi(String judulSkripsi) {
        this.judulSkripsi = judulSkripsi;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
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

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getPembimbing() {
        return pembimbing;
    }

    public void setPembimbing(String pembimbing) {
        this.pembimbing = pembimbing;
    }

    public String getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(String jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSkripsi != null ? idSkripsi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Skripsi)) {
            return false;
        }
        Skripsi other = (Skripsi) object;
        if ((this.idSkripsi == null && other.idSkripsi != null) || (this.idSkripsi != null && !this.idSkripsi.equals(other.idSkripsi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "perpustakaan.Skripsi[ idSkripsi=" + idSkripsi + " ]";
    }
    
}
