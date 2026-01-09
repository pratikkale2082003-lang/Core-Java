package practical;
//z z z 
// y y 
//  x 

public class logic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char ch= 'z';
		int n = 3;
		 for(int i = 0; i<n; i++) {
			 
			  for(int s = 1; s<=i; s++) {
				  System.out.print(" ");
			  }
			
			   for(int j = 1; j<= n-i; j++) {
				   System.out.print( ch+ " ");
				
			   }
	           ch--;
			   System.out.println();
			
		 }
	}

}
