class Nprime
{
	public boolean givePrime(int n)
	{
		int c=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c==0)
			return true;
		else 
			return false;
	}
}