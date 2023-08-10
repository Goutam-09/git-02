public class Strong
{
	public boolean checkStrong(int n)
	{
		int temp=n,r,sum=0;
		while(n!=0)
		{
			r=n%10;
			Fact obj =new Fact();
			sum=sum+obj.fact(r);
			n/=10;
		}
		if(temp==sum)
			return true;
		    return false;
	}
} 