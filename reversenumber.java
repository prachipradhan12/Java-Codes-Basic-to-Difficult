/*  wajp tp find reverse of given number
input :- 354  	output :-453

*/
class reversenumber
{
public static void main(String args[])
{
int rev=0,sum=0;
int num=Integer.parseInt(args[0]);
do
{
System.out.println(sum=num%10);
System.out.println(rev=rev*10+sum);
System.out.println(num=num/10);
System.out.println("******************************");
}while(num>0);
System.out.println("Sum :- "+rev);
}
}