package Multithreading;

import java.util.Scanner;

// one thread and multiple task
public class threadtask2  extends Thread{
	 void reverse() {
		 int n = 145;
		 
		  int rev = 0;
		  while(n > 0) {
			int  rem = n % 10;
			   rev =( rev*10)+ rem;
			   n = n/10;
			
		  }
		   System.out.print(" reverse number is  : "+ rev);
		 
	 }
	
	  void sumofnumber() {
		  
		   int n = 12345;
		   int sum = 0;
		   
		    while (n > 0) {
		    	 int rem = n % 10;
		    	 sum = sum+rem;
		    	 n = n/10;
		    	 
		    }
		    	System.out.print("Sum of number is : " + sum);
		    
	  }
	  
	  
	   void positivenumber() {
		   Scanner sc = new Scanner(System.in);
		   System.out.print("Enter the number : ");
		   int n = sc.nextInt();
		   if ( n > 0) {
			   System.out.println( n +" Positive Number....");
		   }
		   else if (n < 0) {
			   System.out.println( n + " Negative number");
		   }
		   else {
			   System.out.println( n + " Zero number");
			   sc.close();
		   }
	   }
	
	public void run() {
		 System.out.println(" program is Suceffully......\n");
		
		reverse();
		 System.out.println();
		sumofnumber();
		 System.out.println();
		positivenumber();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		threadtask2 ob = new threadtask2();
		ob.start();
		
	}

}
