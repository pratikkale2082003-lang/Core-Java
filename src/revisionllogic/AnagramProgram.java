package revisionllogic;

import java.util.Arrays;

public class AnagramProgram {

	 public static void main(String [] args) {
//		  Scanner sc = new Scanner(System.in);
		  
		 
		  String str1 = "god";
		  String str2 = "dog";
		  
		   char [] arr1 = str1.toCharArray();
		    char[] arr2 = str2.toCharArray();
		    
		    
		    Arrays.sort(arr1);
		    Arrays.sort(arr2);
		     if (Arrays.equals(arr1, arr2)) {
		    	 
		    	  System.out.println("Anagram ");
		    	  
		     }
		   
		     else {
		    	 System.out.println("Not Anagram ");
		    	 
		     }
	 }
}
