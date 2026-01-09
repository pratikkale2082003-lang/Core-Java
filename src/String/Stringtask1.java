package String;

public class Stringtask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str = "*fct%123@gmail.^il.co! m$ ";
		 
		  String replace = str.replaceAll("[a-z]", "");
		  System.out.println(replace);
		  
		  
		  System.out.println("after removing the charcter : " + str.replaceAll("[^0-9A-za-z]", "") );
	}

}
