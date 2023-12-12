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
@Table(name = "kategori_buku")
@NamedQueries({
    @NamedQuery(name = "KategoriBuku.findAll", query = "SELECT k FROM KategoriBuku k"),
    @NamedQuery(name = "KategoriBuku.findByIsbn", query = "SELECT k FROM KategoriBuku k WHERE k.kategoriBukuPK.isbn = :isbn"),
    @NamedQuery(name = "KategoriBuku.findByIdKategori", query = "SELECT k FROM KategoriBuku k WHERE k.kategoriBukuPK.idKategori = :idKategori")})
public class KategoriBuku implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected KategoriBukuPK kategoriBukuPK;

    public KategoriBuku() {
    }

    public KategoriBuku(KategoriBukuPK kategoriBukuPK) {
        this.kategoriBukuPK = kategoriBukuPK;
    }

    public KategoriBuku(String isbn, String idKategori) {
        this.kategoriBukuPK = new KategoriBukuPK(isbn, idKategori);
    }

    public KategoriBukuPK getKategoriBukuPK() {
        return kategoriBukuPK;
    }

    public void setKategoriBukuPK(KategoriBukuPK kategoriBukuPK) {
        this.kategoriBukuPK = kategoriBukuPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kategoriBukuPK != null ? kategoriBukuPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KategoriBuku)) {
            return false;
        }
        KategoriBuku other = (KategoriBuku) object;
        if ((this.kategoriBukuPK == null && other.kategoriBukuPK != null) || (this.kategoriBukuPK != null && !this.kategoriBukuPK.equals(other.kategoriBukuPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "perpustakaan.KategoriBuku[ kategoriBukuPK=" + kategoriBukuPK + " ]";
    }
    
}
