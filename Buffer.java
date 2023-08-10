import java.io.*;
class Buffer
{
	public static void main(String[] args)throws Exception
	{
		FileReader fr = new FileReader("Buffer.java");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("xyz.java");
		BufferedWriter bw = new BufferedWriter(fw);
		String s = br.readLine();
		while(s!=null)
		{
			bw.write(s);
			bw.newLine();
			s=br.readLine();
		}
		/*bw.write("hello i m goutam");
		bw.write("barfa");*/
		bw.close();
		System.out.println("success");	
	}
}