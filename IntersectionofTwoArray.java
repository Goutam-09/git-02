import java.util.*;
public class IntersectionofTwoArray
{
	public void intersectionTwoArray(int a[],int b[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
					System.out.println("Intersection of two array is:"+a[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array 'arr': ");
		int m=sc.nextInt();
		System.out.print("Enter the size of array 'prr': ");
		int n=sc.nextInt();
		int []arr=new int [m];
		int []prr=new int [n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println("Enter the elements of array");
		for(int i=0;i<prr.length;i++)
		{
			prr[i]=sc.nextInt();
		}
		System.out.println();
		IntersectionofTwoArray obj = new IntersectionofTwoArray();
		obj.intersectionTwoArray(arr,prr);
    }
}