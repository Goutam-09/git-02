import java.util.*;
import java.io.*;
class EmployStore
{
	public static void main(String[] args)throws Exception 
	{
		Employ emp = new Employ();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("1. Add Employ Data\n2. Update Employ Data\n3. Delete Empoy ID\n4. Display Data\n5. Exit\n");
			int o = sc.nextInt();
			sc.nextLine();
			switch(o)
			{
				case 1:
					System.out.print("Enter the Administrative Password first: ");
					String s1 = sc.nextLine();
					String s2 = "Goutam@123";
					if(s1.equals(s2))
					{
						System.out.print("Enter the Employ Id: ");
						int id = sc.nextInt();
						sc.nextLine();
						System.out.print("Enter the Employ Name: ");
						String n = sc.nextLine();
					    System.out.print("Enter the Employ Mobile Number: ");
					    String m = sc.nextLine();
					    EmployData e = new EmployData(id,n,m);
					    emp.addData(e);
					    break;
					}
					else 
						System.out.println("Wrong Password Input !");
					    break;
				case 2:
					emp.update();
					break;
				case 3:
					emp.deleteData();
					break;
				case 4:
					ArrayList al = emp.readData();
					if(al==null)
					    System.out.println("No Employ Data Fetch !");
					else 
					{
						for(int i=0;i<al.size();i++)
						{
							System.out.println(al.get(i));
						}
					}
					break;
				case 5:
					System.exit(0);
			}
		}	
	}
}
class Employ
{
	public void addData(EmployData e)throws Exception
	{
		Scanner sc = new Scanner(System.in);
		ArrayList al = readData();
			if(al==null)
			{
				al = new ArrayList();
			}
			if(searchData(e.getID())==null)	
			{
				al.add(e);
				FileOutputStream fos = new FileOutputStream("EmpData.obj");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(al);
				oos.close();
			}
			else 
				System.out.println("Dublicate Id not Allowed here !");
	}
	public void addData(ArrayList al)throws Exception
	{
		FileOutputStream fos = new FileOutputStream("EmpData.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
	}
	public void update()throws Exception
	{
		boolean t=true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Employ Id for updation");
		int id = sc.nextInt();
		EmployData e =  searchData(id);
		if(e==null)
			System.out.println("Employ Data Not fetch !");
		else 
		{
			while(t)
			{
				System.out.print("1. Update Employ Name\n2. Update Employ Mobile no\n3.Exit\n");
				System.out.print("Select the option: ");
				int n = sc.nextInt();
				sc.nextLine();
				switch(n)
				{
					case 1:
						System.out.print("Enter the Update Name: ");
						String na = sc.nextLine();
						e.setEmpName(na);
						break;
					case 2:
						System.out.print("Enter the Update Mobile number: ");
						String m = sc.nextLine();
						e.setEmpmob(m);
						break;
					case 3:
						t=false;
						break;
				}
			}
			ArrayList al = readData();
			int index = al.indexOf(e);
			al.set(index,e);
			addData(al);
		}
	}
	public void deleteData()throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Employ Id for delete: ");
		int id = sc.nextInt();
		EmployData e = searchData(id);
		if(e==null)
			System.out.println("NO Data Fetch !");
		else 
		{
			ArrayList al = readData();
			int index = al.indexOf(e);
			al.remove(index);
			addData(al);
		}
	} 
	public EmployData searchData(int id)
	{
		ArrayList al = readData();
		for(int i=0;al!=null&&i<al.size();i++)
		{
			EmployData e = (EmployData)al.get(i);
			if(e.getID()==id)
				return e;
		}
		return null;
	}
	public ArrayList readData()
	{
		try 
		{
			FileInputStream fis = new FileInputStream("EmpData.obj");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList al  = (ArrayList)ois.readObject();
			return al;
		}
		catch(Exception a)
		{
			return null;
		}
	}
}
class EmployData implements Serializable
{
	int empId;
	String empName,empMob;
	EmployData(int empId,String empName,String empMob)
	{
		this.empId=empId;
		this.empName=empName;
		this.empMob=empMob;
	}
	public String toString()
	{
		return "("+"Employ ID "+empId+",Employ Name "+empName+",Employ Mob "+empMob+")";
	}
	public boolean equals(Object obj)
	{
		EmployData e = (EmployData)obj;
		return empId==e.empId;
	}
	public void setID(int id)
	{
		empId=id;
	}
	public void setEmpName(String name)
	{
		empName=name;
	}
	public void setEmpmob(String mob)
	{
		empMob=mob;
	}
	public int getID()
	{
		return empId;
	}
	public String getEmpName()
	{
		return empName;
	}
	public String getEmpMob()
	{
		return empMob;
	}
}