import java.util.*;
class Sdata
{
	private int rollNo;
    private	String stdName,stdMob;
	Sdata(int rollNo,String stdName,String stdMob)
	{
		this.rollNo=rollNo;
		this.stdName=stdName;
		this.stdMob=stdMob;
	}
	public void setRoll(int rollNo)
	{
		this.rollNo=rollNo;
	}
	public void setName(String stdName)
	{
		this.stdName=stdName;
	}
	public void setmobile(String stdMob)
	{
		this.stdMob=stdMob;
	}
	public int getRoll()
	{
		return rollNo;
	}
	public String getName()
	{
		return stdName;
	}
	public String getMobile()
	{
		return stdMob;
	}
	public String toString()
	{
		return "1.Roll no: "+rollNo+" 2.Student Name: "+stdName+" 3.Student Mobile: "+stdMob;
	}
}
class Sprint
{
	Scanner sc = new Scanner(System.in);
	int seat,totalstd;
	Sdata s [];
	Sprint()
	{
		seat = 5;
		totalstd=-1;
		s=new Sdata[seat];
	}
	public void admission()
	{
		if(totalstd<seat)
		{
			System.out.print("Enter the Roll no: ");
			int r = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the Name of Student: ");
			String n = sc.next();
			System.out.print("Enter the Mobile no of Student: ");
			String m = sc.next();
			Sdata p = new Sdata(r,n,m);
			s[++totalstd] = p;
		}
	}
	public void show()
	{
		if(totalstd<0)
			System.out.println("No Student Enroll.");
		else 
		{
			for(int i=0;i<=totalstd;i++)
			{
				System.out.println(s[i]+" ");
			}
		}
	}
	public void delete()
	{
		System.out.print("Enter the Roll no which you want to delete: ");
		int r = sc.nextInt();
		for(int i=0;i<=totalstd;i++)
		{
			if(r==s[i].getRoll())
			{
				for(int j=i;j<totalstd;j++)
				{
					s[j]=s[j+1];
				}
				totalstd--;
			}
		}
	}
}
class Student1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Sprint obj = new Sprint();
		while(true)
		{
			System.out.print("1.Admission\n2.show\n3.delete\n4.Exit\n");
			switch(sc.nextInt())
			{
				case 1:
					obj.admission();
					break;
				case 2:
					obj.show();
					break;
				case 3:
					obj.delete();
					break;
				case 4:
					System.exit(0); 
			}

		}
	}
}