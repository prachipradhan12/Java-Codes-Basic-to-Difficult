//WAJP for creating an interface B with one abstract method sub,that return the result of two integer supplied
// and display the result.
//use lambda expression.

interface B {
int sub(int a ,int b);
}

class lambda_expression_example{
public static void main(String args[]){

B a1=(a,b)-> { return a-b; };
System.out.println(a1.sub(10,20));

B a2=(int a, int b)-> { return a-b; };
System.out.println(a2.sub(10,20));

B a3 = (a,b)-> a-b;
System.out.println(a3.sub(10,20));



}
}