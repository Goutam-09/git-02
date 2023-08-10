public class Foreachlooparray
{
	public static void main(String[] args) 
	{
		int []a=new int[]{10,20,30};
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" "); //valid
		/*for(int i:a)
		System.out.print(i+" ");*/ //valid
	}
}