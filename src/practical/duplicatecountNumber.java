package practical;

public class duplicatecountNumber {

	public static void main(String[] args) {
	 int ob [] = {4, 8,4, 7 ,5 ,2,5};
	 int count = 0;

	  for(int i =0; i<ob.length; i++) {
		  
		   for (int j =i+1; j <ob.length; j++) {
			   if(ob[i] == ob[j]) {
				   
				    count++;
				
				    
			   }
		   }	   
	  }
	   if ( count > 0) {
System.out.println("duplicate count  value is : " + count  ); //true 
	   } 
else {
		   System.out.println("not duplicate value count " ); //false
	   }
	}
}

