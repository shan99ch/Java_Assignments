package OOPS;

public class Main_CallDetails {
	public static void main(String[]args)
	{
		callDetails c=new callDetails();
		c.setCallid(0); 
		c.setCallednumber(0);
		c.setDuration(0);
		c.parsedata(null);
		int id=c.getCallid();
		long number=c.getcallednumber(0);
		float d=c.getDuration();
		System.out.println("                 ");
		System.out.println("OutPut");
		System.out.println("***********");
		System.out.println(id);
		System.out.println(number);
		System.out.println(d);
	}

}
