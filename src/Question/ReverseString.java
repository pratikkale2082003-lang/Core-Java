package Question;

import java.util.Scanner;

public class ReverseString {

	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter String : ");
		String str = sc.nextLine();
		
		 char arr[] =  str.toCharArray();
		 
		 
		  for ( int i = str.length()-1; i>=0; i-- ) {
			   System.out.print(arr[i]);
		  }
		   sc.close();
	}
}
