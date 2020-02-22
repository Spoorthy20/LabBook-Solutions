package com.cg.eis.pl;

import java.util.Scanner;

public class Empdet {
	
	void disp()
	{
		System.out.println("emp det");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("emp details :");
        Empdet e=new Empdet();
        
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		e.disp();
		System.out.println("emp id :");
		int a=sc.nextInt();
		System.out.println("emp name :");
		String n=sc.next();
		System.out.println("emp sal :");
		float s=sc.nextFloat();
		System.out.println("emp desg :");
	    String d=sc.next();
	    System.out.println("emp is :");
	    String i=sc.next();
	    //System.out.printf("emp det:");
	    
	    
	}

}
