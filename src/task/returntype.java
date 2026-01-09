package task;

import java.util.Scanner;

public class returntype {
	 static int mango(int n , int b ) {
		 
		  int sum = n + b;
		  return  sum; 
		 
	 }
	 
	  int sub(int a , int c) {
	  
	  int  sub  = a -c;
	  return sub;
}
	 
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
//		  int n = sc.nextInt();
//		  int b = sc.nextInt();
		   int a = sc.nextInt();
		 int c = sc.nextInt();
//		   
//		System.out.println(mango(15,12));

		returntype name = new returntype();
//		name.sub(10, 5);
		
		System.out.println(name.sub(a,c));
		
		 sc.close();
	}

}
