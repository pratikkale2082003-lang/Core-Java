package practical;

//Enter the index  is find the key
import java.util.*;
public class indexarray2 {
public static void main(String[] args) {
	

		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Size of Array : ");
		 int n = sc.nextInt();
		 
		 int arr[] = new int[n] ;
		 
		  System.out.println( "Enter the Element : ");
			  
		   for ( int i = 0; i<arr.length; i++) {
			   arr[i] = sc.nextInt();
			   
		   }
		   
		   
		   System.out.print("Enter the number of Search : ");
		   int index = sc.nextInt();
		   
		   
		   if( index >= 0 &&  index < arr.length) {
			   System.out.println( index + " index  key is : "+ arr[index]);
			   
		   }
		   else {
			   System.out.println("not found the index  value is " + arr.length);
			   sc.close();
		   }
		    }
}



			 