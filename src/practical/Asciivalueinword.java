package practical;

import java.util.Scanner;

public class Asciivalueinword{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter the String  : ");
		  String str = sc.nextLine();
		  
		  System.out.print("Enter the word get ascii value : ");
		  String word =sc.nextLine();
		  
		  
		  int start = str.indexOf(word);
		  
		   if(start != -1) {
			   System.out.println("Ascii value of " + word);
			    for(int i = start; i< start+ word.length(); i++) {
			    	char ch = str.charAt(i);
			    	System.out.println(ch + " : " + (int)  ch);
			    }
		   }else {
			    
			    	System.out.println( word + " not found string  ");
			    }
		   
	}

}
