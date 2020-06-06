//wajp to read marks and find the grade
class marksgrade
{
public static void main(String args[])
{

int marks;
marks= Integer.parseInt(args[0]);

if(marks>=70)
{
	System.out.println("MARKS ="+marks+"GRADE = * Distinction *");
}
else if(marks>=60)
{
	System.out.println("MARKS ="+marks+"GRADE = * First class*");
}
else if(marks>=40)
{
	System.out.println("MARKS ="+marks+"GRADE = * Second class*");
}
else
{
	System.out.println("MARKS ="+marks+"GRADE = * Fail*");
}
}

}