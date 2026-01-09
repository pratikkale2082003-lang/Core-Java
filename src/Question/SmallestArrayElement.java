package Question;

public class SmallestArrayElement {

	 public static void main(String[] args) {
		
		  int arr [] = { 4,7,5,2,6};
		  
		   int smallest = arr[0];
		   
		    for( int i = 0; i< arr.length; i++) {
		    	
		    	 if ( arr[i]< smallest) {
		    		 
		    		 smallest = arr[i];
		    		 
		    	 }
		    }
		     System.out.println("Smallest Elements : " + smallest);
	}
}
