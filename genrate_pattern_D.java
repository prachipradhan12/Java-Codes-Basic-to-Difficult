/*WAJP data ="a,2,b,4,c,3"
o/p-> a a
      b b b 
      c c c
*/
import java.util.*;
class genrate_pattern_D
{
public static void main(String args[]){

String str="a,2,b,4,c,3";
Scanner s= new Scanner(str);
s.useDelimiter(",");

while(s.hasNext())  //hasNext ka output-> true - false result 
{
	String what=s.next();
	int how=s.nextInt();
	for(int i=0;i<how;i++)
	{
	   System.out.print(what+"\t");

	}
 System.out.println();
}

}
}