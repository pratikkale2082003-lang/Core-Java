package Array;

public class Array3D {
	

	
	public static void main(String[] args) {
		
		 int arr [][][]  ={ {{11,12,13,14},
		                    {15,16,17,18},
		                    {19,20,21,22},
		                    {23,24,25,26}
		 } };
		 
		
//	row
		  for (int i = 0; i < arr.length; i++) {
			  
//			   colum
			  for (int j = 0; j < arr[i].length; j++) {
				  
				   for (int k = 0; k<arr[i][j].length; k++) {
					   System.out.print(arr[i][j][k] + " ");
					   
				   }
				    System.out.println();
			  }
		  }
	}

}
