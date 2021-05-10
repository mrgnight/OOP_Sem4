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
public class Admin extends User {
    private String admin_name;
    private String email;
    
    public Admin(){
        //
    }
    
    public Admin(String user_id){
        super(user_id);
    }
    
    public void setAdmin(String adminName, String email){
        this.admin_name = adminName;
        this.email = email;
    }
    
    public void update_catalog(){
        // ?
    }
    
    public String getemail(){
        return email;
    }
    
    public String getname(){
        return admin_name;
    }
}
