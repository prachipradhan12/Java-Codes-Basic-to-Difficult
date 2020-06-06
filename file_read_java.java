//wajp to read form the file ...whose name swud be supplied by the user.'

import java.io.*;
class file_read_java2{

public static void main(String args[]) throws IOException
{

Console c= System.console();
String file_name =c.readLine("Enter file name : ");
File f = new File(file_name);
if(f.exists())
{
	FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
String st;
	while((st=br.readLine())!=null)
		System.out.println(st);	
}
else
{
System.out.println("File is not exists");
}
}

}