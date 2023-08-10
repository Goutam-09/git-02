class Bus implements Runnable
{
	int available = 2,passanger;
	Bus(int passanger)
	{
		this.passanger=passanger;
	}
	public synchronized void run()
	{
		String name = Thread.currentThread().getName();
		if(available>=passanger)
		{
			System.out.println(name+" Reserved seat.....");
			available = available-passanger;
		}
		else 
		{
			System.out.println("Sorry Seat not available ! ");
		}
	}
	
}
class Customer 
{
	public static void main(String[] args) 
	{
		Bus r = new Bus(1);
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		t1.setName("Aakash");
		t2.setName("Vikash");
		t3.setName("Vidhayak");
		t1.start();
		t2.start(); 
		t3.start();
	}
}