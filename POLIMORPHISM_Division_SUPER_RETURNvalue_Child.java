package OOPS;

import java.util.Scanner;

public class POLIMORPHISM_Division_SUPER_RETURNvalue_Child extends POLIMORPHISM_Multiplication_SUPER_RETURNvalue_Parent {
	static int a,b,c;
	//static int d;
	Scanner sc = new Scanner(System.in);

	void firstword() 
	{
		super.firstword();
		System.out.println(" 4th SUPER :-)");
	}
	
	void division() 
	{
		System.out.println("Enter A value: ");
		a=sc.nextInt();
		System.out.println("Enter B value: ");
		b=sc.nextInt();
		c=a/b;
		System.out.println(a+" / "+b+" = "+c);
		
	}
	void division(int a, int b) 
	{
		System.out.println("Enter A value: ");
		a=sc.nextInt();
		System.out.println("Enter B value: ");
		b=sc.nextInt();
		c=a/b;
		System.out.println(a+" / "+ b +" = "+c);
	}

	int division(int a, int b, int c) 
	{
		int d;
		System.out.println("Enter A value: ");
		a=sc.nextInt();
		System.out.println("Enter B value: ");
		b=sc.nextInt();
		System.out.println("Enter C value: ");
		c=sc.nextInt();
		d=(a/b)/c;
		return d;

	}
	
	public static void main(String[]args)
	{
		POLIMORPHISM_Division_SUPER_RETURNvalue_Child div =new POLIMORPHISM_Division_SUPER_RETURNvalue_Child();
		
		div.firstword();
		div.add();
		div.add(a, b);
		int d=div.add(a, b, c);
		System.out.println(d);
		
		div.subtraction();
		div.subtraction(a, b);
		int d1=div.subtraction(a, b, c);//since its a return type  method it returns value thats y we  need to assign a variable store that value in it
		System.out.println(d1);         // to print that value.
		
		div.multiplication();
		div.multiplication(a, b);
		int d2=div.multiplication(a, b, c);
		System.out.println(d2);
		
		div.division();
		div.division(a, b);
		int d3=div.division(a, b, c);
		System.out.println(d3);
	}

}
