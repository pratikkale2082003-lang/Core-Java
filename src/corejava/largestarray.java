package corejava;

public class largestarray {
	
	 public static int largest(int number[]) {
		 
		  int largest = Integer.MIN_VALUE;
		  int smallest = Integer.MAX_VALUE;
		 
		  
		   for(int i =0; i<number.length; i++) {
			   
			    if(largest < number[i]) {
			              largest = number[i];
			              
		   }
			if(smallest > number[i])    {
				smallest = number[i];
			}
			    
	 }
		    System.out.println("Smallest number  is :  " + smallest);
		    return largest;
	 }
	
	 public static void main(String []args) {
		 
		  int number [] = {12,15,11,25,20};
		  
		   System.out.println("largest number  is : " + largest(number));
	 }
}
