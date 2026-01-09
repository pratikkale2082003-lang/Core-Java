package Question;

public class CountDuplicateArray {

	 public static void main(String[] args) {
		
	
	 int arr [] = {5,7,8,4,9,2,4,6,5};
	 
	  int count = 0;
	  
	   for ( int i = 0; i < arr.length; i++) {
		   
		   
		   
		    for (int j = i +1; j< arr.length; j++) {
		    	
		    if( arr[i]  == arr[j]) {

		    	 System.out.println("Duplcate array is : " + arr[i]);
		    	  count ++;
		    }
		    }
	   }
	   
	    if ( count > 0) {
	    	 System.out.println("Count  Of Duplacte array Number : " +  count);
	    }
	    else {
	    	 System.out.println("Count is 0");
	    }
}
	 }
