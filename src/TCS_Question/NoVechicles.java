package TCS_Question;

import java.util.Scanner;

public class NoVechicles {

	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		  System.out.print("Enter the Vichle : ");
		  int v = sc.nextInt();
		  
		   System.out.print("Enter The Wheelers : ");
		    int w = sc.nextInt();
		    
		    
		     if (w % 2 != 0 || w < 2 * v || w >  4* v) {
		    	 System.out.println(-1);
		    	  return;
		    	  
		     }
		      int fourwheelers = (w -2 * v)/2;
		    	  int twoWhiller = v -fourwheelers;
		    	  System.out.println(twoWhiller + " " + fourwheelers );
		    	   sc.close();
		      }
	
	}
