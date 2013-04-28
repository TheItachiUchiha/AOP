package com.kc.aop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kc.aop.VO.LoginVO;

public class LoginDAO {

	 private Connection connect = null;
	 private ResultSet resultSet = null;
	 private PreparedStatement prep =null;

	public String checkValidUser(LoginVO loginVO) throws SQLException {
		try {
		     
		      Class.forName("com.mysql.jdbc.Driver");
		    
		      connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/aop","admin", "admin");

		    
		      prep = connect.prepareStatement("select count(*) from Login where user_name = ? and pass+word = ?");
		    
		      resultSet = prep.executeQuery();
		      
		      if(resultSet.next())
		      {
		    	  return "sucess";
		      }
		    }
		    catch (Exception e) {
				
		    }
		    finally{

				if(connect !=null )
				{
					connect.close();
				}
				if(prep != null )
				{
					prep.close();
				}
				if(resultSet != null)
				{
					resultSet.close();
				}
		    }
		//return "failure";
		return "success";
	}
}
