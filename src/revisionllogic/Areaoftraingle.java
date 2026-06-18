package revisionllogic;

import java.util.*;

public class Areaoftraingle {

	 public static void main(String[] args) {
		
		  Scanner sc = new Scanner (System.in);
		   System.out.print("Enter Base : ");
		   double base = sc.nextDouble();

		   
		   System.out.print("Enter Height : ");
		   double height = sc.nextDouble();
		   
		    double area = 0.5 * base * height;
		    
		     System.out.println("Area Of Triangle = " + area);
		   sc.close();
		   
	}
}
