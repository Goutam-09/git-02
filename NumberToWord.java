import java.util.*;
class NumberToWord
{
	public static String numbertoWord(int n)
	{
		String word = "";
		String []one = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven",
						"twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String []two = {"",""," twenty"," thirty"," fourty"," fifty"," sixty"," seventy"," eighty"," ninety"};
		if(n==0)
			return "zero";
		if((n/1000)>0)
		{
			word = word+numbertoWord(n/1000)+" thousand ";
			n=n%1000;
		}
		if((n/100)>0)
		{
			word = word+numbertoWord(n/100)+" hundered ";
			n=n%100;
		}
		if(n>0)
		{
			if(n<20)
			{
				word = word+one[n];
			}
			else 
			{
				word = word+two[n/10];
				if((n%10)>0)
				{
					word =word+"-"+one[n%10];
				}
			}
		}
		return word;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");	
		int n = sc.nextInt();
		System.out.print("Number in words: "+numbertoWord(n));

	}
}