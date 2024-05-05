package com.krishna.prabha.mahe.service;

import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.krishna.prabha.mahe.entity.Employee;
import com.krishna.prabha.mahe.repo.EmployeeRepo;

public class EmployeeServiceSuplier {
	public static String findAndAny() {
		List<String> collect = EmployeeRepo.getAllEmployees().stream().map(emp -> emp.getEmployeeName())
				.collect(Collectors.toList());
		String FindFirst = collect.parallelStream().filter(s -> s.startsWith("M")).findFirst()
				.orElseGet(() -> "not avaliable");
		String findAny = collect.parallelStream().filter(s -> s.startsWith("K")).findAny()
				.orElseGet(() -> "not avaliable");
		System.out.println("FindFirst::: " + FindFirst);
		System.out.println("findAny::: " + findAny);
		return FindFirst;

	}
	
	public static List<Entry<Employee, Integer>> getDatabasedOnfilterInMap(){
		List<Entry<Employee, Integer>> collect = EmployeeRepo.getAllMapEmployees().entrySet().stream().filter(emp->emp.getValue()%2==0).collect(Collectors.toList());
		System.out.println("getDatabasedOnfilterInMap::"+collect);
		return collect;
	}

}
