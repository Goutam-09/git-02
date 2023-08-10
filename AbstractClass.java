class AbstractClass
{
	public static void main(String[] args) 
	{
		P obj = new P();
	}
}
abstract class Abs 
{
	public void m2()
	{
		System.out.println("papa");
	}
	abstract public void m1();

}
class C extends Abs 
{
	super.m2();
}
