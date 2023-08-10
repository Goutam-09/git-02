import java.util.*;
class PairSumArray
{
	public static void main(String[] args) 
	{
		int i,j,n,c=0;
		Scanner sc = new Scanner(System.in);
		int a[] = new int[8];
		System.out.println("Enter the elements of array ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}	
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("Enter the number: ");	
		n=sc.nextInt();
		System.out.println();
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==n)
				{
					c++;
					System.out.println("("+a[i]+","+a[j]+") ="+n);
				}
			}
		}
		if(c==0)
		System.out.print("No pair is found in array equal to given number");
	}
}