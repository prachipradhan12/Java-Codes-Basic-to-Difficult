class Parent{
public double computePay(double d){ //change to float
System.out.println("In parent");
return 0.0;	// convert this line to float value using 0.0f
}
}


public class Child extends Parent{
public double computePay(double d){// change to float

System.out.println("In child");
return 0.0; 	// convert this line to float value using 0.0f
}

public static void main(String args[])
{
new Child().computePay(0.0);
}
}