package OOPS;

import java.util.Scanner;

public class callDetails {
	Scanner sc = new Scanner(System.in);
	private int callid;
	private long callednumber;
	private float duration=0.00f;
	
	public float getDuration() {
		return duration;
	}

	public float setDuration(float duration) {
		this.duration = duration;
		return duration;
	}

	public long getCallednumber() {
		return callednumber;
	}

	public long setCallednumber(long callednumber) {
		this.callednumber = callednumber;
		return callednumber;
	}
	

	public int getCallid() {
		return callid;
	}

	public int setCallid(int callid) {
		this.callid = callid;
		return callid;
	}
	
	public callDetails()
	{
		
	}
	
	public void parsedata(String info)
	{
		//System.out.println("Enter caller ID:");
		//this.callid=sc.nextInt();
		//System.out.println("Enter called Number:");
		//this.callednumber=sc.nextLong();
		//System.out.println("Enter Duration of the call:");
		//this.duration=sc.nextFloat();
		info=String.valueOf(this.setCallid(sc.nextInt()))+":"+String.valueOf(this.setCallednumber(sc.nextLong()))+":"+String.valueOf(this.setDuration(sc.nextFloat()));
		System.out.println("InPut");
		System.out.println("***********");
		System.out.println("Enter the call Details:");
		System.out.println(info);
	}
	
	public int getcallid(int callid)
	{
		return this.getCallid();
	}
	
	public long getcallednumber(long callnumber)
	{
		return this.getCallednumber();
	}
	public float getduration(long duration)
	{
		return this.getDuration();
	}

	
	
	

}
