package practical;

public class rightrotationarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				 int arr[]  = {57,82,64,91,30};
				 System.out.println("Before Right Rotation  ");
				  for (int j = 0; j<arr.length; j++) {
					  System.out.print(arr[j] + " ");
				  }
				   System.out.println("\n----------------------------------------------------------------------------------------------");
				    
	    int temp = arr[arr.length-1];  
		for(int i =arr.length-1; i> 0 ; i--) {
		arr[i] = arr[i-1];

		}
		
		arr[0] = temp;
		System.out.println( "After Right Rotation  ");
		for(int j = 0; j<arr.length; j++) {
			 System.out.print(arr[j] + " ");
		}
			}

		
	}


