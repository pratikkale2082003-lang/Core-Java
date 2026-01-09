package oops;

 abstract class  remote {
	 
	 
	  void Volumedown() {
		  System.out.println(" volume down :  volume is decreasing ");
	  }
	 abstract  void volumeup();
	 
 }
 
 class Fun extends remote{

	
	void volumeup() {
		
		
		System.out.println(" volume up :   volume is increasing ");
	}
	 
 }
public class Abstraction3  {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fun ob = new Fun();
		
		ob.volumeup();
		ob.Volumedown();
	}



}
