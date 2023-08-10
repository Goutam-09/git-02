import java.util.Scanner;
public class Removechar
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String = ");
		String s = sc.nextLine();
		String s1 = s. substring(1,6);
		System.out.print(s1);	
	} 
}