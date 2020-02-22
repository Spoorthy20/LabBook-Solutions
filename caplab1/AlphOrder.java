package caplab1;

import java.util.Scanner;

public class AlphOrder {
	
	private static boolean AlpOrder(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)<s.charAt(i-1))
			{
		
		return false;
			}
		}
		return true;
	}
	
	public static void name(String args[])
	{
		@SuppressWarnings("unused")
		AlphOrder ap=new AlphOrder();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string :");
		String s=sc.nextLine();
		if(AlpOrder(s))
		{
			System.out.println("positive string");
		}
		else
		{
			System.out.println("negative string");
		}
			
	}

}
