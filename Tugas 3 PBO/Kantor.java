/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasinterface;

/**
 *
 * @author SHOFYYAH
 */
public class Kantor {
    
    public Kantor(){
        this.tataTertib = "sesuai SOP";
        this.jenisPekerjaan = "yang pasti bukan direktur atau CEO";
        this.jenisPerlengkapan = "sesuai kebutuhan pekerja";
        this.ruangan = "dimana pun";
        
    }
    
    /**
     * @return the tataTertib
     */
    public String getTataTertib() {
        return tataTertib;
    }

    /**
     * @param tataTertib the tataTertib to set
     */
    public void setTataTertib(String tataTertib) {
        this.tataTertib = tataTertib;
    }

    /**
     * @return the jenisPekerjaan
     */
    public String getJenisPekerjaan() {
        return jenisPekerjaan;
    }

    /**
     * @param jenisPekerjaan the jenisPekerjaan to set
     */
    public void setJenisPekerjaan(String jenisPekerjaan) {
        this.jenisPekerjaan = jenisPekerjaan;
    }

    /**
     * @return the jenisPerlengkapan
     */
    public String getJenisPerlengkapan() {
        return jenisPerlengkapan;
    }

    /**
     * @param jenisPerlengkapan the jenisPerlengkapan to set
     */
    public void setJenisPerlengkapan(String jenisPerlengkapan) {
        this.jenisPerlengkapan = jenisPerlengkapan;
    }

    /**
     * @return the ruangan
     */
    public String getRuangan() {
        return ruangan;
    }

    /**
     * @param ruangan the ruangan to set
     */
    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }
    
    private String tataTertib = "sesuai SOP";
    private String jenisPekerjaan = "yang pasti bukan direktur atau CEO";;
    private String jenisPerlengkapan = "sesuai kebutuhan";;
    private String ruangan = "dimana pun";
    
    public String pulang() {
        return "mau pulang ";
    }

    public String pulang(String waktu) {
        return "mau pulang " + "waktunya " + waktu;
    }

    public String pulang(int waktu) {
        return "mau pulang, " + "sudah " + String.valueOf(waktu) ;
    }

    public String pulang(double waktu) {
        return "mau pulang " + "pukul " + String.valueOf(waktu) + ", babaiii";
    }

}
