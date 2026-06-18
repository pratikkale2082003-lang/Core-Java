package TCS_Question;
//🔵 Problem:
//Array: [2, 3, 1, 1, 4]
//👉 Each element represents the maximum jump length from that position
//👉 Goal: Reach the last index with minimum number of jumps
//
//🧠 Approach (Greedy):
//We track 3 things:
//
//jumps → number of jumps taken
//end → current jump range limit
//farthest → farthest index we can reach so far
public class Minimum_Jumps_Reach_End {

	
	 public static int  minjumps( int [] arr) {
		 
		  int jumps = 0;
		   int end = 0;
		    int farthest = 0;
		    
		     for (int i = 0; i < arr.length-1; i++) {
		    	 
		    	  farthest =Math.max(farthest, i + arr[i]);
		    	  
		    	   if ( i == end ) {
		    		    jumps++;
		    		    end = farthest;
		    		    
		    	   }
		     }
		     
		      return jumps;
		      
	 }
	
	 public static void main(String [] args) {
		 
		  int arr[] = {2,3,1,1,4, 1};
		  
		  System.out.println("Minimum OF Jumps :  " + minjumps(arr));
	 }
}
