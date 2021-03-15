/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabSesi3;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Sesi03_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int guessNumber;
        int randomNumber = (int) ((Math.random()*((100-0)+1))+0);;
        
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("Guess a number between 0 and 100!");
            System.out.println("Your guess: ");
            
            guessNumber = input.nextInt();
                
                if(guessNumber > randomNumber){
                    System.out.println("Your guess is too high!");
                    System.out.print("\n");
                }
                else if(guessNumber < randomNumber){
                    System.out.println("Your guess is too low!");
                    System.out.print("\n");
                }
                
                
        } while (guessNumber != randomNumber);
        
        System.out.println("Yes, the number is " + randomNumber + "!");
        System.out.println("Your guess was correct!");
        
    }
    
}
