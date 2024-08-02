package com.logic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayDuplicateFrequency {

	public static void main(String[] args) {
		//TreeSet
		//Declare and initialize the array elements
	      int[] array = {1,2,1,1};
	      
	      //sorting an array
	      Arrays.sort(array); //1.1.2
	      
	      //declaring the variables
	      int i,j,frequency;
	      System.out.println("These elements are repeated along with its frequency-");
		
	    //loop for logic implementation
	      for(i=0; i<array.length; i++){
	         frequency = 1;
	         for(j=i+1; j<array.length; j++){
	            if(array[j] == array[i]){
	               frequency++;
	            } else {
	               break;
	            }
	         }
	         
	         i=j-1;
	        
	         //if(frequency > 1){
	         
	            //printing the output
	            System.out.println(array[i] + " --> " + frequency);
	         //}
		
		
	}
	      
	      System.out.println("--------------MAP--------------------------");
	      
	      int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};

	        // Create a map to store the frequency of each element
	        Map<Integer, Integer> frequencyMap = new HashMap<>();

	        // Iterate over the array and update the frequency map
	        for (int element : arr) {
	            if (frequencyMap.containsKey(element)) {
	                frequencyMap.put(element, frequencyMap.get(element) + 1);
	            } else {
	                frequencyMap.put(element, 1);
	            }
	        }

	        // Print the frequency of each element
	        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	        System.out.println("--------------Number--------------------------");
	        List<Integer> numbers = Arrays.asList(new Integer[]{1,2,1,3,4,4});
	        numbers.stream().filter(x-> Collections.frequency(numbers, x) >1)
            .collect(Collectors.toSet()).forEach(System.out::println);
	        System.out.println("--------------end Number--------------------------");
	/*// CountDuplicateChars
	      String str="veer";
	      Map < Character, Long > result = str
	              .chars().mapToObj(c -> (char) c)
	              .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
	      System.out.println(result);
	          result.forEach((k, v) -> {
	             // if (v > 1) {
	                  System.out.println(k + " : " + v);
	              //}
	          });
	     //  
	          String input = "JavaJavaEE";

	          // create a HashMap
	          Map < Character, Integer > countDuplicateMap = new HashMap < > ();

	          // Converts this string to a new character array.
	          char[] charArray = input.toCharArray();

	          for (char c: charArray) {

	              if (countDuplicateMap.containsKey(c)) {

	                  // get value by key and increment it's value by a
	                  countDuplicateMap.put(c, countDuplicateMap.get(c) + 1);
	              } else {
	                  countDuplicateMap.put(c, 1);
	              }
	          }


	          for (Entry < Character, Integer > entry: countDuplicateMap.entrySet()) {

	              if (entry.getValue() > 1) {
	                  System.out.println(entry.getKey() + " : " + entry.getValue());
	              }
	          }
	          
	          
	      
}*/
	      int[] array1 = {1, 2, 3, 4, 5};

	     

	        // Convert the stream to an ArrayList
	        ArrayList<Integer> arrayList = (ArrayList<Integer>) Arrays.stream(array1).boxed().collect(Collectors.toList());

	        // Print the ArrayList
	        System.out.println(arrayList);
	        
	        // Create a DateTimeFormatter object with the desired format
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd, yyyy");

	        // Parse the string into a LocalDate object
	        LocalDate date = LocalDate.parse("March 13, 2024", formatter);

	        // Print the date
	        System.out.println(date);
	        
	        
	        
}}
