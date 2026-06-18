package Infoyse_Question;

import java.util.*;

public class Next_Greater_Element {

	
	 public static  void main(String [] args) {
		 
		  int arr[] = {4,5,2,25};
		  
		   Stack<Integer> stack = new Stack<>();
		   
		   
		    for ( int i = arr.length-1; i >=0;  i--) {
		    	 while(!stack.isEmpty() && stack.peek() <= arr[i]) {
		    		 
		    		  stack.pop();
		    		  
		    	 }
		    	  if ( stack.isEmpty()) {
		    		  System.out.println(arr[i] + " ->  -1");
		    		  
		    	  } else {
		    		  System.out.println(arr[i] + " -> " + stack.peek());
		    		  
		    	  }
		    	   stack.push(arr[i]);
		    	   
		    }
	 }
}
