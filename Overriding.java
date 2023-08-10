class Overriding
{
	String show()//parent class ka return type hi hona chahiye nhi to error aygi incompattible type
	{
		System.out.println("Parent class");
		return null;
	}
}
class A extends Overriding
{
	String show()
	{
		super.show();
		System.out.println("child class");
		return null;
	}
	public static void main(String[] args) 
	{ 
		A ob = new A();
		ob.show();
		System.out.println("Hello");
	}
}