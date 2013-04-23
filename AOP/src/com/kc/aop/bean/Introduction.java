package com.kc.aop.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.kc.aop.dao.IntroductionService;


@ManagedBean
@SessionScoped
public class Introduction
{
	IntroductionService introductionService;
	public Introduction()
	{
		introductionService = new IntroductionService();
	}
	private String intro;

	
	
	public String getIntro() {
		return intro;
	}



	public void setIntro(String intro) {
		this.intro = intro;
	}



	public String saveIntro()
	{
		return introductionService.saveIntro(this.intro);
	}
}
