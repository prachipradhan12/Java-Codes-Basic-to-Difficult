//WAJP to read two strings to find if the are "ANAGRAMS"
// listen - silent
//
import java.io.*;
import java.util.*;

class Anagrams{

public static void main(String args[]){

Console c= System.console();
String data1=c.readLine("Enter  first string  : ");
String data2=c.readLine("Enter  second string : ");

char [] input1=data1.toCharArray();
char [] input2=data2.toCharArray();

Arrays.sort(input1);
Arrays.sort(input2);

data1= new String(input1);
data2= 	new String(input2);

if(data1.equals(data2))
	System.out.println("Strings are anagrams");
else
	System.out.println("Strings are not anagrams");


}

}