package TCS_Question;

public class RemoveDuplicate_Array {

	
	 public static void main(String[] args) {
		 
		   int arr[] = {4,5,8,9,5,2,1};
		   
		    int remove [] = new int[arr.length];
		    
		     int count ;
		     
		      System.out.println("After Removing Duplicate Elemenets");
		      
		       for (int i = 0; i<arr.length; i++) {
		    	    count = 0;
		    	     for(int j = i+1;  j < arr.length; j++) {
		    	    	 
		    	    	  if (arr[i] == arr[j]) {
		    	    		   count++;
		    	    		   
		    	    	  }
		    	     }
		    	     
		    	     
		    	     
		    	      if ( count == 0) {
		    	    	   remove[i] = arr[i];
		    	    	   
		    	      }
		    	      
		    	       if ( remove[i] != 0)
		    	    	    System.out.print(remove[i] + " ");
		    	       
		       }
	 }
}
