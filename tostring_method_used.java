//Wajp to read a string and check if it is a palindrome
// buffer converted into using toString()
import java.io.*;
class tostring_method_used{

public static void main(String args[]){

Console c= System.console();

String org=c.readLine("Enter String : ");
StringBuffer sb = new StringBuffer(org);
sb.reverse();
String rev=sb.toString();
if(rev.equals(org))
	System.out.println("String is palindrome");
else
	System.out.println("String is not palindrome");

}
}