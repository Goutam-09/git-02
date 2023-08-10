import java.util.Scanner;
public class Ftriangle
{
	public static void pat(int n) 
	{
		for(int i=1;i<=n;i++)
		{
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number for row column = ");
		int n=sc.nextInt();
		pat(n);
	}
}
