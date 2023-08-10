import java.io.File;
class FileHandling
{
	public static void main(String[] args)throws Exception
	{
		File f = new File("D:/");
		if(f.exists())
		{
			if(f.isDirectory())
			{
				String files[] = f.list();
				for(String s:files)
				{
					File f1 = new File(f,s);
					System.out.println(s+"->"+(f1.isFile()?"File":"Folder"));
				}
			}											         ///if(f.isFile())
																//	System.out.println("file found");
			else 
				System.out.println("folder found");
		}
        else 
        {
        	f.mkdir();///f.createNewFile();
        	System.out.println("New file is created");
        }
	}
}