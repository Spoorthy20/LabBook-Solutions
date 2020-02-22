package com.cg.eis.pl;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


import com.cg.eis.bean.Employee;
import com.cg.eis.service.Services;

@SuppressWarnings("unused")
public class EmployeeServiceImpl {
	
	 Employee e=new Employee();
	
	public void addEmployee(Employee e)
	{
		try
		{	
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","admin");
	    //Statement stmt=con.createStatement();
	   
	    String sql="Insert into Empdet (empid,empname,salary,designation,insurancescheme)values(?,?,?,?,?)";
	    PreparedStatement stmt=con.prepareStatement(sql);
	    stmt.setInt(1,e.getId());
	    stmt.setString(2,e.getName());
	    stmt.setDouble(3,e.getSalary());
	    stmt.setString(4,e.getDesignation());
	    stmt.setString(5,e.getInsuranceScheme());
	    stmt.execute();
	    
	    }
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void displayHash()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","admin");
		    Statement stmt=con.createStatement();
		    String sql="Select * from empdet";
		    ResultSet rs=stmt.executeQuery(sql);
		    
		    System.out.println("employee details");
		    System.out.println("EMPID\tEMPNAME\tSALARY\tDESIGNATION\tINSURANCESCHEME");
		    while(rs.next())
		    {
		    	int empid=rs.getInt(1);
		    	String empname=rs.getString(2);
		    	double salary=rs.getDouble(3);
		    	String designation=rs.getString(4);
		    	String insurancescheme=rs.getString(5);
		    }
		    stmt.close();
		    rs.close();
		    con.close();
		}
		
		catch(Exception ex2)
		{
			System.out.println("Error :"+ex2.getMessage());		
		}
	}
	
	public boolean deleteEmployee(int id)
	{
		try
		{
      
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","admin");
		   // Statement stmt=con.createStatement();
		    String sql="delete from empdet where empid=?";
		    PreparedStatement stmt=con.prepareStatement(sql);
		    //ResultSet rs=stmt.executeQuery(sql);
             stmt.setInt(1, id);
             stmt.executeUpdate();
		}
		catch(Exception ex3)
		{
			ex3.printStackTrace();
		}
		return true;
		
	}
	/*
	HashMap<String, Employee> map = new HashMap<String, Employee>();
	Employee e;
	public void addEmployee(Employee emp){
		map.put(emp.getName(), emp);
	}
	
	@SuppressWarnings("rawtypes")
	public void displayDetails(){
		Set<Entry<String, Employee>> set = map.entrySet();
		Iterator<Entry<String, Employee>> it = set.iterator();
		while(it.hasNext()){
			Map.Entry me = (Map.Entry)it.next();
			e = (Employee) me.getValue();
			System.out.println("===================");
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getDesignation());
			System.out.println(e.getSalary());
			System.out.println(e.getInsuranceScheme());
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void employeeDetails(String ins){
		System.out.println("Employee details with "+ins);
		
		Set<Entry<String, Employee>> set = map.entrySet();
		Iterator<Entry<String, Employee>> it = set.iterator();
		while(it.hasNext()){
			Map.Entry me = (Map.Entry)it.next();
			Employee e = (Employee) me.getValue();
			String scheme = e.getInsuranceScheme();
			if(scheme.equalsIgnoreCase(ins))
			{
				System.out.println("=====================");
				System.out.println(e.getId());
				System.out.println(e.getName());
				System.out.println(e.getDesignation());
				System.out.println(e.getSalary());
			}
		}
	}	

	
	@SuppressWarnings("rawtypes")
	public boolean deleteEmployee(int id){
		Set<Entry<String, Employee>> set = map.entrySet();
		Iterator<Entry<String, Employee>> it = set.iterator();
		while(it.hasNext()){
			Map.Entry me = (Map.Entry)it.next();
			Employee e = (Employee) me.getValue();
			if(e.getId() == id){
				map.remove(me.getKey());
				return true;
			}
		}
		return false;
	} 
	*/
	
}
