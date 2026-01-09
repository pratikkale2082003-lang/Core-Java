package practical;
// 1 0 diamond  pattarn
public class logic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		for(int i =0; i<=n; i++) {
			
			 for(int j = n; j>=i; j--) {
				 System.out.print(" ");
			 }
 for(int k =1; k<=i; k++) {
	 if( i % 2 != 0) {
		 System.out.print("1"+ " ");
	 }
	 else {
         System.out.print("0"+ " ");
		}
		}
 System.out.println();
	}
		
//		 part 2
		for(int i =2; i<=n; i++) {
			
			 for(int j = 1; j<=i; j++ ) {
				 System.out.print(" ");
			 }
    for(int k =n; k>=i; k--) {
	 if( i % 2 != 0) {
		 System.out.print("1"+ " ");
	 }
	 else {
        System.out.print("0"+ " ");
		}
		}
System.out.println();
	}
	}

}
