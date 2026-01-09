package oops;


//hybridinheritance1 :  a combination of two  more types hybrid inheritance


 class  S{ //parent class
	 
	   void car() {
		   System.out.println(" car is : THAR");
	   }
	    
 }

 class R extends S { //C1
	  void  color () {
		  System.out.println("Red");
	  }
 }

  class T  extends S{ //C2
	   void   model() {
		    System.out.println(" model : Tata");
	   }
  }
    
   class Q  extends T {
	   
	    void price() {
	    	System.out.println("price is :  60 lacks");
	    }
   }






class hybridinheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Q a  = new Q();
 a.car();
 a.model();
 a.price();
	}

}
