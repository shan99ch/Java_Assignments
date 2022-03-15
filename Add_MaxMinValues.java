package Arrays_Strings;

import java.util.Scanner;

public class Add_MaxMinValues {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int i=0,n=5;
		 int a[]=new int[n];
		 
    System.out.println("Enter Numbers:");
   for(i=0;i<n;i++)
   {
	  a[i]=sc.nextInt();
   }
   
 int max=a[0];
  for(i=0;i<n;i++)
  {
	  if(a[i]>max)
	  {
		max=a[i];
	  }
	
   }
   System.out.println("MAx value:: "+max);

  int min=a[0];
  for(i=0;i<n;i++)
  {
	  if(a[i]<min)
	  {
		 min=a[i];
	  }
	
   }
   System.out.println("MAx value:: "+min);

   System.out.println("Addition of Max & Min values is:: "+(max+min));
   
}
}
