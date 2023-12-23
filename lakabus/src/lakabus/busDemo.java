package lakabus;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import Busreverse.Booking;
import Busreverse.Bus;

public class busDemo {

	public static void main(String[] args) throws SQLException {
		
		
		busDAO busdao=new busDAO();
		busdao.displayBusInfo();
		int userobject=1;
		Scanner input =new Scanner(System.in);
		
		while(userobject==1) {
			System.out.println("enter 1 to book 2 is exit :");
			userobject=input.nextInt();
			if (userobject==1){
				Booking booking=new Booking();
				if(booking.isAvailable( )){
					bookings.add(booking);
					System.out.println("you booking is confrom");
			}
				else {
					System.out.println("sorry ur bus is full");
				}
				
			}
		}

	}
	}

