import java.util.*;
class MaximumNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number1: ");
		int n1 = sc.nextInt();
		System.out.print("Enter the number2: ");
		int n2 = sc.nextInt();
		if(n1>n2)
			System.out.println(n1+" is Maximum Number");
		else if(n2>n1)
			System.out.println(n2+" is Maximum Number");
		else 
			System.out.println("number is equal"+n1);

	}
}