package keywords;

// thow - create an exeception
import java.util.*;
public class throw1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the age : ");
				int age = sc.nextInt();
				
				 if (age >= 18) { 
					 System.out.println("eligible  for voting ");
				 }
				 else {
					 throw new ArithmeticException("not eligible for voting");
				 }

			}

		}

