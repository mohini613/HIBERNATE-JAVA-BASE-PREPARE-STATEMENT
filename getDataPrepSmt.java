package JdbcPrepSmt;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class getDataPrepSmt {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
	        
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/prepsmt", "root", "root");

			String query="select * from student1 ";// we use start and table name for getting whole data from the particular table/condition
             
			java.sql.PreparedStatement ps=con.prepareStatement(query);
			
			ps.close();
			con.close();
			System.out.println("successfull");
		}

	}


