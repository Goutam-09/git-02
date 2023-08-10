import java.util.Scanner;
class Fac
{
	public static void main(String[] args) 
	{
		int i=1,n=5;
		while(i<=n)
		{
			System.out.println(factorial is fact(i++));
		}
	}
	static int fact(int n)
	{
		int i=1,f=1;
		while(i<=n)
		{
			f=f*i++;
		}
		return f;
	} 
}