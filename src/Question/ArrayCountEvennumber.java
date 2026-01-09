package Question;

public class ArrayCountEvennumber {

	 public static void main(String[] args) {
		
		  int arr [] = {5,8,4,7,9,2,6};
		  
		   int count = 0;
		   
		    for (int i = 0; i< arr.length; i++) {
		    	 if (arr[i] % 2 ==0) {
		    		  System.out.println("Even Number "+ arr[i]);
		    		  count++;
		    		  
		    	 }
		    	 else {
		    		 System.out.println("Odd Number "+ arr[i]);
		    		 
		    		  
		    	 }
		    }
		     System.out.println("Even number Count is : " + count);
	}

}
 