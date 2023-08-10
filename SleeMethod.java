class SleeMethod
{
	public static void main(String[] args) throws Exception
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Good Night.....");
			Thread.sleep(5000);
			System.out.println("Good Morning.....");
			Thread.sleep(2000);
		}
	}
}