package corejava;

//nested if else
public class nestedifelse {

	public static void main(String [] args) {
		boolean electricity = true;
		boolean  Switchon =  true;
		
		 if(electricity == true) {
			if (Switchon == true) {
			 System.out.println("light on");
			 
		 }
		 else {
			 System.out.println("light off");
		 }
	
	} else {
			 System.out.println("electracity");
		 }
	}
}
