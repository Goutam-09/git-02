import java.util.Scanner; 
class Uperstring
{
	public static void upertheString(String s)
	{
		String s1="";
		char ch;
		int n;
		for(int i=0;i<s.length();i++)
		{
			n=(int)s.charAt(i);
			if(n>=97&&n<=122)
			{
				n=n-32;
				ch=(char)n;
				s1=s1+ch;
			}
		}
		 System.out.print(s1);
	}
	public static void  main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String = ");
		String s = sc.nextLine();
		upertheString(s);
	}
}