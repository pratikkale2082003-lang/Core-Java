package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

//---------Transportation  Booking  System -----------------------------------


//---------------- Parent Class ----------------

abstract  class Transport{ // using abstraction
	
	// using encapsulation
	 protected String source;        // start journey
	 protected String desitination; // end journey
	 protected double ticketFare;  // fare ticket
	 
	 public Transport(String source, String desitination, double ticketFare) {// using Constructor
		 this.source=source;
		 this.desitination = desitination;
		 this.ticketFare= ticketFare; // use this keyword
		 
	 }
	 
	 public abstract  double calculateticket();
	 
	  public  void displayDetails() {
		  
		   System.out.println("Source: " +  source);
		    System.out.println("Desitination : " + desitination );
		    System.out.println("Ticket : " + ticketFare);
	  }
}
//---------------- Bus Class ----------------
class Bus extends Transport{ // child class
	
	private boolean  isAC;
	
	 public Bus(String source, String desitination ,  double ticketFare, boolean isAC ) {
		 super( source,  desitination,  ticketFare);
		 this.isAC = isAC;
	 }

	 @Override
	 public double calculateticket() {
		double ticket = ticketFare;
		
		 if (isAC) {
			  ticket += 50;
	 }
		 return ticket;
	 }
}

//---------------- Train Class ----------------
class Train extends Transport{// child class

	 private String classType; // Sleeper , 3Ac, 2ac, 1ac
	
	
	 public Train(String source, String desitination, double ticketFare, String classType) {
		super(source, desitination, ticketFare);
		this.classType =  classType;
	}

	@Override
	public double calculateticket() {
		
		 switch(classType.toLowerCase()) {
		 case "sleeper" : return ticketFare + 100;
		 case "3ac" : return ticketFare + 300;
		 case "2ac":     return ticketFare + 500;
         case "1ac":     return ticketFare + 800;
         default:        return ticketFare;
		 }
		 
	} 
	
}

//---------------- Flight Class ----------------
 class Flight extends Transport{// child class

	  private boolean isInternational;
	  private double  luggageWeight;
	  
	
	public Flight(String source, String desitination, double ticketFare, boolean isInternational , double weight) {
		super(source, desitination, ticketFare);
	this.isInternational =isInternational;
	this.luggageWeight =  weight;
	}

	
	@Override
	public double calculateticket() {
		// TODO Auto-generated method stub
		  double ticket = ticketFare;

	        if (isInternational) {
	            ticket += 2000; // International charges
	        }

	        // Extra luggage charges
	        if (luggageWeight > 15) {
	           ticket += (luggageWeight - 15) * 25;
	        }
	        return ticket;
	    }

	}



public class TransportationBookingSystem {

//	----------------------------------JDBC------------------------------------------------------------------
	public static void saveBooking(String passengerName,String type, Transport t) {

	    String url = "jdbc:postgresql://localhost:5432/classroom";
	    String username = "postgres";
	    String password = "7733";

	    double finalFare = t.calculateticket();

	    try {
	        Class.forName("org.postgresql.Driver");

	        Connection con = DriverManager.getConnection(url, username, password);

	        String sql = "INSERT INTO bookings (passanger_name, transport_type, source, destination, base_fare, final_fare ) VALUES (?,?,?,?,?,?)";

	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, passengerName);
	        ps.setString(2, type);
	        ps.setString(3, t.source);
	        ps.setString(4, t.desitination);
	        ps.setDouble(5, t.ticketFare);
	        ps.setDouble(6, finalFare);
	        

	        int rows = ps.executeUpdate();

	        if (rows > 0) {
	            System.out.println("\nBooking Saved Successfully in PostgreSQL!");
	        } else {
	            System.out.println("\nFailed to Save Booking!");
	        }

	        con.close();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
//--------------------------------------Main Method------------------------------------------------------------------
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter Passanger Name : ");
		 String passanger = sc.nextLine();
		 
		 
		  System.out.println("Choose Transport : 1.Bus    2.Train     3. Flight" );
		  int choice = sc.nextInt();
		  sc.nextLine();
		  
		  
		   
		   System.out.print("Enter Source : ");
		   String src = sc.nextLine();
		   
		    System.out.print("Enter Desitination : ");
		   String dest = sc.nextLine();
		   
		   
		   System.out.print("Enter Ticket :");
		   double price = sc.nextDouble();
		   
		   
		   Transport t = null;
		   String type = ""; 
		   
		   switch(choice) {
		   case 1 : 
			   
			    System.out.print( "Is Ac Bus ? (true/ false)");
			     boolean isAC = sc.nextBoolean();
			     
			     t = new Bus(src, dest,  price, isAC);
			      type = "Bus";
			      
			     break;
			 
		   case 2 : 
			   System.out.print("Enter Train Class (Sleeper/3AC/2AC/1AC)" );
			   sc.nextLine();
			   
			   String  classType = sc.nextLine();
			   t = new Train(src, dest, price, classType);
			    type = "Train";
			    
			   break;
			   
		   case 3 : 
			    System.out.print("Is International Flight ? (true/false)");
			    
			     boolean isInternational = sc.nextBoolean();
			     
			     System.out.print("Enter Luggage Weight (kg): ");
			      double weight = sc.nextDouble();
			      
			       t = new Flight(src, dest , price,isInternational, weight );
			       type = "Flight";
			       
			       break;
			       
		   default:
               System.out.println("Invalid Choice!");
               System.exit(0);
		   }
		   
		    System.out.println("\n-------------------Booking Details---------------");
		     System.out.println("Passanger Name : " + passanger);
		    t.displayDetails();
		    System.out.println("Final Ticket : " + t.calculateticket());
		    
		    saveBooking(passanger,type, t);
		    sc.close();
	}
}
