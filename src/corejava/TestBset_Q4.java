package corejava;

import java.util.Scanner;

//Write  A  Program  to test if an Array  Contain  a Specific Value
public class TestBset_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner ( System.in);
		 
		  System.out.println("Size of  Array : ");
		  
		   int n = sc.nextInt();
		   
		   int arr [] = new int [n];
		   
		   
		   System.out.println("Enter the Elemenets");
		   
		    for ( int i = 1; i < arr.length ; i++) {
		    	
		    	  arr[i] = sc.nextInt();
		    }
		    
		    
		    
		     System.out.println("Enter Elements to search : ");
		      int key =  sc.nextInt();
		      boolean found = false ;
		       for ( int i = 0; i<=n; i++) {
		    	   
		    	    if ( arr [i] == key ) {
		    	    	 found = true;
		    	    	  break;
		    	    	  
		    	    }
		    	    
		    	    
		       }
		       
		       if ( found ) {
		    	    System.out.println("Elemnets Found ");
		       }
		       else {
		    	    System.out.println("Element Does Not Found The Elements");
		       }
	}

}
