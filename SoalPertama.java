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
public class SoalPertama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int second, second2, minute;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer for seconds: ");
        second = input.nextInt();
        
        minute = (second / 60);
        second2 = (second % 60);
        System.out.println("\n" +second + " seconds is " + minute + " minutes and " + second2 + " seconds");
    }
    
}
