package String;

import java.util.Scanner;

public class ASCII_Value {

	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter String : ");
		  char ch = sc.next().charAt(0);
		 
		 int ascii = ch; 
		 
		  System.out.println("ASCII value : " + ascii);
	}
}
