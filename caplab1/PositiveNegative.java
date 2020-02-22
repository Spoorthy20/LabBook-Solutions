package caplab1;

public class PositiveNegative {

	public static void main(String args[])
	{
		/*@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.println("enter number :");
		no=sc.nextInt(); */
		//PositiveNegative p=new 
		int no=Integer.parseInt(args[0]);
		if(no>0)
			System.out.println("number is positive ");
		else 
		System.out.println("number is negative ");
	}
}
