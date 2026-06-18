package Question;

import java.util.Scanner;

public class Area_of_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the Number : ");
		 
		  double radius = sc.nextDouble();
		   
		   double area = Math.PI * radius * radius;
		   
		    System.out.println("Area of Circle : " + area);
		     sc.close();
	}

}
