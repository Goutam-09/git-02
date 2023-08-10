import java.util.Scanner; 
public class TwoDArrayDlt
{
	public static void checkDublicate(int [][]a,int val)
	{
		int size=a.length,len=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a[i].length;j++)
			{
				if(val==a[i][j])
				{	
					 dltDublicate(val);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int [][]arr=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Elements of Array");	
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}	
		}
		System.out.println("helo");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				checkDublicate(arr,arr[i][j]);
			}
		}
	}
}