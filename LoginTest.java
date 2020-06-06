import java.io.*;

class Login{

private String username;
private char[] password;

public Login(String username, char[] password)
{
this.username=username;
this.password=password;

}

// String to char[] used -> toCharArray
// char[] to String      -> new String()
public void validate()
{
if((this.username.equals("sneha"))&&(new String(password).equals("sneha123")))
	System.out.println("attack");
else
	System.out.println("try again");
}
}


class LoginTest{
public static void main(String args[]){

Console c = System.console();
String username = c . readLine("Enter username     : ");
char[] password = c . readPassword("Enter password : ");

Login l= new Login(username,password);
l.validate();

}
}