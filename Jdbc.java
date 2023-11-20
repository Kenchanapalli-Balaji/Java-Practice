import java.sql.*;  
class Jdbc{  
public static void main(String args[]) 
{ 
try
{
  String url="jdbc:oracle:thin:@localhost:1521:xe";
  String uname="scott";
  String pw="tiger";
  String query="select * from  dept";
  
//step1 load the driver class  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection( url,uname,pw);  
  
//step3 create the statement object  
Statement stmt=con.createStatement();  
  
//step4 execute query  
ResultSet rs=stmt.executeQuery(query);  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
  
//step5 close the connection object 
stmt.close();
con.close(); 
}
catch(Exception e)
{
	System.out.println(e);
}
  

}  
}  