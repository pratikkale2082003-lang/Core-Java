package Question;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Calender_Question {

	 public static void main(String []  args) {
		 
		 Scanner  sc = new Scanner(System.in);
		 System.out.print("Enter Day : ");
		  int day = sc.nextInt();
		  
		  
		   System.out.print("Enter Month : ");
		   int month = sc.nextInt();
		   
		    System.out.print("Enter Year : ");
		  int year = sc.nextInt();
		  
		  
//		   create date object 
		  LocalDate date =  LocalDate.of(year, month, day);
		  
		  
//		   Get Day  of week
		  DayOfWeek dayofweek = date.getDayOfWeek();
		  
		   System.out.println("Day is : " + dayofweek);
		   
		  
	 }
}
