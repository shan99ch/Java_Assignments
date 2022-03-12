package OOPS;

import java.util.Scanner;

public class TicketPriceCalc_Class {
	private int ticketid,price;
	private static int availabletickets;
	
	static Scanner sc = new Scanner(System.in);
	
	public int getPrice() {
		return price;
	}

	public int setPrice(int price) {
		return this.price = price;
	}

	public int getTicketid() {
		return ticketid;
	}

	public int setTicketid(int ticketid) {
		return this.ticketid = ticketid;
	}

	void ticketDetails()
	{
		
	}
	
	static int setAvailableTickets(int availabletickets1)
	{
	System.out.println("How many Tickets are Available?? ");
	availabletickets1=sc.nextInt();
	if(availabletickets1>0)
	{
		availabletickets=availabletickets1;  //since "availabletickets" is static.. no need to use "This" pointer.
	}
	else 
	{
		System.out.println("Tickets are not available");
	}
	
	return availabletickets;
	
	}

	int calculateTicketCost(int ntickets)
	{
		//int totalcost;
		//System.out.println("Enter Ticket Price");
		//this.price=sc.nextInt();
		//System.out.println("Enter No. of Tickets:: ");
		//ntickets=sc.nextInt();
		//availabletickets=availabletickets-ntickets;
		//System.out.println("************************");
		//System.out.println("InPut");
		//System.out.println("************************");
		//System.out.println("*Ticket Price:: "+this.price);
		//System.out.println("No. Of Tickets:: "+ntickets);
		//System.out.println("availabletickets:: "+availabletickets);
		return ntickets*this.getPrice();
		
	}

}
