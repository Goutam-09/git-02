import java.io.*;
class ImageFile
{ 
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("BARFA-min.jpg");//current folder me search krega jis folder m codev kr re
		FileOutputStream fos = new FileOutputStream("copy1.jpg");
		int a = fis.read();
		while(a!=-1)
		{
			fos.write(a);
			a=fis.read();
		}
		fos.close();
		System.out.println("copy image Successfuly");
	}
}