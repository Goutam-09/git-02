import java.util.*;
class PrintTwoDArray
{
	public static void main(String[] args) 
	{
		int [][]a=new int[2][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				 a[i][j]=sc.nextInt();
			}
		}	
		System.out.println("Elements of Array ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		}	

	}
}