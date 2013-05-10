package com.kc.aop.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class News
{
		private String noOfFields = "1";
	    private String[] values = new String[100];

	    public String submit() {
	    	
	    	return null;
	        // save values in database
	    }

	    public String getNoOfFields() {
	        return noOfFields;
	    }
	    
	    public String[] getValues() {
	        return this.values;
	    }

		public void setValues(String[] values) {
		this.values = values;
		}

	    public void setNoOfFields(String noOfFields) {
	        try {
	            values = new String[Integer.valueOf(noOfFields)];
	            this.noOfFields = noOfFields;
	        }
	        catch(NumberFormatException ex) {
	            values = new String[1];
	            noOfFields = "1";
	        }
	    }

	   
}
