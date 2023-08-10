import java.util.Scanner;
public class Makegenric
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number = ");
		int n=sc.nextInt();
		Genric obj=new Genric();
		int n1=obj.doGenric(n);	
		System.out.println("Genric root of given number is " +n1);
	}
}