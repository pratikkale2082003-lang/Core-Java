package practical;

 import java.util.*;
public class positivenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner  sc = new Scanner(System.in);
   System.out.println("Enter  number : ");
   
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if( a > 0 && b > 0 && c > 0 && d > 0) {
			System.out.println("positive numbers "  );
			
		}
		
			
		else {
			System.out.print("negative number : "  );
		     if(a < 0)  System.out.println(a);
		     if(b < 0)  System.out.println(b);
		     if(c < 0)  System.out.println(c);
		     if(d < 0)  System.out.println(d);

  sc.close();
		}
	}

}
