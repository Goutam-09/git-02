class InstanceOfOperator
{
	public static void main(String[] args)throws Exception
	{
		Class c = Class.forName(args[0]);
		Object obj = c.newInstance();
		if(obj instanceof A)
		{
			A ob = (A)obj;
			ob.show();
		}	
		if(obj instanceof B)
		{
			B ob = (B)obj;
			ob.show();
		}	
		if(obj instanceof C)
		{
			C ob = (C)obj;
			ob.show();
		}	
	}
}
class A
{
	static
	{
		System.out.println("Static A");
	}
	public void show()
	{
		System.out.println("Show A");
	}
}
class B
{
	static
	{
		System.out.println("Static B");
	}
	public void show()
	{
		System.out.println("Show B");
	}
}
class C
{
	static
	{
		System.out.println("Static C");
	}
	public void show()
	{
		System.out.println("Show C");
	}
}