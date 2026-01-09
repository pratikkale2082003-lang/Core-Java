package oops;

//methodoverridding -  parent class child class both contain the same function & same parameter with a different defination.  classes =


class bigbbachan{ //parent class

 void  info() {
	 System.out.println(" age is  : 82");
	 System.out.println("wife is : jaya");
 }
}

class abhibachhan extends bigbbachan{ // child class
	
	 void info() {
		 
		 super.info();
	 System.out.println(" age is  : 50");
	 System.out.println("wife is : ashawarya");
}

}

public class methodoverridding {

	public static void main(String[] args) {
		
		abhibachhan b = new abhibachhan();
		 b.info();
		 
	}

}
