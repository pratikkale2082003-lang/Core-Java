package practical;

public class decendingorder {

	public static void main(String[] args) {
		
		int order [] = {82,30,51,91,76};
		
		 for (int i = 0; i<order.length; i++) {
			 
			  for(int j = i+1; j<order.length; j++) {
				  if(  order[i] < order[j]) {
					  
//					  Swap
					  int temp = order[i];
					  order[i]= order[j];
					  order[j]= temp;
					  
				  }
			  }
		 }

		 
		  for ( int i = 0; i< order.length; i++) {
			  System.out.print(order[i]+ " ");
		  }
	}

}
