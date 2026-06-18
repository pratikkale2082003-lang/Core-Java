package TCS_Question;


public class Hot_Air_Boloon {
	

	  public static void main(String[] args) {
		
		   int arr[] = { 5, 4, 6,3,2};
		     int count = 1;
		     
		     
		      for ( int i = 1; i < arr.length; i++) {
		    	  
		    	   if ( arr[ i] > arr[i -1 ]) {
		    		    count++;
		    		    
		    	   }
		      }
		      
		       System.out.println("Minimum Baloons : " + count);
	}
}
