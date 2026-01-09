package corejava;

public class array2d {

	 public static  void main(String [] args) {
		 
		  int arr [][] = {  {10,20}, {30,40}};
		  
		   for(int r = 0; r <arr.length; r++) {
			   
			    for(int c =0; c<arr.length; c++) {
			    	
			    	System.out.println(arr[r][c]);
			    }
		   }
	 }
}
