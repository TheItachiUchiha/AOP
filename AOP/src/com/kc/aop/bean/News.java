package com.kc.aop.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.kc.aop.VO.NewsVO;

@ManagedBean
@ViewScoped
public class News
{
		private String noOfFields;
	    private List<NewsVO> values;
	    
	    public News()
	    {
	    	this.values = new ArrayList<NewsVO>();
	    }

	    public String submit() {
	    	
	    	for(NewsVO newsVO : this.values)
	    	{
	    		System.out.println(newsVO.getNews());
	    		System.out.println(newsVO.getLabel());
	    	}
	    	return null;
	        // save values in database
	    }

	    public String getNoOfFields() {
	        return noOfFields;
	    }
	    
	    

	    public List<NewsVO> getValues() {
			return values;
		}

		public void setValues(List<NewsVO> values) {
			this.values = values;
		}

		public void setNoOfFields(String noOfFields) {
			this.values = new ArrayList<NewsVO>();
	        try {
	        	for(int i=0;i<Integer.valueOf(noOfFields);i++)
	        	{
	        		NewsVO newsVO = new NewsVO();
	        		newsVO.setLabel("News "+ i+1);
	        		this.values.add(newsVO);
	        	}
	            this.noOfFields = noOfFields;
	        }
	        catch(NumberFormatException ex) {
	            /*values = new String[1];*/
	            noOfFields = "1";
	        }
	    }

	   
}
