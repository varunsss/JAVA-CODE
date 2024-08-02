package com.logic;

import java.io.IOException;

public class Parent {
  public void show() throws Exception  {
	  System.out.println();
	  
	  try {
		  //ArithmeticException | ArrayIndexOutOfBoundsException e
	  }catch(NullPointerException | ArithmeticException   e) {
		  
	  }
		/*
		 * catch(ArithmeticException e) {
		 * 
		 * }
		 */
  }
  
}


  class Child extends Parent {
	  public void show() throws IOException {
		  System.out.println();
	  }
	}
