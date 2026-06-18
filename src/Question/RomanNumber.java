package Question;

import java.util.Scanner;

public class RomanNumber {

	
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Roman Number :  ");
		 String roman = sc.nextLine();
		 
		  int result = 0;
		  
		   for (int i = 0; i< roman.length(); i++) {
			   
			     char ch = roman.charAt(i);
			     
			     if (ch == 'I') result += 1;
		            else if (ch == 'V') result += 5;
		            else if (ch == 'X') result += 10;
		            else if (ch == 'L') result += 50;
		            else if (ch == 'C') result += 100;
		            else if (ch == 'D') result += 500;
		            else if (ch == 'M') result += 1000;
		        } sc.close();

		    System.out.println("Roman Value  = " + result);
		   }
	 
	  
	}

