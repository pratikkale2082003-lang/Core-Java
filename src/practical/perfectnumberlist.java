package practical;

public class perfectnumberlist {

	 public static  boolean perfect(int num ) {
		 
		  int sum = 0;
		  
		   for( int i = 1;  i< num; i++) {
			   if(num % i == 0) {
				 sum = sum + i;   
			   }
		   }
		    return sum == num;
		    
	 }

	public static void main(String[] args) {
		 
 int num = 100000;
 
  for(int i = 1; i<num; i++) {
	  if(perfect(i)) {
	  System.out.println( i + "");
	  }
  }
	}

}
