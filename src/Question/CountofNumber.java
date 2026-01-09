package Question;

public class CountofNumber {

	 public static void main(String[] args) {
		
		  int n = 457896;
		  int count = 0;
		   while (n > 0) {
			    count++;
			    n = n / 10;
			    
		   }
		    System.out.println("Count Of Number : " + count);
	}
}
