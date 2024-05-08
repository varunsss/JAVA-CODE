package com.logic;

import java.util.Iterator;

public class ReverseEachWord {
public static void main(String[] args) {
	
	/*
	 * String sentence="i am developer"; String splitWord[]=sentence.split(" ");
	 * String reverseStr=" "; String reverse = ""; for(int
	 * i=0;i<=splitWord.length-1;i++) {
	 * 
	 * String word=splitWord[i]; //System.out.println(word);
	 *  
	 * for(int j=word.length()-1;j>=0;j--) {
	 * 
	 * reverse=reverse+word.charAt(j) ; System.out.println(reverse ); } reverseStr =
	 * reverseStr + reverse + " ";
	 * 
	 * } System.out.print("Reversed string : " + reverseStr);
	 */
	String originalStr="i am developer";
	String words[] = originalStr.split("\\s");
	String reversedString = "";

	for (int i = 0; i < words.length; i++) 
	{
		String word = words[i];
		String reverseWord = "";
		for (int j = word.length() - 1; j >= 0; j--) {
			reverseWord = reverseWord + word.charAt(j);
		}
		reversedString = reversedString + reverseWord + " ";
	}

	// Displaying the string after reverse
	System.out.print("Reversed string : " + reversedString);
}
}
