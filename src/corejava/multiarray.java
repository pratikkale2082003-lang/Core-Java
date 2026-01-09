package corejava;

//3d array example
public class multiarray {

	 public static void main(String [] args) {
		 int arr [][][] = {
			            	 {{8,2},{3,4}},
				             {{5,6},{7,5}} 
		                 };
				          
			 for(int i=0; i<arr.length; i++){
				 for(int j = 0; j<arr[i].length; j++  ) {
					for(int k =0; k<arr[i][j].length; k++) {
						
						System.out.print(arr[i][j][k] + " ");
						
					}
					System.out.println();
					
				 }
				 
				 System.out.println();
			 }
				          
				          
	 }
}
