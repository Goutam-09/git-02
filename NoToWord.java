import java.util.Scanner;
class NoToWord
{
	public static String noToWord(int n)
	{
		String ans = "";
		String []a1 = {""," One"," Two"," Three"," Four"," Five"," Six"," Seven"," Eight"," Nine"};
		String []a2 = {" Ten"," Eleven"," Twelve"," Thirteen"," Fourteen"," Fifteen"," Sixteen"," Seventeen"," Eighteen"," Nineteen"};
		String []a3 = {"",""," Twenty"," Thirty"," Fourty"," Fifty"," Sixty"," Seventy"," Eighty"," Ninety"};
		if((n/1000)>0)
		{
			ans = ans+noToWord(n/1000)+" Thousand";
			n=n%1000;
		}
		if((n/100)>0)
		{
			ans = ans+noToWord(n/100)+" Hundred";
			n=n%100;
		}
		if(n<10)
		{
			ans = ans+a1[n];
		}
		else if(n<20&&n>=10)
		{
			ans = ans+a2[n%10];
		}
		else 
		{
			ans =  ans+a3[n/10];
			 if((n%10)>0)
			 	ans = ans+a1[n%10];
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		if(n==0)
			System.out.print("Zero");
		else if(n>=100000)
			System.out.println("Wrong Input");
		else 
		System.out.print("Number to Word: "+noToWord(n));	
	}
}