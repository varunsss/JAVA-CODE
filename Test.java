package com.logic;

import java.util.Iterator;

class TestSuper {
		/*
		 * TestSuper() {
		 * 
		 * }
		 */
	 TestSuper(int x){System.out.println("super");}

}

 public class Test extends TestSuper{

	Test(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	/*
	 * Test() {
	 * 
	 * }
	 */
	
	  static void bubbleSort(int[] arr) {  
	        int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
	  }
	  static void bubbleSort1(int[] arr) { 
		  int n=arr.length;
		  int temp=0;
		  for (int i = 0; i < n; i++) {
			for (int j = 1; j < n-i; j++) {
				if(arr[j-1] > arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		  
	  }
	  public static void main(String[] args) {
		  int arr[] ={3,60,35,2,45,320,5};  
		  int arr1[] ={30,60,50,20,40,70,10}; 
		  new Test(1).bubbleSort(arr);
		  new Test(1).bubbleSort1(arr1);
		  
		  System.out.println("Array After Bubble Sort");  
          for(int i=0; i < arr.length; i++){  
                  System.out.print(arr[i] + " ");  
          }  
          System.out.println("Array After Bubble1 Sort");  
          for(int i=0; i < arr1.length; i++){  
                  System.out.print(arr1[i] + " ");  
          }  
	}
 }