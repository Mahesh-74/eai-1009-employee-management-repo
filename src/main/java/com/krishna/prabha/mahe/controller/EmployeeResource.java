package com.krishna.prabha.mahe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResource {
	
	@GetMapping("/getData")
	public String getData() {
		return "Hello AWS this EmployeeResource";
		
		
	}

}
