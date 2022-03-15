package Arrays_Strings;

import java.util.Scanner;

public class ReplaceCharacter {

	public static void main(String[] args) {
		String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String::");
		StringBuffer name= new StringBuffer(sc.next());
		String name1=name.toString();
        System.out.println("Enter a character to be found?");
        String find=sc.next();
        System.out.println("Enter a character to be replaced?");
        String replace=sc.next();
        int index=name1.indexOf(find);
        System.out.println("Index::"+index);
        if(index >0) {
        	String newname=name1.replace(find,replace);
            System.out.println("New Name:: "+newname);
        }else
        {
        	System.out.println(find+" not found");
        }
        
	}

}
