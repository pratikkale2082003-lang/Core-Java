package corejava;

public class largestnumber {

	 public static int largestnumber(int numbers[]) {
		  
		 int largest =Integer.MIN_VALUE;
  int smallest = Integer.MAX_VALUE;
		  
		  for(int i = 0; i<numbers.length; i++) {
			   if( largest < numbers[i]) {
			   largest = numbers[i];
			   
		  }
			   
			 if(smallest > numbers[i]) {
				 smallest = numbers[i];
				 
			 }
	 }
		  
		  System.out.println("Smallest value " +  smallest);
		    return largest;
	
	 }
public static void main(String [] args) {
	int numbers[] = {2,4,6,8,10};
	
	System.out.println(" largest Value is  : " + largestnumber(numbers));
	
}
	
}
