package com.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringTestReverse {

	public static void main(String []arg) {
		
	String str= "Geeks", nstr="";
    char ch;
       
    System.out.print("Original word: ");
    System.out.println("Geeks"); //Example word
       
    for (int i=0; i<str.length(); i++)
    {
      ch= str.charAt(i); //extracts each character
      nstr= ch+nstr; //adds each character in front of the existing string
    }
    
    System.out.println("Reversed word: "+ nstr);
    
   
    
	//////////////////////////---------------------
    
    String input = "GeeksForGeeks";
    
    String rev = "";
    for(int i = input.length() - 1; i >= 0; i--)
    {
    rev = rev + input.charAt(i);
    }
    System.out.println("Reversed word rev: "+ rev);
    
    
    // convert String to character array // by using toCharArray
    char[] try1 = input.toCharArray();

    for (int i = try1.length - 1; i >= 0; i--)
        System.out.print(try1[i]);
 
    //reduction stream operations allow us to produce one single result from a sequence of elements,
    String str1="JAVA";
    String reversed = str1.chars()
    	    .mapToObj(c -> (char)c)
    	    .reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1);	
    
    System.out.println("Reversed word java8: "+ reversed);
    
   // https://stackoverflow.com/questions/47504758/how-can-i-reverse-a-single-string-in-java-8-using-lambda-and-streams
	
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    int result = numbers
      .stream()
      .reduce(0, (subtotal, element) -> subtotal + element);
    System.out.println("result :"+result);
    
    int result1 = numbers.stream().reduce(0, Integer::sum);
    System.out.println("result :"+result1);
    
    //
    String s = "blast";
   String sss= IntStream.range(0, s.length()).           // create index [0 .. s.length - 1] 
       boxed().                               // the next step requires them boxed
       sorted(Collections.reverseOrder()).    // indices in reverse order
       map(i -> String.valueOf(s.charAt(i))). // grab each index's character 
       collect(Collectors.joining());  // join each single-character String into the final String
   System.out.println("sss :"+sss);
   System.out.println("-----------------");
   String revStr="BOOT";
   revStr.chars().mapToObj(c->(char)c).sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
   
   List<String> list = new ArrayList<>(Arrays.asList("bb","aa","zz","zz","pp"));
  // list = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
   list = list.stream().sorted((e1, e2) -> e2.compareTo(e1)).collect(Collectors.toList());
   System.out.println(list);
   
   //
   Map<Object, Long> counts =
		    list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
   System.out.println(counts);
   
   Map<String, Long> counts1 = 
		   list.stream()
	              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
   System.out.println(counts1);
   
   /////
   String inputString = "Java";
	Map<Character, Long> charCountMap = 
            inputString.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	System.out.println(charCountMap);//{a=2, v=1, J=1}
   //  // ***How do you find the most repeated element in an array?
	List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
    
    Map<String, Long> stationeryCountMap = 
            stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.println(stationeryCountMap);//{Pen=2, Stapler=1, Pencil=2, Note Book=2, Eraser=1}
    //
    String string = "abcda";
    string.chars()
            .mapToObj(item -> (char) item)
            .collect(Collectors.toSet()).forEach(System.out::print);
   //
     
	
	}
}


  interface AA{
	
}
  
   abstract class  AAA{
		
  }