import java.io.*;
class FileHandlingF
{
	public static void print(String s1)
	{
		File f = new File(s1);
		if(f.exists())
		{
			if(f.isDirectory())
			{
				System.out.println(f.getName());
				System.out.println("v");
				String []s = f.list();
				for(String a:s)
				{
					File f1= new File(f,a);
					if(f1.isDirectory())
					{
						print(s1+"//"+a);
					}
					else 
						System.out.println(a);
				}
			}
		}
	}
	public static void main(String[] args)throws Exception
	{
		print("c://Drivers");
	}
}
