package oops;
 

  abstract class Washim {
	
	   void city() {
		   
		   System.out.println("hello Washim");
	   }
	   
	     abstract void college();
	   
 }
 
  class Risod  extends Washim{


	void college() {
		
		System.out.println("mangul zanak ");
		
	}
	  
	  
  }
public class Abstraction4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Risod m = new Risod();
		m.city();
		m.college();
		
	}

}
