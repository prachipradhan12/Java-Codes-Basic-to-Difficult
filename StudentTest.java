import java.io.*;
class Student{
private int rno;
private String name;
private int marks;

public Student(int rno,String name,int marks)
{
this.rno=rno;
this.name=name;
this.marks=marks;
}

public void showData()
{
System.out.printf("Roll no : %d\nName :%s\nMarks :%d",rno,name,marks); 
}

public void findgrade()
{

if(this.marks>=70)
	System.out.println("\nGrade A");
else if(this.marks>=40)
	System.out.println("\nGrade B");
else
	System.out.println("\nGrade C");
}

}


class StudentTest{
public static void main(String args[]){

Console c = System.console();



int n= Integer.parseInt(c.readLine("Enter total number of student"));
Student s[]= new Student[n];
for (int i=0;i<n;i++)
{
int rno= Integer.parseInt(c.readLine("Enter roll number : "));
String name= c.readLine("Enter name  : ");
int marks= Integer.parseInt(c.readLine("Enter marks : "));
s[i] = new Student(rno,name,marks);
}
System.out.println("______________________________________________________");
for(Student s1: s)
{
s1.showData();
s1.findgrade();
System.out.println("______________________________________________________");
}
}
}