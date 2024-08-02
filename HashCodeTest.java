package com.logic;

public class HashCodeTest {

	public static void main(String[] args) {
		Emp emp=new Emp("AA", 1);
		Emp emp1=new Emp("AA", 1);
		if(emp.hashCode() == emp1.hashCode() ) {
			System.out.println("same");
		}else {
			System.out.println("diff");
		}
		
		 
	}
}
