package practical;
//ABCDE
// ABCD
//  ABC
//   AB
//    A

// reverse right angle triangle.. abcd
public class pattarn13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for( int i = 1; i<=5; i++) {
			  for(int s = 1; s<i; s++) {
				  System.out.print(" ");
			  }
			   char ch = 'A';
			  for(int j = 5; j>=i; j--) {
				  System.out.print(ch);
				ch++;
			  }
			   
			  System.out.println();
	}

}
}