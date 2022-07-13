package OOPS;

import java.util.Scanner;

public class POLIMORPHISM_Multiplication_SUPER_RETURNvalue_Parent extends POLIMORPHISM_Substraction_SUPER_RETUTNvalue_GParent {
int a,b,c;
//static int d;
Scanner sc = new Scanner(System.in);

void firstword() 
{
	super.firstword();
	System.out.println(" 3rd SUPER :-)");
}

void multiplication() 
{
	System.out.println("Enter A value: ");
	a=sc.nextInt();
	System.out.println("Enter B value: ");
	b=sc.nextInt();
	c=a*b;
	System.out.println(a+" x "+b+" = "+c);
	
}
void multiplication(int a, int b) 
{
	System.out.println("Enter A value: ");
	a=sc.nextInt();
	System.out.println("Enter B value: ");
	b=sc.nextInt();
	c=a*b;
	System.out.println(a+" x "+ b +" = "+c);
}

int multiplication(int a, int b, int c) 
{
	int d;
	System.out.println("Enter A value: ");
	a=sc.nextInt();
	System.out.println("Enter B value: ");
	b=sc.nextInt();
	System.out.println("Enter C value: ");
	c=sc.nextInt();
	d=a*b*c;
	return d;

}

  public static void main(String[]args)
  {
	  POLIMORPHISM_Multiplication_SUPER_RETURNvalue_Parent multi =new POLIMORPHISM_Multiplication_SUPER_RETURNvalue_Parent();
	     multi.firstword();
	     
	     multi.add();
	     multi.add(0, 0);
	     multi.add(0, 0, 0);
	     System.out.println(d);
	     
	     multi.subtraction();
	     multi.subtraction(0, 0);
	     int d=multi.subtraction(0, 0, 0);
	     System.out.println(d);
	     
	     multi.multiplication();
	     multi.multiplication(0, 0);
	    int d1= multi.multiplication(0, 0, 0);
	     System.out.println(d1);
  }
}


