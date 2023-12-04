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
@Table(name = "peminjaman_skripsi")
@NamedQueries({
    @NamedQuery(name = "PeminjamanSkripsi.findAll", query = "SELECT p FROM PeminjamanSkripsi p"),
    @NamedQuery(name = "PeminjamanSkripsi.findByNoPeminjaman", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.peminjamanSkripsiPK.noPeminjaman = :noPeminjaman"),
    @NamedQuery(name = "PeminjamanSkripsi.findByIdSkripsi", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.peminjamanSkripsiPK.idSkripsi = :idSkripsi")})
public class PeminjamanSkripsi implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PeminjamanSkripsiPK peminjamanSkripsiPK;

    public PeminjamanSkripsi() {
    }

    public PeminjamanSkripsi(PeminjamanSkripsiPK peminjamanSkripsiPK) {
        this.peminjamanSkripsiPK = peminjamanSkripsiPK;
    }

    public PeminjamanSkripsi(String noPeminjaman, String idSkripsi) {
        this.peminjamanSkripsiPK = new PeminjamanSkripsiPK(noPeminjaman, idSkripsi);
    }

    public PeminjamanSkripsiPK getPeminjamanSkripsiPK() {
        return peminjamanSkripsiPK;
    }

    public void setPeminjamanSkripsiPK(PeminjamanSkripsiPK peminjamanSkripsiPK) {
        this.peminjamanSkripsiPK = peminjamanSkripsiPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (peminjamanSkripsiPK != null ? peminjamanSkripsiPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeminjamanSkripsi)) {
            return false;
        }
        PeminjamanSkripsi other = (PeminjamanSkripsi) object;
        if ((this.peminjamanSkripsiPK == null && other.peminjamanSkripsiPK != null) || (this.peminjamanSkripsiPK != null && !this.peminjamanSkripsiPK.equals(other.peminjamanSkripsiPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "perpustakaan.PeminjamanSkripsi[ peminjamanSkripsiPK=" + peminjamanSkripsiPK + " ]";
    }
    
}
