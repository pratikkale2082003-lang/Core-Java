package Array;

//Enter the Key is Find Index
//// using linear search
import java.util.*;
public class EnterKeyFindIndex {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Size of Array : ");
		 int n  = sc.nextInt();
		 
		  int arr[] = new int [n];
		  System.out.println("Enter The Elements : ");
		   for (int i = 0; i < arr.length; i++) {
			   
			    arr[i] = sc.nextInt();
			    
		   }
		   
		    System.out.print("Enter KeyNumber to Search : ");
		    int  key = sc.nextInt();
		    
		     boolean found = false ;
		     
		     for (int i = 0; i < arr.length; i++) {
		    	 if (key == arr[i]) {
              System.out.println( key + " found at index : " + i);
              found = true;
              break;
              
		    	 }
		     }
		      if (!found) {
		    	  System.out.println(key + " Not Found in the array");
		      }sc.close();
	}
}
