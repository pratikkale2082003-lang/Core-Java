package practical;

public class matrix4x4array {

	public static void main(String[] args) {
		

		 int arr[][] = { {11,12,13,14},
		                 {15,16,17,18},
		                 {19,20,21,22},
		                 {23,24,25,26}
				        };
		 
		  int largest = 0;
		  
		  
		 
	        for(int i = 0; i < arr.length; i++) {
	            for(int j = 0; j < arr[i].length; j++) {
	                if(arr[i][j] > largest) {
	                    largest = arr[i][j];
	                }
	            }
	        }
	     
	        
		  for(int i = 0; i< arr.length; i++) {
			  for(int j = 0; j< arr.length; j++) {
				
				   if ( i == 0 || j == 0 || i == arr.length-1 || j == arr.length-1) {
					  
					   
					   System.out.print( arr[i] [j] + " ");
				   }
				   else {
					   System.out.print("   ");
				   }
				 
				  
			  }
			  
			  System.out.println();
			  
		  }
		  
		  
		   System.out.println("the largest element is : " + largest);
	}

	}


