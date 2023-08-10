import java.io.*;
class DoConcatAandBTask
{
	public static void main(String[] args)throws Exception 
	{
		FileReader fr = new FileReader("A.txt");
		BufferedReader br = new BufferedReader(fr);
		FileReader fr1 = new FileReader("B.txt");
		BufferedReader br1 = new BufferedReader(fr1);
		FileWriter fw = new FileWriter("concatAB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String s = br.readLine();
		while(s!=null)
		{
			bw.write(s);
			bw.newLine();
			s=br.readLine();
		}
		String s1 = br1.readLine();
		while(s1!=null)
		{
			bw.write(s1);
			bw.newLine();
			s1=br1.readLine();
		}
		bw.close();
		System.out.println("success");
	}
}
class Same
{
	public static void main(String[] args) throws Exception
	{
		FileReader fr = new FileReader("concatAb.txt");
		BufferedReader br = new BufferedReader(fr);
		FileReader fr1 = new FileReader("concatAb.txt");
		BufferedReader br1= new BufferedReader(fr1);
		PrintStream ps = new PrintStream("CommontOfAB.txt");
		String s=br.readLine();
		int a=0,c=0;
		while(s!=null)
		{
			c++;
			s=br.readLine();
		}
		int arr[]=new int[c];
		String s1=br1.readLine();
		while(a<c&&s1!=null)
		{
			arr[a++]=Integer.parseInt(s1);
			s1=br1.readLine();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					ps.println(arr[i]);//System.out.println(arr[i]);
			}
		}
		ps.close();
		System.out.println("success");
	}
}
class NotSame
{
	public static void main(String[] args) throws Exception
	{
		FileReader fr = new FileReader("concatAb.txt");
		BufferedReader br = new BufferedReader(fr);
		FileReader fr1 = new FileReader("concatAb.txt");
		BufferedReader br1= new BufferedReader(fr1);
		PrintStream ps = new PrintStream("Notcommon.txt");
		String s=br.readLine();
		int a=0,c=0;
		while(s!=null)
		{
			c++;
			s=br.readLine();
		}
		int arr[]=new int[c];
		String s1=br1.readLine();
		while(a<c&&s1!=null)
		{
			arr[a++]=Integer.parseInt(s1);
			s1=br1.readLine();
		}
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(j!=i)
				{
					if(arr[i]==arr[j])
					{
						temp=1;
						break;
					}
				}	
			}
			if(temp==0)
				ps.println(arr[i]);
			else 
				temp=0;
		}
		ps.close();
		System.out.println("success");
	}
}