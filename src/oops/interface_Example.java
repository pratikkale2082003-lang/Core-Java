package oops;

//Interface : Blueprint of a  class 
//           interface achive to Multiple inheritance


// All method are public  abstract without implementation
 

// used to achive total abstraction 

// variable in the  interface  are final, static and  default






 interface  AcRoom {
 
	  abstract void room();
	  
	   default void starroom() {
		    System.out.println("omg");
	   }
	   
	    static  void  poorroom() {
	    	System.out.print("ndd");
	    }
 
	    
	  
	    	 
	     
 } 
 class  roommm implements AcRoom{

	@Override
	public void room() {
		// TODO Auto-generated method stub
		
		 System.out.println(" yeas dudod");
	}
	 
 }
 
 



public class interface_Example {

	 public static void main(String[] args) {
		  roommm r = new  roommm();
		  r.room();
		  r.starroom();
		  System.out.println("-------------");
		  
		  AcRoom.poorroom();
	}
}
