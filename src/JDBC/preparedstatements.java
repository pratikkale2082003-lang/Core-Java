package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class preparedstatements {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
//	Load the driver class
Class.forName("org.postgresql.Driver");
  System.out.println(" driver loadeed");
  
  
//   Database connection detail
  String url = "jdbc:postgresql://localhost:5432/cravita";
  String username = "postgres";
  String Password = "7733";
  
  
//   create connection
   Connection con = DriverManager.getConnection(url, username,Password);
   System.out.println("Database connected  Sucessfully..");
   
   
   String query = "INSERT INTO fortunecloud(id, name, fees, course) VALUES (?, ?, ?, ?)";
   
   PreparedStatement p = con.prepareStatement(query);
   
   
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter ID :");
    int id = sc.nextInt();
    
    System.out.println( "Enter Name : ");
     String name = sc.next();
     
     System.out.println("Enter fees : ");
   int fees = sc.nextInt();
   
   System.out.println( "Enter course : ");
   String course = sc.next();
   
    p.setInt(1,  id);
    p.setString(2, name);
    p.setInt(3,  fees);
   p.setString(4,"java");
   
   
//    execute the query
   Statement st = con.createStatement();
   
   String  fetch = "select * from fortunecloud";
   
  ResultSet rs = st.executeQuery(fetch);
  
   System.out.println("\n-------------------------------------------------------------------------------");
   System.out.println("Id\tName\t\tFees\tCourse");
   System.out.println("------------------------------------------------------------------------");
  while (rs.next()) {
	  System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getInt(3)+ " | "  + rs.getString(4) );
//	  System.out.println(rs.getString(2) );
//	  System.out.println(rs.getInt(3));
//	  System.out.println(rs.getString(4));
  }
 
  
//    execute query
//   p.executeUpdate();
//   
   con.close();
}
}
