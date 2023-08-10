import java.util.Scanner;
public class Swapnumber
{
	public static void Swap(int n1,int n2)
	{
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println(n1+" "+n2);
	}
	public static void main(String[] Goutam)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number 1 = ");
		int n1=sc.nextInt();
		System.out.print("Enter the number 2 = ");
		int n2=sc.nextInt();
		System.out.println("After swapping the number");
		Swap(n1,n2);
	}
}