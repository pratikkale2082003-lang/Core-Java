package task;

// one thread  and multiple Task
public class ThreadTask2 extends Thread  {

	
	 void reversenumber() {
		 
		  int n = 2654;
		  
		   int rev = 0;
		    while(n > 0) {
		    	 int rem = n % 10;
		    	  rev = rev * 10 + rem;
		    	
		    	    n = n /10;
		    	    
		    }
		     System.out.println("The Reverse Number is : " + rev);
		     
	 }
	 
	  void  sumofnumber() {
		  
		   int n  = 12589;
		   int sum = 0;
		   while(n > 0) {
			    int rem = n % 10;
			      sum = sum + rem;
			      
		   }
		    System.out.println("The Sum of Number is : " + sum);
	  }
	  
	  
	   void  positivenumber() {
		   
		    int n = 14;
		    
		     if ( n > 0) {
		    	  System.out.println(n +" Postive Number.");
		    	  
		     }
		     else  if (n < 0){
		    	  System.out.println(n + " Negative Number.");
		    	 
		     }
		     else {
		    	  System.out.println(n + " is Zero Number");
		     }
	   }
	  
	  public  void run() {
		  
		   System.out.println("Program is Suceefully save");
		        reversenumber();
		         System.out.println();
		        sumofnumber();
		         System.out.println();
		         positivenumber();
		        
	  }
	 public static void main(String[] args) {
		 ThreadTask2 th = new ThreadTask2();
		 th.start();
		 
	}
}
