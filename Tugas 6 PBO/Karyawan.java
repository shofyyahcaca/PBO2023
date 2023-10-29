/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tampilandatabase;

/**
 *
 * @author SHOFYYAH
 */
public class Karyawan {

    /**
     * @param args the command line arguments
     */
    public String getId_karyawan() {
        return id_karyawan;
    }

    /**
     * @param nim the nim to set
     */
    public void setId_karyawan(String id_karyawan) {
        this.id_karyawan = id_karyawan;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    /**
     * @return the almat_karyawan
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat_karyawan the alamat_karyawan to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    private String id_karyawan;
    private String nama;
    private String alamat;


}
