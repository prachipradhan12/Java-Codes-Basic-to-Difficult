// wajp to read two integers from cla and find maximum of 3 numbers
class findmaximum
{
public static void main(String args[])
{
int a,b,c;
a = Integer.parseInt(args[0]);
b = Integer.parseInt(args[1]);
c = Integer.parseInt(args[2]);

System.out.println("A:"+a+" "+"B:"+b+"C:"+c);

int res= (a>b)?a:b;
int status = (c>res)?c:res;

System.out.println("Maximum :"+status);
}
}