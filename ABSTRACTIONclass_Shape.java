package OOPS;

import java.util.Scanner;

public abstract class  ABSTRACTIONclass_Shape {
	String color;
	Scanner sc = new Scanner(System.in);
	
	abstract double calculateArea();
	
	void setColor()
	{
		System.out.println("Enter ur fav color: ");
		color=sc.next();
		System.out.println(color);
	}

}
