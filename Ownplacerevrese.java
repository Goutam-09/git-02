import java.util.Scanner;
public class Ownplacerevrese
{
	public static int getLastindex(String s,int size,int f)
	{
		while(f<size)
		{
			if(s.charAt(f)==' ')
			   return f-1;
			   f++;
		}
		return f-1;
	}
	public static String reverse(String s,int f,int l)
	{
		char ch[] = s.toCharArray();
		while(f<l)
		{
			char temp=ch[f];
			ch[f]=ch[l];
			ch[l]=temp;
			f++;
			l--;
		}
		return s=new String(ch);
	}
	public static void main(String[] args)
	{
		int l=0;
		String s1="";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String = ");
		String s = sc.nextLine();
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		int size=s1.length();
		for(int i=0;i<s1.length();i=l+2)
		{
			l=getLastindex(s1,size,i);
			s1=reverse(s1,i,l);
		}
		System.out.println(s1);

	}
}