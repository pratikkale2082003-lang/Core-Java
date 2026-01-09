package Question;

public class SwapNumber {

	public static void main(String[] args) {
		
		 int a = 50;
		 int b = 20;
		 
	 
		  System.out.println("Before Swap : a = "+ a + " b = " + b);
//		  using third variable
//		   int temp = a;
//		    a = b;
//		    b = temp;
		    
//		  without using third varible 
//		    
//		   a = a+b;
//		   b = a-b;
//		   a = a-b;
		  
//		   without using third varible and addition and substraction
		   a = a ^ b;
		   b = a ^ b;
		   a = a ^ b;
		    System.out.println("After  Swap : a = "+ a + " b = " + b); 
		   
	}
}
