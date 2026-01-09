package Exceptionhandling;

//java.lang.ArrayIndexOutOfBoundsException
public class handlingExeception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayIndexOutOfBoundsException
		 try {
			 
		 char ch [] = new char[2];
		 
		   ch[0] = 'A';
		   ch[1] = '*';
		   ch[2] = '0';
		   
		  
		 }
	
		   catch(Exception c ) {
			   System.out.println( c );
			
		   }
		 
		 System.out.println( " hey java ");
	 }

	}


