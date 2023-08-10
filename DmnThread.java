/*class DmnThread extends Thread
{
	public void run()
	{
		System.out.println("child thread");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Thread");	
		DmnThread  d = new DmnThread();
		d.setDaemon(true);
		d.start();
	}
}*/
class Parent
{
	public void show()
	{
		System.out.println("Parent class");
	}
	Parent()
	{
		System.out.println("ok");
	}
}
class Child extends Parent
{
	public void show()
	{
		//super.show();
		System.out.println("Child class");
	}
	Child()
	{
		System.out.println("help");
	}
	public static void main(String[] args) 
	{
		Parent p = new Child();
		p.show();	
	}
}

