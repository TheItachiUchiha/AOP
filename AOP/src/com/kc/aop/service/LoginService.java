package com.kc.aop.service;

import java.sql.SQLException;

import com.kc.aop.VO.LoginVO;
import com.kc.aop.dao.LoginDAO;

public class LoginService {
	
	LoginDAO loginDAO = new LoginDAO();

	public String checkValidUser(LoginVO loginVO) 
	{
		try {
			return loginDAO.checkValidUser(loginVO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "failure";
	}

}
