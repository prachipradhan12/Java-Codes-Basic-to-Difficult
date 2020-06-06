//Wajp to read a string and generate follwing:
// input :- kamal classes borivali
// output :-  ilavirob sessalc lamak(sort)

import java.io.*;
import java.util.*;
class genrate_pattern_C{

public static void main(String args[])
{

Console c= System.console();

String str=c.readLine("Enter a String:");
String data[]=str.split(" ");

String nstr="";
for (int i=data.length-1;i>=0;i--)
{
StringBuffer sb = new StringBuffer(data[i]);
sb.reverse();
data[i]=sb.toString();
char [] input=data[i].toCharArray();
Arrays.sort(input);
data[i]= new String(input);
nstr=nstr+data[i]+ " ";

}
System.out.println(str +"\n \n "+nstr);

}
}