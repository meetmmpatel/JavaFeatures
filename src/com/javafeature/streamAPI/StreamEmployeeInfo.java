package com.javafeature.streamAPI;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEmployeeInfo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Jack", 27, new BigDecimal(10000)));
		empList.add(new Employee("John", 34, new BigDecimal(14000)));
		empList.add(new Employee("Mike", 98, new BigDecimal(4500)));
		empList.add(new Employee("Steve", 34, new BigDecimal(78000)));

		System.out.println(empList);

		// Before Java 8
		List<String> names = new ArrayList<>();
		for (Employee e : empList) {
			names.add(e.getName());
		}
		System.out.println(names);
		
		//Java 8 Using Steam API
		
		List<String> newNames = 
				empList.stream().map(p -> p.getName()).collect(Collectors.toList());
		System.out.println(newNames);
		
		List<Integer> empAge = 
				empList.stream().map(p -> p.getAge()).collect(Collectors.toList());
		System.out.println(empAge);

	}

}
