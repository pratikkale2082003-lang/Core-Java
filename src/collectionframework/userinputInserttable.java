package collectionframework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class userinputInserttable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		
//				Load the driver class
			Class.forName("org.postgresql.Driver");
			  System.out.println(" driver loadeed");
			  
			  
			//   Database connection detail
			  String url = "jdbc:postgresql://localhost:5432/cravita";
			  String username = "postgres";
			  String Password = "7733";
			  
			  
			//   create connection
			   Connection con = DriverManager.getConnection(url, username,Password);
			   System.out.println("Database connected  Sucessfully..");
			   
//=----------------------------------------------------------------------------------------------------------
			   
//			  
			    
			   String table = "create table india(jes_no int, name varchar(50), run int, ipl_team varchar(12))";
			   
			   
			   Scanner sc = new Scanner(System.in);
			   
			   
			   System.out.println("Enter Jesary NO : ");
			   int jes_no = sc.nextInt();
			   
			   System.out.println("Enter name : ");
			   String name = sc.nextLine();
			   sc.nextLine();
			   
			   System.out.println("Enter run : ");
			   int run = sc.nextInt();
			   
			   System.out.println("Enter iplteam : ");
			   String ipl_team = sc.next();
			   
			   String insert = "insert into india(jes_no, name,run,ipl_team) VALUES ("  
			 
			     + jes_no + ", '" + name + "', " + run + ", '" + ipl_team + "');";
			   
			   
//			    create  statement
			   Statement s = con.createStatement();
			   System.out.println("statement sucess");
			   
//			   execute  query
			   s.execute(table);
			   s.executeUpdate(insert);
			   
//			   close connection
			   
			   con.close();
			   
			   
			   
			   
	}

}
