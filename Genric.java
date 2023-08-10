public class Genric
{
	int r,s=0;
	public int doGenric(int n)
	{
		while(true)
		{
			while(n!=0)
			{
				r=n%10;
				s=s+r;
				n/=10;
			}
			if(s>9)
			{
				n=s;
				s=0;
			}
			else 
			   break;
		}
		return s;
	}
}