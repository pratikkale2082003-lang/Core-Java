package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Studentmanagementsystem2 {
	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
	        Scanner sc = new Scanner(System.in);

	        // Load PostgreSQL JDBC Driver
	        Class.forName("org.postgresql.Driver");

	        // Database connection details
	        String url = "jdbc:postgresql://localhost:5432/StudentManagementSystem"; 
	        String user = "postgres"; 
	        String password = "7733";  

	        // Connect to database
	        Connection conn = DriverManager.getConnection(url, user, password);
	        System.out.println(" Database Connected Successfully!");

	        while (true) {
	            System.out.println("\n===== Student Management System =====");
	            System.out.println("1. Add Student");
	            System.out.println("2. View Students");
	            System.out.println("3. Update Student");
	            System.out.println("4. Delete Student");
	            System.out.println("5. Delete NULL Rows");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {
	                case 1:
	                	
	                    System.out.print("Enter Name: ");
	                    String name = sc.nextLine();

	                    System.out.print("Enter Age: ");
	                    int age = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Enter Course: ");
	                    String course = sc.nextLine();

	                    System.out.print("Enter City: ");
	                    String city = sc.nextLine();
	                    
	                    System.out.print("Enter ID: ");
	                    int id = sc.nextInt();
	                   

	                    String insertSQL = "INSERT INTO student (name, age, course, city, id) VALUES (?, ?, ?, ?, ?)";
	                    PreparedStatement p = conn.prepareStatement(insertSQL);
	                    p.setString(1, name);
	                    p.setInt(2, age);
	                    p.setString(3, course);
	                    p.setString(4, city);
			            p.setInt(5, id);
	                    p.executeUpdate();
	                    System.out.println(" Student Added Successfully!");
	                    p.close();
	                    break;

	                case 2:
	                    String viewSQL = "SELECT * FROM student";
	                    Statement stmt = conn.createStatement();
	                    ResultSet rs = stmt.executeQuery(viewSQL);
	                    System.out.println("\nID\tName\tAge\tCourse\tCity");
	                    System.out.println("-------------------------------------------");
	                    while (rs.next()) {
	                        System.out.println(rs.getInt("id") + "\t" +
	                                           rs.getString("name") + "\t" +
	                                           rs.getInt("age") + "\t" +
	                                           rs.getString("course") + "\t" +
	                                           rs.getString("city"));
	                        
	                    }
	                    rs.close();
	                    stmt.close();
	                    break;

	                case 3:
	                    System.out.print("Enter Student ID to update: ");
	                    int idUpdate = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Enter New Name: ");
	                    String newName = sc.nextLine();

	                    System.out.print("Enter New Age: ");
	                    int newAge = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Enter New Course: ");
	                    String newCourse = sc.nextLine();

	                    System.out.print("Enter New City: ");
	                    String newCity = sc.nextLine();

	                    String updateSQL = "UPDATE student SET name=?, age=?, course=?, city=?  WHERE id=?";
	                    PreparedStatement pstmtUpdate = conn.prepareStatement(updateSQL);
	                    pstmtUpdate.setString(1, newName);
	                    pstmtUpdate.setInt(2, newAge);
	                    pstmtUpdate.setString(3, newCourse);
	                    pstmtUpdate.setString(4, newCity);
	                    pstmtUpdate.setInt(5, idUpdate);
	                    int updated = pstmtUpdate.executeUpdate();
	                    if (updated > 0)
	                        System.out.println("Student Updated Successfully!");
	                    else
	                        System.out.println(" No Student Found with that ID.");
	                    pstmtUpdate.close();
	                    break;

	                case 4:
	                    System.out.print("Enter Student ID to delete: ");
	                    int idDelete = sc.nextInt();
	                    String deleteSQL = "DELETE FROM student WHERE id=?";
	                    PreparedStatement pstmtDelete = conn.prepareStatement(deleteSQL);
	                    pstmtDelete.setInt(1, idDelete);
	                    int deleted = pstmtDelete.executeUpdate();
	                    if (deleted > 0)
	                        System.out.println("Student Deleted Successfully!");
	                    else
	                        System.out.println("No Student Found with that ID.");
	                    pstmtDelete.close();
	                    break;

	                case 5:
	                    String deleteNull = "DELETE FROM student WHERE name IS NULL OR age IS NULL OR course IS NULL OR city IS NULL";
	                    Statement stmtNull = conn.createStatement();
	                    int rowsDeleted = stmtNull.executeUpdate(deleteNull);
	                    System.out.println(" Deleted " + rowsDeleted + " rows having NULL values!");
	                    stmtNull.close();
	                    break;

	                case 6:
	                    System.out.println(" Exiting...");
	                    conn.close();
	                    sc.close();
	                    System.exit(0);

	                default:
	                    System.out.println(" Invalid choice! Please try again.");
	            }
	        }
	    }
	}
