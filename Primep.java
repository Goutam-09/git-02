public class Primep
{
	public boolean isPrime(int n)
	{
		int c=0;
		if(n==1)
			return true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c==0)
			return true;
		    return false;
	}
}