//WAJP to read a string and display the count of
//1.vowels
//2.consonants

import java.io.*;
class vowels_consonats_count
{
public static void main(String args[])
{
Console c= System.console();
String data=c.readLine("Enter string : ");
int vc=0,cc=0;
for(int i=0;i<data.length();i++)
{
char ch = data.charAt(i);
if(Character.isLetter(ch))
{
switch(ch)
{

case 'a','e','i','o','u','A','E','O','U' -> vc++;
default -> cc++;
}
}
}
System.out.println("\nVowels Count : "+vc + "\nConsonatas Count : " + cc);
}
}