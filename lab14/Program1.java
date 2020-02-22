package lab14;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Program1 {

	public static void main(String args[])
	{
		Program1 pm=new Program1();
	/*	MathOperation power=(int x,int y)-> x^y;
		
		System.out.println("10^5="+pm.operate(10,5,power));*/
		
		@SuppressWarnings("unused")
	     Power ad1=(x,y)->(x^y);
		//System.out.println(ad1.pow(10, 20));
		
		System.out.println((Math.pow(10,2)) );
		
		
	//	(String s) -> System.out.println(s);
		//pm.spaceEx();
	}
	interface Power{  
	    int pow(int x,int y);  
	}  
	
		
	/* interface MathOperation {
		int operation(int x,int y);
	}
	
	
	private int operate(int x,int y,MathOperation mathOperation)
	{
		return 0;
		
		
	} */
}
