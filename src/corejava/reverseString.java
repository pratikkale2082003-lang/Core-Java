package corejava;

import java.util.Scanner;

public class reverseString {
 public static void main(String []args){

	  Scanner sc = new Scanner(System.in);
	  
	  
	  System.out.println("Enter the String : ");
	  String str = sc.nextLine();

	 
	 //String reversed= new StringBuilder(str).reverse().toString();
	 
	/// System.out.println("reverse String : " + reversed);//
       
	  
	   char ch [] = str.toCharArray();
	   
	   for(int i = str.length()-1; i>=0; i--) {
		   
		    System.out.print(ch[i]);
	   }
 }
}
