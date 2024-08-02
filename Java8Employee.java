package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
//https://github.com/veerao05/programs/blob/main/src/com/java8/Java8Employee.java
public class Java8Employee {
public static void main(String[] args) {//i/p list of employee
	List<Employee1> empList = new ArrayList<>();
	empList.add(new Employee1(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
	empList.add(new Employee1(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
	empList.add(new Employee1(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
	empList.add(new Employee1(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
	empList.add(new Employee1(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
	empList.add(new Employee1(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
	empList.add(new Employee1(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
	empList.add(new Employee1(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
	empList.add(new Employee1(9, "stv", 25, 160, "M", "IT", "Blore", 2010));

	
	
	// Group employees by city
	Map<String, List<Employee1>> empByCity=empList.stream().collect(Collectors.groupingBy(Employee1::getCity));
    System.out.println("Employees grouped by city :: \n" + empByCity);
    
    // Group Employees by age
    Map<Integer,List<Employee1>> empByAge=empList.stream().collect(Collectors.groupingBy(Employee1::getAge));
    System.out.println("Employees grouped by age :: \n" + empByAge);
    
    //Find  the count of male and female employees present in the organization
    Map<String, Long> empByGender= empList.stream().collect(Collectors.groupingBy(Employee1::getGender,Collectors.counting()));
    System.out.println("Count of male and female employees present in the organization :: \n" + empByGender);
    
   //Print the names of all departments in the organization
    empList.stream().map(Employee1::getDeptName).distinct().forEach(System.out::println);
    
   // print employee details whose age is greater than 28
    empList.stream().filter(e->e.getAge()>28).collect(Collectors.toList()).forEach(System.out::println);
    
    // find maximum age of employee
    OptionalInt max = empList.stream().mapToInt(Employee1::getAge).max();// easy
    if (max.isPresent()) System.out.println("Maximum age of Employee: " + max.getAsInt());
    
   /* Optional<Integer> maxAge = empList.stream().map(Employee1::getAge).max(Integer::compare);
    System.out.println("maxAge :"+maxAge);
    Optional<Employee1> oldestEmployeeWrapper = empList.stream().max(Comparator.comparingInt(Employee1::getAge));
	Employee1  oldestEmployee = oldestEmployeeWrapper.get();  
    System.out.println(maxAge.get()); */
  
  //Print the number of employees in each department.
    Map<String, Long> map=empList.stream().collect(Collectors.groupingBy(Employee1::getDeptName,Collectors.counting()));
    System.out.println("number of employees in each department :"+map);
    
    // //Find oldest employee
    
    // Find youngest  female employee
    Employee1 emp = empList.stream().filter(e->e.getGender()=="F").sorted((a,b)->a.getAge()-b.getAge()).findFirst().get();
	System.out.println("================"+emp);
	
   /* OptionalInt youngestEmp = empList.stream().filter(e -> e.getGender() == "F")
    		.mapToInt(Employee1::getAge).min();    System.out.println(youngestEmp.getAsInt());*/
    		
    		
    System.out.println("----------");
    List<Employee1> tempList = empList.stream()
            .filter(e -> "IT".equalsIgnoreCase(e.getDeptName()) && e.getAge() > 30)
            .collect(Collectors.toList());
    tempList.forEach(e -> System.out.println("Designation :- " + e.getDeptName() + " , Age :- " + e.getAge()));       
 
    //Print the number of employees in each department.
	 
	Map<String, List<Employee1>> noemp= empList.stream().collect(Collectors.groupingBy(Employee1::getDeptName));
	System.out.println("employees in each department :"+noemp);
 
	 Map<String, Long> countByDept = empList.stream().collect(Collectors.groupingBy(Employee1::getDeptName,Collectors.counting()));
     System.out.println("No of employees in each department");
     for (Map.Entry<String, Long> entry : countByDept.entrySet()) {
         System.out.println(entry.getKey() + " : " + entry.getValue());
     } 
     
     //Find oldest employee
     Optional<Employee1> maxage=empList.stream().max(Comparator.comparingInt(Employee1::getAge));
     System.out.println("max age :"+maxage.get());
     
     // Find youngest  female employee
     Optional<Employee1> minage= empList.stream().filter(e->e.getGender().equals("F")).
    		 min(Comparator.comparingInt(Employee1::getAge));
     System.out.println("min age :"+minage.get());
     
     // Find employees whose age is greater than 30 and less than 30
     Set<Entry<Boolean, List<Employee1>>> mapPartAge=empList.stream().collect(Collectors.partitioningBy(e->e.getAge()>30)).entrySet();
     System.out.println("mapPartAge :"+mapPartAge);
     
     System.out.println("Employees whose age is greater than 25 and less than 25");
     Map<Boolean, List<Employee1>> partitionEmployeesByAge =
             empList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 30));

     Set<Map.Entry<Boolean, List<Employee1>>> empSet = partitionEmployeesByAge.entrySet();

     for (Map.Entry<Boolean, List<Employee1>> entry : empSet) {
         if (Boolean.TRUE.equals(entry.getKey())) {
             System.out.println("Employees greater than 30 years ::" + entry.getValue());
         } else {
             System.out.println("Employees less than 30 years ::" + entry.getValue());
         }
     }
     z
   //Find the department name which has the highest number of employees
    Optional<Entry<String, Long>>highDeprt= empList.stream().
    		collect(Collectors.groupingBy(Employee1::getDeptName,Collectors.counting())).
    		entrySet().stream().max(Comparator.comparingDouble(e->e.getValue()));
     System.out.println("highDeprt::"+highDeprt);
     
     //Find the each department name which has the highest salary of employees
     Map<String, Optional<Employee1>>highDeprt1= empList.stream().
     		collect(Collectors.groupingBy(Employee1::getDeptName,
     				Collectors.maxBy(Comparator.comparing(Employee1::getSalary))));
      System.out.println("highDeprt::"+highDeprt1);
     
      
     
	 }
}
