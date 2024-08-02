package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraryOrder {

	public static void main(String[] args) {
		
		//1.Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
		List<Integer> list=Arrays.asList(10,11,12,13,14,15);
		list.stream()
		.filter(n->n%2==0)
		.forEach(System.out::println);
		
		//2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
		List<Integer> mylist=Arrays.asList(10,11,12,13,14,15);
		mylist.stream()
		.map(s->s+"")// Convert integer to String
		.filter(n->n.startsWith("1"))
		.forEach(System.out::println);
		 
		//3. How to find duplicate elements in a given integers list in java using Stream functions?
		List<Integer> duplicatelist=Arrays.asList(10,11,12,13,14,15,10,13);
		Set<Integer> set = new HashSet();
		duplicatelist.stream()
		.filter(n-> !set.add(n))
		.forEach(System.out::println);
		 
		//4. Given the list of integers, find the first element of the list using Stream functions?
		List<Integer> firstList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		firstList.stream().findFirst().ifPresent(System.out::println);
		
		System.out.println("---------------count---------");
			//5. Given a list of integers, find the total number of elements present in the list using Stream functions?
		List<Integer> sumList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		long cc=sumList.stream().count();
		System.out.println(cc); 
		//sum -------
		int sumint=sumList.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sumint); 
		//***  reverseOrder
		List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        
        //**********
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers.stream().filter(i -> i % 5 == 0).forEach(System.out::println);//45 15 75
        
        System.out.println("---------------max---------");
		 //6. Given a list of integers, find the maximum value element present in it using Stream functions?
		 List<Integer> maxList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		int max= maxList.stream()
		 .max(Integer::compare).get();
		 System.out.println(max); 
		 
        //** Given a list of integers, find maximum and minimum of those numbers?
        List<Integer> listOfIntegers1 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        
        int max1 = listOfIntegers1.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Maximum Element : "+max1);
         
        int min = listOfIntegers1.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Minimum Element : "+min);
        
        //** How do you get three maximum numbers and three minimum numbers from the given list of integers?
        List<Integer> listOfIntegers2 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers2.stream().sorted().limit(3).forEach(System.out::println);
        listOfIntegers2.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
        
        //** Find second largest number in an integer array?
        List<Integer> listOfIntegers3 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer secondLargestNumber = listOfIntegers3.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLargestNumber);//75
        
        // ** How do you find common elements between two arrays?
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        list1.stream().filter(list2::contains).forEach(System.out::println);// 21 34  56
        
        //***Reverse an integer array
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        int[] reversedArray = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).toArray();
        System.out.println(Arrays.toString(reversedArray));
        
        //***Print first 10 even numbers
        IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);
        
        //**** How do you merge two unsorted arrays into single sorted array using Java 8 streams?
        int[] a = new int[] {4, 2, 7, 1};
        int[] b = new int[] {8, 3, 9, 5};
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));//[1, 2, 3, 4, 5, 7, 8, 9]
        
        //***  How do you merge two unsorted arrays into single sorted array without duplicates?
        int[] a1 = new int[] {4, 2, 5, 1};
        int[] b2 = new int[] {8, 1, 9, 5};
        int[] c3 = IntStream.concat(Arrays.stream(a1), Arrays.stream(b2)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(c3));// [1, 2, 4, 5, 8, 9]
        
        List<Integer> listOfIntegers6 = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
    	Map<Boolean, List<Integer>> oddEvenNumbersMap  = listOfIntegers6.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
    	System.out.println("Even oddEvenNumbersMap>>"+oddEvenNumbersMap);
    	Set<Entry<Boolean, List<Integer>>> entrySet = oddEvenNumbersMap.entrySet();
    	for (Entry<Boolean, List<Integer>> entry : entrySet) 
        {
            System.out.println("--------------");
             
            if (entry.getKey())
            {
                System.out.println("Even Numbers");
            }
            else
            {
                System.out.println("Odd Numbers");
            }
             
            System.out.println("--------------");
             
            List<Integer> list6 = entry.getValue();
             
            for (int i : list6)
            {
                System.out.println(i);
            }
        }
    	
    	//** How do you extract duplicate elements from an array?
    	List<Integer> listOfIntegers7 = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = listOfIntegers7.stream().filter(i -> ! uniqueElements.add(i)).collect(Collectors.toSet());
        System.out.println(duplicateElements);
        
        // ** Fibonacci series
        Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]})
        .limit(10)
        .map(f -> f[0])
        .forEach(i -> System.out.print(i+" ")); //0 1 1 2 3 5 8 13 21 34
        
        //** First 10 odd numbers
        Stream.iterate(new int[] {1, 3}, f -> new int[] {f[1], f[1]+2})
        .limit(10)
        .map(f -> f[0])
        .forEach(i -> System.out.print(i+" ")); //1 3 5 7 9 11 13 15 17 19
        
        
        //** Given an integer array, find sum and average of all elements?
        int[] a2 = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        int sum = Arrays.stream(a2).sum();
        System.out.println("Sum = "+sum);
        double average = Arrays.stream(a).average().getAsDouble();
        System.out.println("Average = "+average);
        
        //****Distinct elements
        Integer[] array1 = {5, 10, 3, 7, 2, 10, 5};
        Integer[] distinct = Arrays.stream(array1)
                                   .distinct()
                                   .toArray(Integer[]::new);
        System.out.println("Distinct elements: " + Arrays.toString(distinct));
        //Distinct elements: [5, 10, 3, 7, 2]
        
        Integer[] numbers = {1, 2, 1, 3, 4, 4};
        List<Integer> list111 = Arrays.asList(1, 2, 3, 3, 4, 4, 5);
        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> set111 = list111.stream()
          .filter(i -> Collections.frequency(list111, i) > 1)
          .collect(Collectors.toSet());
        duplicates.addAll(set111);
         System.out.println("Duplicate elements: " + duplicates);
         
         String[] strArrays = { "Cabbage", "Kale", "Radish", "Kale",
         "Garlic", "Ginger","Garlic","Carrot","Kale"};
         List<String> list9 = Arrays.asList(strArrays);
         Set<String> setVeg = new HashSet(list9);
         System.out.println("setVeg :"+setVeg);
         for (String veg : setVeg) {
             System.out.println(veg + "\t\t"+ Collections.frequency(list9, veg));
         }
         
         // sorting array
         List<Integer> listarr = Arrays.asList(20,30,50,10,30);
         listarr.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
         listarr.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        //-----------
        List<Employee> employeeList = new ArrayList<Employee>();
     	employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
     	employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
     	employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
      
     	//1   https://javatechonline.com/how-to-sort-the-list-in-java-8/
		
		/*
		 * employeeList.sort((Employee e1, Employee e2) ->
		 * e1.getAge().compareTo(e2.getAge())); employeeList.forEach(item ->
		 * System.out.println(item));
		 */
     	
     	//*************  SORT   ********  https://www.java67.com/2021/09/3-ways-to-sort-list-in-java-8-and-11.html
		///////////////////////////// 1.collection sort method
     	 List<Integer> numbers1 = new ArrayList<Integer>();
         numbers1.add(3); numbers1.add(1); numbers1.add(4); numbers1.add(2);
         Collections.sort(numbers1);
         System.out.println("Sorted List: " + numbers1);
         
         Collections.sort(numbers1, Collections.reverseOrder());  
         numbers1.forEach(System.out::println);//we can use stream in collction
         
         //Collections.sort(employeeList, Comparator.comparing(Employee::getAge));
     	 Collections.sort(employeeList, Comparator.comparing(Employee::getAge).reversed());
     	 employeeList.forEach(System.out::println);  
     	 
         //////////////////////// 2. List sort method
         List<Integer> numbers2 = Arrays.asList(5, 3, 2, 4, 1);
         //numbers2.sort(null); //null means sorting in natural order
         numbers2.sort((o1, o2) -> o2.compareTo(o1)); //Sorted List2: [5, 4, 3, 2, 1]
         System.out.println("Sorted List2: " + numbers2);
         
         List<Integer> list11 = Arrays.asList(10,1,-20,40,5,-23,0);  
         list11.sort(Comparator.naturalOrder());  
         list11.sort(Comparator.reverseOrder());
         
         employeeList.sort(Comparator.comparing(Employee::getAge).reversed());
         employeeList.forEach(System.out::println);        
         System.out.println("--------------");
         
         ///////////////////////////3. Stream 
         List<Integer> numbers3 = Arrays.asList(5, 3, 2, 4, 1);
         List<Integer> sortedList = numbers3.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
         System.out.println(sortedList); // prints [1, 2, 3, 4, 5] [5, 4, 3, 2, 1]
         sortedList.forEach(System.out::println);
         
         List<String> slist1 = Arrays.asList("Tanu", "Kamal", "Suman", "Lucky", "Bunty", "Amit");  
         List<String> sortedList1 = slist1.stream().sorted().collect(Collectors.toList());     
         sortedList1.forEach(System.out::println);  
         System.out.println("stream list..");
         List<Employee> emplist1= employeeList.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).collect(Collectors.toList());
         emplist1.forEach(System.out::println);
     	 
        List<Integer> listt=Arrays.asList(10,20,30,40,50);
  		 
  		listt.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
  		 
  		listt.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
  		//--------------------------------------------------------------------------------
  		Optional<Integer> no1=listt.stream().sorted(Comparator.reverseOrder()).findFirst();  
  		System.out.println("max :"+no1.get());
  		
  		Optional<Integer> no2=listt.stream().sorted(Comparator.naturalOrder()).findFirst();  
  		System.out.println("min :"+no2.get());
  		//----------------------------------------------------------------------------------
  		int maxxx=listt.stream().max(Integer::compare).get();
  		System.out.println("max :"+maxxx);
  		
  		int maxx=listt.stream().max(Integer::compareTo).get();
  		System.out.println("maxx :"+maxx);
  		
  		int minn=listt.stream().min(Integer::compare).get();
  		System.out.println("minn :"+minn);
  		//-----new 
  		 OptionalInt max11 = listt.stream().mapToInt(Integer::intValue).max();
  		 System.out.println("Max element: " +max11.getAsInt() );
  		//---------
  	  final List<Integer> inputArrayList = Arrays.asList(1, 3, 2, 4, 3, 1, 2);
      final List<Integer> outputArrayList = inputArrayList.stream()
              .distinct()
              .sorted(Comparator.reverseOrder())
              .collect(Collectors.toList());
      System.out.println(outputArrayList);  // Output: [4, 3, 2, 1]
  	  // sum
      List<Integer> sumNumbers = Arrays.asList(1, 2, 3, 4, 5);
      IntSummaryStatistics i=sumNumbers.stream().collect(Collectors.summarizingInt(e-> e));
      System.out.println(i);
      System.out.println(i.getSum());
      
      int sum1=sumNumbers.stream().mapToInt(Integer::intValue).sum();
      System.out.println(sum1);
      
     
  		
	}
}
