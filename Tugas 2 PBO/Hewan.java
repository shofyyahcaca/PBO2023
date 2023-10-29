/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasconstructor;

/**
 *
 * @author SHOFYYAH
 */
public class Hewan extends MakhlukHidup {
    
    public Hewan() {
        super();
        this.habitat = "Alam";
        this.hidup = true;
        this.tinggi = 100;
        this.berat = 200;
    }

    public Hewan(String habitat) {
        super("Alam");
        this.habitat = habitat;
        this.hidup = true;
        this.tinggi = 100;
        this.berat = 200;
    }

    public Hewan(boolean hidup) {
        super(true);
        this.habitat = "Alam";
        this.hidup = hidup;
        this.tinggi = 100;
        this.berat = 400;
    }

    public Hewan(int tinggi) {
        super(600);
        this.habitat = "Alam";
        this.hidup = true;
        this.tinggi = tinggi;
        this.berat = 200;
    }

    public Hewan(double berat) {
        this.berat = berat;
        this.berat = 400;
        this.habitat = "Alam";
        this.hidup = true;
        this.tinggi = 600;
    }
    
    private int jumlahKaki;
    protected double berat;

    /**
     * @return the jumlahKaki
     */
    public int getJumlahKaki() {
        return jumlahKaki;
    }

    /**
     * @param jumlahKaki the jumlahKaki to set
     */
    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    /**
     * @return the berat
     */
    public double getBerat() {
        return berat;
    }

}

