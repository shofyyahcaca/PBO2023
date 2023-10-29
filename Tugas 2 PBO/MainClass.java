/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import tugasconstructor.Sapi;
import tugasconstructor.Vertebrata;
import tugasconstructor.Hewan;


/**
 *
 * @author SHOFYYAH
 */
public class MainClass {
    
    public static void main(String[] args) {
        Vertebrata Elang = new Vertebrata("Udara");
        Elang.setNama("Elang");
        Elang.setSpecies("Haliaeetus pelagicus");
        Vertebrata Komodo = new Vertebrata("Daratan");
        Komodo.setNama("Komodo");
        Komodo.setSpecies("Varanus komodoensis");
        Komodo.setJumlahKaki(4);
        Vertebrata Sapi = new Vertebrata("Daratan");
        Sapi.setNama("Sapi");
        Sapi.setSpecies("bos Taurus");
        Sapi.setJumlahKaki(4);
       
        
        System.out.println("Nama : " + Elang.getNama() + ", Species : " + Elang.getSpecies() + ", Habitat : " + Elang.getHabitat() + ", Tinggi : " + Elang.getTinggi() + " cm" + ", Berat : " + Elang.getBerat() + " kg");
        System.out.println("Nama : " + Komodo.getNama() + ", Species : " + Komodo.getSpecies() + ", Habitat : " + Komodo.getHabitat() + ", Tinggi : " + Komodo.getTinggi() + " cm" + ", Berat : " + Komodo.getBerat() + " kg");
        System.out.println("Nama : " + Sapi.getNama() + ", Species : " + Sapi.getSpecies() + ", Habitat : " + Sapi.getHabitat() + ", Bertulang belakang/tidak: " + Sapi.istulangBelakang() + ", Tinggi : " + Sapi.getTinggi() + " cm" + ", Berat : " + Sapi.getBerat() + " kg" + ", Jumlah Kaki : " + Sapi.getJumlahKaki());
        
    }
    
}
