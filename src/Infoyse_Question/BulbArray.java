package Infoyse_Question;

import java.util.*;

public class BulbArray{
	
	
	 public static void main(String [] args) {
		 
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the Number : ");
		  int n = sc.nextInt();
		   System.out.println("Bulbs ON are : ");
		   
		   for (int i = 1; i * i <= n; i++) {
			   System.out.print(i * i + " ");
			    sc.close();
		   }
	 }


}
