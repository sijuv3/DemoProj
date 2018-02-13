package test.demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main (String args[]) {
		DateTest d = new DateTest();
		d.demo();
	}
	
	public void demo() {
		String startDate = "01/07/0174";
		DateFormat df = new SimpleDateFormat("mm/dd/yyyy");
		try {
			Date date = df.parse(startDate);
			
			SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
		    SimpleDateFormat format2 = new SimpleDateFormat("dd-MMM");
		    Date dates = format1.parse(startDate);
		    System.out.println(format2.format(dates));
		    
		    Calendar cal = Calendar.getInstance();
	        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	        System.out.println( sdf.format(cal.getTime()) );
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
