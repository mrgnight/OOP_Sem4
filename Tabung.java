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
public class Tabung {
    double radius = 1;
    double tinggi = 1;
    
    Tabung(){
        //
    }
    
    Tabung(double r, double t){
        radius = r;
        tinggi = t;
    }
    
/* method getVolume() untuk mendapatkaan volume tabung, getLuasAlas() untuk
mendapatkan luas alas tabung, setRadius() untuk memodifikasi radius dan setTinggi() untuk
memodifikasi tinggi tabung. */
    
    double getVolume(){
        return (Math.PI * radius * radius * tinggi);
    }
    
    double getLuasAlas(){
        return (Math.PI * radius * 2);
    }
    
    public void setRadius(double r){
        radius = r;
    }
    
    public void setTinggi(double t){
        tinggi = t;
    }
    
}
