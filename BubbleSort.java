package com.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {
public static void main(String[] args) {
	
	 int[] data = { 6, 5, 8, 1, 2 };
	    bubbleSortAlgorithm(data);
	    System.out.println("The array performing the Bubble Sort Algorithm is:");
	    System.out.println(Arrays.toString(data));
	    //---------------------------------------
	    
	    int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};  
	    System.out.println("Array elements after sorting:");  
	   
	    for (int i = 0; i < arr.length; i++)   
	    {  
	    	for (int j = i + 1; j < arr.length; j++)   
	    	{  
	    		int tmp = 0;  
	    		if (arr[i] > arr[j])   
	    		{  
	    			tmp = arr[i];  
	    			arr[i] = arr[j];  
	    			arr[j] = tmp;  
	    		}  
	    	}  
	    	//prints the sorted element of the array  
	    	System.out.println(arr[i]);
	    }
}
	static void bubbleSortAlgorithm(int array[]) 
	{
		int size = array.length;
		System.out.println(size);
		for(int i=0; i<size-1; i++) 
		{
			for(int j=0; j<size-1; j++) {  
				
				 if (array[j] > array[j + 1]) { 
					 
				 int temp= array[j];
				 array[j]= array[j+1];
				 array[j+1]= temp;
				 }
			}
		}
	  }
}

 
