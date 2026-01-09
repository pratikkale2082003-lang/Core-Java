package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcclass {


	    public static void main(String[] args) throws ClassNotFoundException, SQLException {

	        // Load the driver class
	        Class.forName("org.postgresql.Driver");
	        System.out.println("Driver loaded successfully");

	        // Database connection details
	        String url = "jdbc:postgresql://localhost:5432/pune";
	        String username = "postgres";
	        String password = "7733";

	        // Create connection
	        Connection con = DriverManager.getConnection(url, username, password);
	        System.out.println("Database connected successfully");

	        
	        
//	       create table   
	     String table = "create table pmpl(ticket int , stop_name varchar(50), km int)";
	     
//	      insert value
	      String  insert = "insert into  pmpl(ticket, stop_name, km ) VALUES "
	    		  + "(20,'Manapa', 6),"
	    		  + "(30,'Warje', 10),"
	    		  + "(10, 'Karvenagar', 3);";
	      
	    		 
//	       create statement
	         Statement s = con.createStatement();
	         System.out.println("create statement ");
	        
	         
//	          execute statement
	       s.execute(table);
	       s.executeUpdate(insert);
	       
	       
//	       --------------------------------------------------------------------------------------------------------------
	 
	    String fetch = "select * from pmpl";
	    
	     ResultSet rs = s.executeQuery(fetch);
	     System.out.println("\n------------------------------------------------------");
	    System.out.println("ticket\tstop_name\t\tkm ");
	     System.out.println("-------------------------------------------------------");
	    
	    while (rs.next()) {
	    	int ticket = rs.getInt("ticket");
	    	String stop_name = rs.getString("stop_name");
	    	int km = rs.getInt("km");
	    	
	    	System.out.println(ticket + "\t" + stop_name + "\t\t" +km);
	    }
	  
//	     close connection
	     rs.close();
	     s.close();
	    con.close();
	    System.out.println("----------------------------------------------------------------------");
	     System.out.println(" connection is closed");
	    }
	}


