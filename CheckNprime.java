class CheckNprime
{
	public static void main(String[] args)
	{
		int n=10;
		Nprime obj=new Nprime();
		for(int i=2;i<=n;i++)
		{
			if(obj.givePrime(i))
			{
				System.out.print(i);
			}
			System.out.print(" ");
		}
	}
}