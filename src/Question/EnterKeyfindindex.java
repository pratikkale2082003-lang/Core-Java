package Question;

import java.util.Scanner;

public class EnterKeyfindindex {

	
	 public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter Size Of Array : ");
		  
		   int n = sc.nextInt();
		   
		    int arr[] = new  int[n];
		    
		     System.out.println("Enter The  Elements : ");
		      for (int i = 0; i<arr.length; i++) {
		    	  arr[i] = sc.nextInt();
		    	  
		      }
		      
		       System.out.println("Enter the  Key To Search : ");
		        int key  = sc.nextInt();
		        
		         boolean found = false;
		         
		          for (int i = 0; i< arr.length; i++) {
		        	  
		        	   if ( key == arr[i]) {
		        		     System.out.println(key + " Found At index is :  " + i);
		        	   found = true;
		        	   break;
		        	   }
		        	    
		          }
		           if (!found) {
		        	   System.out.println(key + " not found in the Array.");
		           }
		            sc.close();
	}
}
