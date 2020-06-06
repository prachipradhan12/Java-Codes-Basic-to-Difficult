// wajp to  avrege of 3 integer numbers 
class intavg
{
public static void main(String args[])
{
int a,b,c;
a = Integer.parseInt(args[0]);
b = Integer.parseInt(args[1]);
c = Integer.parseInt(args[2]);

System.out.println("A:"+a+" "+"B:"+b+" "+"C:"+c);

double res =(a+b+c)/3.0;
System.out.println("Average is  :"+res);
}
}