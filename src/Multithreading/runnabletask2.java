package Multithreading;

//single runnable multiple task
public class runnabletask2 implements Runnable {

	
	public void run() {
		// TODO Auto-generated method stub
		 int n = 145;
		 
		  int rev = 0;
		  while(n > 0) {
			int  rem = n % 10;
			   rev =( rev*10)+ rem;
			   n = n/10;
			   
			
		  }
		   System.out.print(" reverse number is  : "+ rev);
		 
	   
		    System.out.println();
			   int num = 12345;
			   int sum = 0;
			   
			    while (num > 0) {
			    	 int rem = num % 10;
			    	 sum = sum+rem;
			    	 num = num/10;
			    	 
			    }
			    	System.out.print("Sum of number is : " + sum);
			
	}


	
	public static void main(String[] args) {
		runnabletask2  ob = new runnabletask2();
		
		Thread ob1 = new Thread(ob);
		ob1.start();
		
	}
}
