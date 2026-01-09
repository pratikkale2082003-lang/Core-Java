package corejava;
//bubble sort
//inspration:- large element come to the end to array by swappping with adjecent element.
public class bubbleSort {

	public static void bubblesort(int arr[]) {
	 for(int i = 0; i<arr.length-1; i++) {
		 
		 
		  for(int j =0; j<arr.length-1-i; j++) {
			  
			  
			   if(arr[j] > arr[j+1]) {
				   
				   
				  // swap
				   int temp = arr[j];
				   arr [j] = arr[j+1];
				   arr[j+1] = temp;
			   }
		  }
	 }
}
 public static void printArr(int arr[]) {
	 for(int k =0; k<arr.length; k++) {
		 
		 System.out.print(arr[k]+ " ");
	 }
		
	 System.out.println();
	 }
	

	
	
	 public static void main(String[] args) {
		 
		  int arr[] = {5,4,3,2,1};
		  
		  bubblesort(arr);
		  printArr(arr);
	 }
	
}
