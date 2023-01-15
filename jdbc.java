import java.sql.*;
import java.util.*;
import java.io.*;

class JTest{

	public static void main(String[] args){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","toor");
			/*Scanner sc = new Scanner(System.in);

			int roll = sc.nextInt();
			String name = sc.nextLine();
			String course = sc.nextLine();
			*/
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter roll number:");
			int roll=Integer.parseInt(br.readLine());
			System.out.println("enter name:");
			String name=br.readLine();
			System.out.println("enter salary:");
			String course = br.readLine();
			PreparedStatement stmt=con.prepareStatement("insert into students values(?,?,?)");
			stmt.setInt(1,roll);
			stmt.setString(2,name);
			stmt.setString(3,course);

			int i=stmt.executeUpdate();
			System.out.println(i+"records inserted");
			con.close();

		}
		catch(Exception e){
			System.out.println(e);
		}
		

	}
}