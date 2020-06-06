//WAJP to read a String and display the count of 
//1.letter 2.character 3.other
import java.io.*;
class letter_char_other_Count
{
public static void main(String args[])
{

Console c= System.console();
String data=c.readLine("Enter string : ");
int l=0,d=0,o=0;

for(int i=0;i<data.length();i++)
{
char ch = data.charAt(i);
if(Character.isLetter(ch))
	l++;
else if(Character.isDigit(ch))
	d++;
else
	o++;
}
System.out.println("\nLeter Count : "+l + "\nDigit Count : " + d +"\nOther Count : " + o );
}
}