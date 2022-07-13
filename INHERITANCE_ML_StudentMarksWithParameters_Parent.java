package OOPS;

import java.util.Scanner;

public class INHERITANCE_ML_StudentMarksWithParameters_Parent extends INHERITANCE_ML_StudentDetails_GParent {
	Scanner sc= new Scanner(System.in);
 
 void displaymarks(int m1,int m2,int m3,int m4,int m5)
 {
	
	 System.out.println("Enter Marks 1:");
	 m1=sc.nextInt(); // these input statements help to read values  in Mother class while running program 
	 System.out.println("Enter Marks 2:");
	 m2=sc.nextInt(); 
	 System.out.println("Enter Marks 3:");
	 m3=sc.nextInt();
	 System.out.println("Enter Marks 4:");
	 m4=sc.nextInt();
	 System.out.println("Enter Marks 5:");
	 m5=sc.nextInt();

	 int total=m1+m2+m3+m4+m5;
	 System.out.println("Marks 1 ::"+m1); // These staements help to display output in Mother class
	 System.out.println("Marks 2 ::"+m2); 
	 System.out.println("Total 3 ::"+m3);
	 System.out.println("Total 4 ::"+m4);
	 System.out.println("Total 5 ::"+m5);
	 System.out.println("Total Marks::"+total);
 }
 
}
