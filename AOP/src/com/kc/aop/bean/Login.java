package com.kc.aop.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.kc.aop.VO.LoginVO;
import com.kc.aop.service.LoginService;

@ManagedBean(name="user")
@SessionScoped
public class Login 
{
	String username;
	String password;
	
	LoginService loginService;
	
	public Login()
	{
		loginService = new LoginService();
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
	
	
	public String checkValidUser()
	{
		LoginVO loginVO = new LoginVO();
		loginVO.setUsername(this.username);
		loginVO.setPassword(this.password);
		
		if (!loginService.checkValidUser(loginVO).equalsIgnoreCase("success")) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Unknown login, try again"));
            return (username = password = null);
        } else {
            return "dashboard?faces-redirect=true";
        }
		
	}
	
	public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "index?faces-redirect=true";
    }
	
	
}
