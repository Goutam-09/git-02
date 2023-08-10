class Task1
{
	public static void main(String[] args) 
	{
		C obj = new C();	
		Q obj1 = new Q();
		
	}
}
class P
{
	P()
	{
		System.out.println("papa");
	}
}
class C extends P
{
	void pC()
	{
		System.out.println("child");
	}
}
class Q extends C 
{
	Q()
	{
		super.pC();
		System.out.println("Queen");
	}
}
