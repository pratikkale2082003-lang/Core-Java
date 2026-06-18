package corejava;

// Write  a Program remove  number  from the String Fortune12cloud3
public class TestBset_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str =  "Fortune12cloud3";
		 
		 
		  String result  = str.replaceAll("[0-9]", "");
		  
		   System.out.println( " Original String :  " + str);
		   
		    System.out.println("Result  : " + result);
		   
	}

}
