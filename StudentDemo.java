//WAJP to read n marks fromthe user and find sum,avg,highest and lowest marks
import java.io.*;
import java.util.*;

class StudentDemo{

public static void main(String args[])
{

Console c= System.console();
int n = Integer.parseInt(c.readLine("Enter number of students"));
int marks[]= new int[n];

for (int i=0;i<marks.length;i++)
	marks[i]=Integer.parseInt(c.readLine("Enter marks"));

int sum=0;
for( int s : marks)
	sum=sum + s;
double avg= sum*1.0/n;
System.out.printf("SUM :%d \n AVG :%.2f",sum,avg);


Arrays.sort(marks);

Arrays.toString(marks);

System.out.println("\nLOWEST MARKS"+marks[0]);
System.out.println("\nHIGHEST MARKS"+marks[n-1]);
}
}