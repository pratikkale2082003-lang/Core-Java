package Question;

public class SumofIndexArray {

	 public static void main(String[] args) {
		int arr [] =  {4,8,9,5,7,6};
		 int  sum = 0;
		 
		   for ( int i = 0; i < arr.length; i++) {
			   
			    sum = sum + i;
			    
		   }
		 
		    System.out.println("Sum of index is : " + sum);
	}
}
