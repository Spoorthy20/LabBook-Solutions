package caplab1;

import java.util.ArrayList;
import java.util.Collections;

public class Product1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> al=new ArrayList<String>();
        al.add("cadbury");
        al.add("heitage");
        al.add("amul");
        
        System.out.println("list :");
        Collections.sort(al);
        
        al.forEach((n)->print(n));
	}

	private static void print(String n) {
		// TODO Auto-generated method stub
		System.out.println("product is :"+n);
	}

}
