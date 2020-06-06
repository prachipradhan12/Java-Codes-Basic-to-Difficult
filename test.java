class A{
int a;
A(int a){
this.a=a;
}
}

class B extends A {  // to call constructor of superclass we used super keyword.
int b;
B(int a,int b){
super(a);
//this.a=a;
this.b=b;                                                                                                              
}
}

class test{ 
public static void main(String args[]){
B b = new B(10,20);
System.out.println(b.a+""+b.b);
}
}