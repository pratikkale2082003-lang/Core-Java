package keywords;
// finally : - indicates  a block of code  always executed...
//2) try and catch structures that will always be executed

public class Finally1 {

	public static void main(String[] args) {
		
		try {
			 
			 
			int n = 10 / 0;
			
		}
	  catch(Exception r){
		  System.out.println(r);
	  }

	  finally {
		  
		  System.out.println("Finally key is Found");
	  }
	}

}
