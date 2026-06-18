package practical;

import java.util.Arrays;
import java.util.Scanner;

public class String_Sorting_Character {
public static void main(String[] args) {
	
	 Scanner sc = new Scanner (System.in);
	  System.out.print("Enter String : ");
	  String str = sc.nextLine();
	  
	  
	  char [] arr = str.toCharArray();
	  
	  Arrays.sort(arr);
	  
	   String  sortedstr = new String(arr);
	   System.out.println(sortedstr);
	    sc.close();
}

}
