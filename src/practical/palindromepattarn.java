package practical;

public class palindromepattarn {
public  static void palindromepattarn7(int n ){
	
//	 outerloop
	for(int i =1; i<=n; i++) {
		
//		 space
		 for(int s =n; s>i; s--) {
			 System.out.print(" ");
			  
		 }
		 
//		 desending
		 for(int j =i; j>=1; j--) {
			 System.out.print(j );
		 }
		 
		 
//		 asending
		 for(int j=2; j<=i; j++) {
		 System.out.print(j);
	}
		 System.out.println();
	}
}
	
	
	public static void main(String[] args) {
		palindromepattarn7(5);

	}

}
