// maximum of three number using if else
class 3_max
{
public static void main(String args[])
{

int a,b,c;

a= Integer.parseInt(args[0]);
b= Integer.parseInt(args[1]);
c= Integer.parseInt(args[2]);

if(a>b)
{
System.out.println("A is greater than B and C");
}
else if(b>c)
{
System.out.println("B is greater than A and C");
}
else
{
System.out.println("C is greater");
}
}

}