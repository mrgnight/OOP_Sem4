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
        /////////////////////////////////////////////////////////////////////
        System.out.println("\n");
        /////////////////////////////////////////////////////////////////////
        Admin adminPertama = new Admin("ADMIN666", "Hallo Cepi");
        adminPertama.setAdmin("Gusti", "Gusti@gmail.com");
        adminPertama.verify_login(true);
        
        System.out.println("Admin ID: " + adminPertama.getuser_id());
        System.out.println("Password: " + adminPertama.getpassword());
        System.out.println("Admin Email: " + adminPertama.getemail());
        System.out.println("Admin Name: " + adminPertama.getname());
        System.out.println("Login Status: " + adminPertama.verify_login());
        /////////////////////////////////////////////////////////////////////
        System.out.println("\n");
        /////////////////////////////////////////////////////////////////////
        Customer customerPertama = new Customer("GG69", "PassGustiLol");
        customerPertama.register("Gusti",
                                 "Jalan Malang",
                                 "gusticustomer@gmail.com",
                                 "6969696969696969",
                                 "24/7/2069",
                                 "500000");
        customerPertama.bill(230000, 10);
        
        System.out.println("Customer ID: " + customerPertama.getuser_id());
        System.out.println("Customer Pass: " + customerPertama.getpassword());
        System.out.println("Customer Name: " + customerPertama.getcustomer_name());
        System.out.println("Address: " + customerPertama.getaddress());
        System.out.println("Email: " + customerPertama.getemail());
        System.out.println("Login Status: " + customerPertama.login(true));
        
        System.out.println("\nUpdated info:");
        customerPertama.update_profile("Gusti S", "Jalan Batu", "gusti.binus@gmail.com");
        System.out.println("Customer Name: " + customerPertama.getcustomer_name());
        System.out.println("Address: " + customerPertama.getaddress());
        System.out.println("Email: " + customerPertama.getemail());
        
        System.out.println("\nInvoice\n" + customerPertama.bill());
        
    }
    
}
