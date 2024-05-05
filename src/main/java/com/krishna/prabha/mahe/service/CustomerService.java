package com.krishna.prabha.mahe.service;

import java.util.List;
import java.util.stream.Collectors;

import com.krishna.prabha.mahe.entity.Customer;
import com.krishna.prabha.mahe.repo.CustomerRepo;

public class CustomerService {

	public static List<String> getCustomerDataOnetoOne() {

		List<Customer> customers = CustomerRepo.getAll();
		// List<Customer> convert List<String> -> Data Transformation
		// mapping : customer -> customer.getEmail()
		// customer -> customer.getEmail() one to one mapping
		List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
		System.out.println("emails::one to one mapping:: " + emails);
		return emails;
	}

	public static List<String> getCustomerDataOnetoMany() {
		List<Customer> customers = CustomerRepo.getAll();
		// customer -> customer.getPhoneNumbers() ->> one to many mapping
		// customer -> customer.getPhoneNumbers() ->> one to many mapping
		List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers())
				.collect(Collectors.toList());
		System.out.println("getCustomerDataOnetoMany::: " + phoneNumbers);
		return null;
	}

	public static List<String> getCustomerDataOnetoManyWithFlatMap() {
		List<Customer> customers = CustomerRepo.getAll();
		// List<Customer> convert List<String> -> Data Transformation
		// mapping : customer -> phone Numbers
		// customer -> customer.getPhoneNumbers() ->> one to many mapping
		List<String> phones = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		System.out.println("getCustomerDataOnetoManyWithFlatMap::: " + phones);
		return phones;
	}

}
