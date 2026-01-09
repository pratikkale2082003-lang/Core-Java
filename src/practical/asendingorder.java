package practical;

public class asendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int number [] = { 90, 43,52,78,21};
		 
		   for (int i = 0; i < number.length; i++) {
			    for ( int j = i+1; j<number.length; j++) {
			    	
			    	 if (number[i] >  number[j]) {
			    		 
//			    		  swap 
			    		 int temp = number[i];
			    		 
			    		  number[i]= number[j];
			    		  number[j] = temp;
			    	
			    	 }
			   	 
			    }
		   }
		   
		   for (int i = 0; i <number.length; i++) {
				  System.out.print( + number[i] + " ");
		   }
	}

}
