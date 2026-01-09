package practical;

//Avarage number of array 
 import java.util.*;
public class AvgofArray1 {

	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		System.out.print("Enter the Size : ");
		
		int n = s.nextInt();
		
	int number [] = new int [n];
	
	System.out.println( "Enter the Element : ");
	 for (int i = 0; i<number.length; i++) {
		 number[i]= s.nextInt();
		 
		 
	 }

	 double sum = 0;  
	 
	  for (int i = 0; i<number.length; i++) {
		  
		   sum += number[i];
	  }
		   double avg = sum / number.length;
	  
		   System.out.println( " Avarage number is : " + avg);
		   
	  s.close();
	  
	}

}
