import java.sql.*;
import java.io.*;

class DB_connection_data{

public static void main(String args[])
{
Console c= System.console();
try{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sneha");


String sql = "insert into student values(? ,?)";
PreparedStatement pst = con.prepareStatement(sql);
int rno= Integer.parseInt(c.readLine("Enter roll_no : "));
String name=c.readLine("Enter name : ");

pst.setInt(1,rno);
pst.setString(2,name);
int r=pst.executeUpdate();
System.out.println(r +"  records inserted");
con.close();
}
catch(SQLException e)
{
System.out.println("Issue "+e);
}

}
}