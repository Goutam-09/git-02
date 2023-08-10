class CheckPriority
{
	public static void main(String[] args) 
	{
		N t = new N();
		t.start();
		N1 t1 = new N1()
		t1.start();
	}
}
class N extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getPriority()+"->"Thread.currentThread().getName()+"="+i);
		}
	}
}
class N1 extends Thread
{
	for(int i=1;i<=5;i++)
	{
		System.out.println(Thread.currentThread().getPriority()+"->"Thread.currentThread().getName()+"="+i);
	}
}