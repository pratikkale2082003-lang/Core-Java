package task;


//check the largest number among two number 

import java.util.*;
public class task9 {

	 public static  void main(String [] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		  System.out.print("Enter A : ");
		  int a = sc.nextInt();
		  
		   System.out.print("Enter B : ");
		    int b = sc.nextInt();
		    
		  if(a>b) {
			  System.out.println( a + " is largest Number");
			  
		  }
		  else {
			  System.out.println(b + " is  largest Number");
			  
			  sc.close();
			  
			   
		  }
	 }
}
