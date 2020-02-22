package caplab1;

public class PersonalDetails {
	
	String fname="Divya";
	String lname="Bharathi";
	String gender="F";
	int age=20;
	double weight=85.55; 

	
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
	/*	PersonMain p=new PersonMain("Divya","Bharathi",Gender.Female,"9848324349");
		PersonMain p1=new PersonMain(); */
		PersonalDetails p2=new PersonalDetails();
		System.out.println("Personal Details:");
		System.out.println("------------------------");
		System.out.println("First name :"+p2.fname);
	/*	System.out.println("Last name:"+p.lname);
		System.out.println("Gender :"+p.gender);
		System.out.println("Age :"+p.age);
		System.out.println("weight : "+p.weight); */
		
	}
	
}
