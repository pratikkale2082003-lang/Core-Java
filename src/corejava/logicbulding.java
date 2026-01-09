package corejava;

import java.util.Scanner;

public class logicbulding {

//	 public static int fact(int n) {
//		 
//	 if ( n == 1) {
//		 return  n; 
//	 }
//	  
//	  int f1 = fact(n-1);
//	  int fn = n * f1;
//	  return fn;
//	  
//	 }
//	public static void main(String[] args) {
//		
//		 Scanner sc  = new Scanner(System.in);
//		 System.out.print("Enter the number : ");
//		int n = sc.nextInt();
//		 System.out.println( " factorial is  : " + fact(n));
//		  sc.close();
//	}
	
//	 public static void main(String[] args) {
//		
//		  int n = 19;
//		  int count = 0;
//		  
//		   for (int i = 2; i < n; i++) {
//			   
//			    if (n  %  i == 0) {
//			    	 count++;
//			    	 break;
//			    	 
//			    }
//		   } 
//			     if(count == 0) {
//			    	 System.out.println("is prime ");
//			     }
//			     else {
//			    	 System.out.println("not prime");
//			     }
//		   }
//	
//	
//	
//	
	
	 public static boolean primr(int n ) {
		 
		  for (int i = 2; i<n; i++) {
			  if (n %i == 0) {
				  return false;
				  
			  }
		  }
		   return true;
		   
	 }
 public static void main(String[] args) {
	int n = 47;
	
	
	 for (int i = 2; i< n; i++) {
		 if(primr(i)) {
			 
			  System.out.print(i + " ");
		 }
	 }
	
}
}



