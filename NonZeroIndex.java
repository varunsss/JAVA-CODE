package com.logic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NonZeroIndex {
	public static int[] NonZeros(int[] A) {
	    return Arrays.stream(A).filter(i -> i != 0).toArray();
	}
	public static void main(String[] args) {
		
		 
		  System.out.println("with java8.................");
		  Integer[] ints = new Integer[] { 0, 5, 2, 0, 1, 5, 6 };
		    List<Integer> list = Arrays.asList(0, 5, 2, 0, 1, 5, 6);
		    Collections.sort(list);
		    Collections.reverse(list);
		    System.err.println(list); // prints [6, 5, 5, 2, 1, 0, 0]
		  
		    System.out.println("without java8.................");
		  int array[] = { 1,4,0,3,0,2,5,0 };  
		  for(int i=0;i<array.length;i++) {
			  int arraytmp=0;
			  if(array[i] !=0) {
			  int temp=array[i];
			  array[i]=array[arraytmp];
			  array[arraytmp]=temp;
			  arraytmp++;
			
			  }
			  System.out.println(array[arraytmp]);
		  }
		  
	}
}
