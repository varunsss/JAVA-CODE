package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharOfStr {
public static void main(String[] args) {
	
	String someString = "JAVA PROGRAMMER";
	char[] strArray =someString.toCharArray();
	
	//getting distinct characters in strArray
    Set<Character> set = new TreeSet<>();
    for (char c : strArray){
      set.add(c);
    }System.out.println(set);
     set.forEach(System.out::println);//[A, E, G, J, M, O, P, R, V]
	 
   //***********How do you find frequency of each character in a string using Java 8 streams?

 	String inputString = "Java";
 	Map<Character, Long> charCountMap = 
             inputString.chars()
                         .mapToObj(c -> (char) c)
                         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
 	System.out.println(charCountMap);//{a=2, v=1, J=1}
 	    
    //****** words count 
    List<String> strings = Arrays.asList("java scala ruby", "java react spring java");
    String word="java";
    long count=strings.stream().flatMap(s -> Arrays.stream(s.split(" ")))
 		   .filter(w -> w.equals(word))
            .count();
    System.out.println("Occurrences of \"" + word + "\": " + count);//Occurrences of "java": 3
    
   
    
    // **  Print duplicate characters in a string?
    String inputString2 = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
    Set<String> uniqueChars = new HashSet<>();
     
    Set<String> duplicateChars = 
    Arrays.stream(inputString2.split(""))
    .filter(ch -> ! uniqueChars.add(ch))
    .collect(Collectors.toSet());
    System.out.println(duplicateChars);// [a, c, t, e, o]
    
    //***********How do you remove duplicate elements from a list using Java 8 streams?
    List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
    List<String> uniqueStrngs =  listOfStrings.stream().distinct().collect(Collectors.toList());
    System.out.println(uniqueStrngs);//[Java, Python, C#, Kotlin]
    
    //** Given a list of strings, sort them according to increasing order of their length?
    List<String> listOfStrings4 = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
    listOfStrings4.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    
  
    
    //** Reverse each word of a string using Java 8 streams?
	/*
	 * String str = "Java Concept Of The Day"; String reversedStr =
	 * Arrays.stream(str.split(" ")) .map(word -> new StringBuffer(word).reverse())
	 * .collect(Collectors.joining(" ")); System.out.println(reversedStr);
	 */
    
  
    
  //***********How do you find frequency of each element in an array or a list?
 	
   	List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
      
      Map<String, Long> stationeryCountMap = 
              stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      System.out.println(stationeryCountMap);//{Pen=2, Stapler=1, Pencil=2, Note Book=2, Eraser=1}
      
      // ***How do you find the most repeated element in an array?
      List<String> listOfStrings5 = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
      
     Map<String, Long> elementCountMap = listOfStrings5.stream()
     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      
    Entry<String, Long> mostFrequentElement = elementCountMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
    System.out.println("Most Frequent Element : "+mostFrequentElement.getKey());
    System.out.println("Count : "+mostFrequentElement.getValue());
    
    //--------------------------
    System.out.println("------Count : ");
    char[] charArray = new char[]{'a', 'b', 'c', 'a', 'd', 'c'};

    // Create a map to store the count of each character
    Map<Character, Integer> charCountMap1 = new HashMap<>();

    // Iterate over the character array and update the map
    for (char c : charArray) {
        if (charCountMap1.containsKey(c)) {
        	charCountMap1.put(c, charCountMap1.get(c) + 1);
        } else {
        	charCountMap1.put(c, 1);
        }
    }

    // Iterate over the map and print the duplicate characters
    for (Map.Entry<Character, Integer> entry : charCountMap1.entrySet()) {
        if (entry.getValue() > 0) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    
    //--------------------
    System.out.println( " ---------------- "  );
    String input = "JavaJavaEE";

    // convert string into stream
    Map < Character, Long > result = input
        .chars().mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

    result.forEach((k, v) -> {
        if (v > 1) {
            System.out.println(k + " : " + v);
        }
    });
    
	}

}
