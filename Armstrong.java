public class Armstrong
{
	public static boolean checkArmstrong(int n)
	{
		int c,temp=n,sum=0,r;
		Count obj=new Count();
		c=obj.count(n);
		while(n!=0)
		{
			r=n%10;
			Pow obj1=new Pow();
			sum=sum+obj1.pow(r,c);
			n/=10;
		}
		if(temp==sum)
			return true;
		    return false;
	}
}