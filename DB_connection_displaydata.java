import java.sql.*;

class DB_connection_displaydata{

public static void main(String args[]){


try{

DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sneha");

String sql = "select * from student";
Statement stmt =con.createStatement();
ResultSet rs= stmt.executeQuery(sql);
while(rs.next())
{

System.out.println("rno="+rs.getInt(1)+"  name ="+rs.getString(2));
}
con.close();
}
catch(SQLException e)
{
System.out.println("Issue "+e);
}

}
}