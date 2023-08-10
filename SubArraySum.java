import java.util.*;	//not complete
class SubArraySum
{
	public static void subSum(int a[],int num)
	{
		int sum=0;
		for (int i=0;i<a.length;i++) 
		{
			sum=sum+a[i];
			if(sum==num)
			{
				System.out.print();
				sum=0;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []a = new int[10];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		subSum(a,num);
	}
}