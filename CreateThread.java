class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Thread is under running.....");
	}
	public static void main(String[] args) 
	{
		MyThread ct = new MyThread();
		ct.start();
		MyThread ct1 = new MyThread();
		ct1.start();
	}
}
