package caplab1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

enum Gender
{
	Male,Female
}


public class PersonMain {
	//private static final String getFName = null;


	//private static final String getLName = null;


	Gender g;
	
	
	private String FName;
	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public String getLName() {
		return LName;
	}

	public void setLName(String lName) {
		LName = lName;
	}


	private String LName;
	String Phno;
	int age;
	
	public static void calculateAge()
	{
		LocalDate d1=LocalDate.now();
		LocalDate d2=LocalDate.of(1998, Month.SEPTEMBER, 20);
		Period p=Period.between(d2, d1);
	//	System.out.println("age :");
		//System.out.println("days:"+p.getDays());
	//	System.out.println("months:"+p.getMonths());
		System.out.println("age :"+p.getYears());
	}
	
	public static void getFullName(String firstName,String lastName)
	{
		System.out.println("Full name :");
		
		
	}
	public String getPhno() {
		return Phno;
	}

	public void setPhno(String phno) {
		Phno = phno;
	}
	
	
	PersonMain() {
		
		FName="Divya";
		LName="Bharathi";
		g=Gender.Female;
		Phno="9976865490";
		//age=20;
	}
	
	PersonMain(String firstname,String lastname,Gender g,String phno)
	{
		this.FName=firstname;
		this.LName=lastname;
		this.Phno=phno;
		this.g=g;
		//this.age=Age;
	}
	
	void display()
	{
		System.out.println("Person details");
		System.out.println("-------------------");
		System.out.println("First Name :"+FName);
		System.out.println("Last Name :"+LName);
		System.out.println("Gender :"+g);
		System.out.println("Phone number :"+Phno);
	//	System.out.println("Age :"+age);
		
	}
	
	public static void main(String args[])
	{
	  PersonMain p=new PersonMain();
	  PersonMain p1=new PersonMain("ashish","aggarwal",Gender.Male,"7288080600");
	  p.display();
	  System.out.println("--------------------------");
	  p1.display();
	  calculateAge();
	  //getFullName(FName, LName);
	  try
	     {
		if(p1.FName==null & p1.LName==null)
		{
		System.out.println("error");
		}
		throw new Exception();
	     }
	     catch(Exception ex)
	     {
	    	 System.out.println(ex);
	     }
	  	}
}
