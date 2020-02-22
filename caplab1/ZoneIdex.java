package caplab1;

import java.time.LocalTime;
import java.time.ZoneId;

public class ZoneIdex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId zoneid=ZoneId.of("America/New_York");
		//ZoneId zoneid2 = ZoneId.of("Asia/Tokyo"); 
		LocalTime t1=LocalTime.now(zoneid);
		//LocalTime t2 = LocalTime.now(zoneid2);
		System.out.println(t1);
		//System.out.println(t2);
        //System.out.println(t1.isBefore(t2));
	}

	
}
