package practical;
import java.util.*;

public class Armstrongnumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number  : ");
         int n = sc.nextInt();
 
	 int num = n;
	 int sum = 0;
  
		while(n > 0) {
			 int rem = n % 10;
			 sum = sum + rem *rem * rem;
			 
			  n = n / 10;
			  
			  
		}
		
		 if ( sum == num) {
		 System.out.println( num + " its is armstrong number ");
	}
		 else {
			 System.out.println(num + " its not  armstrong number");
		 }
 sc.close();
}
}