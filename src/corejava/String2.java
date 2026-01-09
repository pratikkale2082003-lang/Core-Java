package corejava;

import java.util.Arrays;

public class String2 {

	 public static void main(String[] args) {
//		 System.out.println("hello");
		   String name = "fortunecloud";

	        System.out.println("String is  : " + name);
	        
	        System.out.println("length is : " + name.length());
	        
	        System.out.println("Uppercase : " + name.toUpperCase());
	        
	        System.out.println("Lowercase : " + name .toLowerCase());
	        
	        System.out.println("Equals : " + name.equals("fortunEcloud"));
	        
	         System.out.println("char at  : " + name.charAt(3));
	         
	         System.out.println("index of : " + name.indexOf("o..."));
	         
	         System.out.println("Ends with : " + name.endsWith("d"));
	         
	         System.out.println("Start with : " + name.startsWith("s") );
	  
	          System.out.println("Replace : " + name.replace("e", "a"));

	          System.out.println("concat  : " + name.concat("  technology"));

	          
	          char arr[] = name.toCharArray();
 System.out.println("charcter array is : " +Arrays.toString(arr))  ;
	      
	         
 
  String sarray[] = name.split("/s");
  System.out.println("split is  : " + Arrays.toString(sarray));
	          
	          
  
  
 
	          
	          
	}
	} 

