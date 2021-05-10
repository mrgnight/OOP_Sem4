/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabSesi8;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User userPertama = new User("2301927916");
        userPertama.Password("Binusmaya");
        userPertama.verify_login(true);
        
        System.out.println("User ID: " + userPertama.getuser_id());
        System.out.println("Pass: " + userPertama.getpassword());
        System.out.println("Login Status: " + userPertama.verify_login());
        
        System.out.println("\n");
    
        Admin adminPertama = new Admin("ADMIN666");
        adminPertama.setAdmin("Gusti", "Gusti@gmail.com");
        adminPertama.Password("Mantab");
        
        System.out.println("Admin ID: " + adminPertama.getuser_id());
        System.out.println("Password: " + adminPertama.getpassword());
        System.out.println("Admin Email: " + adminPertama.getemail());
        System.out.println("Admin Name: " + adminPertama.getname());
        System.out.println("Login Status: " + adminPertama.verify_login());
        
    }
    
}
