public class FLreverse
{
	public int flReverse(int n,int n1)
	{
		int s=0,r;
		while(n!=0)
		{
			if(s==0||n<10)
				r=n%10;
			else 
				r=n1%10;
			s=s*10+r;
			n/=10;
			n1/=10;
		}
		return s;
	}
}