package TCS_Question;

//N = total number of soldiers in the line
//R = soldiers are numbered  from  1  to R
//end =  the  last soldiers must be this number

//Rules
//1. the arrangement must start with soldiers 1;
//2. the arrangement must end with d soldiers end
//3. NO two adjacent soldier can have the same number
//4. You can use numbers from 1 to R multiple times
//5. Find the total number of valid arrangements of length N
public class Arrange_King_Army {

	public static void main(String[] args) {
		
		 int N = 5;      // length
		 int R = 3;     // soldiers 1 to R
		 int end = 2;  // last soldier must be 2
		 
		 
		  int  dp [][] = new int[N +1][R + 1];
		// start must be 1
		  dp [1][1] = 1;
		  
		   
		   
		    for (int i = 2; i<=N; i++) {
		    	
		    
//		     total ways from previous row
		    	  for (int j = 1; j <= R; j++) {
		    	
		    	  
		     
		    
//		    	   current row 
		    	    for (int k = 1; k<= R; k++) {
		    	    	
		    	    	 if (k != j  ) {
		    	    		 
		    	    	 
		    	    	 dp [i][j] +=  dp[ i - 1][k];
		    	    	 }
		    	    }
		     }
		    }
		     System.out.println(dp[N] [end]);
		     }
	}

	

