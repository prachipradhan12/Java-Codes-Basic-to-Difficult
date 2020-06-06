//wajp t read raduis from the user and print the area and circumference of circle using ISR ,BR and math class.

import java.io.*;
class ISR_BR_class
{
public static void main(String args[]) throws IOException{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);

System.out.println("Enter redius");
double rd=Double.parseDouble(br.readLine());

double area= Math.PI * Math.pow(rd,2);
double cirarea= 2  * Math.PI * rd;


System.out.println("AREA           :"+area);
System.out.println("Circumference  :"+cirarea); 
 

System.out.printf("AREA           :%.2f \n",area);
System.out.printf("Circumference  :%.3f",cirarea); 

//format
System.out.format("\nAREA           :%.2f \n",area);
System.out.format("Circumference  :%.3f",cirarea); 
 
} 

}