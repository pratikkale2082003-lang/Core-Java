package practical;

public class reverserttask2 {

	public static void main(String[] args) {
		int n =5;
		
		 int num = 9;
		  for(int i = 1; i<=n; i++) {
			  
			   for( int j = n; j>=i; j--) {
				   
				    if( num % 2 != 0) {	
				    
				   System.out.print(num);
			   }
		  } 
			    num-=2;
			    System.out.println();
		  }
	}

}


	