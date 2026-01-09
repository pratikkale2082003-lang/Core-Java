package String;
import java.util.Scanner;
public class String3 {

	

			public static void main(String[] args) {
			
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter String : ");
				String str = sc.nextLine();
				
				 int count=0;
				 for(int i = 0; i< str.length()-1; i++) {
					 
					  if(str.charAt(i)==str.charAt(i+1)) {
					   count++;
					  }
						  }

				 if(count > 1) {
					 System.out.println( str+ " : Duplicate charcter...");
				 }
				 else {
					 System.out.println( str+ " : Not Duplicate charcter...");
				 }
			}

}
