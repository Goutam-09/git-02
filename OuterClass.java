/*class Outer 								//Example 1	->normal inner class or Nested inner class
{
	class Inner
	{
		public void show()
		{
			System.out.println("In nested class method");
		}
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.show();	
	}
}*/									
											//Example 2 ->Method Local inner class
/*class Outer
{
	public void outerMethod()
	{
		System.out.println("inside outerMethod");
		class Inner
		{
			public void innerMethod()
			{
				System.out.println("inside innerMethod");
			}
		}
		Inner i = new Inner();
		i.innerMethod();
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Outer o = new Outer();
		o.outerMethod();	
	}
}*/


/*class Outer 									//Example 1 -> Static nested class
{
	private static void show()
	{
		System.out.println("outer");
	}
	static class Inner
	{
		private static void inner()
		{
			System.out.println("inner");
			Outer.show();
		}
	} 
}
class Main
{
	public static void main(String[] args) 
	{
		Outer.Inner.inner();
		//Outer.show();	
		Outer o = new Outer();
		Outer.Inner i =o.new Inner();
		i.inner();
	}
}*/

/*class ChineesePoint         					// Example 1-> Anonymous class	
{
	public void noodles()
	{
		System.out.println("Testy Noodles");
	}
}
class Main
{
	public static void main(String[] args) 
	{
		new ChineesePoint()
		{
			public void noodles()
			{
				System.out.println("Spicy Noodles");
			}
		}.noodles();
		new ChineesePoint().noodles();
	}
}*/
