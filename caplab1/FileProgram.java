package caplab1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("unused")
public class FileProgram extends Thread {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		FileReader fr=new FileReader("D:\\java lab\\core_java\\source.txt");
		FileWriter fw=new FileWriter("D:\\java lab\\core_java\\target.txt");
		CopyDataThread ct=new CopyDataThread(fr,fw);
	}

}
