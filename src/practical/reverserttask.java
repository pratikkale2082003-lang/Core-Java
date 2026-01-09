package practical;

public class reverserttask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int n =5;
		
		 int num = 9;
		  for(int i = 1; i<=n; i++) {
			  
			   for( int j = n; j>=i; j--) {
				   System.out.print(num);
			   }
			   
			   num-=2;
			   System.out.println();
		  }
	}

}
