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
        
    }
    
    public User(String userId, String password, boolean loginStatus){
        this.user_id = userId;
        this.password = password;
        this.login_status = loginStatus;
    }
    
    public boolean verify_login(){
        return login_status;
    }
    
    public String getuser_id(){
        return user_id;
    }
    
}
