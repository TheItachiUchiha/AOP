package com.kc.aop.service;

public class IntroductionDAO 
{
	public String saveIntro(String data)
	{
		System.out.println(data);
		return "success";
	}
}
