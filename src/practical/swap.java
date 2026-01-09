package practical;

public class swap {

	public static void main(String[] args) {
		

	
	 int a = 10;
		 int b = 20;
//		 using third variable 
//		 System.out.println(" before swap : a = " + a + " b = "+ b);
//		
//		  int temp = a;
//		  a = b;
//		  b= temp;
//		  System.out.println(" After swap : a = " + a + " b = "+ b);
		  
		  
//		without using third variable 
//		
//		 System.out.println(" before swap : a = " + a + " b = "+ b);
//		  a = a+b;
//		  b = a-b;
//		  a= a-b;
//		  System.out.println(" After swap : a = " + a + " b = "+ b);
		  
		  // without addition & substraction.
		  System.out.println(" before swap : a = " + a + " b = "+ b);
		  a = a ^ b;
		  b = a ^b;
		  a = a ^b;
		  System.out.println(" After  swap : a = " + a + " b = "+ b);
	}

}
