package com.kc.aop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.kc.aop.constants.SQLConstants;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class DashboardDAO {
	
  private Connection connect = null;
  private ResultSet resultSet = null;
  private PreparedStatement prep =null;

  public String readIntroduction() throws Exception {
	  String intro = null;
    try {
     
      Class.forName("com.mysql.jdbc.Driver");
    
      connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/aop","admin", "admin");

    
      prep = connect.prepareStatement("select * from Introduction");
    
      resultSet = prep.executeQuery();
      
      while(resultSet.next())
      {
    	  intro = resultSet.getString(2);
    	  System.out.println(intro);
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
    return intro;
	}

public String saveIntro(String data) throws SQLException {
	
	    try {
	      
	      Class.forName("com.mysql.jdbc.Driver");
	      
	      connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/aop","admin", "admin");

	 
	      prep = connect.prepareStatement(SQLConstants.INTRO_INSERT);
	     
	      prep.setString(1, data);
	      prep.execute();
	     
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
	    return null;
		}





public String readNumberOfNewsItem () throws Exception {
	  String intro = null;
  try {
   
    Class.forName("com.mysql.jdbc.Driver");
  
    connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/aop","admin", "admin");

  
    prep = connect.prepareStatement("SELECT * FROM news");
  
    resultSet = prep.executeQuery();
    
    while(resultSet.next())
    {
  	  intro = resultSet.getString(2);
  	  
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
  return intro;
	}


public String savereadNumberOfNewsItem(String data) throws SQLException {
	
	    try {
	      
	      Class.forName("com.mysql.jdbc.Driver");
	      
	      connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/aop","admin", "admin");

	 
	      prep = connect.prepareStatement(SQLConstants.NEWS_INSERT);
	     
	      prep.setString(1, data);
	      prep.execute();
	     
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
	    return null;
	}

public static void main(String args[]) throws Exception
{
System.out.println(new DashboardDAO().readIntroduction());	
}
}
  

