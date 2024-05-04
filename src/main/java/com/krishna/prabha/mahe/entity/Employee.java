package com.krishna.prabha.mahe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@Entity
//@Table(name = "Employee_tbl")
public class Employee {
	
	private Integer employeeId;
	private String employeeName;
	private Double employeeSalary;
	private String emplyeeDept;
	private String employeeEmail;
	private String gender;
	private String employeeMobileNo;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer employeeId, String employeeName, Double employeeSalary, String emplyeeDept,
			String employeeEmail, String gender, String employeeMobileNo) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.emplyeeDept = emplyeeDept;
		this.employeeEmail = employeeEmail;
		this.gender = gender;
		this.employeeMobileNo = employeeMobileNo;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmplyeeDept() {
		return emplyeeDept;
	}
	public void setEmplyeeDept(String emplyeeDept) {
		this.emplyeeDept = emplyeeDept;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmployeeMobileNo() {
		return employeeMobileNo;
	}
	public void setEmployeeMobileNo(String employeeMobileNo) {
		this.employeeMobileNo = employeeMobileNo;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", emplyeeDept=" + emplyeeDept + ", employeeEmail=" + employeeEmail + ", gender="
				+ gender + ", employeeMobileNo=" + employeeMobileNo + "]";
	}
	
	

}
