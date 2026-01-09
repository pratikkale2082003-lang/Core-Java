package corejava;

public class Swap {

	public static void main(String[] args) {
		 int a = 10;
		 int b = 20;
		 System.out.println(" before Swap is : a = " + a + " b  = "+ b );

//		  using add and sub
		  a= a+b;
		  b = a-b;
		  a = a-b;
		 
//		 using third varible
//		 int temp = a;
//		 a =  b;
//		 b = temp;
		 
		  
//		   without third and add/sub
//		  a = a ^ b;
//		  b = a ^b;
//		  a = a ^ b;
		  System.out.println(" After  Swap is : a = " + a + " b  = " + b );
	}

}
