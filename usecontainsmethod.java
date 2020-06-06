//wajp to read listof names and create  new list of unique names
//Hint  :-  use contains()
// ip :- kamal vimal kamal aman vimal
// op :- kamal vimal aman

import java.util.*;
import java.io.*;

class usecontainsmethod
{

public static void main(String args[]){
int i;
Console c = System.console();
List<String> names = new ArrayList<>();
List<String> newnames = new ArrayList<>();
String replay=c.readLine("Do you wish to add names (y/n)");
while (replay.equals("y"))
{
	String m= c.readLine("Enter names");
	names.add(m);
	replay=c.readLine("Do you wish to add more names(y/n)");

}
for(String p :names)
{
if(!newnames.contains(p))	
	newnames.add(p);
}
System.out.println("original :" + names);
System.out.println("New      :" + newnames);
}
}