package com.cg.eis.pl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.Services;


@SuppressWarnings("unused")
public class Input {
	@SuppressWarnings({ "resource", "static-access" })
	public static void main(String[] args) throws IOException
	{
		
		//Scanner sc=new Scanner(System.in);
		
		Employee e[]=new Employee[10];
		Services ser1=new Services();
		EmployeeServiceImpl esi=new EmployeeServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee no:");
		int no=sc.nextInt();
		//e1.setId(sc.nextInt());
		//System.out.println("Enter Employee Name:");
		//String dummy=sc.nextLine();
		//String n=sc.nextLine();
		//e1.setName(n);
		//ser.scheme();
		
		for(int i=0;i<no;i++)
		{
		  e[i]=new Employee();
		  System.out.println("Enter employee id");
		  int empid=sc.nextInt();
		  e[i].setId(empid);
		  
		  System.out.println("enter name :");
		  String empname=sc.next();
		  e[i].setName(empname);
		  
		  System.out.println("Enter salary");
		  e[i].setSalary(sc.nextDouble());
		  
		  ser1.scheme1(e[i]);
		  esi.addEmployee(e[i]);
		  
		  esi.displayHash();
		  
		  System.out.println("enter id to delete");
		  int del=sc.nextInt();
		  esi.deleteEmployee(del);
		  esi.displayHash();
		}
	/*	try {
			 
            Employee emp = e1.find(3000);
 
        } catch (EmployeeException ex) {
            System.err.print(ex);
        }*/
	}
	/*void dis()
	{
		System.out.println("------Employee Details-----");
		System.out.println("Designation :"+e1.getDesignation());
	}*/

}
