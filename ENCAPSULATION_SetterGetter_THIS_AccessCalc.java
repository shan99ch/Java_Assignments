package OOPS;

import java.util.Scanner;

import Assignments.ENCAPSULATION_StterGetter_THIS_Calc;

public class ENCAPSULATION_SetterGetter_THIS_AccessCalc {
	static int a;
	static int b,d,e, result,res;
	static Scanner sc = new Scanner(System.in);
	
 void values()
	{
	 System.out.println("Enter Imported A value:: ");
		this.a=a;
		a=sc.nextInt();
		System.out.println("Enter Imported B value:: ");
		this.b=b;
		b=sc.nextInt();
		System.out.println("Enter Imported D value:: ");
		this.d=d;
		a=sc.nextInt();
		System.out.println("Enter Imported E value:: ");
		this.e=e;
		b=sc.nextInt();	
		
	} 

	public static void main(String[] args) {
		
		ENCAPSULATION_StterGetter_THIS_Calc  access = new ENCAPSULATION_StterGetter_THIS_Calc ();
		
		 ENCAPSULATION_SetterGetter_THIS_AccessCalc ac =new  ENCAPSULATION_SetterGetter_THIS_AccessCalc();
		//ac.values();
		 
//to display or use any imported private or protected variables in main function need to make them public here.		 
// type access.a(variable name); it asks u to create getter & setter methods
		 
		access.setA(a);
		access.setB(b);
		access.setD(d);
		access.setE(e);
		result= a*b;
		res=d/e;
		System.out.println("A value: "+access.getA());
		System.out.println("B value: "+access.getB());
		System.out.println("D value: "+access.getD());
		System.out.println("E value: "+access.getE());
		System.out.println("Multiplication:: "+result);
		System.out.println("Division:: "+res);
	}

}
