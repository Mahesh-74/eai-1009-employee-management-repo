package com.krishna.prabha.mahe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.krishna.prabha.mahe.service.EmployeeService;

@SpringBootApplication
public class EmployeeManagementRepoApplication {

	public static void main(String[] args) {
		System.out.println("/***===Started spring boot EmployeeManagementRepoApplication===***/");
		EmployeeService.evaluateTaxEmployees("tax").stream().forEach(System.out::println);
		
		System.out.println("ASE: : "+EmployeeService.employeeSortingByASE());
		System.out.println("DSE: : "+EmployeeService.employeeSortingByDSE());
		System.out.println("Map key ASE: : "+EmployeeService.getAllMapEmployeesWithKeyASE());
		System.out.println("Map key DSE: : "+EmployeeService.getAllMapEmployeesWithKeyDSE());
		System.out.println("Map value ASE: : "+EmployeeService.getAllMapEmployeesWithValueASE());
		System.out.println("Map value DSE: : "+EmployeeService.getAllMapEmployeesWithValueDSE());
		//EmployeeService.getAllMapEmployeesWithKeyASE().stream().forEach(System.out::println);
		SpringApplication.run(EmployeeManagementRepoApplication.class, args);
	}

}
