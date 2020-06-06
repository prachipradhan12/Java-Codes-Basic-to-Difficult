/*  Develop a class with follwing specs:
	IV: raduis
	IM: setData(),showData(),area() and circumference()
do write test dases also   */

class Circle
{
private double raduis;

public void setData(double r)
{
this.raduis=r;
}

public void showData()
{
System.out.println("Raduis                   :  "+raduis);
}

public double area()
{
return 3.142 * raduis * raduis;

}

public double circumferenece()
{
return 2 * 3.142 * raduis;

}

}


class CircleDemo
{
public static void main(String args[])
{
double r = Double.parseDouble(args[0]);
Circle c1= new Circle();
c1.setData(r);
c1.showData();
double areares=c1.area();
System.out.println("Area of circle           :  "+areares);
double cirres=c1.circumferenece();
System.out.println("circumferenece of circle :  "+cirres);


}
}