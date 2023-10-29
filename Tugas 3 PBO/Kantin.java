/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasinterface;

/**
 *
 * @author SHOFYYAH
 */
public class Kantin extends Kantor implements Karyawan, BukaUsaha, TradingSaham {
    
    @Override
    public void pebisnis() {
        System.out.println("Saya juga pebisnis");
    }

    @Override
    public void investor() {
        System.out.println("Saya juga investor");
    }

    @Override
    public void bekerja() {
        System.out.println("Saya pekerja");
    }

    public void setTataTertib() {
        super.setTataTertib("Gabole kasbon");
    }
    
    public void setJenisPekerjaan() {
        super.setJenisPekerjaan("Data Science");
    }
    public void setJenisPerlengkapan() {
        super.setJenisPerlengkapan("Laptop");
    }

    public void setRuangan() {
        super.setRuangan("Kantin bukan Lobby");
    }

    public Kantin() {
        this.setTataTertib();
        this.setJenisPekerjaan();
        this.setJenisPerlengkapan();
        this.setRuangan();
    }
    
}
