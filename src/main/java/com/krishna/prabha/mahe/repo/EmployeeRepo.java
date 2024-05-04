package com.krishna.prabha.mahe.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.krishna.prabha.mahe.entity.Employee;

public class EmployeeRepo {
	
	public static List<Employee> getAllEmployees(){
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(102,"Mahesh",500000.00,"IT","ma@hmail.com","male","9010061121"));
		empList.add(new Employee(103,"Krishna",3300000.00,"Accounts","kr@hmail.com","male","9010061123"));
		empList.add(new Employee(104,"Prabha",3000000.00,"HR","pr@hmail.com","male","9010061125"));
		empList.add(new Employee(105,"Ram",400000.00,"System","ra@hmail.com","male","9010061126"));
		return empList;
		
	}
	
	public static Map<Employee,Integer> getAllMapEmployees(){
		Map<Employee,Integer> empMap = new HashMap<>();
		empMap.put(new Employee(102,"Mahesh",500000.00,"IT","ma@hmail.com","male","9010061121"),20);
		empMap.put(new Employee(103,"Krishna",3300000.00,"Accounts","kr@hmail.com","male","9010061123"),30);
		empMap.put(new Employee(104,"Prabha",3000000.00,"HR","pr@hmail.com","male","9010061125"),40);
		empMap.put(new Employee(105,"Ram",400000.00,"System","ra@hmail.com","male","9010061126"),50);
		return empMap;
		
	}

}
