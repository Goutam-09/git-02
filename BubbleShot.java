class BubbleShot
{
	public static void ShortAscending(int a[])
	{
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<a.length-i;j++)
			{
				if(a[j]>a[j+1])
				{
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
				}
			}
		}
	}
	public static void ShortDescending(int a[])
	{
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<a.length-i;j++)
			{
				if(a[j]<a[j+1])
				{
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int a[]={5,2,6,4,1};
		int b[]={1,2,3,4,5};
		ShortAscending(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		ShortDescending(b);
		for (int i=0;i<b.length;i++) 
		{
			System.out.print(b[i]+" ");	
		}
	}
}