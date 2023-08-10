public class Pow
{
	public int pow(int n,int p)
	{
		int s=1;
	    for(int i=1;i<=p;i++)
	    {
	    	s=s*n;
	    }
	    return s;
	}
}