package caplab1;

import java.util.Scanner;

public class Sop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings({ })
		int n;
		@SuppressWarnings("unused")
		Sop s=new Sop();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("1.Append string\n2.Replace pos\n3.Remove duplicates\n4.change odd");
		System.out.println("Select the string option");
		n=sc.nextInt();
	
	switch(n)
		{
		
		case 1: AppendString();
		        break;
		        
		case 2: ReplacePos();  
		        break;
		        
		case 3: RemoveDuplicates();
		        break;
		        
		case 4: ChangeUpper();
		        break;
		}
	
		}
	}

	private static void ChangeUpper() {
		// TODO Auto-generated method stub
	    @SuppressWarnings("resource")
		Scanner sc3=new Scanner(System.in);
	    System.out.println("enter string");
	    String str5=sc3.nextLine();
	    for(int i=0;i<str5.length();i++)
	    {
	    	char c=str5.charAt(i);
	    	if(i%2!=0)
	    	{
	    		System.out.println(Character.toUpperCase(c));
	    	}
	    }
	    System.out.println(str5);
	}

	private static void RemoveDuplicates() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc4=new Scanner(System.in);
		System.out.println("enter string");
		String str6=sc4.nextLine();
		String result="";
		for(int i=0;i<str6.length();i++)
		{
			if(!result.contains(String.valueOf(str6.charAt(i))))
			{
				result+=String.valueOf(str6.charAt(i));
					}
				}
		        System.out.println(result);
			}
		
		
	

	private static void ReplacePos() {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter string");
		String str4=sc2.nextLine();
		for(int i=0;i<str4.length();i++)
		{
			if(i%2!=0)
			{
				str4=str4.substring(0,i-1)+"#"+str4.substring(i,str4.length());
			}
		}
		System.out.println(str4);
	}

	private static void AppendString() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter a String");
		String str1=sc1.nextLine();
		System.out.println("Enter other string");
		String str2=sc1.nextLine();
		String str3=str1.concat(str2);
		System.out.println("Concatinated string is :"+str3);
	}
}


