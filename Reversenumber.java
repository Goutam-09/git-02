public class Reversenumber
{
	public int isReverse(int n)
	{
		int r,s=0;
		while(n!=0)
		{
			r=n%10;
			s=s*10+r;
			n/=10;
		}
		return s;
	}
}