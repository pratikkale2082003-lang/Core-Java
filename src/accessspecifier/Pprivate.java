package accessspecifier;

// private : - only accessible within the class
public class Pprivate {
           
	private int num = 10; //  private  variable name
	
	
	 private void display() {//private method
		 
		 System.out.println("Private "+ num);
	 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pprivate p = new Pprivate();
		p.display();
		
		
	}

}
