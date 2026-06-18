package TCS_Question;

import java.util.Scanner;

public class Fibnochiiseries {
public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Number : ");
	 int n = sc.nextInt();
	  sc.close();
	  
	 int a = 0;
	  int b = 1;
	   int c;
	   
	    for (int i = 0; i< n; i++) {
	    	
	    	 System.out.println("Fibnochii Series : " + i + " = " + a);
	    	  c = a+b;
	    	  
	    	   a= b;
	    	    b = c;
	    	    
	    }
}
}
