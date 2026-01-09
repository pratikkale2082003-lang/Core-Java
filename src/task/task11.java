package task;

// print odd number using user input
import java.util.*;
public class task11 {
	 public static void main(String []args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		  System.out.println("Enter the Limit : ");
		  int n = sc.nextInt();
		  
		  for(int i = 1; i <=n; i++) {
			  if(i % 2!= 0 ) {
				   System.out.print(i + " ");
				  
			  }
		  }
			  
		 
	 }

}
