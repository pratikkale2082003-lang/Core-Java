package practical;

import java.util.Scanner;

public class asciivalueofallString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		
		System.out.println("Ascii value is of charcter : ");
		 for(int i = 0; i< str.length(); i++) {
			 char ch = str.charAt(i);
			 System.out.println(ch + " : " + (int) ch);
			 
		 }
	}

}
