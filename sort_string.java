//WAJP the sort the given String 

import java.io.*;
import java.util.*;
class sort_string
{
public static void main(String args[])
{
Console c= System.console();
String data=c.readLine("Enter string : ");
System.out.println("BEFORE string :"+ data);
char [] input=data.toCharArray();
Arrays.sort(input);

data= new String(input);

System.out.println("AFTER string :"+ data);
}
}