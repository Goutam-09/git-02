import java.util.Scanner;
public class TwoDarraytest
{
	public static void main(String[] args) 
	{
		int arr[][][][]=new int[2][2][2][2];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the elements of array = ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					for(int l=0;l<arr[i][j][k].length;l++)
					{
						arr[i][j][k][l]=sc.nextInt();
					}
				}
			}
		}
		/*for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					for(int l=0;l<arr[i][j][k].length;l++)
					{
						System.out.print(arr[i][j][k][l]+" ");
					}
				}
			}
		}*/
		System.out.print(arr[0][1][1][0]+" ");
	}
}