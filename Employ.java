import java.util.*;
class EmployData
{
	private int employ_Id,employ_Salary;
	private String company_Name;
	private String employ_Name;
	private String employ_Mobile;
	EmployData(int employ_Id,String company_Name,String employ_Name,int employ_Salary,String employ_Mobile)
	{
		this.employ_Id=employ_Id;
		this.company_Name=company_Name;
		this.employ_Name=employ_Name;
		this.employ_Salary=employ_Salary;
		this.employ_Mobile=employ_Mobile;
	}
	public void setEmployId(int id)
	{
		employ_Id=id;
	}
	public void setCompanyName(String comName)
	{
		company_Name=comName;
	}
	public void setEmployName(String name)
	{
		employ_Name=name;
	}
	public void setEmploySalary(int salary)
	{
		employ_Salary=salary;
	}
	public void setEmployMobile(String mobile)
	{
		employ_Mobile=mobile;
	}
	public int getEmployId()
	{
		return employ_Id;
	}
	public String getCompanyName()
	{
		return company_Name;
	}
	public String getEmployName()
	{
		return employ_Name;
	}
	public int getEmploySalary()
	{
		return employ_Salary;
	}
	public String getEmployMobile()
	{
		return employ_Mobile;
	}
	public String toString()
	{
		return "Employ Id: "+employ_Id+" Company Name: "+company_Name+" Employ Name: "+employ_Name+" Employ Salary: "+employ_Salary+" Employ Mobile: "+employ_Mobile;
	}
}
class Company
{
	Scanner sc = new Scanner(System.in);
	EmployData employs[];
	int requirement,totalEmploy;
	Company()
	{
		requirement = 5;
		totalEmploy=-1;
		employs = new EmployData[requirement];
	}
	public void increaseEmploys()
	{
		requirement+=5;
		EmployData  e[]=new EmployData[requirement];
		for (int i=0;i<=totalEmploy;i++) 
		{
			e[i]=employs[i];	
		}
		employs=e;
	}
	public void newEmploy()
	{
		if(totalEmploy==requirement-1)
		{
			increaseEmploys();
		}
		if(totalEmploy<requirement)
		{
			System.out.print("Please Enter New Employ Id: ");
			int employid = sc.nextInt();
			sc.nextLine();
			System.out.print("Please Enter New Company Name: ");
			String cn = sc.nextLine();
			System.out.print("Please Enter New Employ Name: ");
			String employname = sc.nextLine();
			System.out.print("Please Enter New Employ Salary: ");
			int employsalary = sc.nextInt();
			sc.nextLine();
			System.out.print("Please Enter New Employ Mobile: ");
			String employmobile = sc.nextLine();
			totalEmploy++;
			EmployData e= new EmployData(employid,cn,employname,employsalary,employmobile);
			employs[totalEmploy]=e;
		}
	}
	public void Show()
	{
		int f=-1;
		if(totalEmploy==f)
		{
			System.out.println("No employ Found:");
		}
		for(int i=0;i<=totalEmploy;i++)
		{
			System.out.println(employs[i]+" ");
		}
	}
	public void Delete(int id)
	{
		for(int i=0;i<=totalEmploy;i++)
		{
			if(id==employs[i].getEmployId())
			{
				for(int j=i;j<totalEmploy;j++)
				{
					employs[j]=employs[j+1];
				}
				totalEmploy--;
			}
		}
	}
	public void Update(int id)
	{
		int flag=0;
		for(int i=0;i<=totalEmploy;i++)
		{
			if(id==employs[i].getEmployId())
			{
				while(true)
				{
					System.out.println("1) Update Employ Id\n2)Update Company Name\n3)Employ Name\n4)Update Salary\n5)Employ Mobile\n6)Finish Update");
					int n = sc.nextInt();
					switch(n)
					{
						case 1:
							System.out.print("Update Employee Id: ");
							employs[i].setEmployId(sc.nextInt());
							break;
						case 2:
							System.out.print("Update Company Name: ");
							employs[i].setCompanyName(sc.next());
							break;
						case 3:
							System.out.print("Update Employ Name: ");
							employs[i].setEmployName(sc.next());
							break;
						case 4:
							System.out.print("Update Employ salary: ");
							employs[i].setEmploySalary(sc.nextInt());
							break;
						case 5:
							System.out.print("Update Employ mobile number: ");
							employs[i].setEmployMobile(sc.next());
						case 6:
							flag = 1;
							break;
					}
					if(flag==1)
						break;
				}
			}
		}
	}
	public void Search(int id)
	{
		for(int i=0;i<=totalEmploy;i++)
		{
			if(id==employs[i].getEmployId())
			{
				System.out.println(employs[i].getEmployId());
				System.out.println(employs[i].getCompanyName());
				System.out.println(employs[i].getEmployName());
				System.out.println(employs[i].getEmploySalary());
				System.out.println(employs[i].getEmployMobile());
			}
		}
	}
}

class Employ
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Company obj = new Company();
		while(true)
		{
			System.out.println("1)New Employ Id\n2)Show\n3)Delete\n4)Update\n5)Search\n6)Exit");
			switch(sc.nextInt())
			{
				case 1:
					obj.newEmploy();
					break;
				case 2:
					obj.Show();
					break;
				case 3:
					System.out.print("Enter the Employ Id which you want to delete: ");
					obj.Delete(sc.nextInt());
					break;
				case 4:
					System.out.print("Enter the Employ ID which you want to Update: ");
					obj.Update(sc.nextInt());
					break;
				case 5:
					System.out.print("Enter Employ id for fetchign data: ");
					obj.Search(sc.nextInt());
				case 6:
					System.exit(0);
			}
		}
	}
}
