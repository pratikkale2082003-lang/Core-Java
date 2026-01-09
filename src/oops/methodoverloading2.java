package oops;

public class methodoverloading2 {
	
	 void sum() {
		 System.out.println(" hey student ");
	 }
	
	  void  sum( int a, int b) {
		 System.out.println(" ky kart aahee");
	 }
	   void sum (  float d, int c ) {
		   System.out.println(" ky nahi");
	   }
	
	
	
	 void sum( String name, int e) {
		 System.out.println(" kas aahe placemenets");
	 }
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodoverloading2 m = new methodoverloading2();
		m.sum();
		m.sum(5, 6);
//		m.sum(5, 2);
		m.sum("prattik", 100);

	}

}
