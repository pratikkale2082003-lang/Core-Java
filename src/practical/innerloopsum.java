
package practical;

public class innerloopsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



	
		// TODO Auto-generated method stub

		 int arr[][] = { {11,12,13,14},
		                 {15,16,17,18},
		                 {19,20,21,22},
		                 {23,24,25,26}
				        };
		 
		 
		 int sum = 0;
		 for(int i = 0; i< arr.length; i++) {
			   for(int j = 0;  j < arr.length; j++) {
				   if (i == 0 || i == arr.length-1 || j == 0 || j == arr.length-1) {
				   } else {
					  System.out.print(arr[i][j] + " "); 
				   
				  sum += arr[i][j];
				   }
			   }
			    System.out.println();
		 
		 }
		 System.out.println("innerloop sum of array  : " + sum);
	}
}