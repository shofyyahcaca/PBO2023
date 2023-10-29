/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClass;

import tugasinterface.Kantor;
import tugasinterface.Lobby;
import tugasinterface.Kantin;

/**
 *
 * @author SHOFYYAH
 */
public class MainClass {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lobby siCici = new Lobby();
        System.out.println("Cici sekarang ada di " + siCici.getRuangan() + " sedang cek in");
        System.out.println("Cici sudah " + siCici.pulang("malam"));
        System.out.println("                                   ");
        System.out.println("                                   ");
        Kantin Caca = new Kantin();
        System.out.println("Caca adalah seorang " + Caca.getJenisPekerjaan() + ", biasanya dia tidak berkutik dari " + Caca.getJenisPerlengkapan() + ", sekarang dia ada di " + Caca.getRuangan() + ", di kantin " + Caca.getTataTertib());
        System.out.println("Caca sekarang " + Caca.pulang(6.00));
        Caca.bekerja();
        Caca.pebisnis();
        Caca.investor();
        System.out.println("                                   ");
        System.out.println("                                   ");
        Kantor o = new Kantor();
        System.out.println("o " + o.getRuangan() + " Caca berada");
        System.out.println("o Caca " + o.pulang() + " karena sudah rindu dengan kasurnya");
    
    }
    
}
 