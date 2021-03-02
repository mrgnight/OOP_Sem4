/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabSesi1;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SoalKedua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] days = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        String today;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan hari yang diinginkan: ");
        today = input.nextLine();
        
        System.out.println("Maka 1000 hari kemudian adalah hari: ");
        
        if (today.equals(days[0])){
            System.out.println(days[6]);
        }
        else if (today.equals(days[1])){
            System.out.println(days[0]);
        }
        else if (today.equals(days[2])){
            System.out.println(days[1]);
        }
        else if (today.equals(days[3])){
            System.out.println(days[2]);
        }
        else if (today.equals(days[4])){
            System.out.println(days[3]); 
        }
        else if (today.equals(days[5])){
            System.out.println(days[4]);
        }
        else if (today.equals(days[6])){
            System.out.println(days[5]);
        }
        else {
            System.out.println("Error");
        }
    }
}
