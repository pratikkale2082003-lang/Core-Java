package Array;

import java.util.Scanner;

//Enter the index  is find the key
//Linearsearch

public class EnterIndexFindKey {
public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
 System.out.print("Enter Size of Key : ");
  int n = sc.nextInt();
  
   int arr [] = new int [n];
   System.out.println("Enter The Elements :  ");
    for (int i = 0; i < arr.length; i++) {
    	arr[i] = sc.nextInt();
    	
    }
    System.out.print("Enter the IndexNumber of Search : ");
    int index = sc.nextInt();
    
     if (index >= 0 && index < arr.length) {
    	 System.out.println(index + "Index Key is : " + arr[index]);
    	 
     }
     else {
    	 System.out.println("Not Found The Index Value is : " + arr.length);
     }
}
}