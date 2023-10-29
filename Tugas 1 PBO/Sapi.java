/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo1;

/**
 *
 * @author SHOFYYAH
 */
public class Sapi {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Hewan Sapi = new Hewan();
        Sapi.setNama("Sapi");
        Sapi.setVertebrata("Mamalia");
        Sapi.setAlatPernapasan("paru-paru");
        Sapi.setReproduksi("melahirkan");
        Sapi.setHabitat("Darat");
        Sapi.setMakanan("rumput");
        Sapi.setGolongan("Herbivora");
        Sapi.setMenghasilkan("susu");
        Sapi.setWarna("putih, namun ada juga yang berwarna bercak coklat atau hitam dan warna kuning kemerahan.");
        Sapi.setCiri2("memiliki 4 kaki, badannya memanjang dengan leher pendek. Badan ini dipenuhi rambut halus");
        Sapi.setLainnya("daging, kulit, jeroan, tenaga");
        System.out.println("Nama makhluk hidup : " + Sapi.getNama());
        System.out.println("Termasuk jenis vertebrata : " + Sapi.getVertebrata());
        System.out.println("Bernafas dengan : " + Sapi.getAlatPernapasan());
        System.out.println("Bereproduksi dengan cara : " + Sapi.getReproduksi());
        System.out.println("Habitatnya di : " + Sapi.getHabitat());
        System.out.println("Makan : " + Sapi.getMakanan());
        System.out.println("Bisa menghasilkan : " + Sapi.getMenghasilkan());
        System.out.println("Pada umumnya, sapi berwarna : " + Sapi.getWarna());
        System.out.println("Ciri-ciri dari sapi : " + Sapi.getCiri2());
        System.out.println("yang bisa dimanfaatkan selain susu : " + Sapi.getLainnya());
        System.out.println(Sapi.bergerak());
    }
}
