package revisionllogic;

import java.util.Scanner;

public class AreaOfCircle {

	 public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter Radius : ");
		   double radius = sc.nextDouble();
		   
		    double area = Math.PI * radius * radius;
		    System.out.println("Area Of Circle : " + area);
		    sc.close();
	}
}
