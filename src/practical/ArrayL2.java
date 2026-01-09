package practical;

public class ArrayL2 {
	
	public static void main(String[] args) {
		
int count = 0;
		String name  []= {"Hina", "chaya", "maya", "jaya"};
		
		 for(int i = 0; i<name.length; i++) {
			 
			  if (name[i] == "maya") {
				  
				   count ++;
				   
			  }
		 }
			  if(count == 0) {
			System.out.println( "Array is contain the value is of maya");

		
			  }
			  else {
					System.out.println( "Array   doesnt contain the value is of maya");
			  }
			  
		 }
	}
	

