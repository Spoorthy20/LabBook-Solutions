package caplab1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DateDemo {
	
  public static void main(String args[])
  {
	  LocalDate d1=LocalDate.of(1998,Month.SEPTEMBER,20);
	  LocalDate d2=LocalDate.of(2002,Month.SEPTEMBER,11);
	  //LocalDate d3=LocalDate.now();
	  Period d=Period.between(d1, d2);
	  int years=d.getYears();
	  int months=d.getMonths();
	  int days=d.getDays();
	  System.out.println("no.of years : "+years);
	  System.out.println("no.of months : "+months);
	  System.out.println("no.of days : "+days);
	  
  }

}
