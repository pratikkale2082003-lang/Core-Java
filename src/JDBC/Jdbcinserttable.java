package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcinserttable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		Load the driver class
	Class.forName("org.postgresql.Driver");
	  System.out.println(" driver loadeed");
	  
	  
//	   Database connection detail
	  String url = "jdbc:postgresql://localhost:5432/cravita";
	  String username = "postgres";
	  String Password = "7733";
	  
	  
//	   create connection
	   Connection con = DriverManager.getConnection(url, username,Password);
	   System.out.println("Database connected  Sucessfully..");
	   
	    
	   
  
//	    create statement
	   String createtable = "create table fortune3(id  SERIAL PRIMARY KEY , name varchar(50) , course varchar(50), fees int)";
//	    insert value
	   String insertQuery = "insert into fortune3(name,course, fees) VALUES "
	                       + "('sahil',  'java',50000 ),"
	                       + "( 'nitesh', 'java', 45000)";
			   
	    Statement st = con.createStatement();
	    System.out.println("statement is create");
	   
//	    execute statement
	    st.execute(createtable);
	    st.executeUpdate(insertQuery);
	   System.out.println(" table create and data inserted sucessfully");
	   
	   
	   
	   
	   
// close connection.cr
	    con.close();
	     System.out.println(" connection closed");
	   
	}

	
}
