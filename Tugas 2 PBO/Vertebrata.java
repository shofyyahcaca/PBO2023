/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasconstructor;

/**
 *
 * @author SHOFYYAH
 */
public class Vertebrata extends Hewan {
    
    public Vertebrata() {
        this.habitat = "Alam";
        this.tulangBelakang = true;
        this.tinggi = 100;
        this.berat = 200;
    }

    public Vertebrata(String habitat) {
        this.habitat = habitat;
        this.tulangBelakang = true;
        this.tinggi = 100;
        this.berat = 200;
    }

    public Vertebrata(boolean tulangBelakang){
        this.tulangBelakang = tulangBelakang;
        this.tulangBelakang = true;
        this.tinggi = 100;
        this.berat = 200;
    }
    
    public Vertebrata(int tinggi) {
        this.tinggi = tinggi;
        this.habitat = "Alam";
        this.tulangBelakang = true;
        this.berat = 200;
    }

    public Vertebrata(double berat) {
        this.berat = berat;
        this.habitat = "Alam";
        this.tulangBelakang = true;
        this.tinggi = 100;
    }
    
    protected boolean tulangBelakang;

    /**
     * @return the tulangBelakang
     */

    public boolean istulangBelakang() {
        return tulangBelakang;
    }



}
