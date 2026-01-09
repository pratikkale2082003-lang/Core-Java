package oops;


 abstract  class  Boss {
	  abstract  void company();
	  
	    void  said() {
	    	
	    	  System.out.println(" Boss Said : The Work can hold salary delay");
	    }
 }

 
  class Manager extends Boss{

	@Override
	void company() {
		// TODO Auto-generated method stub
		
		 System.out.println("Manager Said : The work can not Salary us ");
	}
	  
  }
  
   class  Customer extends Manager{
	   
	    void company () {
	    	 System.out.println( "Employee Said : YeS Customer is Their");
	    }
   }
 
public class Abstraction6 {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.company();
		c.said();
		 System.out.println("-----------------------------------------------------------------------------------");
		 Manager m = new Manager();
		 m.company();
		 m.said();
	}

}
