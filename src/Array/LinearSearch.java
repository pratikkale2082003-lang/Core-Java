package Array;

public class LinearSearch {

	public static void main(String[] args) {
		int arr [] = {5,4, 3,7,9};
		    int key = 4;
		    
		     for (int i = 0; i < arr.length; i++) {
		    	 
		    	  if (key == arr[i]) {
		    		  
		    		   System.out.println("Linear Search : " + i);
		    	  }
		     }
	}
}
