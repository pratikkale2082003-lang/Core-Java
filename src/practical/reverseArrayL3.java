package practical;

//reverse Array with user input
import java.util.*;
public class reverseArrayL3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of array : ");
		 int  size = sc.nextInt();
		 
		  int mark [] = new int[size];
		  
		  System.out.println("Enter the element : ");
		   for (int i = 0; i< mark.length; i++) {
			   mark[i] = sc.nextInt();
			   
		   }
		
		

		System.out.print( " reverse Array  : ");
		for ( int i = mark.length-1; i>=0; i--) {
			System.out.print( mark[i] + " ");
			 sc.close();
			 
		}
	}

}
