package keywords;

public class WhileExample {

	 public static void main(String[] args) {
		
		  int i = 1;
		  
		   while ( i <= 10) {
			  
			    if ( i == 3) {
			    	 continue;
			    	 
			    }
			    System.out.print(i+ " ");
			    
			     i++;
		   }
	}
}
