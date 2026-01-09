package Question;

public class SumofNumber {

	 public static void main(String[] args) {
		
		 int n = 12456;
		 int sum = 0;
		 
		  while (n > 0) {
			  int rem = n % 10;
			  sum = sum + rem;
			  n = n / 10;
			  
		  }
		   System.out.println("Sum Of number " + sum);
	}
}
