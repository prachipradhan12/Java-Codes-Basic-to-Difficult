//wajp displaying the feedback message as per feddback number
//5-superb	 4 and 3-ok		 2 and 1=poor
// using switch statement

class feedbacksystem
{
public static void main(String args[])
{
int fb = Integer.parseInt(args[0]);
switch(fb)
{
	case 5: System.out.println("Superb");
		break;
	case 4: System.out.println("Ok");
		break;
	case 3: System.out.println("Ok");
		break;
	case 2: System.out.println("poor");
		break;
	case 1: System.out.println("poor");
		break;
	default:System.out.println("oops......!invalid input!..... try again!");
		
}
}
}