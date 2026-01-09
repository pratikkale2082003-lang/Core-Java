package accessspecifier;

public class default2 {
	
	int n = 20;  // default variable name
	
	 void display() {  // default method
		System.out.println(" default " + n);
		
		 
	 }

	public static void main(String[] args) {
		
		default2 d = new default2();
		d.display();  // work
	}

}
