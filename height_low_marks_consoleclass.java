//Wajp to read marks from the user and find the heighest and lowest marks

import java.util.*;
import java.io.*;

class height_low_marks_consoleclass{

public static void main(String args[]){


Console c= System.console();
ArrayList<Integer> marks = new ArrayList<>();

String replay=c.readLine("Do you wish to add marks (y/n)");
while (replay.equals("y"))
{
	int m= Integer.parseInt(c.readLine("Enter marks"));
	marks.add(m);
	replay=c.readLine("Do you wish to add more marks (y/n)");

}

Collections.sort(marks);
System.out.println(marks);
int max=marks.get(0);
int min=marks.get(marks.size()q-1);
System.out.println("Heighest marks : "+max +"\n Lowest marks  : "+min);

}

}