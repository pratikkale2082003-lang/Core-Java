package corejava;

public class Stringarray {

	 public static void main(String [] args) {
		 String arr[][] = { 
				           {"id", "name", "surname"},
		                  {"1", "om", "jadav"},
		                  {"2", "jay", "patil"}
		              };
		 
		 
		  for(int i =0; i<arr.length; i++ ) {
			   for(int j = 0; j<arr.length; j++) {
				   
				   System.out.print(arr[i][j] + " ");
			   }
			   System.out.println();
		  }
	 }
}

	 