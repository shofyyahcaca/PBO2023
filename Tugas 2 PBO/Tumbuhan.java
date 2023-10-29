/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasconstructor;

/**
 *
 * @author SHOFYYAH
 */
public class Tumbuhan extends MakhlukHidup {

    public Tumbuhan() {
        super();
        this.habitat = "Alam";
        this.hidup = true;
        this.tinggi = 600;
    }

    public Tumbuhan(String habitat) {
        super("Alam");
        this.habitat = habitat;
        this.hidup = true;
        this.tinggi = 150;
    }

    public Tumbuhan(boolean hidup) {
        super(true);
        this.habitat = "Alam";
        this.hidup = hidup;
        this.tinggi = 150;
    }

    public Tumbuhan(int tinggi) {
        super(150);
        this.habitat = "Alam";
        this.hidup = true;
        this.tinggi = tinggi;
    }
    
    private String jenisAkar;
    
    /**
     * @return the jenisAkar
     */
    public String getJenisAkar() {
        return jenisAkar;
    }

    /**
     * @param jenisAkar the jenisAkar to set
     */
    public void setJenisAkar(String jenisAkar) {
        this.jenisAkar = jenisAkar;
    }
    
}
