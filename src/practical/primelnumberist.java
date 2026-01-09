package practical;

import java.util.Scanner;

public class primelnumberist {
	 public static boolean prime(int n) {
	 for(int i = 2; i < n; i++) {
		 if(n % i == 0) {
			 
			  return  false ;
			  
		 }
		 
	 }
	  return true;
	  
	 }
	 
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter numeber of list : ");
		int n = sc.nextInt();
		for(int i = 2; i< n; i++) {
			if(prime(i)) {
				System.out.print(i + " ");
			}
		}

	}

}
