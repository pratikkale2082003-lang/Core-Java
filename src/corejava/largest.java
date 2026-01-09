package corejava;

public class largest {

	public static  int  getlargest(int number[]){
		
		 
		 int largest = Integer.MIN_VALUE;
		 int smallest = Integer.MAX_VALUE;
		 
		 
		 for(int i = 0; i<number.length; i++) {
		 if(largest < number[i]) {
			 largest = number[i];
		 }
		 
		 if( smallest > number[i]) {
			 smallest = number[i];
			 
		 }
	}
		 
		  System.out.println("Smallest number : " + smallest);
		  return largest;
		  
		  
	}
	
	 
	  public static void main(String [] args) {
		  int number[] = {2,4,8,5,3};
		  
		  
		  System.out.println("largest Number :  " + getlargest(number));
	  }
}
