package com.cg.eis.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;

@SuppressWarnings("unused")
public class TestIn {

	@Test //(expected= EmployeeException.class)
	public void testSal()throws EmployeeException
	{
		Employee e = new Employee();
		Services s = new Services();
		e.setSalary(2500);
		s.des(e);
	}
}
