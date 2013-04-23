package com.kc.aop.dao;

import com.kc.aop.service.IntroductionDAO;

public class IntroductionService 
{
	IntroductionDAO introductionDAO;
	public IntroductionService()
	{
		introductionDAO = new IntroductionDAO();
	}
	
	public String saveIntro(String data)
	{
		return introductionDAO.saveIntro(data);
	}
}
