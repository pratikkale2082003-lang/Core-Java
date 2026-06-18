package String;

import java.util.Scanner;

public class check_specific_char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  String  : ");
        String s =sc.nextLine();
        
        
        System.out.print("Enter the charcter to check the string : ");
        char ch = sc.next().charAt(0);
        
         int count = 0;
         
         for (int i = 0; i<s.length()-1; i++) {
        	 
        	  if (s.charAt(i)== ch) {
        		  count++;
        		  
        		  
        	  }
        	   for (int j = i+1; j<s.length(); j++) {
        		   
        		    if(s.charAt(i)== s.charAt(j)) {
        		    	System.out.println("Duplicate charcter is " + s.charAt(i));
        		    }
        	   }
        	   
        	   
         }
        
        if(count==0) {
        	System.out.println("Charcter " + ch + " is not present String");
        }
        
        else {
        	System.out.println("Charcter " + ch + " is present String");
        }
        
         sc.close();
	}

}
