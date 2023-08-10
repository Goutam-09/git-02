import java.io.*;
class xyz
{
	public static void main(String[] args)throws Exception
	{
		PrintWriter pw = new PrintWriter("Pwiter.java");
		pw.println("hello");
		pw.println(10);
		pw.println('A');
		pw.println(true);
		pw.println(100.45);
		pw.println();
		
		pw.close();
		System.out.println("success");
	}
}
