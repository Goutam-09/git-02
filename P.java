class P
{
	public void m1()
	{
		System.out.println("p.m1");
	}
	public void m2()
	{
		System.out.println("p.m2");
	}
}
class Child extends P
{
	public void m1()
	{
		System.out.println("child.m1");
	}
	public void m3()
	{
		System.out.println("child.m3");
	}
	public static void main(String[] args) 
	{
		Child t = new Child();
		t.m1();
		t.m2();
		t.m3();

	}
}