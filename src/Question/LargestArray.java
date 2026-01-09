package Question;

public class LargestArray {
public static void main(String[] args) {
	

	int arr[] = {4, 2,5,7,3,2};
	
	 int largest = 0;
	 
	  for ( int i = 0; i< arr.length; i++) {
		   if(arr[i] > largest) {
			    largest = arr[i];
			   
			   
		   }
		
	  }
		 
	   System.out.println("Largest Array is : " + largest);
	 
}
}
