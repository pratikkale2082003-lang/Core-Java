
package Exceptionhandling;

// try :  block of code execute for error.  // its use  exception handle
//  catch -   to handle the exception

//    throw -   create and exception
//   finally -    code always executes
//   throws - to declare  exception
public class try1block {

	public static void main(String[] args) {
		
		
		
		
		
		

			  try {
				  
//				  int a = 10/0;
				  
				   
//				 String str1 = null;
//				 
//				  System.out.println(str1.length());
				  
				   int arr[] = {10,20};
				   System.out.println(arr[3]); 
				 
			  }
			  
			  catch(ArrayIndexOutOfBoundsException e) {
				 
				   try {
					   String str1 = null;
						 
						  System.out.println(str1.length());
				   }
				    catch(Exception f){
				    	System.out.println(f);
				    }
				   System.out.println(e);
			  }
				
			  
				  
		 }

//			   catch (NullPointerException d) {
//				   System.out.println(d);
//			   }
//		  
//			   catch(Exception f) {
//				   System.out.println(f);
//			   }
}

//}
//ArithmeticException
//NullPointerException
//ArrayIndexOutOfBoundsException