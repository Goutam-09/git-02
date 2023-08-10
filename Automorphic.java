public class Automorphic
{
	public boolean checkMorphic(int n)
	{
		int p=n*n,q=0;
		Count obj=new Count();
		int c=obj.count(n);
		for(int i=1;i<=c;i++)
		{
			if(p%10==n%10)
			{ 
				q++;
				p/=10;
				n/=10;
			}
		}
		if(q==c)
		  return true;
		  return false;
		
	}

}