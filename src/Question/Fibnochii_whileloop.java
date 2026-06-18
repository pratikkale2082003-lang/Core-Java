package Question;

import java.util.Scanner;

public class Fibnochii_whileloop {


    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("Enter the Number : ");
    	 int n = sc.nextInt();
    	 
    	 
        int a = 0;
        		int b = 1;

        
        
        
        while(a <= n){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
             sc.close();
        }
    }
}
