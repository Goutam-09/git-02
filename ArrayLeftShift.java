class ArrayLeftShift
{
	static void rotateLeft(int []a)
	{
		int size=a.length-1;
		int t = a[0];
		for(int i=0;i<size;i++)
		{
			a[i]=a[i+1];			
		}
		a[size]=t;		
	}
	
	public static void rotateRight(int []a)
	{
		int i;
		int size = a.length-1;
		int t = a[size];
		for(i=size;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[i]=t;
	}
	public static void main(String[] args) 
	{
		int []a={2,3,4,5,6};
		rotateRight(a);
		for(int i:a)
			System.out.print(i+" ");
		     System.out.println();
		rotateLeft(a);
		for(int i:a)
			System.out.print(i+" ");
	}
}