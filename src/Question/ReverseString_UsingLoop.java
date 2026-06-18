package Question;

import java.util.Scanner;

public class ReverseString_UsingLoop {

	
	 public static void main(String [] args) {
		 
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter String : ");
		  String str = sc.nextLine();
		  
		   String rev = "";
		   
		    for (int i = str.length()-1; i>=0; i--) {
		    	 rev = rev + str.charAt(i);
		    	 
		    }
		     System.out.println("Reverse String : " + rev);
		  sc.close();
		  
	 }
}
