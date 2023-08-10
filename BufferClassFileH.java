import java.io.*;
class BufferClassFileH
{
	public static void main(String[] args) throws Exception
	{
		//FileWriter fw = new FileWriter("newFile.java");
		BufferedWriter br = new BufferedWriter(new FileWriter("newFile.java",true));//true lgane se pichla bhi print hoga or true nhi lgaya to bar bar mith k vps print krega;
		br.write("Hello broh how are uhhh");
		br.write("hi gandu");
		br.close();
	}
}