import java.io.*;
class BufferTask 
{
	public static void main(String[] args)throws Exception
	{
		FileReader fr = new FileReader("xyz.java");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("nilesh.java");
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