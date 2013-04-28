package com.kc.aop.bean;

import com.kc.aop.VO.LoginVO;
import com.kc.aop.service.LoginService;

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
		return "success";
		/*LoginVO loginVO = new LoginVO();
		loginVO.setUsername(this.username);
		loginVO.setPassword(this.password);
		return loginService.checkValidUser(loginVO);*/
	}
	
	
}
