package practical;

import java.util.Scanner;

public class logicbuilding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 largest number 
//	    int arr[] = {10,20,30, 23,10};
//		   
//	     int largest  = 0;
//	     
//	     
//	      
//	      for (int i = 0;  i< arr.length; i++) {
//	    	   if ( arr[i] > largest) {
//	    		   largest= arr[i];
//	    		   
//	    	   }
//	      }
//	      
//	      System.out.println( " largest array : " + largest);
//	      
//	      int second = 0;
//	       for (int i = 0; i< arr.length; i++) {
//	    	  
//	    	    if ( arr[i] > second && arr[i] != largest) {
//	    	    second =	arr[i] ;
//	    	    
//	    	    }
//	       }
//	       System.out.println( " second largest array : " + second);
//	       
		
		
//		 Scanner sc =   new Scanner(System.in);
//		 System.out.print("Enter Size : ");
//		 int size = sc.nextInt();
//		 
//		 
//		   int arr[] = new int[size];
//		  
//		 
//		   System.out.println("Enter the Element  : ");
//		    for (int i = 0; i< arr.length; i++) {
//		    	 arr[i] = sc.nextInt();
//		    }
////	
//		
//		 System.out.print( "Enter the key : ");
//		  int key = sc.nextInt();
//		 
//		  for(int i = 0; i< arr.length; i++) {
//			  
//			   if ( key== arr[i]) {
//				   System.out.println( " Index is  : " + i);
//			   }
//		  
//		  }
////		  

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Size : ");
//		 int n = sc.nextInt();
//		 
//		  int arr[]= new int[n];
//		  
//		   System.out.println("Enter the Element : ");
//		    for(int i = 0; i< arr.length; i++) {
//		    	arr[i] = sc.nextInt();
//		    	
//		    }
//		   
//		     System.out.println("Enter Index : ");
//		     int index = sc.nextInt();
//		     
//		      if ( index >= 0 && index < arr.length) {
//		    	  System.out.println(index + " index key is : " + arr[index]);
//		      }
//		      else {
//		    	  System.out.println("not found the index value is  " + arr.length);
//		      }
//	}
//		 int n = 5 ;
//		 
////	
//		 for ( int i = 1; i <= n; i++) {
//			 
//			  for ( int s = n; s>=i; s--) {
//				  System.out.print(" ");
//			  }
//				   for ( int j = i; j>=1; j--) {
//					   System.out.print(j);
//				   }
//				   
//				    for (int j = 2 ; j<=i; j++) {
//				    	 System.out.print(j);
//				    	
//				    }
//				    System.out.println();
//			  }
		
////		 Avg number
//		 int a  = 14;
//		  int b = 57;
//		  int c = 156;
//		   int d = 578;
//		    
//		     double avg = a+b+c+d / 4.0;
//		    System.out.println("avg number is : " + avg);
		
		
//		 prime number 
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter number : ");
//		int n = sc.nextInt();
//		 int count = 0;
//		 
//		 for (int i = 2;  i< n; i++) {
//			 if (n % i == 0) {
//				  count++;
//				  break;
//				  
//			 }
//			 
//		 }
//		  if (  count == 0) {
//			   System.out.println("prime number");
//			   
//		  }
//		
//		  else {
//			  System.out.println("not prime number");
//		  }
		
		
		
//		Armstrong number
//		 Scanner sc = new Scanner(System.in);
//		 System.out.print("Enter Number : ");
//		 int n =  sc.nextInt();
//		 int num = n;
//		  int  sum = 0;
//		  
//		   while ( n > 0) {
//			    int rem =  n % 10;
//			    
//			     sum = sum + rem* rem* rem;
//			      n = n / 10;
//			      
//		   }
//		    if ( num == sum) {
//		    	System.out.print(  num +"  Armstrong number ");
//		    }
//		    else {
//		    	 System.out.println(num + " Is not Armstrong number");
//		    }
		
		
//		 sum of number
//		
//		 int n = 123655;
//		  int sum = 0;
//		  
//		   while ( n > 0) {
//			   
//			    int rem = n % 10;
//			     sum = sum + rem;
//			      n = n/ 10;
//		   }
//		    System.out.println(sum);
		
////		 count of number
//		 int n = 145789656;
//		 int count = 0;
//		  while ( n > 0 ) {
//			 n =   n / 10;
//			    count ++;
//			    
//		  }
//		   System.out.println(count);
		 
//		  swap 
//		 
//		  int a = 10;
//		 int b = 15;
//		  System.out.println(" before swap : a = " + a + " , " + "b = " +  b);
//		   a = a+b;
//		   b = a-b;
//		   a = a-b;
//		   System.out.println(" After swap  : a = " + a + " , " + "b = " +  b);
			  
//		 calculator 
//		 Scanner sc = new Scanner(System.in);
//		 System.out.print("Enter A : ");
//		  int  a= sc.nextInt();
//		  
//			 System.out.print("Enter B : ");
//			  int  b= sc.nextInt();
//			   
//			   System.out.print("Enter operator : ");
//			   int op =  sc.next().charAt(0);
//			   
//			    switch(op) {
//			    
//			    case '+' : System.out.println("Addition  is : " + a+b);
//			    break;
//			    
//			    case '-' : System.out.println("Substraction is : " + (a-b));
//			    break;
//			    
//			    case '*' : System.out.println("multiplication is  : " +a*b);
//			    break;
//			    
//			    case '/' : System.out.println("division  is : " +  a/b);
//			    break;
//			    
//			    case '%' : System.out.println( "Module is : " + a%b);
//			    break;
//			    
//			     default :   System.out.println( " Wrong operator");
//			    }
		
//		 avg  of array
		
// Scanner sc = new Scanner(System.in);
//  System.out.print("Enter size : ");
//   int size =  sc.nextInt();
//   
//    int arr[] = new int[ size];
//    
//		
//     System.out.println("Enter Element : ");
//      for(int i = 0; i< arr.length; i++) {
//    	   arr[i] =  sc.nextInt();
//    	   
//      }
//      
//       int sum = 0;
//       
//       for ( int i = 0; i<= arr.length; i++) {
//    	   
//    	    sum = sum + arr[i];
//    	    
//       }
//        double avg = sum / arr.length;
//        
//         System.out.println(" Avg of array : " + avg);
		
//		 dupicate  array
//		
//		 int arr []  = {5, 4, 1, 3,4,2};
//		 
//		  int count = 0;
//		  
//		   for ( int i = 0; i<arr.length; i++) {
//			    for (int j = i+1; j< arr.length; j++) {
//			    	
//			    	 if ( arr[i] == arr[j]) {
//			    		 count++;
////			    		   System.out.println(" duplicate array is : " + arr[i]);
//			    		   
//			    	 } 
//			    		     
//			    	 }
//			    }
//			     if ( count >  0) {
//			    	  System.out.println("Present duplicate array : " + count);
//			     }
//			     else {
//			    	  System.out.println("Not Present duplicate array");
//			     }
		
//		 remove duplicate array
		
//		 int arr [] = {5,4,7,5,2,1};
//		 
//		  int remove [] = new int[arr.length];
//		  
//		   int count;
//		   
//		    System.out.println("After removing this array  ");
//		    for (int i = 0; i< arr.length; i++) {
//		    	  count = 0;
//		    	  
//		    	   for (int j = i+1; j< arr.length; j++) {
//		    		   
//		    		    if ( arr[i] == arr[j]) {
//		    		    	
//		    		    	 count++;
//		    		    	 
//		    		    }
//		    	   }
//		    	   
//		    	    if (  count == 0) {
//		    	    	 remove[i] += arr[i];
//		    	    	 
//		    	    }
//		    	    if( remove[i] != 0) {
//		    	    	 System.out.print(remove[i] + " ");
//		    	    }
//		    }
//	           2d array second largest
//		
//		 Scanner sc = new Scanner(System.in);
//		  System.out.print("Enter the Row : ");
//		   int r = sc.nextInt();
//		   
//		    System.out.print( "Enter the Column : ");
//		    int c = sc.nextInt();
//		    
//		    
//		     int arr[][] = new int[r][c];
//		      System.out.println("Enter the element");
//		       for ( int i = 0; i<arr.length; i++) {
//		    	    for (int j = 0; j< arr.length; j++) {
//		    	    	 arr[i][j] = sc.nextInt();
//		    	    }
//		    	    	
//		       }
//		       for ( int i = 0; i<arr.length; i++) {
//		    	     for ( int j = 0; j<arr.length; j++) {
//		    	    	 System.out.print(arr[i][j] + " ");
//		    	     }
//		    	      System.out.println();
//		       }
//		        int largest = 0;
//		        
//		         for (int i = 0; i< arr.length; i++) {
//		        	   for ( int j = 0; j<arr.length; j++) {
//		        		     if (arr[i][j] > largest) {
//		        		    	 largest = arr[i][j];
//		        		    	 
//		        		     }
//		        	   }
//		         }
//		        	    System.out.println("Largest array : " + largest);
//		         
//		        	     int second = 0;
//		        	     for (int i = 0; i< arr.length; i++) {
//		        	   	   for ( int j = 0; j<arr.length; j++) {
//		        	   		    if ( arr[i][j] > second && arr[i][j] != largest) {
//		        	   		    	second = arr[i][j];
//		        	   		    }
//		        	     }
//		   }
//		        	      System.out.println("Second largest array : " + second);
		
//		 factorial
//		   int n = 5;
//		    int f = 1;
//		    
//		     for(int i = 1; i<=n; i++) {
//		    	  f = f * i;
//		    	  
//		    	   System.out.println(  i + " != " + f);
		
	
//		   }
//		 evenodd array
//		 Scanner sc = new Scanner(System.in);
//		  System.out.print( "Enter the size  :");
//		   int size = sc.nextInt();
//		   
//		 int  arr [] =  new int[size];
//		 
//		  System.out.println("Enter the elemnet : "); 
//		  for (int i = 0; i<arr.length; i++) {
//			  arr[i] = sc.nextInt();
//		  }
//		   
//		  int even = 0;
//		  int odd = 0;
//		  
//		  for ( int i = 0; i< arr.length; i++) {
//			  System.out.print(arr[i] + " ");
//			   if ( arr[i] % 2 == 0) {
//				   
//				    System.out.println("Even number");
//				     even++;
//			   }
//			   else {
//				   System.out.println("odd number");
//				    odd++;
//			   }
//		  }
//		  
//		   System.out.println("Even count is : " + even);
//		   System.out.println("odd count is : " + odd);
		
//		 user even  and odd number
//		 Scanner sc = new Scanner(System.in);
//		  System.out.print( "Enter the size  :");
//		   int size = sc.nextInt();
//		   
//		 int  arr [] =  new int[size];
//		  int  even = 0;
//		  int  odd = 0;
//		  
//		  System.out.println("Enter the elemnet : "); 
//		  for (int i = 0; i<arr.length; i++) {
//			  arr[i] = sc.nextInt();
//		  }
//		   for (int i = 0; i< arr.length; i++) {
//			    if ( arr[i] % 2 == 0) {
//			    	System.out.println(arr[i] + " even number ");
//			    	 even++;
//			    	 
//			    }
//			    else {
//			    	System.out.println(arr[i] + " odd number ");
//			    	 odd++;
//			    	 
//			    }
//		   }
//		    System.out.println( "Even count is " + even);
//		     System.out.println( "odd count is : " + odd);
		
		 int n = 157889;
		 int rev = 0;
		  while (n > 0) {
			   int Ld = n % 10;
			     rev = (rev * 10 ) + Ld;
			      n = n / 10;
			      
		  }
		   System.out.println(rev);
		 }
	}
		
	
	
