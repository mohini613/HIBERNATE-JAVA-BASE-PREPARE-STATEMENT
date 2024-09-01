package JdbcPrepSmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class studCreatSmt {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
        
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/prepsmt", "root", "root");

		
		String query="insert into student1 values(103,'Minni', 'Brooklyn')";
		
		Statement smt = con.createStatement();
		//int x= smt.executeUpdate(query);
		//System.out.println(x);
		boolean b= smt.execute(query);
		System.out.println(b);
		
		con.close();
		smt.close();
		System.out.println("successfull");
	}

}
