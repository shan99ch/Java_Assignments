package OOPS;

import java.util.Scanner;

public class POLIMORPHISM_Substraction_SUPER_RETUTNvalue_GParent extends POLIMORPHISM_Addition_SUPER_RETURNvalue_GGParent {
	int a,b,c;
	static int d;
	//super.d;
	Scanner sc = new Scanner(System.in);
	
	void firstword() 
	{
	   super.firstword();
		System.out.println(" 2nd SUPER :-)");
	}

	void subtraction() 
	{
		
		System.out.println("Enter A value: ");
		a=sc.nextInt();
		System.out.println("Enter B value: ");
		b=sc.nextInt();
		c=a-b;
		System.out.println(a+" - "+b+" = "+c);
		
	}
	void subtraction(int a, int b) 
	{
		System.out.println("Enter A value: ");
		a=sc.nextInt();
		System.out.println("Enter B value: ");
		b=sc.nextInt();
		c=a-b;
		System.out.println(a+" - "+ b +" = "+c);
	}

	int subtraction(int a, int b, int c) 
	{
		//int d;
		System.out.println("Enter A value: ");
		a=sc.nextInt();
		System.out.println("Enter B value: ");
		b=sc.nextInt();
		System.out.println("Enter C value: ");
		c=sc.nextInt();
		d=a-b-c;
		return d;

	}
	public static void main(String[]args)
	{
		
		POLIMORPHISM_Substraction_SUPER_RETUTNvalue_GParent sub = new POLIMORPHISM_Substraction_SUPER_RETUTNvalue_GParent();
		//POLIMORPHISM_Addition_INHERITANCE add = new POLIMORPHISM_Addition_INHERITANCE();
		//add.firstword();
		sub.firstword();
		sub.subtraction();
		sub.subtraction(0, 0);
		sub.subtraction(0, 0, 0);
		System.out.println(d); 
		
		sub.add();
		sub.add(0, 0);
		int addition=sub.add(0, 0, 0);
		System.out.println(addition);
		
		
	}
}
