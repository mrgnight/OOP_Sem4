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
public class User {
    private String user_id;
    private String password;
    private boolean login_status;
    
    public User(){
        //
    }
    
    public User(String userId){
        this.user_id = userId;
    }
    
    // String password, boolean loginStatus
    public void Password(String password){
        this.password = password;
    }
    
    public void verify_login(boolean loginStatus){
        this.login_status = loginStatus;
    }
    
    public String verify_login(){
        String log;
        if (this.login_status == false){
            log = "Not logged in";
        }
        else{
            log = "Logged in";
        }
        return log;
    }
    
    public String getuser_id(){
        return user_id;
    }
    
    public String getpassword(){
        String decpass;
        decpass = "*".repeat(password.length());
        return decpass;
    }
    
}
