package Exceptionhandling;

import java.util.Scanner;

public class Exampleexception {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	 int  arr [] = new int[2];
	 
	  try {

		 arr[0] = 9;
		 arr[1] = 19;
		 arr[2] = 29;
		 arr[3] = 14;
		 int a  = 10 /0;
	  }
	 
	  
	   catch(ArrayIndexOutOfBoundsException d) {
		   System.out.println(d.getMessage());
	   }
	  catch(Exception c) {
		   System.out.println(c);
	   }
}
}
