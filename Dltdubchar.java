import java.util.Scanner;
public class Dltdubchar
{
	public static int countChar(String s,char ch)
	{
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			  c++;
		}
		return c;
	}
	public static String deleteChar(String s,int index)
	{	int size=s.length(),i;
		char ch[]=s.toCharArray();
		for(i=index;i<size-1;i++)
		{
			ch[i]=ch[i+1];
		}
		s=new String(ch,0,i);
		return s;
	}
	public static void main(String[] Goutam)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String = ");
		String s = sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(countChar(s,s.charAt(i))>1)
			{
				 s=deleteChar(s,i);
				 i--;
			}
		}
		System.out.println(s);
	}
}