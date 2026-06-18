package Array;

public class Findmidvalue {
	 public static void main(String[] args) {
		
	
	int arr [][][]  ={ {{11,12,13,14},
                        {15,16,17,18},
                        {19,20,21,22},
                        {23,24,25,26}
	
} };
	// row
	 for (int i = 1; i<=2;  i++) {
		  //colum
		 for (int j = 1; j <= 2; j++ ) {
			 
			  System.out.print(arr[0][i][j] + " ");
		 }
		 
		  System.out.println();
	 }
}
}