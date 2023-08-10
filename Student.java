class Students
{
	private int rollNo;
	private String name,mobileNo,className,fees;
	Students(int rollNo,String name,String mobileNo,String className)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.mobileNo;
		this.className;
	}
	public void setFees(int f)
	{
		fees=f
	}
	public int getFees()
	{
		return fees;
	}
	public String toString()                             
	{
		return "1.Roll No.: "+rollNo+" 2.Name: "+name+" 3.Mobile No.: "+mobileNo+" 4.Class Name: "+className;
	}
}
class School
{
	Students student[];
	int seat,totalStd;
	School()
	{
		seat = 5;
		totalStd = -1;
		student = new Students[seat];
	}
	public void newStudents()
	{
		if(totalStd==seat-1)
		{
			System.out.println("Seat Full !");
			return;
		}
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
	}
	public void show()
	{
		for(int i=0;i<totalStd;i++)
		{
			System.out.println(student[i]);
		}
	}
}
class Trial
{
	public static void main(String[] args) 
	{
		Trial obj = new Trial();
		obj.newstudents();
		obj.show();

	}
}