package caplab1;

import java.util.*;
import java.io.*;
public class ScannerExample 
{
	public static void main(String[] args)throws Exception
	{
		FileReader fr = new FileReader("D:\\java lab\\core_java\\numbers.txt");
		BufferedReader br = new BufferedReader(fr);
		String data = null;
		int a=0;
		while((data=br.readLine())!=null)
		{
			Scanner sc = new Scanner(data);
			sc.useDelimiter(",");
			while(sc.hasNext())
			{
				a=Integer.parseInt(sc.next());
				if(a%2==0)
					System.out.println(a);
			}
			
		}
		fr.close();
		br.close();

	}
}
