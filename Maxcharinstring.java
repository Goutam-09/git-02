			//How to find the maximum occurring character in a given String?
import java.util.Scanner;
class Maxcharinstring
{
	public static int maxChar(char ch,String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			    count++;
		}
		return count;
	}
	public static void main(String[] Goutam)
	{
		int c=0,max=0;
		char ch='a';
	    Scanner sc =new Scanner(System.in);
	    System.out.print("Enter the String = ");
	    String s=sc.nextLine();
	    for(int i=0;i<s.length();i++)
	    {
	   		c = maxChar(s.charAt(i),s);
	   		if(c>max)
	   		{
	   			max=c;
	   			ch=s.charAt(i);
	   		}
	    }
	    System.out.println("Maximum Occuring Character "+ch+" = "+max+" times");
	}
}