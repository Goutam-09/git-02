import java.util.*;
import java.io.*;
class StudentStore
{
	public static void main(String[] args) throws Exception
	{
		School sk = new School();
		ArrayList al =sk.readData();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1. Add  Data\n2. Update  Data\n3. Delete  Data\n4. Show Data\n5. Exit\n");
			System.out.print("Enter the choice: ");
			switch(sc.nextInt())
			{
				case 1:
					System.out.print("Enter the Student Roll number: ");
					int roll =sc.nextInt();
					sc.nextLine();
					System.out.print("Enter the Student Name: ");
					String name = sc.nextLine();
					System.out.print("Enter the Student class: ");
					String stdclass = sc.nextLine();
					System.out.print("Enter the Student Mobile Number: ");
					String mob = sc.nextLine();
					StudentData s = new StudentData(roll,name,stdclass,mob);
					sk.addData(s);
					break;
				case 2:
					sk.updateData();
					break;
				case 3:
					sk.deleteData();
					break;
				case 4:
					if(al==null)
						System.out.println("No Data Found !");
					else
					{
						for(int i=0;i<al.size();i++)
							System.out.println(al.get(i));
					}
					break;
				case 5:
					System.exit(0);
			}
		}	
	}
}
class School
{
	public void addData(StudentData s)throws Exception 
	{
		ArrayList al=readData();
		if(al==null)
		{
			al = new ArrayList();
		}
		if(search(s.getRollNo())==null)
		{
			al.add(s);
			FileOutputStream fos = new FileOutputStream("Dad.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			oos.close();
		}
		else 
		{
			System.out.println("Dublicate Roll number Found !");
		}
	}
	public void addData(ArrayList al)throws Exception
	{
		FileOutputStream fos = new FileOutputStream("Dad.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
	}
	public void updateData()throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Roll number which You want to update Information: ");
		int r = sc.nextInt();
		int flag=0;
		StudentData s = search(r);
		if(s==null)
			System.out.println("Student Not Fetch !");
		else 
		{
			while(true)
			{
				System.out.print("1. Update Student Name\n2. Update Student Mobile Number\n3. Exit\n");
				System.out.print("Enter your choice: ");
				int c = sc.nextInt();
				sc.nextLine();
				switch(c)
				{
				case 1:
					System.out.print("Enter Name For Update: ");
					String name  = sc.nextLine();
					s.setStdName(name);
					break;
				case 2:
					System.out.print("Enter the Mobile Number For Update: ");
					String mob = sc.nextLine();
					s.setMob(mob);
					break;
				case 3:
					flag=1;
					break;
				}
					if(flag==1)
					break;
			}
			ArrayList al = readData();
			int index = al.indexOf(s);
			al.set(index,s);
			addData(al);
		}
	}
	public void deleteData()throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Roll no. you want to delete: "); 
		StudentData s = search(sc.nextInt());
		if(s==null)
			System.out.println("No Student Data fetch !");
		else 
		{
			ArrayList al = readData();
			int index = al.indexOf(s);
			al.remove(index);
			addData(al);
		}
	}
	public StudentData search(int rNO)
	{
		ArrayList al = readData();
		for(int i=0;al!=null&&i<al.size();i++)
		{
			StudentData s1 = (StudentData)al.get(i);
			if(s1.getRollNo()==rNO)
			{
				return s1;
			}
		}	
		return null;
	}
	public ArrayList readData()
	{
		try  
		{
			FileInputStream fis = new FileInputStream("Dad.obj");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList al=(ArrayList)ois.readObject();
			return al;
		}
		catch(Exception e)
		{
			return null;
		}
	}
}
class StudentData implements Serializable
{
	int rollNo;
	String stdName,stdClass,stdMob;
	StudentData(int rollNo,String stdName,String stdClass,String stdMob)
	{
		this.rollNo=rollNo;
		this.stdName=stdName;
		this.stdClass=stdClass;
		this.stdMob=stdMob;
	}
	public void setRollNo(int r)
	{
		this.rollNo=r;
	}
	public void setStdName(String n)
	{
		this.stdName=n;
	}
	public void setStdClass(String c)
	{
		this.stdClass=c;
	}
	public void setMob(String m)
	{
		this.stdMob=m;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public String getStdName()
	{
		return stdName;
	}
	public String getStdClass()
	{
		return stdClass;
	}
	public String getMob()
	{
		return stdMob;
	}
	public String toString()
	{
		return "("+"1. Roll.no: "+rollNo+" 2. Name: "+stdName+" 3. Class: "+stdClass+" 4. MObile No: "+stdMob+")";
	}
	public boolean equals(Object obj)
	{
		StudentData s = (StudentData)obj;
		return rollNo==s.rollNo;
	}
}