package Question;

import java.util.Scanner;

public final class LCM_Example {

	 public static void main(String[] args) {
		
		  Scanner  sc = new Scanner(System.in);
		   System.out.print("Enter the Number 1 : ");
		     int num1 = sc.nextInt();
		    
		     System.out.print("Enter the Number 2 : ");
		     int num2 = sc.nextInt();
		     
		     System.out.print("Enter the Number 3: ");
		     int num3 = sc.nextInt();

		     
		       int max = Math.max(num1, Math.max(num2, num3));
		       
		        while(true) {
		        	if(max % num1 == 0 && max % num2== 0 && max % num3 == 0) {
		        	
		        		 System.out.println("LCM is : " + max);
		        		  break;
		        	}
		        	 max++;
		        	 
		        }
		         sc.close();
	}
}
