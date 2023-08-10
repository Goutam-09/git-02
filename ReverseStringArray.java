import java.util.*;
class ReverseStringArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:  ");
	    int s = sc.nextInt();
		String a[]=new String[s];
		System.out.println("Enter the String elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next();
		}	
		System.out.println("Elements of array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
}