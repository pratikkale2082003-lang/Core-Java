package oops;



 class   Dipavali { // parent class 
	 
	  void  festival() {
		  
		   System.out.println(" Chakli chivada Fatke");
	  }
 }
 
  class Holi  extends Dipavali{
	  
	   void festival() {
		   super.festival();
		    System.out.println(" Color  and Party");
	   }
  }
public class Methodoverridding0 {

	 public static void main(String[] args) {
		
		 Holi j = new Holi();
		 j.festival();
		
	}
}
