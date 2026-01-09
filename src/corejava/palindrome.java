package corejava;

 import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
				  Scanner sc = new Scanner(System.in);
			     System.out.print("Enter a String: ");
					  String str = sc.nextLine();
					  
					  String rev = "";
					  
					  for(int i = str.length()-1; i>=0; i--) {
						  rev = rev + str.charAt(i);
						  
						  
					  }
					   if(str.equals(rev)) {
						   System.out.println("Palindrome ");
						   
					   } else {
						   System.out.println("not Palindrome ");
					   }
			     
				  }
			}


	


