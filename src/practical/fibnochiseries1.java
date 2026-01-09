package practical;

// its is  the series  where the number series is equal to  last two digit
public class fibnochiseries1 {
	
	 public  static int fib(int n) {
		  if(n == 0 || n == 1){
			  return n;
			  
		  }
		  
		   int fnm1 = fib(n-1);
		    int fnm2 = fib(n-2);
		     int fn = fnm1+ fnm2;
		     return fn;
	 }

	public static void main(String[] args) {
	
          int n = 5;
           System.out.println(fib(n));
	}

}
