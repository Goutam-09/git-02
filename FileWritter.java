import java.io.*;
class FileWritter
{
	public static void main(String[] args) throws Exception
	{
		read();
	}
	static void write()throws Exception
	{
		FileWriter fw = new FileWriter("abc.txt");
		fw.write('A');
		fw.close();//fw.flush()->ye bhi use kr skte he
		System.out.println("Success");
	}
	static void read()throws Exception
	{
		FileReader fr = new FileReader("FileWritter.java");
		int a=0;
		//char b[]=new char[100];
		while((a=fr.read())!=-1)
			System.out.print((char)a);
	}
}