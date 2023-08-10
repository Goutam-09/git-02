class deleteDublicate
{
	/*public static int[] resize(int a[],int c)
	{
		int ar[]=new int[a.length-c];
		for(int i=0;i<a.length-c;i++)
		{
			ar[i]=a[i];
		}
		return ar;
	}*/
	public static int countValue(int []a,int val)
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==val)
				c++;
		}
		return c;
	}
	public static int[] deleteval(int []a,int val)
	{
		int c=0,size=a.length;
		for (int i=0;i<a.length;i++) 
		{
			if(a[i]==val)
			{
			  for(int j=i;j<size-1;j++)
			  {
			  	a[j]=a[j+1];
			  }	
			  i--;
			  size--;
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{
		int a[]={3,3,4,5,6,7,4,4,5,6,3,2};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i=0;i<a.length;i++)
		{
			if(countValue(a,a[i])>1)
			{
				a=deleteval(a,a[i]);
				i--;
		    }
		}
		for(int i=0;i<a.length;i++)	
		System.out.print(a[i]+" ");
	}
}