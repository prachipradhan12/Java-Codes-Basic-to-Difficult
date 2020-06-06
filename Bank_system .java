abstract class rbi{

private int accno;
private String name;
public double balance;


rbi(int accno,String name,double balance){
this.accno=accno;
this.name=name;
this.balance=balance;
}

void show(){
System.out.println("AC no : "+accno+ "\nName :" + name + "\nBalance  " + balance );
}

abstract void deposite(double amount);
abstract void withdraw(double amount);
}


class nayabank extends rbi
{
nayabank(int accno,String name,double balance)
{
super(accno,name,balance);	
}
void deposite(double amount)
{
// deposite--> balance CHC -10
balance=balance+amount-10;
System.out.println("After deposite balance : " + balance);
}

void withdraw(double amount)
{

balance=balance-amount-20;
System.out.println("After withdraw balance : "+ balance);
}
}

class Bank_system {
public static void main(String args[]){

nayabank n = new nayabank(100,"snehaindulkar",1000);
n.show();
//n.show();
n.deposite(100);
n.withdraw(200);
//n.show();
}
}
