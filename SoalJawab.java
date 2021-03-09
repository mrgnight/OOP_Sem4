/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabSesi2;

import java.util.*;

/**
 *
 * @author HP
 */
public class SoalJawab {

    public static int lotteryTicketFD;
    public static int lotteryTicketLD;
    public static int prizeNumberFD = (int) ((Math.random()*((9-0)+1))+0);
    public static int prizeNumberLD = (int) ((Math.random()*((9-0)+1))+0);
    
    static int getLottery(){
       
        Scanner inputAnswer = new Scanner(System.in);
        
        System.out.println("Would you like to receive a ticket (Y/N) ?");
        char answer = inputAnswer.next().charAt(0);
        
        if(answer == 'Y'){
            System.out.println("Enter your 2-digit lottery ticket! ");
            System.out.println("First Digit: ");
            lotteryTicketFD = inputAnswer.nextInt();
            System.out.println("Last Digit: ");
            lotteryTicketLD = inputAnswer.nextInt();

            System.out.print("\nYour lottery ticket has been confirmed to be: " + lotteryTicketFD + "" + lotteryTicketLD);
        }
        else if(answer == 'N'){
            System.out.println("Oh... Well, going back to main menu");
    }
        System.out.print("\n\n");
    return lotteryTicketFD & lotteryTicketLD;
}
    ///////////////////////////
    static void getPrize(){
        
        System.out.println("Your lottery ticket was: " + lotteryTicketFD + "" + lotteryTicketLD);
        System.out.println("\nThe jackpot number is: " + prizeNumberFD + "" + prizeNumberLD);
        
        if(lotteryTicketFD == prizeNumberFD && lotteryTicketLD == prizeNumberLD){
            System.out.println("Congrats! You won $10.000");
        }
        else if(lotteryTicketFD == prizeNumberLD && lotteryTicketLD == prizeNumberFD){
            System.out.println("Congrats! You won $3.000");
        }
        else if(lotteryTicketFD == prizeNumberFD ||
                lotteryTicketFD == prizeNumberLD ||
                lotteryTicketLD == prizeNumberFD ||
                lotteryTicketLD == prizeNumberLD){
            System.out.println("Congrats! You won $1.000");
        }
        else{
            System.out.println("HAHAHA Better luck next time!");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputOpt = new Scanner(System.in);
        int option;
        do{
        System.out.println("Welcome to Gusti's Lottery Machine");
        System.out.println("\nWhat would you like to do ?");
        System.out.println("1. Get a lottery ticket");
        System.out.println("2. Check lottery ticket");
        System.out.println("3. Exit");
        System.out.println("You choose: ");
        option = inputOpt.nextInt();
        
        switch(option){
            case 1:{
                getLottery();
                break;
            }
            case 2:{
                getPrize();
                break;
            }
            case 3: {
                System.out.println("Thank you for using my services!");
                break;
            }
        }
        
    } while(option != 3);
    
}
}