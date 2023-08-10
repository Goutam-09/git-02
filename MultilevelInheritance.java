class MultilevelInheritance 
{
	void showA()
	{
		System.out.println("A");
	}
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.showA();//Child of Multilevel
		obj.showB();//child of Multilevel 
		//obj.showC();//child of Multilevel And B and We create object of B thats Why WE cannot access showC() method  of class C
		C ob1 = new C();
		ob1.showA();//C class is Child of both class thats why it can inherit the property of Multilevel Class and B both 
		ob1.showB();
		ob1.showC();
		MultilevelInheritance ob2  = new MultilevelInheritance();
		ob2.showA();// ShowA method is Exicuted because it is avalaible in this Class Where we can call 
		//ob2.showB();// ShowB is Child class of Multilevel class Thats why we cannot access it
		//ob2.showC();// ShowC is Child class of Multilevel class and class B Thats why we cannot access it 
	}
}
class B extends MultilevelInheritance
{
	void showB()
	{
		System.out.println("B");
	}
}
class C extends B
{
	void showC()
	{
		System.out.println("C");
	}
}