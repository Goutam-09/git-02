import java.util.*;
class Students
{
	private int rollNo;
	private String name,mobileNo,className;
	Students(int rollNo,String name,String mobileNo,String className)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.mobileNo=mobileNo;
		this.className=className;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public String getName()
	{
		return name;
	}
	public String getMobile()
	{
		return mobileNo;
	}
	public String getClassName()
	{
		return className;
	}
	public void setRollNo(int r)
	{
		rollNo=r;
	}
	public void setName(String n)
	{
		name=n;
	}
	public void setMobile(String m)
	{
		mobileNo=m;
	}
	public void setClassName(String cn)
	{
		className=cn;
	}
	public String toString()                             
	{
		return "1.Roll No: "+rollNo+" 2.Name: "+name+" 3.Mobile No.: "+mobileNo+" 4.Class Name: "+className;
	}
}
class School
{ 
	Scanner sc=new Scanner(System.in);
	Students student[];
	int seat,totalStd;
	School()
	{
		seat = 5;
		totalStd = -1;
		student = new Students[seat];
	}
	public void increaseSeat()
	{
		seat+=5;
		Students s[]=new Students[seat];
		for(int i=0;i<=totalStd;i++)
		{
			s[i]=student[i];
		}
		student =s;
    }
	public void newStudents()
	{
		if(totalStd==seat-1)
		{
			increaseSeat();
		}
		if(totalStd<seat)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Please Enter the Roll number: ");
			int rollno = sc.nextInt();
			sc.nextLine();
			System.out.print("Please Enter the Name of Students: ");
			String name = sc.nextLine();
			System.out.print("Please Enter the Mobile Number: ");
			String mob = sc.nextLine();
			System.out.print("Please Enter the Class Name: ");
			String cn = sc.nextLine();
			totalStd++;
			Students s= new Students(rollno,name,mob,cn);
			student[totalStd]=s;
		}
	}
	public void show()
	{
		int j=-1;
		if(totalStd==j)
		{
			System.out.println("No student Enroll");
		}
		for(int i=0;i<=totalStd;i++)
		{
			System.out.println(student[i]+" ");
		}	
	}
	public void delete(Integer rollNo)
	{
		for(int i=0;i<=totalStd;i++)
		{
		    if(rollNo.equals(student[i].getRollNo()))
			{
				for(int j=i;j<totalStd;j++)
				{
					student[j]=student[j+1];
				}
					totalStd--;
			}	
		}
	}
	public void Update(Integer rollNo)
	{   
		int flag=0;
		for(int i=0;i<=totalStd;i++)
		{
			if(rollNo.equals(student[i].getRollNo()))      
			{
			 	while(true)
			 	{
				 System.out.println("1.Update Roll no.\n2.Update Name\n3.Update Mobile no.\n4.Update Class Name\n5.Finish Update");
				 int k = sc.nextInt();
				 	switch(k)
				 	{
				 		case 1:
				 			System.out.print("Enter the roll number for updating data: ");
							student[i].setRollNo(sc.nextInt());
							break;
					    case 2:
						 	System.out.print("Enter the Name for updating: ");
						  	student[i].setName(sc.next());
						 	break;
					    case 3:
						 	System.out.print("Enter the Mobile number for updating: ");
					    	student[i].setMobile(sc.next());
						 	break;
					    case 4:
						 	System.out.print("Enter the Class Name for updating: ");
						 	student[i].setClassName(sc.next());
					 		break;
					 	case 5:
					 		flag=1;
					 		break;
					}
					 if(flag==1)
					 	break;
				}
			}
		} 
	}
	public void Search(Integer r)
	{
		for(int i=0;i<=totalStd;i++)
		{
			if(r.equals(student[i].getRollNo()))
			{
				System.out.println(student[i].getRollNo());
				System.out.println(student[i].getName());
				System.out.println(student[i].getMobile());
				System.out.println(student[i].getClassName());
				System.out.println();
			}
			else 
			{
				System.out.println("Roll number not Found in our record:");
			}
		}
	}
}
class TrialStudentData
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		School obj=new School();
		while(true)
		{
			System.out.println("1.admission\n2.show\n3.Delete\n4.Update\n5.Search\n6.Exit");
			switch(sc.nextInt())
			{
				case 1:
				  obj.newStudents();
				  break;
				case 2:
				  obj.show();
				  break;
				case 3:
				  System.out.print("Enter the Roll number which you want to delete: ");
				  obj.delete(sc.nextInt());
				  break;
				case 4:
				  System.out.print("Enter the Roll number which you want to update: ");  
				  obj.Update(sc.nextInt());
				  break;
				case 5:
				  System.out.print("Enter the Roll number which you want to see detail: ");
				  obj.Search(sc.nextInt());
				  break;
				case 6:
				  System.exit(0); 
			}
		}
	}
}