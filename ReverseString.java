package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseString {
	public static void main(String[] args) {
		
	// reverse string in 8
	String reverse="asd";
	reverse.chars().mapToObj(c->(char)c).sorted((a,b)->b.compareTo(a)).forEach(System.out::print);
	System.out.println("-------------");
	//--------
	 String originalString = "Hello, World!";  
     IntStream charStream = originalString.chars();  
     Stream<String> charStringStream = charStream.mapToObj(ch -> String.valueOf((char) ch));  
     String reversedString = charStringStream.reduce((acc, ch) -> ch + acc).orElse("");  
     System.out.println(reversedString); // Output: !dlroW ,olleH  
     System.out.println("----------");
     String input = "abc";
     Comparator<String> comparator = (s1,s2) -> -1;
     String reversed = Arrays.stream(input.split(""))
             .sorted(comparator)
             .collect(Collectors.joining());
     System.out.println(reversed);
     
     String str = "INDIA";
     IntStream.range(0, str.length()).forEach(i -> System.out.print(str.charAt(str.length() - 1 - i)));
    
     String original = "Java";
     System.out.println("----------------");
     String reversed1 = original.chars()  // Convert to stream
         .mapToObj(c -> (char) c)        // Convert to Character stream
         .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
     System.out.println(reversed1);  // Output: avaJ
	}

}
