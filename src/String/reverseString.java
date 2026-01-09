package String;

public class reverseString {

	public static void main(String[] args) {
		
		String str = "pratik";
		
		
 //using character
		 
//		 System.out.println("Revese String : ");
//		 for(int i = str.length()-1; i>=0; i--) {
//			  System.out.print(str.charAt(i));
//		   }
//		 
//		 using the charArray[];
		
		  char ch [] = str.toCharArray();
		  
		   System.out.print(" reverse String is : ");
		   for(int i = str.length()-1; i>=0; i--) {
			   System.out.print(ch[i]);
//			   
//			   
	}
	}
}
