package oops;


 interface bank{
	 
	  abstract void  bankbalance();
	  
	  
	   default  void Branch() {
		   System.out.println("  Branch : ICCI branch  Pune ");
	   }
	   
	   
	    static void Accountholder() {
	    	System.out.println("   Account holder : is mangaed the task");
	    }
 }


  class customer implements bank{

	@Override
	public void bankbalance() {
		// TODO Auto-generated method stub
		
		System.out.println(" bank balance is 15 lacks");
	}
	  
  }
















public class interfacetask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		customer c = new customer();
		c.bankbalance();
		c.Branch();
		bank.Accountholder();
	}

}
