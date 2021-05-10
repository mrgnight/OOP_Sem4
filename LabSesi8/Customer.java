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
public class Customer extends User{
    private String customer_name;
    private String address;
    private String email;
    private String credit_card_info;
    private String shipping_info;
    
    public Customer(){
        
    }
    
    public Customer(String customerName, String address, String email, String creditCardInfo, String shippingInfo){
        this.customer_name = customerName;
        this.address = address;
        this.email = email;
        this.credit_card_info = creditCardInfo;
        this.shipping_info = shippingInfo;
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
    
    public String bill(){
        return "Bill as stated by shipping info: " + shipping_info;
    }
    
    public void register(){
        // ?
    }
    
    public void login(){
        // ?
    }
    
    public void update_profile(String customerName, String address){
        this.customer_name = customerName;
        this.address = address;
    }
    
    private void calculate_next_bill_amount(){
        // ?
    }
    
    private void generate_invoice_pdf_version(){
        // ?
    }
}
