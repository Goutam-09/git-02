class SingleInheritance
{
	void showA()
	{
		System.out.println("class A");
	}
	public static void main(String[] args) 
	{
		Single obj = new Single();
		obj.showA();
		obj.showB();
	}
}
class Single extends SingleInheritance
{
	void showB()
	{
		System.out.println("class B");
	}
}
