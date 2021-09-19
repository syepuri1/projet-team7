
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sample {
	   public static void main(String[] args) throws Exception {

	      // register Oracle thin driver with DriverManager service
	      // It is optional for JDBC4.x version
	      Class.forName("com.mysql.cj.jdbc.Driver");

	      // variables
	      final String url = "jdbc:mysql:///studentdb";
	      final String user = "root";
	      final String password = "Christ!worship99";

	      // establish the connection
	      Connection con = DriverManager.getConnection(url, user, password);

	      // display status message
	      if (con == null) {
	         System.out.println("JDBC connection is not established");
	         return;
	      } else
	         System.out.println("Congratulations," + 
	              " JDBC connection is established successfully.\n");
	      String query = "Select studentid, studentname from student";
	      
	      Statement st = con.createStatement();

	      // send and execute SQL query in Database software
	      ResultSet rs = st.executeQuery(query);

	      // proces the ResultSet object
	      boolean flag = false;
	      while (rs.next()) {
	         flag = true;
	         System.out.println(rs.getInt(1) + " " + rs.getString(2));
	      }

	      if (flag == true) {
	         System.out.println("\nRecords retrieved and displayed");
	      } else {
	         System.out.println("Record not found");
	      }

	      
	      rs.close();
	      st.close();
	      con.close();

	   } 
	}