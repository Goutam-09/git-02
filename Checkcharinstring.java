import java.util.Scanner;
class Checkcharinstring
{
	public static void main(String[] Goutam) 
	{
		int f=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String = ");
		String s =sc.nextLine();
		System.out.print("Enter the character = ");
		char c = sc.next().charAt(0);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			{
				f++;
				System.out.println("character "+c+" found in string at position = " +(i+1));
			}
		}
			if(f==0)
				System.out.println("Character "+c+" not found in given String");
	}
}