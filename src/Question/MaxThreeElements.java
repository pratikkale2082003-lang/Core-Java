package Question;

public class MaxThreeElements {
    public static void main(String[] args) {
        
    	 int arr [] = {4,5,1,8,2,3,9,1};
    	 
    	  int  first = Integer.MIN_VALUE;
    	   int second = Integer.MIN_VALUE;
    	    int third = Integer.MIN_VALUE;
    	    
    	     for (int i = 0; i < arr.length; i++) {
    	    	 
    	    	  if ( arr[i]  > first) {
    	    		  
    	    		   third = second;
    	    		   second = first;
    	    		    first = arr[i];
    	    		    
    	    	  }
    	    	  
    	    	  else if ( arr[i] > second ) {
    	    		  
    	    		   third  = second;
    	    		    second = arr[i];
    	    		    
    	    	  }
    	    	  
    	    	  else if (arr[i] > third) {
    	    		   third = arr[i];
    	    		   
    	    	  }
    	     }
    	     
    	      int  sum = first + second + third;
    	      
    	    		  
    	    		  
    	      System.out.println( "Element  are : " + first +" "+ second+ " " + third );
    	      
    	       System.out.println("Max Sum of Three Element : " +  sum);
    }
}