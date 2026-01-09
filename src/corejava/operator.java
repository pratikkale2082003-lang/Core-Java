package corejava;

 import java.util.*;
 
public class operator {

	 public static void main(String args []) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Number a : ");
		 int a = sc.nextInt();
		 
		 System.out.println("Enter the number b : ");
		 int b =  sc.nextInt();
		 
		 int add= a+b;
		 int sub = a-b;
		 int mul = a*b;
		 int div = a/b;
		 int mod = a%b;
		 
		 System.out.println("Addition   = " + add);
		 System.out.println("Substraction = " + sub);
		 System.out.println("Multiply = " + mul);
		 System.out.println(" division = " + div);
		 System.out.println("Moduls  = " + mod);
		 
		 sc.close();
		
		 
		 
	 }
}
