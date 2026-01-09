package Question;

public class FibnochiiSeries {

	public static void main(String[] args) {
		
		 int n = 5;
		 int a = 0;
		 int b = 1;
		 int c;
		 
		  for (int i = 1; i<=n; i++) {
			  
			    c = a+b;
			    System.out.println("Fibnochi number " + i + " : " + c);
			     a = b;
			     b =c;
		  }
	}
}