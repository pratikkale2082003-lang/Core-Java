package Question;

import java.util.*;

public class EnterIndexfindkey {

	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
		
 System.out.println("Enter Size Of Array : ");
  int n = sc.nextInt();
  
   int arr[] = new int [n];
   
    System.out.println("Enter the Elements: ");
     for ( int i  = 0; i< arr.length; i++) {
    	  arr[i] = sc.nextInt();
 
     }
     
      System.out.print("Enter the index of search : ");
     
       int index = sc.nextInt();
       
        if ( index >= 0 && index < arr.length) {
        	
        
        System.out.println(+ index + " index  key is  : " + arr[index]);
	}
        else {
        	 System.out.println("not found the value is : " + arr.length);
        }
        sc.close();
	}
}
