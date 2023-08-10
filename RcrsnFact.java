import java.util.Scanner;
public class RcrsnFact
{
	public int fact(int num)
	{
		
		if(num==1)
			return 1;
		else 
			return num*fact(num-1);
	}
	public static void main(String[] Goutam)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int n=sc.nextInt();
		RcrsnFact obj = new RcrsnFact();
		if(n==0||n==1)
		System.out.println("Factorial of Given number = "+1);
		else
		System.out.println("Factorial of Given number = "+obj.fact(n));
	}
}