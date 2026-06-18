package Question;

public class SimpleThreeSum {

	 public static void main(String[] args) {
		int arr[] = {2,5,1,8,2,9,1};
		
		 int maxSum  = 0;
		 
		  for ( int i =0; i < arr.length-2;  i++) {
			  
			   int sum = arr[ i] + arr[i+1] + arr[i+2];
			   
			    if (sum  > maxSum) {
			    	 maxSum = sum;
			    	 
			    }
		  }
		  
		  System.out.println("Maz Sum = " + maxSum);
	}
}
