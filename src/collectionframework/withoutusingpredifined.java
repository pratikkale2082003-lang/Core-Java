package collectionframework;

import java.util.ArrayList;

public class withoutusingpredifined {

	
	 public static void main(String[] args) {
		
			ArrayList al = new ArrayList(); 
		 
			 al.add(45); 
			  al.add("pratik");
			  al.add('c');
			  al.add(10.25);
			  al.add(4569874523698l);
			
			
			   for (int i = 0; i<al.size(); i++) {
				   
				    if (i == 3) {
				    	al.add(3,4.5);
				    }
				
			   }
	
	 System.out.println(" generic collection : " + al);
}}
