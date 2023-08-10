import java.util.*;
class MaxSmaxinarray
{
	public static void main(String[] args) 
	{
		int max=0,smax=-1;
		int [] a=new int [10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}	
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{	
				smax=max;
				max=a[i];
			}
			else if(a[i]<max && a[i]>smax)
				smax=a[i];
		}
		System.out.println();
		System.out.println("Maximum and Second Maximum");
		System.out.println("Max = "+max);
		System.out.println("smax = "+smax);
	}
}