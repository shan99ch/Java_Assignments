package OOPS;

import java.util.Scanner;

public class TicketPriceCalc_MAIN {

	public static void main(String[]args)
{
		int total;
		Scanner sc=new Scanner(System.in);
		TicketPriceCalc_Class tpc = new TicketPriceCalc_Class();
		
		System.out.println("Enter No.Of Bookings");
		int nbookings=sc.nextInt();
		
		while(nbookings>0)
		{
		System.out.println("Enter Ticket ID");
		int ticketid=tpc.setTicketid(sc.nextInt()); //setter getter are public void methods but if u directly want to access input values in Main Function it ask u change it to return type -> click on it
		                                            // then  go back to the base function give retun statement for setter Method only..by default getter Method declare return statement.
		
		//System.out.println("Enter No. Of Ticket Available");
		int navailabletickets=tpc.setAvailableTickets(0);
		
		System.out.println("Enter No. Of Tickets: ");
		int ntickets=sc.nextInt();
		
		System.out.println("Enter Ticket Price");
		int price=tpc.setPrice(sc.nextInt());
		
		total=tpc.calculateTicketCost(ntickets);
		int nextavailabletickets = navailabletickets-ntickets;
		
		System.out.println("*************************");
		System.out.println("OutPut");
		System.out.println("*************************");
		System.out.println("Ticket ID:: "+ticketid);
		System.out.println("No. Of Tickets Available:: "+navailabletickets);
		System.out.println("No. Of Tickets:: "+ntickets);
		System.out.println("Ticket Price:: "+price);
		System.out.println("Total Amount:: "+ total);
		System.out.println("Tickets Available after booking:: "+nextavailabletickets);
		navailabletickets=nextavailabletickets;
		
		nbookings--;
		}
		
		
}
}
