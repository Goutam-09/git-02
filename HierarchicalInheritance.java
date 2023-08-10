class HierarchicalInheritance 
{
	void showH()
	{
		System.out.println("HierachicalInheritance");
	}
	public static void main(String[] args) 
	{
		HierarchicalInheritance ob1 = new HierarchicalInheritance();
		ob1.showH();
		//ob1.showB();
		A ob2 = new A();
		ob2.showAb();
		ob2.showH();
		B ob3 = new B();
		ob3.showH();
	//	ob3.showAb();
	}
}
class A extends HierarchicalInheritance
{
	void showAb()
	{
		System.out.println("A");
	}
}
class B extends HierarchicalInheritance
{
	void showA()
	{
		System.out.println("B");
	}
}