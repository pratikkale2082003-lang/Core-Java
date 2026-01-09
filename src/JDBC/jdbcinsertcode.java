package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class jdbcinsertcode {

	
	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
//			Load the driver class
		Class.forName("org.postgresql.Driver");
		  System.out.println(" driver loadeed");
		  
		  
//		   Database connection detail
		  String url = "jdbc:postgresql://localhost:5432/classroom";
		  String username = "postgres";
		  String Password = "7733";
		  
		  
//		   create connection
		   Connection con = DriverManager.getConnection(url, username,Password);
		   System.out.println("Database connected  Sucessfully..");
		   
		    
		   
	  
//		   create table
		   String createtable = "create table fortune2(id int, name varchar(50), fees int, course varchar(50), college  varchar(50))";
//		    insert value
		   String insertQuery = "insert into fortune2(id,name,fees,course,college ) VALUES "
		                       + "(1, 'sahil', 25000, 'java','modern'),"
		                       + "(2, 'kartik', 27000, 'dotnet' , 'aec'),"
		                       + "(3, 'darshan', 35000, 'mern', 'sipna')," 
		                       + "(4, 'sanket', 20000, 'python','ssgmcc')," 
		                       + "(5, 'nitesh', 25000, 'java', 'gs');";
//		   create statement   
		    Statement st = con.createStatement();
		    System.out.println("statement is create");
		   
//		    execute statement
		    st.execute(createtable);
		    st.executeUpdate(insertQuery);
		   System.out.println(" table create and data inserted sucessfully");
		   
//		   ---------------------------------------------------------------------------------------------------
		   String select = "Select * from fortune2";
		 ResultSet rx   = st.executeQuery(select);
		   
		    System.out.println("\n--------------------------------------------------");
		    System.out.println("ID\tName\t\tFees\tCourse\tCollege");
		   System.out.println("-----------------------------------------------------");
		   
		   
		    while (rx.next()) {
		    	int id = rx.getInt("id");
		    	String name = rx.getString("name");
		    	int fees = rx.getInt("fees");
		    	String course = rx.getString("course");
		    	String  college = rx.getString("college");
		    	 System.out.println(id + "/t" + name + "t\t" + fees + "\t" + course + "\t" + college);
		    }
	// close connection.
//		    con.close();
		    rx.close();
		    st.close();
		    
		    con.close();
		     System.out.println(" connection closed");
		   
		}

		
	


}
