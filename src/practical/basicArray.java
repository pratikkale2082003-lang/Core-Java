package practical;

import java.util.Scanner;

public class basicArray {
  public static void main(String[] args) {
//	
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter String : ");
	  String str = sc.nextLine();
 
 
  char ch [] = str.toCharArray();
  for (int i =str.length()-1; i>=0; i--) {
	   System.out.print(ch[i]);
	   sc.close();
  }
  }
}
