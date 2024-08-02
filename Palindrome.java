package com.logic;

public class Palindrome {
	public static void main(String[] args) {
		String original="nayan";
		String reverse = null;
		int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
	    
	      //----------
	      
	      int r,sum=0,temp;    
	      int n=454;//It is the number variable to be checked for palindrome  
	      
	      temp=n;    
	      while(n>0){    
	       r=n%10;  //getting remainder  
	       sum=(sum*10)+r;    
	       n=n/10;    
	      }    
	      if(temp==sum)    
	       System.out.println("palindrome number ");    
	      else    
	       System.out.println("not palindrome");  
	}
}
