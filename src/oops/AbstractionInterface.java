package oops;


 interface  cravita11{
	 
	  abstract void  placemeny();
	  
	  default  void java() {
		   System.out.println("  java fees : 35000");
	  }
	 
	   static  void merstack() {
		   System.out.println(" mern stack fess : 45000");
	   }
	 
	  public  void python();
	 
	    
 }
 
   class fortune11 implements cravita11{

	@Override
	public void placemeny() {
		// TODO Auto-generated method stub
		System.out.println("100 % placemenets ");
	}

	@Override
	public void python() {
	
		 System.out.println("python fees :  48880" );
	}
	   
   }
 
public class AbstractionInterface {
	
public static void main(String[] args) {
	

	fortune11 f = new fortune11();
	f.placemeny();
	f.python();
	f.java();
	 cravita11.merstack();
}
}