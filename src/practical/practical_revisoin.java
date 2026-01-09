
package practical;

import java.util.Scanner;

public class practical_revisoin {
//	  fibbnochi  series
	
//	 public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the Number : ");
//		  int n = sc.nextInt();
//		  
//		   System.out.print( "Starting number: ");
//		  int n1 = sc.nextInt();
//		  
//		  System.out.print("Ending number is : ");
//		  int n2 = sc.nextInt();
//		  int n3;
//		  
//		   for(int i = 1; i<=n; i++) {
//			    n3 = n1 + n2;
//			   System.out.print(n3  + " ");
//			   n1 = n2;
//			   n2 = n3;
//		   }
		  
//	using recursion
//	 public static int fib( int n ) {
//		 
//		  if(n == 0 || n == 1 ) {
//			  return n;
//			  
//		  }
//		  int  f1 = fib(n-1);
//		  int f2 = fib(n-2);
//		  int  fn = f1 + f2;
//		  return fn;
//	 }
//	 public static void main(String[] args) {
//		
//		  int n = 8;
//		  
//		   System.out.println(fib(n));
//		   
	
//	 fibnoci using ony even number series
//		   
//	 public static void main(String[] args) {
//		
//		 Scanner sc = new Scanner(System.in);
//		 
//		  System.out.print("Enter the number : ");
//		  int n = sc.nextInt();
//		  
//		  System.out.print("Enter Starting  number : ");
//		  int n1 = sc.nextInt();
//		  
//		  
//		  System.out.print("Enter Ending  number : ");
//		  int n2 = sc.nextInt();
//		  
//		  
//		  System.out.print("Even number is : ");
//		   for( int i = n1;  i <= n2; i++) {
//			   
//			   if(i % 2 == 0) {
//				   System.out.println(i + " ");
//			   }
//		   }
//	}
		   
//	 factorial series
	
//	 public static void main(String[] args) {
//		
//		 
//		
//		  int n = 5;
//		  int f = 1;
//		  
//		   for (int i = 1; i<=n; i++) {
//			    f = f * i;
//			    
//			    System.out.println(i + " != " + f);
//		   }
//	}
	
	
	
//	  using function 
	
//	 public static int fact(int n ) {
//		 
//		  int f = 1;
//		  
//		  for (int i = 1; i<=n; i ++) {
//			  f = f * i;
//			  
//		  }
//		   return f;
//		   
//	 }
//	 public static void main(String[] args) {
//		int n  = 5;
//		
//		 for (int i = 1; i<= n; i++) {
//			 
//			 //
//				  System.out.println( i + "!= " + fact(i));
//			  }
//		 
//		 
//	}
//}
	
	
////	 using recursion
//	 public static int fact(int n) {
//		 
//		  if ( n == 1 ) {
//			  return n ;
//			  
//		  }
//		   int f1 = fact(n-1);
//		   int fn = n * f1;
//		   return fn;
//		   
//	 }
//	  public static void main(String[] args) {
//		
//		   int n = 5;
//		   
//		    System.out.println(fact(n));
//	}
//	  
//}
	
	
//	  using the largest array 
	
	 public static void main(String[] args) {
//		
//	
//	 int arr[] = {4, 5, 2,7,3};
//	 
//	 int largest = 0;
//	 
//	  for(int i = 0; i<arr.length; i++) {
//		  
//		   if ( arr[i] > largest) {
//			   largest = arr[i];
//			   
//		   }
//	  }
//	   
//	  System.out.println("the largest number is : " + largest);
//	  
//	   int  second = 0;
//	   for (int i = 0; i<arr.length; i++) {
//		if (arr[i] > second && arr[i] != largest) {
//			second = arr[i];
//			
//	   }
//}
//	System.out.println("The Second largest number  is : " +  second); 
		 
		 
//		  reverse array
		 
//		  int arr[] = {4, 5,1, 3,2, 7};
//		  
//		  System.out.print("Reverse array is : ");
//		   for (int i = arr.length-1; i>=0; i--) {
//			   System.out.print(arr[i] + " ");
//		   }
//} 
//}
	 
	
//		 Scanner sc = new Scanner(System.in);
//		  System.out.print("Enter the Size : ");
//		 int n = sc.nextInt();
//		 
//	      int arr[] = new int [n];
//	      
//	       System.out.print("Enter  the Element : ");
//	      for (int i = 0; i< arr.length; i++) {
//	    	  
//	    	  arr[i] = sc.nextInt();
//	    	  
//	      }
//				  
//				  System.out.print("Reverse array is : ");
//				   for (int i = arr.length-1; i>=0; i--) {
//					   System.out.print(arr[i] + " ");
//				   }
//		} 
//		}
	 
	 
	 
//		   linear search
//		 
//		 int arr[] = {4, 5,1, 3,2, 7};
//		   
//		  for (int i = 0; i< arr.length; i++) {
//			  if ( arr[i] == 8) {
//				  System.out.println(i);
//			  }
//			  else {
//				  System.out.println("not found the index");
//				   break;
//			  }
//		  }
//	 }
//}
////	 swap 
//		 int a = 10;
//		 int b = 20;
//		 System.out.println("before swap  :   a = " +  a + ",  b = " + b );
////		 a = a+b;
////		 b = a-b;
////		 a = a-b;
//		 
//		 
//		  int temp = a;
//		   a = b;
//		   b = temp;
//		 System.out.println("after swap  :   a = " +  a + ",  b = " + b );
//	 }
//}
//		reverse string   
	 
//	 String str = "pratik";
//	 
//	  char ch [] = str.toCharArray();
//	   for (int i = str.length()-1; i>=0; i--) {
//		   System.out.print(ch[i]);
//	   }
//	 }
//}
	 
	 
////		 avg number/
//		 
//		  
//		  
//		   int a = 10;
//		   int b= 20;
//		   int c = 30;
//	
//		   int d = 40;
//		   int e= 50;
////		  
//		  int sum  = a+b+c+d+e;
////		   
//		   double avg =sum /5;
////		   
//		    System.out.println(avg);
//	 }
//}
	
////		  avg array 
//		  int arr[] = { 10, 20, 30, 20};
//		  
//		   double sum  = 0;
//		   
//		    for (int i = 0; i<arr.length; i++) {
//		    	
//		    	sum  =  sum + arr[i];
//		    }
//		    	double avg = sum / arr.length;
//		    	
//		    
//		     System.out.println(avg);
//	 }
//}
//		  sum of number
//		 
//		  int n = 1245879;
//		  
//		  int sum = 0;
//		  while (n > 0){
//			  int rem = n % 10;
//			  sum = sum +rem;
//			  n = n / 10;
//			  
//		  }
//		   System.out.println(sum);
//	 }
//	 
//}
//		 
//		
//		  int n = 1245879;
//		  int count = 0;
//		  
//		   while (n > 0) {
//			  n =  n / 10;
//			   count++;
//		   }
//		  System.out.println(count);
//		 
//	 }
//}
//		  reverse number
//		  int n = 1245879;
//		  
//		   int reverse = 0;
//		   
//		   while ( n > 0) {
//			   int rem = n % 10;
//			   
//			   reverse = reverse * 10 + rem;
//			   n = n / 10;
//		   }
//		    System.out.println(reverse);
//	 }
//}
//		
//		  acending order
		 
//		 int arr[] = {4, 5,1, 3,2, 7 , 6};
////		   
//		  for (int i = 0; i< arr.length; i++) {
//		 
//			   for (int j = i+1; j < arr.length; j++) {
//			   if ( arr[ i] > arr[j]) {
//				   
////				   swap 
//				   int temp = arr[i];
//				   arr[i] = arr[j];
//				   arr[j] = temp;
//				   
//			   }
//		  }
//	 }
//		  
//		  for (int i = 0; i< arr.length; i++) {
//		  System.out.print(arr[i] + " ");
//}
//	 }
//
//}
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int n = sc.nextInt();
		
		
		int number [] = new int[n];
		
		System.out.println("Enter the Element : ");
		 for(int i = 0; i<number.length; i++) {
			 number[i]= sc.nextInt();
			 
		 }
		 
		  System.out.print("Enter The Specific ");
		   int key = sc.nextInt();
		   int i;
		   for( i = 0; i<number.length; i++) {
		   
			   if (number[i] == key) {
				    key = number[i]; 
				    System.out.print(key + " index is : " + i);
				     break;
				     
			   }
			 
		   }
		   
		   if (i == n) {
			   System.out.println(key + " not found the value ");
		   }
	 }
}
		 