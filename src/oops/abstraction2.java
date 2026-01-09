package oops;



 abstract class appuser{
	
	 
	 
	 abstract void passwords();
	 
	 
}

 class appimplemetation  extends appuser{

	@Override
	void passwords() {
		// TODO Auto-generated method stub
		
		System.out.println("1234566");

 
		 
	}
	 
 }



public class abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		appimplemetation  ab = new appimplemetation ();
	
		ab.passwords();
		
	}

}
