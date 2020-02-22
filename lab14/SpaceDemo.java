package lab14;

interface space
{
	String space(String s);
}
public class SpaceDemo {
	
	public static void main(String args[])
	{
		space t=(str)-> {
			String sp="";
			char []ar=str.toCharArray();
			for(int i=0;i<ar.length;i++)
			{
				sp+=ar[i]+" ";
			}
			return sp;
		};
		System.out.println(t.space("spoo"));
	}

}
