package corejava;

import java.util.*;

public class rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the length  : ");
		 int  l= sc.nextInt();
		 
		 System.out.print("Enter the breath  : ");
		 int  b = sc.nextInt();
		 
		  int sum = l * b ;
		  
		  System.out.println("Rectangle is : " +sum);
		  sc.close();
	}

}
