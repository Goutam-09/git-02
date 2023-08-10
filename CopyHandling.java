import java.io.*;
class CopyHandling
{
	public static void main(String[] args)throws Exception
	{
		FileWriter fw = new FileWriter("con");//jha write krna h vo pass krdo to copy hojyga or con mtlb console pr display;
		FileReader fr = new FileReader("Number.java");//from where we read the file (file name);
		int a = fr.read();//first character unique code input from this method;
		while(a!=-1)
		{
			fw.write(a);//ek ek character whrite krta he;
			a=fr.read();//next characte uniquie code input 
		}
		fw.close();
	}
}