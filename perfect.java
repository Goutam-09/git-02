import java.util.Scanner;
class Per
{
	public static void main(String[] args)
	{
		System.out.println(isPerfect(6));
	}
	static boolean isPerfect(int n)
	{
		int i=1,sum=0;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				sum = sum+i++;
			}
		}
		if(n==sum)
			return true;
		    return false;
	}
}