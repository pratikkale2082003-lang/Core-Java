package Question;

public class AvgofArray {

	 public static void main(String[] args) {
		
		  int  arr [] = {14, 15, 17,12,14};
		  
		  int sum  = 0;
		   
		    for ( int i = 0; i< arr.length; i++) {
		    	
		    	  sum = sum + arr[i];
		    }
		    	    double  avg = sum / arr.length; 
		     System.out.println(" Avg of array is : " + avg);
	}
}
