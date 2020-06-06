//WAJP to read a string and create a new string that does not contain any vowels

import java.io.*;
class delete_vowels_string
{
public static void main(String args[])
{
Console c= System.console();
String data=c.readLine("Enter string : ");
int vc=0,cc=0;
String str="";
for(int i=0;i<data.length();i++)
{
char ch = data.charAt(i);
switch(ch)
{
case 'a','e','i','o','u','A','E','O','U' -> str=str+"";
default -> str+=ch;
}
}
System.out.println("NEW string :"+ str );
}
}