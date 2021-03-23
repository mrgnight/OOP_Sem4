/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabSesi4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Sesi04_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String temporary;
        
        Scanner inputString = new Scanner(System.in);
        
        String stringArray[] = new String[2];
        
        System.out.println("Enter the Strings containing city name one by one [max 2]:");
        for(int i = 0; i < 2; i++)
        {
            stringArray[i] = inputString.nextLine();
        }
        
            if (stringArray[0].compareTo(stringArray[1])>0) //this is used to switch the strings
            {
                temporary = stringArray[0];
                stringArray[0] = stringArray[1];
                stringArray[1] = temporary;
            }
        
        //Display the strings after sorting them based on alphabetical order
        System.out.print("Strings in Sorted Order: \n");
        for (int i = 0; i <= 2 - 1; i++) 
        {
            System.out.println(stringArray[i]);
        }
    }
    
}
