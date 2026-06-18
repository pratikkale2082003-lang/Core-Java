package Question;

import java.util.Scanner;

public class Persantage {

	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter Marks : ");
		  int a = sc.nextInt();
		  int b = sc.nextInt();
		  int c = sc.nextInt();
		  int d= sc.nextInt();
		  int e = sc.nextInt();
		   int Totalmarks = 500;
		   
		    int obtainMarks = a+b+c+d+e;
		    
		     double Persantage = (obtainMarks * 100)/ Totalmarks;
		     
		     
		     System.out.println("ObtainMarks :  " + obtainMarks);
		      System.out.println("Totalmarks : " + Totalmarks  );
		       System.out.println("Persantage : " + Persantage);
		       sc.close();
	}
}
