package practical;
import java.util.*;
public class fibnochiiserieslist1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System .in);
		System.out.print("Enter the number : ");
		 int n = sc.nextInt();
		
		  System.out.print("Starting number : ");
		 int n1 = sc.nextInt();
		 System.out.print("Ending  number : ");
		  int n2 = sc.nextInt();
		  int n3;
		   for(int i =0; i<n; i++) {
			   
			  
			    
			    System.out.print( n1 + " ");  //System.out.print( i + " = " +n3 + " ");
			    n3 = n1+ n2;
			    n1 = n2;
			     n2 = n3;
			     
			      sc.close();
		   }

	}

}
