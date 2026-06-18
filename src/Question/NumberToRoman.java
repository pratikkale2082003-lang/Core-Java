package Question;

import java.util.Scanner;

public class NumberToRoman {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter  Number : ");
		  int n = sc.nextInt();
		 
	
		 
		  String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		  int[] value   = {1000,900,500,400,  100,90,  50,  40, 10,  9,   5,   4,  1};
		  String result = "";

	        for(int i = 0; i < value.length; i++){
	            while(n >= value[i]){
	                result = result + roman[i];
	                n = n - value[i];
	            }
	        }
	        
	        System.out.println("Roman Number = " + result);
	        sc.close();
	}
}
