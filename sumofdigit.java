/*  wajp tp find sum of the digits of given number
input :- 354  	output :-12
input :- 1842	output :-15
*/
class sumofdigit
{
public static void main(String args[])
{
int rem=0,sum=0;
int num=Integer.parseInt(args[0]);
while(num!=0)
{
System.out.println(rem=num%10);
System.out.println(sum=sum+rem);
System.out.println(num=num/10);
System.out.println("********************");
}
System.out.println("Sum :- "+sum);
}
}