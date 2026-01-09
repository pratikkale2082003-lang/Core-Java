package Multithreading;

public class threadtask5  extends Thread{

	  void multiplication() {
		  int n = 5;
			
			
			 for (int i = 1; i<=10; i++) {
				 System.out.println(n + " x " + i + " = " + (n * i));
			 }
			}
	  
	
	   void reverse() {
		   int n = 145;
			 
			  int rev = 0;
			  while(n > 0) {
				int  rem = n % 10;
				   rev =( rev*10)+ rem;
				   n = n/10;
				   
				
			  }
			   System.out.println(" reverse number is  : "+ rev);
			 
				
		 }
		   
	   
	    void prime() {
	    	int n = 5;
	    	 int count = 0;
	    	 
	    	  for(int i = 2; i<n; i++) {
	    		  if( i % 2 == 0) {
	    			  
	    			  count++;
	    			  break;
	    		  }
	    	  }
	    	 
	    	   if (count == 0) {
	    		   System.out.println("prime number "); 
	    		
	    	   }
	    	   else {
	    		   System.out.println(" not prime number");
	    	   }
	    } 
	
	    
	    void largestnumber() {
	    	
	    	 int a = 10;
	    	 int b= 20;
	    	 int c = 15;
	    	 
	    	  if (a > b && a > c) {
	    		  System.out.println(a+ " is largest element a");
	    	  }
	    	  else if(b > c && b > a) {
	    		  System.out.println(b+ " is largest element b");
	    	  }
	    	  
	    	  else {
	    		  System.out.println(c+ " is largest element c");
	    	  }
	    }
	    
	 public void run() {
		 multiplication();
		 System.out.println("------------------------------------------------------------------------------------------");
		 
		 reverse();
		 System.out.println("---------------------------------------------------------------------------------------------------------");
		 prime();
		 System.out.println("----------------------------------------------------------------------------------------");
		 largestnumber();
	 }

	 public static void main(String[] args) {
		 threadtask5 ob = new threadtask5();
		 ob.start();
	}
}
