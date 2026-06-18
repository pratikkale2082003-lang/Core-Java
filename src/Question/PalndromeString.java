package Question;

import java.util.Scanner;

public class PalndromeString {

 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	 System.out.print("Enter  String : ");
 String str =  sc.nextLine();
	 
	  String rev = "";
	   for (int i = str.length()-1; i>=0; i--) {
		    rev = rev + str.charAt(i);
	   }
	   
	   
	     if ( str.equals(rev)) {
	    	 
	    	  System.out.println( str + " = " + "Palindrome String ");
	     }
	     else {
System.out.println(str + " = " + "Non Palindrome String");
	     }
	     sc.close();
}
 
}
