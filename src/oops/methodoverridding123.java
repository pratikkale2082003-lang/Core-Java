package oops;


 class Animal10 {
	 
	  void eat() {
		   System.out.println(" chicken");
	  }
 }
  class dog extends Animal10 {
	  
	   void eat() {
		    super.eat();
		   System.out.println(" meat");
	   }
  }
public class methodoverridding123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d = new dog();
		d.eat();
		
	}

}
