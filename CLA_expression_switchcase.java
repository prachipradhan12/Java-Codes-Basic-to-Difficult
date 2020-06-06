//wajp to read CLA an expression :  10 plus 20   == 30
//plis/minus/mu/div
import java.io.*;
class CLA_expression_switchcase{
public static void main(String args[]){
try{
int op1= Integer.parseInt(args[0]);
String oprn = args[1];
int op2= Integer.parseInt(args[2]);
int res=0;
switch(oprn){

	case "plus" :   res= op1+op2;  System.out.println("Addition         :"+res); break;
	case "minus":   res= op1-op2;  System.out.println("Subtraction      :"+res); break;
	case "mul"  :   res= op1*op2;  System.out.println("Multiplication   :"+res); break;
	case "div"  :   res= op1/op2;  System.out.println("Division         :"+res); break;
	default     :	               System.out.println("Invaild operation");	
}
}
catch(NumberFormatException e)          {  System.out.println("Invaild input !  try again ");    }
catch(ArithmeticException e)            {  System.out.println("Invaild data for operatoin");     }
catch(ArrayIndexOutOfBoundsException e) {  System.out.println("Invaild data for operatoin");     }
catch(Exception e)                      {  System.out.println("insufficent input ");             }
}
}