package Question;

public class RemoveDuplicatesArray {
public static void main(String[] args) {
	

int number [] = { 8,22,88,22,74,10};
	 
	  int remove[] = new int[number.length];
	  int count;
	  
	   System.out.println("After Removing Duplicate Element ");
			  
	    for(int i = 0; i< number.length; i++) {
	    	 count = 0;
	    	 
	    	  for ( int j = i+1; j< number.length; j++) {
	    		   if ( number[i] ==number[j]) {
	    			   
	    			    count ++;
	    			    
	    		   }
	    		   
	    	  }
	    
	     if( count  == 0) {
	    	  remove[i] = number[i];
	    	  
	     }
	     if(remove [i] != 0) 
	    	  System.out.print(remove[i] + " ");
	    	  
	     }
}
}