package com.krishna.prabha.mahe.service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.krishna.prabha.mahe.entity.Employee;
import com.krishna.prabha.mahe.repo.EmployeeRepo;

public class EmployeeService {
	public static List<Employee> evaluateTaxEmployees(String input) {
		return (input.equalsIgnoreCase("nontax"))
				? EmployeeRepo.getAllEmployees().stream().filter(e -> e.getEmployeeSalary() > 500000)
						.collect(Collectors.toList())
				: EmployeeRepo.getAllEmployees().stream().filter(e -> e.getEmployeeSalary() <= 500000)
						.collect(Collectors.toList());
	}

	public static List<Employee> employeeSortingByASE() {
		return EmployeeRepo.getAllEmployees().stream().sorted(Comparator.comparing(Employee::getEmployeeSalary))
				.collect(Collectors.toList());
	}

	public static List<Employee> employeeSortingByDSE() {
		return EmployeeRepo.getAllEmployees().stream()
				.sorted(Comparator.comparing(Employee::getEmployeeSalary).reversed()).collect(Collectors.toList());
	}

	public static List<Entry<Employee, Integer>> getAllMapEmployeesWithKeyASE() {
		return EmployeeRepo.getAllMapEmployees().entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEmployeeSalary)))
				.collect(Collectors.toList());

	}

	public static List<Entry<Employee, Integer>> getAllMapEmployeesWithKeyDSE() {
		return EmployeeRepo.getAllMapEmployees().entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEmployeeSalary).reversed()))
				.collect(Collectors.toList());

	}

	public static List<Entry<Employee, Integer>> getAllMapEmployeesWithValueASE() {
		return EmployeeRepo.getAllMapEmployees().entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.comparing(Integer::byteValue)))
				.collect(Collectors.toList());

	}

	public static List<Entry<Employee, Integer>> getAllMapEmployeesWithValueDSE() {
		return EmployeeRepo.getAllMapEmployees().entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.comparing(Integer::byteValue).reversed()))
				.collect(Collectors.toList());

	}

}
