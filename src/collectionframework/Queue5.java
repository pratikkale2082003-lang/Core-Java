package collectionframework;

import java.util.*;

public class Queue5 {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter The Number : ");
		  int n = sc.nextInt();
		  sc.nextLine();
		Queue<String> q = new LinkedList<>();
		
		System.out.print("Enter Bank name : ");
		   for (int i = 0; i< n; i++) {
			   String bankname = sc.nextLine();
			   q.add(bankname);
			   	    
		   }
		
		    if ( q.contains("sbi")) {
		    	 q.remove("sbi");
		    	  System.out.println("sbi found");
		    }
	
		    else {
		    	 System.out.println("sbi not found ");
		    }
		    
		    System.out.println("After Update  : "  + q);
		     sc.close();     
	}

}
