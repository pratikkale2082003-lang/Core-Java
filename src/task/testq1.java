package task;

//Write a program  to find the second largest element in an array.
public class testq1 {

	public static void main(String[] args) {
	
		 int arr [] = {15,10,9,12,8};
		 
		 int largest = 0;
		 for(int i = 0; i< arr.length; i++) {
			 if(arr[i] > largest) {
				 largest = arr[i];
				 
			 }
		 }
		 
		  System.out.println("largest Array  : " + largest);
		  
		  int second = 0;
		  for(int i = 0; i<arr.length; i++) {
			  if(arr[i] > second && arr[i] != largest) {
				  second = arr[i];
				  
			  }
		  }
		  System.out.println("Second  largest Array : "+ second);
	}
	
	

}
