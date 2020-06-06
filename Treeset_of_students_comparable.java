//WAMDJP to implement Treeset of students
//1 .add ,2.view,3.remove,4.exit
import java.util.*;
import java.io.*;

class Student implements Comparable<Student>,Serializable
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


class Treeset_of_students_comparable{

public static void main(String args[]) throws Exception
{

Console c=System.console();


TreeSet<Student> s= new TreeSet<>();

File f= new File("student.ser");
if(f.exists())
{
FileInputStream f2= new FileInputStream("student.ser");
BufferedInputStream b2 = new BufferedInputStream(f2);
ObjectInputStream o2 = new ObjectInputStream(b2);
s=(TreeSet<Student>) o2.readObject();

o2.close();

}
while(true)
{

System.out.println("1.Add user \n2.Display user \n3.Remove user\n4.Exit");

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
FileOutputStream f1= new FileOutputStream("student.ser");
BufferedOutputStream b1 = new BufferedOutputStream(f1);
ObjectOutputStream o1 = new ObjectOutputStream(b1);
o1.writeObject(s);
o1.close();

break;
}
else
{
System.out.println("Invalid option");
}
}
}
}
