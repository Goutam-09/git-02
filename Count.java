public class Count 
{
	public int count(int n)
	{
	  int c=0;
	  while(n!=0)
	  {
		c++;
		n/=10;
	  }
	  return c;
	}
}