package Question;

public class Duplicate_Stringarray {

	 public static void main(String[] args) {
		 String  arr [] = { "A", "B", "C", "B", "E"};
		 boolean found = false;
		   for ( int i = 0; i< arr.length; i++) {
			   
			    for (int j = i+1;  j< arr.length; j++) {
			    	
			    	 if (arr[i].equals(arr[j])) {
			    		 
			    		  found = true;
			    		  System.out.println("Duplacte String : " + arr[i]);
			    		   break;
			    	 }
			    
		   
			    	 
			    
		   } }
		   
		    if (!found) {
		    	 System.out.println("No Duplicate String");
	        
		    }
	}
}
