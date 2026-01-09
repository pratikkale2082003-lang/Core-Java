package oops;
//check  whether the number is positive and negative or zero
import java.util.*;

class positive { //parent class
	 
	 
		 int num;
		 
		 void inputNumber() {
		     Scanner sc = new Scanner(System.in);
		     System.out.print("Enter a number: ");
		     num = sc.nextInt();
		     sc.close();
		 }
		}
	 
 class parral{   // child class1
	 
	  void sukun() {
		  
	  }
 }

  class negative extends positive { //child2class
	  
	 
	   void condition(){
		    if(num > 0) {
		    	
		    	System.out.println("Its is positive numbers");
		    }
		    else if( num < 0) {
		    	System.out.println(" its negative number");
		    }
		    else {
		    	System.out.println(" its zero number");
		    }
	   }
		   
	   }

  class zero extends negative {  // subclass
	  
	  void ze() {
		  System.out.println( num + "  is enternumbers.");
	  }
	  
	  
  }

 
  
public class hybridinheritancetask1 {

	
	 public static void main(String[] args) {
		
		  zero z = new zero();
		 z.inputNumber();
		 z.condition();
	z.ze();
		 
}
}
