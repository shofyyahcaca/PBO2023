/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author SHOFYYAH
 */
@Entity
@Table(name = "kategori_skripsi")
@NamedQueries({
    @NamedQuery(name = "KategoriSkripsi.findAll", query = "SELECT k FROM KategoriSkripsi k"),
    @NamedQuery(name = "KategoriSkripsi.findByIdSkripsi", query = "SELECT k FROM KategoriSkripsi k WHERE k.kategoriSkripsiPK.idSkripsi = :idSkripsi"),
    @NamedQuery(name = "KategoriSkripsi.findByIdKategori", query = "SELECT k FROM KategoriSkripsi k WHERE k.kategoriSkripsiPK.idKategori = :idKategori")})
public class KategoriSkripsi implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected KategoriSkripsiPK kategoriSkripsiPK;

    public KategoriSkripsi() {
    }

    public KategoriSkripsi(KategoriSkripsiPK kategoriSkripsiPK) {
        this.kategoriSkripsiPK = kategoriSkripsiPK;
    }

    public KategoriSkripsi(String idSkripsi, String idKategori) {
        this.kategoriSkripsiPK = new KategoriSkripsiPK(idSkripsi, idKategori);
    }

    public KategoriSkripsiPK getKategoriSkripsiPK() {
        return kategoriSkripsiPK;
    }

    public void setKategoriSkripsiPK(KategoriSkripsiPK kategoriSkripsiPK) {
        this.kategoriSkripsiPK = kategoriSkripsiPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kategoriSkripsiPK != null ? kategoriSkripsiPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KategoriSkripsi)) {
            return false;
        }
        KategoriSkripsi other = (KategoriSkripsi) object;
        if ((this.kategoriSkripsiPK == null && other.kategoriSkripsiPK != null) || (this.kategoriSkripsiPK != null && !this.kategoriSkripsiPK.equals(other.kategoriSkripsiPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "perpustakaan.KategoriSkripsi[ kategoriSkripsiPK=" + kategoriSkripsiPK + " ]";
    }
    
}
