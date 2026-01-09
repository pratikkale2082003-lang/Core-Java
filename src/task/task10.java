package task;

//  check   whether  user is eligible  for  voting or not 

 import java.util.*;
 

public class task10 {

	 public static void main(String [] args) {
		 
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.println("Enter the age : ");
		 
		  int age = sc.nextInt();
		  
		   if(age >= 18) {
			   System.out.println("Eligible for Voting");
			   
		   }
		   else {
			   System.out.println("Not Eligible for Vote");
			   
			    sc.close();
		   }
		   
	 }
}
