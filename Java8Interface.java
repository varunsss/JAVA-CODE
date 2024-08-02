package com.stream;

import java.util.Arrays;

/*
 * public interface Java8Interface {
 * 
 * default void first(){ System.out.println("first default method"); } default
 * void second(){
 * System.out.println("Second default method on Java 8 interface"); } default
 * void third(){ System.out.println("Third default method"); }
 * 
 * }
 */

public abstract class Java8Interface {

	   public static void main(String[] args) {
		   int arr[] = new int[]{9,10,15,8,49,25,98,32,10};
		   Arrays.stream(arr).filter(i->i%2==0).forEach(System.out::println);
		   int i=Arrays.stream(arr).max().getAsInt();
		   System.out.println("max="+i);
	}

}
