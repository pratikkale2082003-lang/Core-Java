package practical;

public class evenoddarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr[] = {9,4,5,6,7};
		 int even = 0;
		  int odd = 0;
		  
		 
		  for( int i = 0; i<arr.length; i++) {
			  System.out.print( arr[i] + " : ");
			   if ( arr[i] % 2 == 0) {
				   System.out.println("even number ");
				    even++;
				    
			   }
			   else {
				    System.out.println("odd number ");
				     odd++;
				     
			   }
			
		  }
		  System.out.println("even element  count are : " + even);
		  System.out.println("odd element  count are : " + odd);
	}

}
