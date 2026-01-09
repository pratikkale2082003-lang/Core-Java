package oops;


 class company { //parent class
	 
	  void info() {
		  System.out.println(" company name is : TCS");
		  System.out.println(" company role : Java Full stack");
	  }
 }


 class empolyee  extends  company{ //child class
	 
	 void info() {
		  super.info();
	 System.out.println(" empolyee name is : Pratik kale ");
	  System.out.println(" package  : 10 lack");

 }


 }



public class methodoverridingtask {

	public static void main(String[] args) {
		
		empolyee e = new  empolyee();
             e.info();
		
	}

}
