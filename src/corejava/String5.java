package corejava;

import java.util.*;
// find the index String without using the charctercann
public class String5 {

	 public static void  main(String [] args) {
//		 		 String str = "cravita";  
		 		 
		 		 Scanner sc = new Scanner(System.in);
		 		 System.out.print("Enter the String :");
		 		  String str = sc.nextLine();
		 		  
		 		  
	  
	  
	  System.out.print("Enter the index : ");
	   int index = sc.nextInt();
	   
			   char chr[] = str.toCharArray();
			   for(int i = 0; i<chr.length; i++) {
				   
				   
				    if(index == i) {
				    	  System.out.println(chr[i]);
				    }
			
			   
			 }
		 
	 }

}