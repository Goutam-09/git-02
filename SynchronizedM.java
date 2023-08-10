class SynchronizedM
{
	public static void main(String[] args) 
	{
		Task t = new Task();
		MyThread t1 = new MyThread(t,"ABC");
		t1.start();
		MyThread t2 = new MyThread(t,"xyz");
		t2.start();
	}
}
class MyThread extends Thread
{
	Task task;
	String name;
	MyThread(Task t,String name)
	{
		this.task = t;
		this.name = name;
	}
	public void run()
	{
		task.doTask(name);
	}
}
class Task
{
	synchronized public void doTask(String name)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(name+" :"+i);
		}
	}
}