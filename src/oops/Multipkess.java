package oops;

import java.util.Scanner;

interface Ipl2{
	  void team ( String  name);
	  
	 
 }

  interface  country {
	  
	  void national( int Rank);
	  
  }
  
  interface  rangi{
	  
	   void domantic();
  }
  
  class Player  implements Ipl2, country, rangi{

	
	public void domantic() {
		
		 System.out.println(" mumbai");
		
	}

	@Override
	public void national( int Rank ) {
		
		
		System.out.println("India");
		
		
	}

	@Override
	public void team(String name) {
		// TODO Auto-generated method stub
		System.out.println(" chennai Super king");
	}


	  
	 
  }
          public class Multipkess{
        public static void main(String[] args) {
        	 Scanner sc = new Scanner(System.in);
        	 
        	Player  p = new Player();
        	
        	 System.out.print("Enter player name : ");
        	String name = sc.nextLine();
        	p.team(name);
        	
        	 System.out.print(":  Rank is ");
        	int n = sc.nextInt();
        	p.national(n);
        	p.domantic();
        }
        }