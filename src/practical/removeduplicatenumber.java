package practical;

public class removeduplicatenumber {

	 public static void main(String[] args) {
		
	
	 int number [] = {45,54,36,45,87,66};
	 
	 int remove[] =  new int[number.length];
	 int count;
	  
	 
	 System.out.println("After removing duplicate element  is : ");
	   for (int i =0; i< number.length; i++ ) {
		   
		    count=0;
		     
		     for(int j =i+1; j< number.length; j++) {
		    	 
		    	  if ( number[i] == number[j]) {
		    		  			count++;																														count++;
		    		  
		    	  }
		     }
		      if (count == 0) {
		    	   remove[i] = number[i];
		    	   
		      }
		       if (remove[i] != 0)
		       System.out.print(remove[i] + " ");
	   }
			 
}
}
