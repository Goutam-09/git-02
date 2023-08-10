class Testv
{
	int a;
	static void m1()
	{
		System.out.println("m1: "+a);
	}
	public static void main(String[] args) 
	{
		Testv obj1=new Testv();
		Testv obj2=new Testv();
		obj1.a=100;
		obj2.a=200;
		obj1.m1();
		obj2.m1();
	}
}
