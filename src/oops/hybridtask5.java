package oops;


import java.util.*;
 
class  inputnumber{// parent class
	
	int a;
	int b;
	
	void  input() {
		Scanner sc = new Scanner(System.in);
		System.out.print( "Enter A : ");
		a = sc.nextInt();
		System.out.print("Enter B : ");
		 b = sc.nextInt();
		 sc.close();
		 
	}
}
 class condition { //child class
	 
	  void  condition1() {
	  System.out.println("hello");
	  }
 }

 class blockofcode  extends inputnumber{ // child class
	 
	  void block() {
		  for ( int n = a; n<=b; n++) {
				  
			  if(n % 2 == 1) {
				  System.out.print(n + " ");
			  }
			 }
			 
	  }
 }
 
  class enter extends blockofcode{ //subclass
	  
	   void complted() {
		   System.out.println("  the odd number series ");
	   }
  }
public class hybridtask5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enter e = new enter();
		
		e.input();
		e.block();
		e.complted();
	}
}


