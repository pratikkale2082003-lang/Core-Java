package oops;

import java.util.*;

interface A1{ //parent class
	
	 void Bankbalance();
	 
}

 interface B2{  // parent class
	 
	  void Password(String S);
	  
 }

 interface C3{ // parent class
	 
	  void Acc_number(long  n );
	  
	 
 }

class multiple implements A1,B2,C3{// child class


	public void Acc_number( long n ) {
	
		System.out.println("Account Number Suceffully creadited  ");
	}

		public void Password(String S) {
			System.out.println("Passwords Sucessfully credited");
		
	}


	public void Bankbalance() {
	
		System.out.println(" bank Balance is : 50,00000");
		
	}

}

public class multipleinheritance21 {

	public static void main(String[] args) {
		
	
	 multiple m = new multiple();
	 Scanner sc = new Scanner (System.in);
	 System.out.print("Enter the account no :  ");
long n = sc.nextLong();
	  m.Acc_number(n);
	  
	  Scanner ob = new Scanner (System.in);
		 System.out.print("Enter the Password :  ");
		 String S = ob.nextLine();
	 m.Password(S);
	 
	 System.out.println("----------------------------------------------------------------------------------------------------------");
	 m.Bankbalance();
}
}
