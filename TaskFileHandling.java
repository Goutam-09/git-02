import java.io.*;
class DoConcatAandBBfrStream
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