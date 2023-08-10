class MyThread1 extends Thread
{
	public void run()
	{
		System.out.println("MyThread1"+Thread.currentThread().getName());
	}
}
class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("MyThread2"+"->"+Thread.currentThread().getName());
	}
}
class M1
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Goutam");
		System.out.println(Thread.currentThread().getName());
		MyThread1 m = new MyThread1();
		m.start();
		MyThread2 m1 = new MyThread2();
		m1.start();
	}
}