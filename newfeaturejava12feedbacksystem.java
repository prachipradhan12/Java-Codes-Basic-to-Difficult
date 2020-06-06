//wajp displaying the feedback message as per feddback number
//5-superb	 4 and 3-ok		 2 and 1=poor
// using switch statement
// java SE 12 : new feature of switch combine 2 case and remove break statement.(reduced LOC)
/*  
-> :- case L
how to run :
javac --enable=preview --release 12 p3.java
java --enable-preview p4 5	

*/
class newfeaturejava12feedbacksystem
{
public static void main(String args[])
{
int fb = Integer.parseInt(args[0]);
switch(fb)
{
	case 5-> System.out.println("Superb"); 
	case 4,3->System.out.println("Ok");
	case 2,1-> System.out.println("poor");
	default->System.out.println("oops......!invalid input!..... try again!");
		
}
}
}