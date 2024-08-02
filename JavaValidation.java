package com.logic;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaValidation {

	public static void main(String[] args) {
		boolean trueEmail=isValidEmailAddress("varun@gmail.com");
		System.out.println(trueEmail);
		
		 ArrayList<String> emails = new ArrayList<String>();  
		 emails.add("@yahoo.com");  
	     emails.add("javaTpoint#domain.com");  
	     emails.add("varun12@gmail.com");  
	     String regex = "^(.+)@(.+)$";  
	     
	     Pattern pattern = Pattern.compile(regex);  
	     for(String email : emails){  
	            //Create instance of matcher   
	            Matcher matcher = pattern.matcher(email);  
	            System.out.println(email +" : "+ matcher.matches()+"\n");  
	        }  
	}
	
	 public static  boolean isValidEmailAddress(String email) {
         String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
         java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
         java.util.regex.Matcher m = p.matcher(email);
         return m.matches();
  }
}
