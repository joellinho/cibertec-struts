/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.struts.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author admin-joel
 */
public class loginAction extends ActionSupport {
private String username;
private String password;

  public String execute(){
  return SUCCESS;
  }
    
    public String login(){
    if(username.equals("pepe")&&password.equals("123")){
    return SUCCESS;
    }
    return "init";
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
