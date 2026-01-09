package task;

public class testQ6d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		for(int i = 1; i<=n; i++) {
			
			 for(int s = n; s>=i; s--) {
				 System.out.print(" ");
			 }
				  for(int j =1; j<=n; j++) {
					  System.out.print("#");
				  }
				  System.out.println();
			 }
		}
	

}
