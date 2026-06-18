package JDBC;



////What is JDBC : ( Java Database Connectivity) :
///                       JDBC  is  API  that allows java   program to connected the
///                       database and send SQL queries & process the result.
///
///            jdbc implementation :
///            1) Load  the driver class
//             2) Create Connection
//             3) Create Statement
//             4) execute statements
//             5)  connection close.

//
//               JDBC Architecture
//                 1)    JDBC API :  privide the application to jdbc manager connection;
//                 2)      JDBC Driver provide  : the jdbc managerbto database connection.

// .           jdbc components
//             1) DriverManager - managea list of data.
//             2) connection - Represent a connection
//             3)  statement - used  to execute sql queries
//             4)   Result -  hold  the result  of a  query
//             5) SQLException -  Handle error and exception 


              //Advantage of JDBC

//           1)Platform Independent
//           2)Database Independent
//           3)Easy to learn and use
//           4)Secure
//           5) support sql operation 
//           6) open source free
//           7) performance
//           8) Java Integration

//            Disadvantage of JDBC
//           1)  Database dependency
//           2) Manual exception & resourse Handling
//           3) Biolerplate
//           4)  platform dependency



public class hello {

	public static void main(String[] args) {
		
System.out.println("hello world");
	}

}
