import java.io.*;
class Serialized
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fos = new FileOutputStream("std.obj");	
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Std s = new Std();
		oos.writeObject(s);
		oos.close();
		System.out.println("Success");
	}
}
class Std implements Serializable
{
	String name="Goutam";
	transient int rollNo=1000;
}
class Deserialized
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("std.obj");	
		ObjectInputStream ois = new ObjectInputStream(fis);
		Std s = (Std)ois.readObject();
		System.out.println(s);
		System.out.println(s.name);
		System.out.println(s.rollNo);
	}
}

