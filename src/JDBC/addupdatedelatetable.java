package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class addupdatedelatetable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		1. load class driver
		Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded successfully!");

        // Step 2: Database connection details
        String url = "jdbc:postgresql://localhost:5432/classroom";
        String username = "postgres";
        String password = "7733";

        
//        3.  create connection 
         
        Connection con = DriverManager.getConnection(url, username, password);
         System.out.println("Database connect  sucessfully");
        
        
//        create statement
         Statement s = con.createStatement();
         System.out.println(" statement is creating sucessfully");
        
//         create table  query
         String create = "create table Pune( id  int , name varchar(50),  salary int, company varchar(50))";
         s.execute(create);
         System.out.println(" create table sucessfully");
         
          String insert = "insert into Pune(id, name,salary, company) VALUES " 
        		          + "(1, 'Sushant', 25000, 'infoys'),"
        		          + "(2, 'Akshay', 32000, 'Hcl'),"
        		          + "(3, 'Shankar', 17000, 'BDO'),"
        		          + "(4, 'Omkar', 27000,'Tcs');";
          s.executeUpdate(insert);
          System.out.println(" insert the value sucessfully");

          
          
//           Add column
          String alterq = "alter table  Pune add column  city varchar(50)";
           s.execute(alterq);
           System.out.println("Add colum Query sucess fully exits city");

//            Update  
           String updateq = "UPDATE Pune SET city = 'Mumbai' WHERE  id = 1";
           s.executeUpdate(updateq);
            System.out.println(" upadte sucessfully");
           
//   delete 
             String deleteq ="delete from Pune  where id = 4";
             s.executeUpdate(deleteq);
             System.out.println("successfuly delete");
           
//              select 
             String select = "select * from Pune";
             ResultSet rs = s.executeQuery(select);
             
             System.out.println("\n-------------------------------------------------------------");
             System.out.println("ID\tName\t\tSalary\tCompany\tCity");
             System.out.println("-------------------------------------------------------------");
             
             while (rs.next()) {
                 int id = rs.getInt("id");
                 String name = rs.getString("name");
                 int salary = rs.getInt("salary");
                 String company = rs.getString("company");
                 String city = rs.getString("city");
             
                 System.out.println();
                 System.out.println(id + "\t" + name + "\t\t" + salary+ "\t" + company + "\t"  + city);
               
                  
             }


             
//             close connection
             rs.close();
             s.close();
             con.close();
          }
}
