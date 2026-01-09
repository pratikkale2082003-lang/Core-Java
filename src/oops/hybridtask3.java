package oops;

import java.util.*;
 class fortune{ // parent class
	  int n;
	 
	 
	  void input() {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the number : ");
	    n = sc.nextInt();
	  sc.close();
	  }
 }

 class python { //child1 class 
	 
	  void  condition() {
		  
		  System.out.println(" 100 Skill is placements");
	  }
	 
 }


  class java extends fortune{ //child2
	  
	   void loop() {
		   
		    for( int i = 5; i<=n; i++) {
		    	System.out.print(i + " ");
		    }
	   }
  }


 class student7 extends java { //subclass
	 
	 void add() {
		 System.out.println(" number is print ");
	 }
 }





public class hybridtask3 {

	public static void main(String[] args) {
		student7 s = new student7();
		s.input();
		s.loop();
		s.add();
		
		python p =  new python();
		p.condition();

	}

}
