package com.stream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
public class SecondSalary {
	public static void main(String[] args) throws IOException {
        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1(1, "John Doe", "Dev", 70000));
        employees.add(new Employee1(2, "Jane shina", "Dev", 60000));
        employees.add(new Employee1(3, "Peter Parker", "QA", 40000));
        employees.add(new Employee1(4, "Mary Jane", "QA", 50000));

		
		/*
		 * Map<String, List<Employee1>> employeesByDepartment = employees.stream()
		 * .collect(Collectors.groupingBy(Employee1::getDepartment));
		 * 
		 * employeesByDepartment.forEach((department, employeeList) -> { List<Employee1>
		 * sortedEmployees = employeeList.stream()
		 * .sorted(Comparator.comparingDouble(Employee1::getSalary).reversed())
		 * .collect(Collectors.toList());
		 * 
		 * Employee1 secondHighestPaidEmployee = sortedEmployees.get(1);
		 * System.out.println("Second highest paid employee in " + department + ": " +
		 * secondHighestPaidEmployee.getName()); });
		 */
		 
        //grouping and sorting
		 Map<String, List<Employee1>> empByDepartment =employees.stream().collect(Collectors.groupingBy(Employee1::getDepartment));
		 empByDepartment.forEach( (dept,empList)->{
		
			 List<Employee1>  sortedEmp= empList.stream().sorted(Comparator.comparingDouble(Employee1::getSalary).reversed())
			 .collect(Collectors.toList());
			 
			 Employee1 secondHighestPaidEmp =sortedEmp.get(1);
			 
			 System.out.println("Second highest paid employee in " + dept + ": " +  secondHighestPaidEmp.getName()); });
			 
		  // 2nd high
		  List<Integer> lisNo= Arrays.asList(500,100,300,400,200);
		  Integer secNo1 =lisNo.stream().sorted((a,b)->(b-a)).skip(1).findFirst().get();
		  System.out.println(secNo1);
		  Optional<Integer> secNo =lisNo.stream().sorted((a,b)->(b-a)).skip(1).findFirst();
		  System.out.println(secNo.get());
		  
		 
		 
	}
	
	 
}
