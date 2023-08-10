import java.util.Scanner;
class FrequencyCount
{
	public static boolean frequency(char ch[],char val,int index)
	{
		for(int i=index;i>=0;i--)
		{
			if(ch[i]==val)
				return false;
		}
		return true;
	}
	public static int count(char val,char ch[])
	{
		int c=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==val)
				c++;
		}
		return c;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String here: ");
		String s=sc.nextLine();
		char ch[] = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(frequency(ch,ch[i],i-1))
			{
				int c = count(ch[i],ch);
				System.out.println(ch[i]+" -> "+c);
			}
		}
	}
}