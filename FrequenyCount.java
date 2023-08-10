import java.util.Scanner;
class FrequencyCount
{
	public static void frequency(char ch[],char ch)
	{
		int c=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==ch)
			   c++;	
		}
	}
	public static void main(String[] args) 
	{
		String s;
		int c=0;
		System.out.print("Enter the String here: ");
		s=sc.next();
		char ch[] = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			c=frequency(ch,ch[i]);
			System.out.print(ch[i]+" -> "+c);
		}
	}
}