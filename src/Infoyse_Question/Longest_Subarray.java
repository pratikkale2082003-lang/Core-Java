
 package Infoyse_Question;

  import java.util.*;
  
public class Longest_Subarray {

	 public static void main(String [] args) {
		 
		  int  arr[] = {0,1,0,1,1,1,0};
		   HashMap<Integer, Integer> map = new HashMap<>();
		   
		    int sum = 0;
		     int maxLen  = 0;
		     
		     map.put(0, -1);
		     
		      for(int i = 0; i<arr.length; i++) {
		    	  
		    	   sum = sum + (arr[i] == 0 ? -1 : 1);
		    	   
		    	   
		    	    if (map.containsKey(sum)) {
		    	    	maxLen = Math.max(maxLen, i- map.get(sum));
		    	    	
		    	    } else {
		    	    	
		    	    	 map.put(sum,  i);
		    	    	 
		    	    }
		      }
		       System.out.println(maxLen);
		       
	 }
}
