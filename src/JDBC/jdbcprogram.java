package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcprogram {

	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Class.forName("org.postgresql.Driver");
		  System.out.println("jdbc");
		  
//		   database URl,  Username, password , jdbc:postgresql://localhost:5432/mydatabase 
		  
//		  database 
		  String URL = "jdbc:postgresql://localhost:5432/java";
		  String username = "postgres";
		  String Password = "7733";
		  
		  
//		   2 create connection
//		  
		  Connection con = DriverManager.getConnection(URL, username, Password);
		  System.out.println( "  connection data");
		  
		  
//		 3  create statement
		  String create_table ="create table student2(id int , name varchar(50), salary int)";
		  
		  
		   String insertQuer = "insert into  student2(id, name,salary) VALUES" +
		   		 " (1, 'pratik', 4566000),"+
		   		"(2, 'mahesh', 500001),"+
		   		"(5, 'supesh',25000)";		
		   
		   
		  Statement st =  con.createStatement();
		  System.out.println("3. statements");
		  
		  
//		   4. executes the statement / Query
		 st.execute(create_table);
		 st.executeUpdate(insertQuer);
		 System.out.println("4.query ");
		 
//		  5. close  connection
		  con.close();
		  System.out.println("5.connection close ");
	}
}
