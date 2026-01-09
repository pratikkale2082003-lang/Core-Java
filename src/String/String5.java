package String;

import java.util.Scanner;

public class String5 {

	// find the index String without using the charcter.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      System.out.print("Enter  String : ");
		 String  s= sc.nextLine();
		 
	
		  System.out.print("Enter the index : ");
		  int index = sc.nextInt();
		  
		   char ch [] = s.toCharArray();
		   for ( int i = 0; i < ch.length; i++ ) {
			   
			    if ( index == i ) {
			    	System.out.println(ch[i]);
			    }
		   }
	}

}
