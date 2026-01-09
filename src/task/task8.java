package task;
// check the whether  the number is Even or Odd 
 import java.util.*;
 
public class task8 {

	 public static void main(String [] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		  System.out.print("Enter the Number : ");
		  int n = sc.nextInt();
		  
		  if(n % 2 == 0) {
			  System.out.println(n + "  is Even Number");
			  
		  }
		  else {
			  System.out.println(n + " is Odd Number ");
		  }
		 
	 }
}
