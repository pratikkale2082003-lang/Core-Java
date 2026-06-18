package Infoyse_Question;

import java.util.Arrays;

//🔹 Problem Statement
//
//You are given:
//
//Arrival times of trains
//Departure times of trains
//
// Find minimum number of platforms required so that no train waits
// input : Arrival  = [900, 940, 950, 1100, 1500, 1800]
//        Departure= [910,1200,1120,1130,1900,2000]
//
//Output: 3
public class Minimum_Platforms {

	 public static void main(String [] args) {
		 
		  int arr[] = {900,940,950,1100,1500,1800};
		   int dep [] = {910, 12000, 1120, 1130,1900, 2000};
		   
		    Arrays.sort(arr);
		    Arrays.sort(dep);
		    
		     int i = 0;
		     int j = 0;
             int platform = 0; 
		     int maxplatform = 0;
		      
		     
		      while(i < arr.length && j < dep.length) {
		    	   if (arr[i] <= dep[j]) {
		    		   
		    		    platform++;
		    		    
		    		     maxplatform = Math.max(maxplatform, platform);
		    		     i++;
		    		     
		    	   } else {
		    		   platform--;
		    		   j++;
		    		   
		    	   }
		      }
		    	    System.out.println("Minimum Platforms : " + maxplatform);
		    	    
		      
	 
	 }
}

// Time Complexity : O(N log N)  (sorting);
