/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author SHOFYYAH
 */
@Embeddable
public class KategoriSkripsiPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_skripsi")
    private String idSkripsi;
    @Basic(optional = false)
    @Column(name = "id_kategori")
    private String idKategori;

    public KategoriSkripsiPK() {
    }

    public KategoriSkripsiPK(String idSkripsi, String idKategori) {
        this.idSkripsi = idSkripsi;
        this.idKategori = idKategori;
    }

    public String getIdSkripsi() {
        return idSkripsi;
    }

    public void setIdSkripsi(String idSkripsi) {
        this.idSkripsi = idSkripsi;
    }

    public String getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(String idKategori) {
        this.idKategori = idKategori;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSkripsi != null ? idSkripsi.hashCode() : 0);
        hash += (idKategori != null ? idKategori.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KategoriSkripsiPK)) {
            return false;
        }
        KategoriSkripsiPK other = (KategoriSkripsiPK) object;
        if ((this.idSkripsi == null && other.idSkripsi != null) || (this.idSkripsi != null && !this.idSkripsi.equals(other.idSkripsi))) {
            return false;
        }
        if ((this.idKategori == null && other.idKategori != null) || (this.idKategori != null && !this.idKategori.equals(other.idKategori))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "perpustakaan.KategoriSkripsiPK[ idSkripsi=" + idSkripsi + ", idKategori=" + idKategori + " ]";
    }
    
}
