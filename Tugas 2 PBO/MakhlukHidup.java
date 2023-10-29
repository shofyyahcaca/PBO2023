/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasconstructor;

/**
 *
 * @author SHOFYYAH
 */
public class MakhlukHidup {
    
    public MakhlukHidup() {
        this.habitat = "Dimana saja";
    }

    public MakhlukHidup(String habitat) {
        this.habitat = habitat;
    }

    public MakhlukHidup(boolean hidup) {
        this.hidup = hidup;
        this.hidup = true;
    }
    
    public MakhlukHidup(int tinggi) {
        this.tinggi = tinggi;
        this.tinggi = 10;
    }
    
    private String nama;
    private String species;
    protected boolean hidup;
    protected String habitat;
    protected int tinggi;

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
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * @return the hidup
     */
    public boolean isHidup() {
        return hidup;
    }

    /**
     * @return the Habitat
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * @return the tinggi
     */
    public int getTinggi() {
        return tinggi;
    }

    /**
     * @return the bertulangBelakang
     */
    
}
