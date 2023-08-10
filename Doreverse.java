import java.util.Scanner;
public class Doreverse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		System.out.print("Enter the number = ");
		int n=sc.nextInt();
		System.out.println("Before reversing number is " +n);
		Reversenumber obj=new Reversenumber();
		System.out.println("After reversing number is " +(obj.isReverse(n)));
	}
}