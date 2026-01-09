package practical;

public class transformmatrix {

	public static void main(String[] args) {

		 int matrix [][] = { {1,2,3,4},
		                   {5,6,7,8},
		                    {9,8,7,6 },
		                    {5,4,3,2}
		 };
		 
		 int row = matrix.length;
		 int col=  matrix.length;
		 
		  int matrix2 [][] =  new int[col][row];
		  
		   for(int i = 0; i<row; i++) {
			   
			    for (int j = 0; j <col; j++) {
			    	matrix2[i][j] =  matrix[j][i];
			    	
			    }
		   }
		    for(int i =0; i<col; i++) {
		    	
		    	 for(int j =0; j<row; j++) {
		    		 System.out.print(matrix2[i][j]+ " ");
		    	 }
		    	  System.out.println();
		    }
		  
	}

}
