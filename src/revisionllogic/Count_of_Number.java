package revisionllogic;

public class Count_of_Number {

	 public static void main(String [] args ) {
		 
		 
		  int n =  1235698;
		   int count = 0;
		   
		   while ( n > 0 ) {
			   n = n  / 10;
			    count ++;
			    
		   }
		    System.out.println("Count  Number : " + count );
	 }
}