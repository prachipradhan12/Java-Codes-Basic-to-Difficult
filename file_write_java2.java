//wajp to write into a file .... whose name wud be supplied by the user.

import java.io.*;
class file_write_java2{
public static void main(String args[]) throws IOException
{

Console c= System.console();
String file_name = c.readLine("Enter file name : ");
File f= new File(file_name); // create referenece not a file
if(f.exists()){

FileWriter fw = new FileWriter(f,true);
BufferedWriter bw = new BufferedWriter(fw);
PrintWriter pw= new PrintWriter(bw);
String data = c.readLine("Enter data to write");
pw.println(data);
pw.close();
	
}
else{
System.out.println(file_name +"does not exit");
}


}

}