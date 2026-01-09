package oops;

// polymorphism are 2 types :- 
// compile time polymorphism =  means methodoverloading 
//  run time polymorphism = method overriding.
 
//methodoverloading : 
// multiple function with same name   but  different parameters.
public class methodoverloading {
	
	
	void payment() {  // by using no paerameter
		System.out.println(" credit");
	}
	
	void payment(int num) { // by passing parameter
		System.out.println(" debit");
	}
	 void payment( int r, String name) { // by passing no of parameter
		 System.out.println(" upi");
	 }
	
	
	 void payment(String p, int c) { //by changing the sequence of parameter
		 System.out.println(" cash on delivery");
	 }
	
	
	 void payment(float z, char w) //by changing datatypes
	 {
		 System.out.println("paytm");
	 }
	

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		methodoverloading ob = new methodoverloading();
		ob.payment();
		ob.payment(5);
		ob.payment(0, "pratik");
		ob.payment("Sahil", 10);
		ob.payment(1, 'p');
	}

}
