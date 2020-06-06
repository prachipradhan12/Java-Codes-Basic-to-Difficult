import java.sql.*;

class DB_connection{

public static void main(String args[]){

try{

DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sneha");
	
con.close();
}
catch(SQLException e)
{
System.out.println("Issue "+e);
}

}
}