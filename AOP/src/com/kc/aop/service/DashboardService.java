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
	
	public String saveIntro(String data) throws SQLException
	{
		return dashboardDAO.saveIntro(data);
	}
}
