//Input stream reader and BufferedReader 
import java.io.*;
class Employee{
private int eid;
private String ename;
private double esalary;

public Employee(int eid, String ename , double esalary)
{
this.eid=eid;
this.ename=ename;
this.esalary=esalary;
}

public void showData()
{
System.out.println("Eid               :"+eid+"\nEname             :"+ename+"\nEsalary           :"+esalary);
}

public void computeTaxes()
{
if(esalary>=500000)
	System.out.println("Tax to be payed   :"+(esalary*0.20));
else
	System.out.println("Tax to be payed   :"+(esalary*0.10));	
}
}

class EmployeeTest{
public static void main(String args[]) throws IOException {
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("Enter Total employee number you want to add :");
int no = Integer.parseInt(br.readLine());

for (int i=1;i<=no;i++)
{
System.out.println("Enter employee id     :");
int eid = Integer.parseInt(br.readLine());

System.out.println("Enter employee name   :");
String  ename = br.readLine();

System.out.println("Enter employee salary :");
double esalary= Double.parseDouble(br.readLine());

Employee e1 = new Employee(eid,ename,esalary);
e1.showData();
e1.computeTaxes();
}
}
}