import java.util.*;
class EqualityOfTwoArray
{
	public static boolean checkArray(int a[],int b[])
	{
		int c=0;
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					if(a[i]==a[j])
						c++;
				}
			}
		if(c==b.length)
			return true;
			return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array 'a': ");
		int n=sc.nextInt();
		System.out.print("Enter the size of array 'b': ");
		int m=sc.nextInt();
		System.out.println();
		int [] a=new int[n];
		int [] b=new int[m];
		if(a.length!=b.length)
		{
			System.out.println("Both Array 'a' and 'b' are not equal because size cannot match ");
		}
		else 
		{
			System.out.println("Enter the elements of array 'a' ");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println();
			System.out.println("Enter the elements of array 'b' ");
			for(int i=0;i<b.length;i++)
			{
				b[i]=sc.nextInt();
			}
			System.out.println("Elements of Array 'a'");
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
			System.out.println("Elements of Array 'b'");
			for(int i=0;i<b.length;i++)
			{
				System.out.print(b[i]+" ");
			}
			System.out.println();
			if(checkArray(a,b))
				System.out.print("Both Array 'a' and 'b' are equal");
			else 
				System.out.print("Both Array 'a' and 'b' are not equal ");

		}
	}
}