package Pattarn;
//1111
//0  0
//1  1
//0000
public class Hallow_pattarn_01 {
public static void main(String[] args) {
	
	 int r = 4;
	  int c = 4;
	  
	 for ( int i = 1; i<=r; i++) {
		 
		 for (int j = 1; j<=c; j++) {
			 if( i == 1 || i == r|| j ==1 || j == c) {
             
			 if ((i)%2 == 0) {
				  System.out.print("0");
			 }
			 else {
				  System.out.print("1");
			 }
			 }
			 else {
				  System.out.print(" ");
			 }
	 }
		  System.out.println();
}
}
}
