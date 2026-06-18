package Infoyse_Question;


//You are given an array of size n containing numbers from 1 to n,
//👉 but one number is missing and one number is repeated.


//Input: [1, 2, 2, 4]
//Output: Missing = 3, Repeating = 2
public class Find_Missing_Number {

	 public  static void main(String [] args) {
		 
		  int arr [] = {1,2,2,4};
		   int n = arr.length;
		   
		    int sum = 0;
		     int sqsum = 0;
		     
		      for(int x : arr) {
		    	   sum = sum + x;
		    	   sqsum = sum + x * x;
		    	   
		      }
		  
		      
		       int expsum = n * (n+1) / 2;
		       int expsqsum  =  n * (n + 1) * (2 * n + 1) / 6;
		        
		       int diff = expsum - sum;
		       int sqDiff = expsqsum - sqsum;
		          
		          
		       int  summR = sqDiff / diff;
		           
		       int missing = ( diff + summR) / 2;
		       int repeating = summR - missing;
		              
		             
		         System.out.println("Missing Number : " + missing);
		         System.out.println("Repeating : " + repeating);
		              
	 }
}
