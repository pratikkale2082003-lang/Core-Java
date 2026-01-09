package task;

import java.util.Scanner;
public class task1 {


	
	    public static void main(String [] args){

	        Scanner sc =  new Scanner(System.in);

	        System.out.println("Enter the Number a : ");
	        int a = sc.nextInt();

	        System.out.println("Enter the Number b : ");
	        int b = sc.nextInt();

	         int add = a+b;
	         int sub = a-b;
	        int  mul = a*b;
	        int div = a/b;
	        int modul = a%b;

	        
	        System.out.println("Addition : " + add);
	        System.out.println("Substration : " + sub);
	        System.out.println("multiply : " + mul);
	        System.out.println("Division  : " + div);
	        System.out.println("module : " + modul);

	        
	        // System.out.println("Addition : " + (a+b));
	        // System.out.println("Substration : " +(a-b));
	        // System.out.println("multiply : " + (a*b));
	        // System.out.println("Division  : " + a/b);
	        // System.out.println("module : " + a%b);
	       sc.close();


	    }
	    
	}



