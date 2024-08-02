package com.logic;

import java.util.HashSet;

public class CollectionEx {
	public static void main(String[] args) {
		HashSet  hs=new HashSet ();
		hs.add("Abcd");
		hs.add("efg");
		hs.add("abcd");
		String s = new String("Abcd");
		hs.add(s);
		hs.add("Abcdefg");

		System.out.println(hs);
		Double ss=1234567890E234;
		System.out.println();
	}
}
