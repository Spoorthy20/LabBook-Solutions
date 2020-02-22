package lab14;

import java.util.Scanner;
import java.util.stream.IntStream;

interface MyInterface
{
	void display();
}

public class MethodRef {
	
	int id;
	String name;
	
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

	public void referMethod()
	{
		id=20;
		name="abc";
		System.out.println("id :"+id+"\nname :"+name);
	}

	public void fact(int n)
	{
		n=5;
		IntStream.range(1,n);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodRef mr=new MethodRef();
	    MyInterface ref=mr::referMethod;
	    ref.display();

	}

}
