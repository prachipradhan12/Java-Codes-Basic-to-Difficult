//wajp to produce op "yes" if the user enter an integer else "no"
//hint used console class
//exit when user enter integer else ask again and again

import java.io.*;
class console_class_example2{

public static void main(String args[]){

Console c= System.console();
while(true)
{
try{
int a = Integer.parseInt(c.readLine("Enter an integer"));
break;
}
catch(NumberFormatException e){

}
}
System.out.println("pefect !.. ");
}
}