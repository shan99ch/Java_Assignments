
// rule 1: it used  to refer immediate parent class Object

package OOPS;

import java.util.Scanner;

public class POLIMORPHISM_Addition_SUPER_RETURNvalue_GGParent  {
	static int a,b,c,d;
	Scanner sc=new Scanner(System.in);
	
	void firstword() 
	{
		System.out.println(" 1st SUPER :-)");
	}
	
void add()   //polymorphism is 1 function many ways with same Method name different actions.
{
	System.out.println("Enter A value: ");
	a=sc.nextInt();
	System.out.println("Enter B value:");
	b=sc.nextInt();
	c=a+b;
	System.out.println(a+" + "+ b +" = "+ c);
}

void add(int a, int b )
{
	System.out.println("Enter A value: ");
	a=sc.nextInt();
	System.out.println("Enter B value:");
	b=sc.nextInt();
	c=a+b;
	System.out.println(a+" + "+ b +" = "+ c);
}

int add(int a,int b, int c) {
	System.out.println("Enter A value: ");
	a=sc.nextInt();
	System.out.println("Enter B value:");
	b=sc.nextInt();
	System.out.println("Enter C value: ");
	c=sc.nextInt();
	d= a+b+c;
	return d;
}


}
