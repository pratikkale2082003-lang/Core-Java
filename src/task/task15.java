package task;

// check the array size even number.
public class task15 {

	 public static void main(String [] args) {
		  int arr[] = {1,2,3,4,5};
		  
		  System.out.println("the array Even number : ");
		  
		  for(int i =0; i<arr.length; i++) {
			  if(arr[i] % 2 == 0) {
				  System.out.println(arr[i]);
			  }
		  }
		  
	 }
}
