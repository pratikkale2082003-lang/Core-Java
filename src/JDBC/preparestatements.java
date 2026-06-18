package JDBC;

import java.sql.*;
import java.util.Scanner;

public class preparestatements {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Load Driver
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver Loaded");

        // Database Connection
        String url = "jdbc:postgresql://localhost:5432/cravita";
        String username = "postgres";
        String password = "7733";

        
//         create Connection
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Database Connected Successfully");

//    create prepare statement
        String query = "INSERT INTO iplteam(jes_no, name, run, team) VALUES (?, ?, ?, ?)";

        PreparedStatement p = con.prepareStatement(query);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Jersey No:");
        int jes_no = sc.nextInt();
        sc.nextLine(); // ✅ FIX

        System.out.println("Enter Player Name:");
        String name = sc.nextLine();

        System.out.println("Enter Run:");
        int run = sc.nextInt();
        sc.nextLine(); // ✅ FIX

        System.out.println("Enter IPL Team:");
        String team = sc.nextLine();

        // Set Values
        p.setInt(1, jes_no);
        p.setString(2, name);
        p.setInt(3, run);
        p.setString(4, team);

        // ✅ Execute stamenet
        int rows = p.executeUpdate();
        System.out.println(rows + " record inserted successfully");

        // Fetch Data
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM iplteam");

        System.out.println("\n-------------------------------------------");
        System.out.println("jes_no\tName\tRun\tTeam");
        System.out.println("-------------------------------------------");

        while (rs.next()) {
            System.out.println(
                rs.getInt(1) + " | " +
                rs.getString(2) + " | " +
                rs.getInt(3) + " | " +
                rs.getString(4)
            );
        }

//         connection close
        con.close();
        sc.close();
    }
}