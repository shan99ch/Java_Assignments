
// Creating 2 classes in 2 different PACKAGES. Invoking this class in another class in another PACKAGE

package Assignments;

import java.util.Scanner;

public class StudentDetails_Class_Constructors {
	
	private int studentid; 
	private String studentname, studentaddress,collegename;
	
	
	
	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getStudentaddress() {
		return studentaddress;
	}

	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	
	// since constructor name & class name shud be d same. so creating two constructors means constructor overloading so make difference at Arguments.
	
	public StudentDetails_Class_Constructors(int studentid, String studentname, String studentaddress )
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("***********************");
		System.out.println("InPut");
		System.out.println("***********************");
		
		System.out.println("Enter Student Name::");
		this.setStudentname(sc.next());
		
		System.out.println("Enter Student ID Number::");
		this.setStudentid(sc.nextInt());
		
		System.out.println("Enter student Address::");
		this.setStudentaddress(sc.next());
		
		this.setCollegename("NIV"); //initialized value
		
	}
	
	public StudentDetails_Class_Constructors(int studentid, String studentname, String studentaddress, String collegename )
	{
		this( studentid, studentname,  studentaddress ); //Re-initializing all variable at a time
		
		this.setCollegename(collegename); //Re-Initializing variable but not reading value
	}
	

}
