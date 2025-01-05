package Strings;
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Test 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String driver= "com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/edu";
		String username="root";
		String password="Balu@359";
		
		try
		{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, username, password);
			Statement stmt=con.createStatement();
			ResultSet res=stmt.executeQuery("select * from employee");
			System.out.println("ID  "+"  Name  "+"  Designation ");
			while(res.next())
			{
				System.out.print(res.getInt(1)+"      ");
				System.out.print(res.getString(2)+"      ");
				System.out.print(res.getString(3));
				System.out.println();
			}
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
*/

