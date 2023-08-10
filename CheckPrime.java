import java.util.Scanner;
public class CheckPrime
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
	    n=sc.nextInt();
		Primep obj=new Primep();
		if(obj.isPrime(n))
		   System.out.println("Given number is Prime=" +n);
		else
		   System.out.println("Given number is not Prime=" +n);	
	}
}