import java.sql.*;

class MysqlConc{

	public static void main(String[] args){
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","toor");

		Statement stmt = con.createStatement();
		//result set if used for fetching
		ResultSet rs = stmt.executeQuery("Select *from emp");

		while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		con.close();

}
catch(Exception e){System.out.println(e);}
	}

}