package oops;


  class  Atm {
	  
	    private int pin;
	     private String name;
	     
	     
	      public int  getpin() {
	    	  return pin;
	    	  
	      }
	     
	       public  void setpin( int pin) {
	    	   this.pin= pin;
	    	   
	       }
	     
	     
	        public String getname() {
	        	  return name;
	        	
	        }
	     
	         public  void  setname(String name) {
	        	  this.name = name;
	        	  
	         }
	     
	     
  }
  
public class Encapsulation7 {

	 public static void main(String [] args) {
		 
		Atm a = new Atm();
		a.setpin(10);
		a.setname("Pratik");
		
		 System.out.println("Student Roll no : " + a.getpin());
		  System.out.println("Stundent name : " + a.getname());
	 }
}
