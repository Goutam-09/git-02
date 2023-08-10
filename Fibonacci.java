import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the number = ");
		int n=sc.nextInt();
	    fibo(n);
	}
	public static void fibo(int n)
	{
		int next,a=0,b=1;
		if(n==0||n==1)
		{
			System.out.println("Fibonacci Series is");
			System.out.print("0 1");
		}
		else 
		{
			System.out.println("Fibonacci Series is");
			System.out.print("0 1");
			for(int i=3;i<=n;i++)
			{
				next = a+b;
				System.out.print(" "+next);
				a=b;
				b=next;
			}
		}
	}
}