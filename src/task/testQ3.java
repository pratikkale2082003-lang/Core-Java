package task;

public class testQ3 {

	public static void main(String[] args) {
		
			
			int arr [] = {15,47,45,89,15,56};
			
			 int remove [] = new int[arr.length];
			 
			 
			 int count;
			 
			 
			 System.out.println("remove the Duplicate element  : ");
			 for (int i = 0; i < arr.length; i++  ){
				  count = 0;
				  
				   for (int j = i+1; j<arr.length; j++) {
					   
					    if (arr[i] == arr[j]) {
					    	 count++;
					    	 
					    }
					     
				   }
				 
				    if( count == 0) {
				    	remove[i] = arr[i];
				    	
				    }
				     if (remove[i] != 0) {
				    	 System.out.print(remove[i] + " ");
				     }
			
	}

	}

}
