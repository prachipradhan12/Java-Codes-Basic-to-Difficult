//wajp to produce op "yes" if the user enter an integer else "no"
//hint used console class

import java.io.*;
class console_class_example1{

public static void main(String args[]){

Console c= System.console();
try{
int a = Integer.parseInt(c.readLine("Enter an integer"));

System.out.println("yes");
}
catch(NumberFormatException e){

System.out.println("NO");
}
}
}