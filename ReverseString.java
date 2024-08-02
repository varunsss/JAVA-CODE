package com.logic;

public class ReverseString {
public static void main(String[] args) {
	
	System.out.println("-------------------------1");
	String strrev1="java";
	String strrev2="";
	char char1;
	for(int i=0;i<=strrev1.length()-1;i++) {
		char1=strrev1.charAt(i);
		strrev2=char1+strrev2;
	}
	System.out.println("First way of Reversed word :"+strrev2);
	
	System.out.println("-------------------------2");
	String strrev11="core";
	String strrev22="";
	  for(int i = strrev11.length() - 1; i >= 0; i--)
	    {
		  strrev22 = strrev22 + strrev11.charAt(i);
	    }
	    System.out.println("Second way of Reversed word : "+ strrev22);
	     
	System.out.println("-------------------------3");
	String strrev3="spring";
	char[] char2 = strrev3.toCharArray();

	for(int i = char2.length - 1; i >= 0; i--) {
		System.err.print(char2[i]);
	}
	System.out.println("-------------------------4");
	String strrev4="xyz";
	strrev4.chars().mapToObj(c->(char)c).sorted((a,b)->b.compareTo(a)).forEach(System.out::print);
	 
}
}
