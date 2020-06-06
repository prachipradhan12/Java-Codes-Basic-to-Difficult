//wajp to write into a file .... whose name wud be supplied by the user.

import java.io.*;
class file_write_java1{
public static void main(String args[]) throws IOException
{

Console c= System.console();
String file_name = c.readLine("Enter file name : ");
File f= new File(file_name); // create referenece not a file
if(f.exists()){
f.delete();
System.out.println("File deleted");	
}
else{
System.out.println(file_name +"does not exit");
}


}

}