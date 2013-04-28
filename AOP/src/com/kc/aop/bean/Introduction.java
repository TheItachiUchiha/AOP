package com.kc.aop.bean;

import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kc.aop.service.DashboardService;



@ManagedBean
@SessionScoped
public class Introduction
{
	DashboardService dashboardService;
	public Introduction()
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

	
	public void doFilter(ServletRequest request,ServletResponse response, FilterChain chain)
            throws java.io.IOException,
                   ServletException
	{
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		Login login = (Login) req.getSession().getAttribute("login");

		if (login == null || login.checkValidUser().equalsIgnoreCase("failure")) {
		    res.sendRedirect(req.getContextPath() + "/index.xhtml");
		} else {
		    chain.doFilter(request, response);
		}
	}
	
	
	public void readIntroduction()
	{
		this.intro = dashboardService.readIntroduction();
	}

	
	
	public String saveIntro() throws SQLException
	{
		return dashboardService.saveIntro(this.intro);
	}
}
