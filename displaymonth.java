//wajp to display number of days in the month given the users 
/* example

jan 31
feb 28
march,may,july.....31
april,june 20
*/

class displaymonth
{
public static void main(String args[])
{

String day= args[0];

switch(day)
{
case "jan","mar","may","july","sep","nov"  -> 	System.out.println("total days 30");
case "feb"			           ->	System.out.println("total days 28/29");
case "apr","june","aug'","oct","dec"       ->  	System.out.println("total days 31");
default					   ->	System.out.println("invalid input");
}
}
}