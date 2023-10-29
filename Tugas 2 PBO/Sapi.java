/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasconstructor;

/**
 *
 * @author SHOFYYAH
 */
public class Sapi extends Vertebrata {

    
    public Sapi() {
        this.habitat = "Darat";
        this.tulangBelakang = true;
        this.tinggi = 100;
        this.berat = 390;
    }

    public Sapi(String habitat) {
        this.habitat = habitat;
        this.tulangBelakang = true;
        this.tinggi = 100;
        this.berat = 390;
    }

    public Sapi(boolean tulangBelakang){
        super(true);
        this.tulangBelakang = tulangBelakang;
        this.tulangBelakang = true;
        this.habitat = "Alam";
        this.tinggi = 100;
        this.berat = 390;
    }

    public Sapi(int tinggi) {
        this.tinggi = tinggi;
        this.habitat = "Darat";
        this.tulangBelakang = true;
        this.berat = 390;
    }

    public Sapi(double berat) {
        this.berat = 390;
        this.habitat = "Darat";
        this.tulangBelakang = true;
        this.tinggi = 100;
    }
    
    
    private String warnaKulit;

    /**
     * @return the warnaKulit
     */
    public String getWarnaKulit() {
        return warnaKulit;
    }

    /**
     * @param warnaKulit the warnaKulit to set
     */
    public void setWarnaKulit(String warnaKulit) {
        this.warnaKulit = warnaKulit;
    }
    
}
