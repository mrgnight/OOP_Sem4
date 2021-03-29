/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabSesi5;

/**
 *
 * @author HP
 */
public class TesTabung {

/*buatlah program di file terpisah untuk membuat object dari class Tabung tersebut – object
pertama dengan radius 5 dan tinggi 10 dan yang lain dengan radius 7.5 dan tinggi 15.5.
Tampilkan radius, tinggi, luas alas dan volume tabung */    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabung object = new Tabung();
        
        System.out.println("Radius unmodified tabung: " + object.radius);
        System.out.println("Tinggi unmodified tabung: " + object.tinggi);
        System.out.println("Luas alas unmodified tabung: " + object.getLuasAlas());
        System.out.println("Volume unmodified tabung: " + object.getVolume());
        
        System.out.println("\nSementara tabung dengan rad 5 t 10:\n");
        
        Tabung object1 = new Tabung(5,10);
        
        System.out.println("Radius tabung 1: " + object1.radius);
        System.out.println("Tinggi tabung 1: " + object1.tinggi);
        System.out.println("Luas alas tabung 1: " + object1.getLuasAlas());
        System.out.println("Volume tabung 1: " + object1.getVolume());
        
        System.out.println("\nSementara tabung dengan rad 7.5 dan t 15.5\n");
        
        Tabung object2 = new Tabung(7.5, 15.5);
        
        System.out.println("Radius tabung 2: " + object2.radius);
        System.out.println("Tinggi tabung 2: " + object2.tinggi);
        System.out.println("Luas alas tabung 2: " + object2.getLuasAlas());
        System.out.println("Volume tabung 2: " + object2.getVolume());  
        
    }
    
}
