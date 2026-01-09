package Question;

public class PalindromeArray {

	 public static void main(String[] args) {
		
		  int arr [] = {10, 20, 30, 20, 10, };
		  
		    boolean isPalindrome = true;
		     int start = 0;
		      int end = arr.length-1;
		      
		       while (start < end ) {
		    	   if( arr[start] != arr[end] ){
		    		   isPalindrome = false;
		    		    break;
		    		    
		    	   }
		    	   
		    	    start++;
		    	     end--;
		       }
		       
		       if (isPalindrome) {
		    	   System.out.println("Palindrome Array");
		       }
		    	
		       
		       else {
		    	   System.out.println("Not Palindrome Array");
		       }
	}
}
