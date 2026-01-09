package practical;

 import java.util.*;
public class fibnochievennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System .in);
		  System.out.println("Starting number : ");
		 int n1 = sc.nextInt();
		 System.out.println("Ending  number : ");
		  int n2 = sc.nextInt();
		  
		  
				   
		  System.out.println("Even number is : ");
		   for(int num = n1; num <=n2; num++ ) {
			    if(num % 2 == 0) {
			    	System.out.print( num + " ");
			    	sc.close();
			    	
			    }
		   }
	}

}
