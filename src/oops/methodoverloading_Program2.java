package oops;



class methodoverloading_Program2 {

	
	 void bank () {
		  System.out.println("State Bank Of India ");
	 }
	 
	 
	  void bank (String name ) {
		   System.out.println("Akola Distruct Cop BanK");
	  }
	   void bank (int a ) {
		   System.out.println("Axis Bank");
	   }
	   
	    void bank(int a, String ab ) {
	    	
	    	 System.out.println("Bank OF Baroda");
	    }
	     public static void main(String [] args) {
	    	 methodoverloading_Program2 a = new methodoverloading_Program2();
	    	 a.bank();
	    	 a.bank("sbi");
	    	 a.bank(10);
	    	 a.bank(10, "pratikk00000");
	     }
}
