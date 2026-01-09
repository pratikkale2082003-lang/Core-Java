package practical;

import java.util.Scanner;

public class userevenoddarray {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size  : ");
	int n = sc.nextInt();
	
	 int num[] = new int[n];
	  int count = 0;
	  
	  for(int i = 0; i<num.length; i++) {
	 num[i]=sc.nextInt();
	 
	  if ( num [i] % 2 == 0) {
		  System.out.println( num[i] + " even number ");
		  count++;
		  
	   }
	   else {
		   System.out.println( num[i]+ " odd number number");
	   }
	  }
	   System.out.println("Array Even number count is  : "+ count);
	  
	    sc.close();
}
	  
}
	  
   
	  	 

