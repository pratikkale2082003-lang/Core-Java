package practical;
import java.util.*;
public class Asciivalue1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      Scanner sc = new Scanner(System.in);
		      
		      System.out.print("Enter the Charcter : ");
		       char ch = sc.next().charAt(0);
		       
		        System.out.println( ch + " Ascii value is : " + (int)ch );
	}
}