import java.util.Scanner;
public class Marks
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of Physics");
		int Phy=sc.nextInt();
		System.out.println("Enter the marks of Maths");
		int Maths=sc.nextInt();
		System.out.println("Enter the marks of Chemistry");
		int Che=sc.nextInt();
		System.out.println("Enter the marks of Hindi");
		int Hin=sc.nextInt();
		System.out.println("Enter the marks of English");
		int Eng=sc.nextInt();
		float percentage=(Phy+Maths+Hin+Eng+Che)/5;
		System.out.println(percentage);
	}
}