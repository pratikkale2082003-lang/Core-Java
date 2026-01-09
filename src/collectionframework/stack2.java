package collectionframework;

import java.util.*;

// file the stack object by user input in the collection of bank name check the bank Sbi  is present in the Stack  if it  is present  then remove  it  and print stack
public class stack2 {

	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 Stack<String> s = new Stack<>();
		 
		 System.out.print( "Enter the Number of bank : ");
		  int n = sc.nextInt();
		   sc.nextLine();
		   
		   for (int i = 0; i < n; i++) {
	            System.out.print("Enter bank name: ");
	            String bankName = sc.nextLine();
	            s.push(bankName);
	        }

	        System.out.println("\nStack before checking SBI: " + s);

	        // Check if SBI is present
	        if (s.contains("sbi")) {
	            s.remove("sbi");
	            System.out.println("\nsbi found and removed from  stack.");
	        } else {
	            System.out.println("sbi not found  the stack.");
	        }

	        // Print updated stack
	        System.out.println("\nAfter Updated Stack: " + s);
	        
	        
	         
	        sc.close();
		   
		  
		    }
	}
