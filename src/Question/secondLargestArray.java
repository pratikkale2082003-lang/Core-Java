package Question;

public class secondLargestArray {

	public static void main(String[] args) {
		 int arr [] = {2,8,6,7,5,4};
		 
		  int largest = 0;
		   for ( int i = 0; i< arr.length; i++) {
			   if ( arr[i] > largest) {
				   
				     largest = arr[i];
				     
			   }
		   }
		    System.out.println("Largest Element : " + largest);
		    
		     int  second = 0;
		     
		     for (int i = 0; i< arr.length; i++) {
		    	 if (arr[i] > second && arr[i] != largest) {
		    		 
		    		  second = arr[i];
		    		  
		    	 }
		     }
		     
		      System.out.println("Second Largest Element : " +  second);
	}
}
