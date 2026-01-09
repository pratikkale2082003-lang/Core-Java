package oops;
//check whether  user is eligible or not eligible for voting
 import java.util.*;
 
class number { //parent class
	
	 int n;
	  void input() {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the number : ");
	    n = sc.nextInt();
	   sc.close();
	 
	  }
	
}

 class eligible extends number { //child1 class
	 
	 void system() {
		 
	 }
 }
 
 class  count extends number  {  //child2 class
	 
	  void system() {
		   if ( n >= 18) {
			   System.out.println("eligible  voting");
		   }
		   else {
			   System.out.println("  not eligible  voting");
		   }
		  
	  }
 }
 
  class people extends count{ //subclass
	  
	   void vote() {
		   if( n >=18) {
		   System.out.println("  congratulation  you  can vote");
		   
	   }
		   else {
			   System.out.println(" better than next time ......");
		   }
  }
  }
 
public class taskinheritance2  {

public static void main(String[] args) {
	people p = new people();
	p.input();
	p.system();
	p.vote();
	
	
}
		

	}


