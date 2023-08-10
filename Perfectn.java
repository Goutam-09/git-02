public class Perfectn
{
	public boolean isPerfect(int n)
	{
		int temp=n,sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
			if(sum==temp)
			  return true;
			else
			  return false;
	}
}