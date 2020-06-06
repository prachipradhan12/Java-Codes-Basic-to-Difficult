//wajp to understand stream opeartion

import java.util.*;
import java.util.stream.*;

class Employee implements Comparable<Employee> {
int id;
String name;
double salary;
String location;

Employee(int id,String name,double salary,String location){
this.id=id;
this.name=name;
this.salary=salary;
this.location=location;
}

public String toString()		//forEach ();
{

return "Id : "+id+" Name : "+name+" Salary : "+salary+" Location : "+location;

}

public int compareTo(Employee e) // .sorted ko call karta hai  
{

return (int)(e.salary-salary);
}



/*public int hashcode(){
return id;
}*/


}
class hashcode_method_used{

public static void main(String args[]){

Employee e1= new Employee(10,"amit",7900,"mumbai");
Employee e2= new Employee(30,"sumit",7500,"mumbai");
Employee e3= new Employee(20,"rumit",4900,"thane");
Employee e4= new Employee(50,"namit",8900,"mumbai");
Employee e5= new Employee(40,"amit",5900,"thane");

ArrayList<Employee> e= new ArrayList<>();
e.add(e1);  e.add(e2);  e.add(e3);  e.add(e4);  e.add(e5);

Stream<Employee> s1= e.stream()
.sorted()
.filter(l -> l.location.equals("mumbai"));
s1.forEach(r-> System.out.println(r));

double res=e.stream()
.filter(l -> l.location.equals("thane"))
.map(u->u.salary)
.reduce(0.0,(x,y)->(x+y));
System.out.println("Employee in thane :"+res);


double res1=e.stream()
.map(u->u.salary)
.reduce(0.0,(x,y)->(x+y));
System.out.println("total salary      : "+res1);



}
}
