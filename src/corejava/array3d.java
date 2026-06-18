package corejava;

public class array3d{
public static void main(String[] args) {
	
	 int arr [][][]  ={ {{11,12,13,14},
	                    {15,16,17,18},
	                    {19,20,21,22},
	                    {23,24,25,26}
	 } };
	 
	  for (int i = 0; i < arr.length; i++) {
		  
//		   colum
		  for (int j = 0; j < arr[i].length; j++) {
			  
			   for (int k = 0; k<arr[i][j].length; k++) {
				   System.out.print(arr[i][j][k] + " ");
				   
			   }
			    System.out.println();
		  }
	  }
}
}

