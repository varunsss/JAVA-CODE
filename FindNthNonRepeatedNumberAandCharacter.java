package com.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindNthNonRepeatedNumberAandCharacter {
	private void nonRepeatedNumberByHashmap() {
		
	}
	private void nonRepeatedNumber() {
		List<Integer> list=Arrays.asList(1,2,3,1,2,4,5,3);
		List<Integer> result = list.stream()
                .filter(i -> Collections.frequency(list, i) == 1)
                .collect(Collectors.toList());
		System.out.println("no repeated value :"+result);
	}
	
	private void nthNonRepeatedNumber() {
		List<Integer> list=Arrays.asList(1,2,3,1,2,4,5,3);
		int n = 1;
		Optional<Integer> nonrepeatable=list.stream().distinct()
		.filter(i->Collections.frequency(list, i)==1)
		.skip(n-1).findFirst();
		System.out.println("nth nonrepeatable Number :"+nonrepeatable.get());
	}

	private void nthNonRepeatedChar() {
		List<Character> list=Arrays.asList('A','B','C','A','D');
		int n = 2;
		Optional<Character> char1=list.stream().distinct()
		.filter(i->Collections.frequency(list, i)==1)
		.skip(n-1).findFirst();
		System.out.println("nth nonrepeatable Character :"+char1.get());
		
	}
	public static void main(String[] args) {
		FindNthNonRepeatedNumberAandCharacter n=new FindNthNonRepeatedNumberAandCharacter();
		n.nonRepeatedNumber();
		n.nthNonRepeatedNumber();
		n.nthNonRepeatedChar();
		n.nonRepeatedNumberByHashmap();
		
		// find last element
		Stream<Integer> stream1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream();
        Integer lastElement1 = stream1.reduce((first, second) -> second).orElse(-1);
        System.out.println(lastElement1); 
        
	}


}
