package task;

public class testQ4 {

	public static void main(String[] args) {
		
		int arr [] = {15,47,89,28,56};
		
		
	 int arr2 [] = {894,28};

 for( int i = 0; i< arr.length-arr2.length; i++) {
	 
	int j;
	  for( j = 0; j< arr2.length; j++) {
		  if(arr[i+j] != arr2[j]) {
			  break;
		  }
	  }
	  
	
	  if( j == arr2.length) {
		  System.out.println("Array is contain");
		 return ;
		 
	  }
 }
 System.out.println(" array does not contain");
	}

}
