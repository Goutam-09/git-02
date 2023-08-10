import java.util.Scanner;
public class DoFLreverse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number = ");
		int n=sc.nextInt();
		Reversenumber obj=new Reversenumber();
		int n1=obj.isReverse(n);
		FLreverse obj1=new FLreverse();
		int n2=obj1.flReverse(n,n1);
		System.out.println("After first last number revrsing = " +n2);
	}
}