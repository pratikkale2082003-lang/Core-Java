package task;

 import java.util.*;
 
public class Applicationform {

	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
      
		System.out.print("Enter your name : ");
		  String name = sc.nextLine();
		  
		 System.out.print("Enter Surname : ");
		 String surname = sc.nextLine();
		 
		 System.out.print("Enter the Mobile number : ");
		 String number = sc.nextLine();
		 
		 System.out.print("Enter the Adharno : ");
		 String adhar = sc.nextLine();
		 
		 System.out.print("Enter your Password : ");
		 String password = sc.nextLine();
		 
		 System.out.println("\nThank You For Registration.");
		 
//		  Login part
		 System.out.println("\nNow Enter your name and password for  login");
		 
		 System.out.print("Name: ");
		  String loginName = sc.nextLine();
		  
		  System.out.print("PassWord : ");
		  String loginPassword = sc.nextLine();
		  
		  
		   if (loginName.equals(name) &&  loginPassword.equals(password)) {
			   
			   System.out.println("\nLogin is SucessFully ");
		   }
		   else {
			   System.out.println("\nInvaild  Try Again.....");
		   }
		  
	}
}