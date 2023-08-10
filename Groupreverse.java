import java.util.Scanner;
class Groupreverse
{
	public static int getLastindex(int size,int f,int g)
	{
		int l=f+g-1;
		if(l>=size)
			return size-1;
			return l;
	}
	public static String reverseString(String s,int f,int l)
	{
		char ch[]=s.toCharArray();
		while(f<l)
		{
			char temp = ch[f];
			ch[f]=ch[l];
			ch[l]=temp;
			f++;
			l--;
		}
		return s=new String(ch);
	}
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String = ");
		String s = sc.nextLine();
		int size=s.length();
		System.out.print("Enter the number of group = ");
		int g = sc.nextInt();
		for(int i=0;i<s.length();i+=g)
		{
				int l = getLastindex(size,i,g);
				s=reverseString(s,i,l);
		}	
		System.out.print(s);
	}
}