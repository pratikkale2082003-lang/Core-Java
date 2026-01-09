package corejava;

import java.util.Scanner;

public class linearsearch1 {
  public static void main(String[] args) {
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the size : ");
	   int size = sc.nextInt();
	   
	int number [] =   new int[size];
	
	System.out.print("Enter the element : ");
	
	 for (int i = 0; i< number.length; i++) {
		 number[i] = sc.nextInt();
		 
	 }
	
	  System.out.println("Enter the key :  ");
	   int  key = sc.nextInt();
	 
	  for (int i = 0; i< number.length; i++) {
		   
		   if ( number[i] == key) {
			   System.out.println(" the index value is " + i);
		   }
//		 
	  }
}
} 
