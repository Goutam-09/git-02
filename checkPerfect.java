import java.util.Scanner;
public class CheckPerfect
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number= ");
		int a=sc.nextInt();
		Perfectn obj=new Perfectn();
		if(obj.isPerfect(a))
			System.out.println("Given number is perfect = "+a);
		else 
			System.out.println("Given number is not perfect = "+a);
	}
}