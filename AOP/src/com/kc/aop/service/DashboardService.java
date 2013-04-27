package com.kc.aop.service;

import java.sql.SQLException;

import com.kc.aop.dao.DashboardDAO;



public class DashboardService 
{
	DashboardDAO dashboardDAO;
	public DashboardService()
	{
		dashboardDAO = new DashboardDAO();
	}
	
	public String readIntroduction() 
	{
		String data=null; 
		try {
			data=dashboardDAO.readIntroduction();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
	public String saveIntro(String data)
	{
		try {
			return dashboardDAO.saveIntro(data);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "failure";
	}
}
