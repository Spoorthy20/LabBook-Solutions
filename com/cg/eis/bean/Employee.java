package com.cg.eis.bean;

import com.cg.eis.exception.EmployeeException;

@SuppressWarnings("unused")
public class Employee{

	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	 
	 /*   public Employee find(double salary) throws EmployeeException {
	        if (salary>3000) {
	            return new Employee();
	        } else {
	            throw new EmployeeException(
	                "salary is less than 3000 ");
	        }
	    }*/
	
	 	}

