class JoinMethod 
{
	public static void main(String[] args) throws Exception
	{
		P t = new P();
		t.start();
		t.join();
		P t1 = new P();
		
		for(int i=1;i<=5;i++)
			System.out.println(Thread.currentThread().getName()+":"+i);
	}
}
class P extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		System.out.println("p class");
	}
}