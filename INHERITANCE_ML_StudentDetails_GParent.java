package OOPS;

import java.util.Scanner;

public class INHERITANCE_ML_StudentDetails_GParent {
	Scanner sc=new Scanner(System.in);
	
	
	
	  void Display()
	  {
		
		  String sname,id,dept,cname;
		  System.out.println("Enter student name:");
		  sname=sc.nextLine(); 
		  System.out.println("Enter student Number:");
		  id=sc.nextLine();
		  System.out.println("Enter Department name:");
		  dept=sc.nextLine();
		  System.out.println("Enter College name:");
		  cname=sc.nextLine();
		  System.out.println("Name::"+sname);
			System.out.println("ID::"+id);
			System.out.println("Deportment::"+dept);
			System.out.println("College::"+cname); 
	  }
	
	

}
