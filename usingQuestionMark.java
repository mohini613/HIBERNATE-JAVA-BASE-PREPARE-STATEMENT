package JdbcPrepSmt;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

	public class usingQuestionMark {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
	        
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/prepsmt", "root", "root");

			String query="insert into student1 values(?,?,?)";
             
			java.sql.PreparedStatement ps=con.prepareStatement(query);
			//run time query executes always
			ps.setInt(1, 104);
			ps.setString(2, "Ray");
			ps.setString(3, "Singapore");
			ps.execute(); 
			
			ps.close();
			con.close();
			System.out.println("successfull");
		}

	}

