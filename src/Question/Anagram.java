package Question;


 import java.util.*;
 
public class Anagram {

	 public static void main(String[] args) {
		String str1 =  "egg";
		String str2 = "abb";
		
		
//		 convert to char array 
		 char[] arr1 = str1.toCharArray();
		 
		 char[] arr2 = str2.toCharArray();
		 
//		Sort both arrays
		 if (Arrays.equals(arr1, arr2)) {
			 
			 System.out.println("Anagram");
		 }
		 else {
			 System.out.println("Not Anagram");
		 }
	}
}
