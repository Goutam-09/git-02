import java.util.*;
public class ReverseArray
{
	public static void reverse(int a[])
	{
		int f=0,l=a.length-1;
		while(f<l)
		{
			a[f]=a[f]+a[l]-(a[l]=a[f]);
			f++;
			l--;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements: ");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		reverse(a);	
	}
}