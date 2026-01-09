package Project;



	import java.util.*;

	// Custom Exception for insufficient balance
	class InsufficientBalanceException extends Exception {
	    public InsufficientBalanceException(String msg) {
	        super(msg);
	    }
	}

//	using encapsulation
	class BankAccount7{
		private String name;
	    private int acc_no;
	    private  double balance;
		
//	     using constructor
	    public BankAccount7(String name , int number , double balance) {
	    	this.name=name;
	    	this.acc_no=number;
	    	this.balance=balance;
	    	
	    }
	    
//	     check balance
	     public double getbalance() {
	    	 return balance;
	    	 
	     }
	     
//	      deposits money
	      public void deposit(double amount ) {
	    	  
	    	  if (amount > 0 ) {
	    		 balance= balance +amount;
	    		 
	    		 System.out.println("SuccessFully deposit : " + amount );
	    		  
	    	  }
	    	  else {
	    		  System.out.println("Invalid amount");
	    	  }
	      }
	      
//	      withdrow
	      
	       void withdraw(double amount ) throws InsufficientBalanceException{
	    	   if(amount > balance) {
	    		   
	    		   throw new InsufficientBalanceException("Insufficient balance.  Current balance " + balance);
	    	   }
	    	   else {
	    		balance= balance -amount;
	    		    
	    		   System.out.println("Successfully withdraw : " + amount);
	    	   }
	    	   
	       }
	      
//	       Display account detail
	      
	       void Display() {
                  System.out.println( "Account Holder : " + name );
                System.out.println("Account number : " + acc_no);
                System.out.println("Balance : " + balance);
	       }
	      
	}
	
	
	    

	// Main class
	public class BankManagementSystem {
	    public static void main(String[] args)  {
	        
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("Enter your name : ");
	    	String name = sc.nextLine();
	    	
	    	System.out.print("Enter Account Number : ");
	    	int number = sc.nextInt();
	    	
	    	System.out.print("Enter Intial Balance : ");
	         double balance = sc.nextDouble();
	         
	         
	         BankAccount7  ob = new BankAccount7(name, number, balance);
	         
	          int choice;
	          do {
	        	  System.out.println("\nBank Mangement System Menu....");
	        	  System.out.println("1. Deposit Money");
	        	  System.out.println("2. Withdrowl  Money ");
	        	  System.out.println("3. Check Balance");
	        	  System.out.println("4. Display Account details");
	        	  System.out.println("5. Exit");
	        	  System.out.print("Enter your Choice : ");
	        	   choice = sc.nextInt();
	        	   
	        	   switch(choice) {
	        	   
	        	   case 1 : 
	        		   System.out.print("Enter Amount  to deposit : ");
	        		   double depositAmount = sc.nextDouble();
	        		   ob.deposit(depositAmount);
	        		    break;
	        		    
	        	   case  2 : 
	        		         System.out.print("Enter Amount to withdraw :  ");
	        		      double withdrwAmount = sc.nextDouble();
					try {
						ob.withdraw(withdrwAmount);
					} catch (InsufficientBalanceException e) {
						 System.out.println("Exception caught : " + e.getMessage());
						
					}
	        		
	        		    break;
	        		    
	        		    
	        	   case 3 : 
	        		   System.out.println( "Current Balance : " + ob.getbalance());
	        		   break;
	        		   
	        		   
	        		   
	        	   case 4 : 
	        		  ob.Display();
	        		    break;
	        		  
	        		    
	        	   case 5 : 
	        		   System.out.println("Exiting .... Thank You!");
	        		  break;
	        		  
	        		  
	        		  
	        		   default:
	        			   System.out.println("Invalid Choice !..");
	        	   }
	        	   
	        	   
	          } 
	          while(choice != 5 );
	         
	           sc.close();
	         
	    
	    }
	}




