import java.util.*;
class ArrayPattern
{
	public static void main(String[] args) 
	{
		int arr[][]=new int[4][4];	
		//Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
