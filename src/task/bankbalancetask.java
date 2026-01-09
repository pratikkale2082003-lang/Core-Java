package task;
	import java.util.Scanner;

	class Insufficientbalance extends Exception {
		
		public Insufficientbalance(String  msg) {
			super(msg);
			
		}
		
	}

	 class BankAccount {
		 
		  private double bankbalance;
			 
		   public   void  bankbalance1(double balance) {
			    this.bankbalance= balance;
			    
		   }
		   
		    public double getbalanace() {
		    	return bankbalance;
		    	
		    }
	  
	 
	 
	  public void withdrow(double amount ) throws Insufficientbalance {
		  
		  if (  amount  <= bankbalance) {
			   bankbalance -= amount; 
			  System.out.println("withdrow  Sucessful ! Remaining Bankbalace : " + bankbalance);
		  }
		  else {
			throw new Insufficientbalance (" faild  check  Insufficientbalance........." );
		  }
			
	  }
	  }


	
		public class bankbalancetask {
		 
		public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		BankAccount bank = new BankAccount();
		bank.bankbalance1(1000);
		System.out.println("Current balance : " + bank.getbalanace());
		
		
		
		System.out.print(" Enter the Withdrowl : ");
	  double amount = sc.nextDouble();
	  try {
		  bank.withdrow(amount);
		  
	  }
	   catch(Exception e) {
		   System.out.println("Exception cought : "+ e.getMessage());
	
	   }
	   sc.close();
	  

	}
	 }


