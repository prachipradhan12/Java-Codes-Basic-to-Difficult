//Wajp to read a string and generate follwing:
// input :- kamal classes borivali
// output :-  borivali classes kamal

import java.io.*;
class genrate_pattern_A{

public static void main(String args[])
{

Console c= System.console();

String str=c.readLine("Enter a String:");
String data[]=str.split(" ");
String nstr="";
for (int i=data.length-1;i>=0;i--)
{
	nstr=nstr+data[i]+ " ";
}
System.out.println(str +"\n"+nstr);
}
}