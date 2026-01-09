
package Multithreading;

public class task2thread extends Thread {


		public void run() {
			 int n = 145;
			 
			  int rev = 0;
			  while(n > 0) {
				int  rem = n % 10;
				   rev =( rev*10)+ rem;
				   n = n/10;
				   
				
			  }
			   System.out.println(" reverse number is  : "+ rev);
			 
				
		 }
		
	
		public void run(int n ) {
			
				  
				   int num = 1234;
				   int sum = 0;
				   
				    while (num > 0) {
				    	 int rem = num % 10;
				    	 sum = sum+rem;
				    	 num = num/10;
				    	 
				    }
				    	System.out.println("Sum of number is : " + sum);
				
		}
		
	
	public static void main(String[] args) {
	
		task2thread t1 = new task2thread();
		t1.start();
	
		
		t1.run(0);
	}
	}


