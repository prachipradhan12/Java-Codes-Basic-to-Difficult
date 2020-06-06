class CLAopration
{
public static void main(String args[])
{
int a,b;

a = Integer.parseInt(args[0]);
b = Integer.parseInt(args[1]);

System.out.println("A :"+a+"B :"+b);
a=a+b;
b=a-b;
a=a-b;

System.out.println("A :"+a+"B :"+b);

}

}