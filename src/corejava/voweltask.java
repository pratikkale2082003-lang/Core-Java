package corejava;
import java.util.*;
public class voweltask {
	

	    public static void main(String[] args) {
	         
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the String : ");
	        String str = sc.nextLine();
	      int countt = 0;
	    
	     for(int i = 0; i<str.length();   i++){
	        
	            char ch = str.charAt(i);

	        
	            if( ch=='a'   || ch =='A'   || 
	             ch == 'e'  ||  ch == 'E' ||
	              ch =='i'  || ch == 'I'  ||
	               ch == 'o' || ch  == 'O' ||
	               ch == 'u' || ch == 'U'){
	               countt++;
	               }
	            }
	                System.out.println("vowel is present the String " + countt );
	        }
	        
	    }





