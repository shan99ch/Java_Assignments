package OOPS;

public class ABSTRACTIONexecution_Shape_RETURNvalue {

	public static void main(String[] args) {
		
		ABSTRACTION_Shape_Circle sc=new ABSTRACTION_Shape_Circle();
		double area;  //common Variable to receive Return Values from "different" classes. If receiving Return values from "Same classes" declare ifferent variables 
		area=sc.calculateArea(); //storing Return value into Variable 
		System.out.println(area); //printing that value
		sc.setColor();
		
		
		ABSTRACTION_Shape_Square ss = new ABSTRACTION_Shape_Square();
		area=ss.calculateArea(); //storing Return value into Variable 
		System.out.println(area);  //printing that value
		ss.setColor();

	}

}
