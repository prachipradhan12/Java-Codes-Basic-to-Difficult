//WAMDJP to implement Treeset of students
//1 .add ,2.view,3.remove,4.exit
import java.util.*;
import java.io.*;

class Student implements Comparable<Student>
{

int no;
String name;

Student(int no, String name){

this.no=no;
this.name=name;

}

public String toString(){
return "Roll no :- " + no +" Name  : - "+name;
}

public boolean equals(Object o){

Student s=(Student)o;
return no==s.no;
}

public int hashcode(){
return no;
}

public int compareTo(Student s){

return no - s.no;

}
}


class Treeset_student_example{

public static void main(String args[]){

Console c=System.console();
TreeSet<Student> s= new TreeSet<>();

while(true)
{

int op = Integer.parseInt(c.readLine("Enter option"));
if(op==1)
{

int no =Integer.parseInt(c.readLine("Enter no"));
String name = c.readLine("Enter name");
Student s1= new Student(no,name);
boolean res=s.add(s1);
if(res)
	System.out.println("Record added ");
else
	System.out.println("Rno already exits");

}else if(op==2){
for(Student m: s)
	System.out.println(m);

}
else if(op==3){
int no= Integer.parseInt(c.readLine("Enter rollno"));
Student s1=new Student(no,"");

boolean res=s.remove(s1);
if(res)
	System.out.println("Record deleted ");
else
	System.out.println("Rno does not exits");
}
else if(op==4)
{
break;
}
else
{
System.out.println("Invalid option");
}
}
}
}
