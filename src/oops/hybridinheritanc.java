package oops;

 class country1 {  //parent class
	 
	 void co_name() {
		 System.out.println("India is parent class");
	 }
	 
 }
 
  class state1  extends country1{ //child1
	  
	  void st_name() {
		  System.out.println("Maharastra is child class 1");
	  }
  }

   class city1 extends country1{ //child2 class 
	   
	   void c_name() {
		   System.out.println(" pune is  chid2 class ");
	   }
   }

public class hybridinheritanc extends city1 { // subclass 

	
	 void hybrid() {
		 
		  System.out.println(" hybrid is subclass");
		  
	 }
	 
	  public static void main(String[] args) {
		
		  hybridinheritanc ob = new hybridinheritanc();
		  
		  
		  
		  ob.co_name();
		  ob.c_name();
		  ob.hybrid();
		  
		  state1  ob1 = new state1();
		  ob1.st_name();
		 
		  
	}
	
	
}
