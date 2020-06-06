//WAJP for creating an interface A with one abstract method add,that takes two integer
// and display the result.

interface A{
void add(int a ,int b);
}

class interface_intro_add2numbers{
public static void main(String args[]){

A a1=(int a, int b)-> System.out.println("Result : "+(a+b));
a1.add(10,20);

A a2 = (a,b)->System.out.println("Result : "+(a+b));
a2.add(10,20);


A a3=(a,b)->{System.out.println("Result : "+(a+b));};
a3.add(10,20);

A a4=(a,b)->{
		int res=a+b;
		System.out.println("Result : "+res);};
a4.add(10,20);

}
}