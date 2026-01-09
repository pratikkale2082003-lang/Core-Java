package oops;



class Ab{ //perent class

//	 private Ab( int i) {
//		 System.out.println("private constructor...");
////		  
//	 }
	 
	 Ab(){
		 System.out.println(" default  constructor  of A ...");
	 }
}


public class privateconstructor extends Ab  { // child class
	privateconstructor(){
	
	  System.out.println(" default  constructor B...");
	}
	public static void main(String[] args) {
	

		
//		 privateconstructor ob = new privateconstructor();  first way of creating object
		 new privateconstructor();         //  second  way of creating object.
	
	}

}
