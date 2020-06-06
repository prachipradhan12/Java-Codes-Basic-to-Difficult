// WAJP to read a sentense and display occurrness of each letter.
//i/p :- mammal o/p [m=2,a=2,l=1]
//i/p :- kamaal o/p [k=1,a=1,l=1]

import java.util.*;
import java.io.*;
class p2{

public static void main(String args[]){


Console c = System.console();
String str = c.readLine("Enter String : ");
HashMap<String,Integer> hm = new HashMap<>();


for(int i=0;i< str.length();i++)
{
	String s= str.substring(i,i+1);
	Integer count=hm.get(s);
	if(count==null)
		hm.put(s,1);
	else
		hm.put(s,count+1);
}

System.out.println(hm);

}

}
