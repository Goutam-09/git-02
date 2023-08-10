import java.io.*;
class File
{
	public static void print(String str)throws Exception
	{
		File f = new File(str);
		if(f.exists())
		{
			if(f.isDirectory())
			{
				System.out.println(f.str);
				System.out.println("v");
				String s[]=f.list();
				for(String a:s)
				{
					File f1 = new File(f,a);
					if(f1.isDirectory())
					{
						print(str+"//"+a);
					}
					else 
						System.out.println(a);
				}
			}
		}
	}
	public static void main(String[] args)throws Exception
	{
		print("c://");	
	}
}