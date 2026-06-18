package TCS_Question;

import java.util.Arrays;

public class Air_boloon {

	 public static void main(String[] args) {
		 int arr [] = {40,50,60,30};
		 
		  int x = 100;
		  
		  Arrays.sort(arr);
		   int i = 0;
		   
		    int j = arr.length-1;
		     int balloons = 0;
		     
		      while(i <= j) {
		    	  
		    	   if (arr[i] + arr[j] <= x) {
		    		   i++;
		    	   }
		    	    j--;
		    	    balloons++;
		    	    
		      }
		       System.out.println("MInimums Booloon : " + balloons);
	}
}
