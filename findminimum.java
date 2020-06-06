// wajp to read two integers from cla and find minimum
class findminimum
{
public static void main(String args[])
{
int a,b;
a = Integer.parseInt(args[0]);
b = Integer.parseInt(args[1]);

System.out.println("A:"+a+" "+"B:"+b);

String res=(a<b) ? "A is less than B": "A is greater than B";

System.out.println("result :"+res);
}
}