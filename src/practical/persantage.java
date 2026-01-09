package practical;

import java.util.Scanner;

public class persantage {
  public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);
	  System.out.println(" Enter marks : ");
	   
	   int a = sc.nextInt();
	   int b =sc.nextInt();   
       int c = sc.nextInt();
       int d = sc.nextInt();
       int e = sc.nextInt();
      
      
       
     
	   int  totalmarks = 500;
	   
	   int obtainmark = a+b+c+d+e;
         
         double persantage = ( obtainmark * 100) /totalmarks;
        
         System.out.println("obtainmarks : " + obtainmark);
         System.out.println(" totalmarks : " + totalmarks);
           System.out.println("persantage : " + persantage);
}
}