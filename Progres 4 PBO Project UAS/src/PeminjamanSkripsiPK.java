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
public class PeminjamanSkripsiPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "no_peminjaman")
    private String noPeminjaman;
    @Basic(optional = false)
    @Column(name = "id_skripsi")
    private String idSkripsi;

    public PeminjamanSkripsiPK() {
    }

    public PeminjamanSkripsiPK(String noPeminjaman, String idSkripsi) {
        this.noPeminjaman = noPeminjaman;
        this.idSkripsi = idSkripsi;
    }

    public String getNoPeminjaman() {
        return noPeminjaman;
    }

    public void setNoPeminjaman(String noPeminjaman) {
        this.noPeminjaman = noPeminjaman;
    }

    public String getIdSkripsi() {
        return idSkripsi;
    }

    public void setIdSkripsi(String idSkripsi) {
        this.idSkripsi = idSkripsi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noPeminjaman != null ? noPeminjaman.hashCode() : 0);
        hash += (idSkripsi != null ? idSkripsi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeminjamanSkripsiPK)) {
            return false;
        }
        PeminjamanSkripsiPK other = (PeminjamanSkripsiPK) object;
        if ((this.noPeminjaman == null && other.noPeminjaman != null) || (this.noPeminjaman != null && !this.noPeminjaman.equals(other.noPeminjaman))) {
            return false;
        }
        if ((this.idSkripsi == null && other.idSkripsi != null) || (this.idSkripsi != null && !this.idSkripsi.equals(other.idSkripsi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "perpustakaan.PeminjamanSkripsiPK[ noPeminjaman=" + noPeminjaman + ", idSkripsi=" + idSkripsi + " ]";
    }
    
}
