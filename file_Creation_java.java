//wajp to create a file .... whose name wud be supplied by the user.

import java.io.*;
class file_Creation_java{
public static void main(String args[]) throws IOException
{

Console c= System.console();
String file_name = c.readLine("Enter file name : ");
File f= new File(file_name); // create referenece not a file
if(f.exists()){
	System.out.println(file_name+"File deleted");
}
else{
f.createNewFile();
System.out.println(file_name +"Created");
}


}

}