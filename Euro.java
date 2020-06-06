class Money
{
	private String country="canada"; // protected ,public,defulat can put as access modifier	
		public String getC()
	{ 
		return country;
	}
}

class Yen extends Money
{
		public String getC()
		{
			return super.getC();
		}
}

public class Euro extends Money
{
		public String getC(int x)
		{ 
			return super.getC();
		}
	public static void main(String args[])
	{	
		System.out.println(new Yen().getC()+""+new Euro().getC());
	}
}