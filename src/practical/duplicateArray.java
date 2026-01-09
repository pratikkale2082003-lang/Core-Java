package practical;

public class duplicateArray {

	public static void main(String[] args) {
		int arr[] = {5,4,6,2,4,8};
	int count= 0;
	
		
		 for (int i =0; i< arr.length; i++) {
			 

			  
			  for ( int j =  i + 1; j<arr.length; j++) {
				  
				   if (arr[i] == arr[j]) {
					    count++;
					    
					   System.out.println("Duplicate array is  : "+ arr[i]);
					    
					   
				   }
				   
				   }
				 
			  }
		 
		 if(count == 0) {
			 System.out.println("not present Duplicate array"); // false
		 }
		 else {
		 System.out.println("present Duplicate array"); // true
		 }
	}
}