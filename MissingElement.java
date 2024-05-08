package com.logic;

import java.util.Arrays;

public class MissingElement {
	 public static void main(String[] args)
	    {
	        int[] arr={10,9,8,7,5,4,3,1,2};
	        Arrays.sort(arr);
	        for(int i=0;i<arr.length-1;i++)
	        {
	            if(arr[i]+1!=arr[i+1])
	            {
	                System.out.println(arr[i]+1);
	                break;
	            }
	        }
	        System.out.println("---------");
	        int[] arr1={10,9,8,7,5,4,3,1,2};
	        Arrays.sort(arr1);
	        for(int i=0;i<arr1.length-1;i++)
	        {
	            if(i!=arr1[i])
	            {
	                System.out.println(arr1[i]);
	                break;
	            }
	        }
	    }
}
