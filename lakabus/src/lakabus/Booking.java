package lakabus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	Booking(){
		Scanner input=new Scanner(System.in);
		System.out.println("enter the passanger name:");
		passengerName=input.next();
		System.out.println(" enter the bus number:");
		busNo=input.nextInt();
		System.out.println("enter date dd-MM-yyyy:");
		String dateinput=input.next();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			dateformat.parse(dateinput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		int capacity=0;
		for (Bus bus : buses) {
			if (bus.getbusno()==busNo) 
				capacity=bus.getcapacity();
		}
		int booked=0; 
		for (Booking b : bookings) {
			if(b.busNo==busNo && b.date.equals(date)) {
				booked++;
			
		}
			
		}
		return booked<capacity?true:false;
	
	}
	
	
	
}
