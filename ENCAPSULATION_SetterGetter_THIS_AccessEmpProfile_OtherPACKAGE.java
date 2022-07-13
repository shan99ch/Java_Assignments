package OOPS;

import java.util.Scanner;

import Assignments.ENCAPSULATION_SetterGetter_THIS_EmpProfile_OtherPACKAGE; // importing package Assignments & Class as well.
// ?? class  activates for inheritance ?? //
// if not how to inherit a Class from different package to import protected variables??

public class ENCAPSULATION_SetterGetter_THIS_AccessEmpProfile_OtherPACKAGE  {
	static String name;
	static int age;
	static long phone;
	static String designation;
	static double basic_salary, allowance,salary;
	static Scanner sc = new Scanner(System.in);
	
	void employeeDetails() //since we are not initializing any imported variables, need to read input values 
	{                   
		System.out.println("Enter Employee Imported Name:: "); 
		this.name=name;
		name=sc.next();
		System.out.println("Enter Employee Imported Age:: ");
		this.age=age;
		age=sc.nextInt();
		System.out.println("Enter Imported Phone Number:: ");
		this.phone=phone;
		phone=sc.nextLong();
		System.out.println("Imported Basic Salary:: ");
		this.basic_salary=basic_salary;
		basic_salary=sc.nextLong();
		System.out.println("Imported Allowances:: ");
		this.allowance=allowance;
		allowance=sc.nextLong();
		
	}  
	
	
	public static void main (String[] args)
	{
		ENCAPSULATION_SetterGetter_THIS_EmpProfile_OtherPACKAGE profile = new ENCAPSULATION_SetterGetter_THIS_EmpProfile_OtherPACKAGE(); // object for a class from package Assignments
		ENCAPSULATION_SetterGetter_THIS_AccessEmpProfile_OtherPACKAGE ae = new ENCAPSULATION_SetterGetter_THIS_AccessEmpProfile_OtherPACKAGE();
		ae.employeeDetails();
		
//setter & getter// after typing like "profile.age;" it asks u "create setter & getter" click on that generates them automatically in mother class.
	    
		profile.setAge(age);
		//System.out.println("Age:: "+profile.getAge());
		profile.setPhone(phone);
		//System.out.println("Phone Number::"+profile.getPhone());
		profile.setBasic_salary(basic_salary);  // ?? here why it's allowed me to create setter & getter for protected variables
		
		salary= basic_salary+(basic_salary*0.1)-(basic_salary*0.05)+allowance;
		
		System.out.println("*************************************");
		System.out.println("Name::"+name);
		System.out.println("Age:: "+profile.getAge());
		System.out.println("Phone Number::"+profile.getPhone());
		System.out.println("Basic Salary::"+profile.getBasic_salary());
		System.out.println("Allowances:: "+allowance);
		System.out.println("Basic Salary::"+salary);
	}
	
	

}
