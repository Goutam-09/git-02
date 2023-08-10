import java.util.Scanner;
class Per
{
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the marks of English = ");
	   int Eng = sc.nextInt();
	   System.out.println("Enter the marks of Hindi = ");
	   int Hin = sc.nextInt();
	   System.out.println("Enter the marks of Maths = ");
	   int Mat = sc.nextInt();
	   System.out.println("Enter the marks of Physics = ");
	   int phy = sc.nextInt();
	   System.out.println("Enter the marks of Chemistry = ");
	   int che = sc.nextInt();
	   float percentage = (Eng + Hin + Mat + phy + che)/5;
	   System.out.println(percentage);

	}
}