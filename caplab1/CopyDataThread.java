package caplab1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("unused")
public class CopyDataThread  extends Thread{
	
	static BufferedReader br;
	static BufferedWriter bw;
	
	public CopyDataThread(FileReader fr,FileWriter fw) throws IOException, InterruptedException
	{
		br=new BufferedReader(fr);
		bw=new BufferedWriter(fw);
		
		int j=10;
		String line;
		
		while((line=br.readLine())!=null){
		char[] demo = line.toCharArray();
		for(int i=0;i<demo.length;i++){
		bw.write(demo[i]);
		if(i==j){
		System.out.println("10 characters are copied!");
		j+=10;
		Thread.sleep(5000);
	}

}
}
		br.close();
		bw.close();
}
}
