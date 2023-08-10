import java.util.Scanner;
class Lowerstring
{
	public static void toLowerString(String s)
	{
		String s1="";
		int n;
		char ch;
		for(int i=0;i<s.length();i++)
		{
			n=(int)s.charAt(i);
			if(n>=60&&n<=90)
			{
				n+=32;
				ch=(char)n;
				s1=s1+ch;
			}
		}
		System.out.print(s1);
	}
	 public static void main(String[] args) 
	 {
	 	Scanner sc = new Scanner(System.in);
	 	System.out.print("Enter the String = ");
	 	String s = sc.nextLine();
	 	toLowerString(s);
	 }
}