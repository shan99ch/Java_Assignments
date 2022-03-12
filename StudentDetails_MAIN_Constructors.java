package OOPS;

import java.util.Scanner;

import Assignments.StudentDetails_Class_Constructors;

public class StudentDetails_MAIN_Constructors {
	public static void main(String[]args)
	{
		int id;
		String sname,saddress;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Local Student Name:");
		sname=sc.next();
		
		System.out.println("Enter Local Student ID:");
		id=sc.nextInt();
		
		System.out.println("Enter Local Student Address:");
		saddress=sc.next();
		
		StudentDetails_Class_Constructors s= new StudentDetails_Class_Constructors(0, null, null, "NIV");
		// initialized variable value (NIV) shud b invoked while creating object to that class/constructor
		// Takes input values of Student Name,Id & Address from Constructor
		
		//s.setStudentname(null); // declared to create getter & setter 
		//s.setStudentid(0);      
		//s.setStudentaddress(null);
		//s.setCollegename("NIV"); 
		
		System.out.println("Is the Student belong to NIV College??(yes/no)");
		String cname=sc.next();
		
		if(cname.equals("yes"))
		{ 
			
			System.out.println("***********************");
			System.out.println("OutPut");
			System.out.println("***********************");
			System.out.println("Student Name: "+s.getStudentname());
			System.out.println("Student ID: "+s.getStudentid());
			System.out.println("Student Address: "+s.getStudentaddress());
			System.out.println("College Name: "+s.getCollegename());
			System.out.println("***********************");
		}
		else if(cname.equals("no"))
		{
			System.out.println("Enter College Name:: ");
			String collegename=sc.next();
			
			System.out.println("***********************");
			System.out.println("OutPut");
			System.out.println("***********************");
			System.out.println("Student Name: "+s.getStudentname());
			System.out.println("Student ID: "+s.getStudentid());
			System.out.println("Student Address: "+s.getStudentaddress());
			System.out.println("College Name: "+collegename);
			System.out.println("***********************");
		}
		
		
		
		
	}

}
