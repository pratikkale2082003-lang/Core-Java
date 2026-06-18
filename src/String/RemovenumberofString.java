package String;

public class RemovenumberofString {

	 public static void main(String []  args) {
		 
		  String str = "For1tuneClo2ud3";
		  
		   String result  = str.replaceAll("[0-9]", "");
		   
		    System.out.println("original String : " + str);
		     System.out.println("After Removing number : " + result);
	 }
}
