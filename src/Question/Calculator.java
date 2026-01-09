package Question;

import java.util.Scanner;

public class Calculator {

	  public static void main(String[] args) {
		Scanner  sc = new  Scanner(System.in);
		
		System.out.print("Enter A : ");
		int a = sc.nextInt();
		
		System.out.print("Enter B : ");
		 int b = sc.nextInt();
		 
		  System.out.print("Enter Operator : ");
		 int  op = sc.next().charAt(0);
		 
		  switch(op) {
		  
		  case '+' : System.out.println(a+b);
		  break;
		  
		  case '-' : System.out.println(a-b);
		  break;
		  
		  case '*' : System.out.println(a*b);
		   break;
		   
		  case '/' : System.out.println(a/b);
		   break;
		   
		   
		  case '%' : System.out.println(a%b);
		   break;
		   
		    default : System.out.println("operator not found ");
		     sc.close();
		  }
	}
}
