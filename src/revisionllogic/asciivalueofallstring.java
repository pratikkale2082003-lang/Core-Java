package revisionllogic;

import java.util.Scanner;

public class asciivalueofallstring {

	 public static void main(String[] args) {
		
		  Scanner  sc = new Scanner(System.in);
		  System.out.print("Enter a String : ");
		  String str = sc.nextLine();
		  
		  System.out.println("Ascii Value is Of Character : ");
		   for (int i = 0; i< str.length(); i++) {
			   
			    char ch = str.charAt(i);
			    System.out.println(ch + " : " + (int) ch);
		   }
	}
}
