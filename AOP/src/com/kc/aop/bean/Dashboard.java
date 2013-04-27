package com.kc.aop.bean;

import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.kc.aop.service.DashboardService;



@ManagedBean
@SessionScoped
public class Dashboard
{
	DashboardService dashboardService;
	public Dashboard()
	{
		dashboardService = new DashboardService();
	}
	private String intro;

	
	
	public String getIntro() {
		return intro;
	}



	public void setIntro(String intro) {
		this.intro = intro;
	}



	public String saveIntro() throws SQLException
	{
		return dashboardService.saveIntro(this.intro);
	}
}
