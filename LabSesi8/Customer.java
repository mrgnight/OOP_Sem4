/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabSesi8; 

import java.util.HashMap;

/**
 *
 * @author HP
 */
public class Customer extends User{
    private String customer_name;
    private String address;
    private String email;
    private HashMap<String, String> credit_card_info = new HashMap<String, String>();
    private HashMap<String, Integer> shipping_info = new HashMap<String, Integer>();
    
    public Customer(){
        //
    }
    
    public Customer(String user_id, String password){
        super(user_id);
        super.Password(password);
    }
    
    public String getcustomer_name(){
        return customer_name;
    }
    
    public String getaddress(){
        return address;
    }
    
    public String getemail(){
        return email;
    }
    
    public void bill(int bill, int tax){
        shipping_info.put("bill", bill);
        shipping_info.put("tax", tax);
        shipping_info.put("total", calculate_next_bill_amount(bill, tax));
    }
    
    public String bill(){
        return generate_invoice_pdf_version();
    }
    
    public void register(String customerName, String address, String email, String ccNumber, String ccExpiration, String ccLimit){
        this.customer_name = customerName;
        this.address = address;
        this.email = email;
        credit_card_info.put("Credit Card Number", ccNumber);
        credit_card_info.put("Credit Card Expiration Date", ccExpiration);
        credit_card_info.put("Credit Card Limit", ccLimit);
    }
    
    public String login(boolean logStat){
        super.verify_login(logStat);
        return super.verify_login();
    }
    
    public void update_profile(String customerName, String address, String email){
        this.customer_name = customerName;
        this.address = address;
        this.email = email;
    }
    
    private int calculate_next_bill_amount(int bill, int tax){
        return bill + (bill * tax / 100);
    }
    
    private String generate_invoice_pdf_version(){
        return(
                "CC info: \n" + credit_card_info.get("Credit Card Number") + "\n" +
                credit_card_info.get("Credit Card Expiration Date") + "\n" +
                credit_card_info.get("Credit Card Limit")
                + "\n\n" +
                "Shipping info: \nPrice: " + shipping_info.get("total") + "\nTo: " + this.customer_name +
                " at " + this.address
                );
    }
}
