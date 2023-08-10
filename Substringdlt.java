import java.util.Scanner;
public class Substringdlt
{
	 public static void main(String[] args) 
	 {
	 	int i,j;
	 	String v="";
	 	String u="";
	 	Scanner sc = new Scanner(System.in);
	 	System.out.print("Enter the String = ");
	 	String s = sc.nextLine();
	 	for(i=0;i<s.length();i++)
	 	{
	 		for(j=i+1;j<s.length();j++)
	 		{
	 			if(s.charAt(i)==s.charAt(j))
	 			{
	 				v=s.substring(0,j);
	 				u=s.substring(j+1);
	 				s=v+u;
	 				j--;
	 			}
	 		}
	 	}
	 	System.out.print(s);
	 }
}